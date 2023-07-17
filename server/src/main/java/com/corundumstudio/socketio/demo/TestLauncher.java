package com.corundumstudio.socketio.demo;

import com.corundumstudio.socketio.listener.*;

import java.util.ArrayList;

import com.corundumstudio.socketio.*;

public class TestLauncher {

    public static void main(String[] args) throws InterruptedException {
        TestUserObj user1 = new TestUserObj(1, "John");
        TestUserObj user2 = new TestUserObj(2, "Bob");
        TestUserObj user3 = new TestUserObj(3, "Emma");
        ArrayList<TestUserObj> listUser = new ArrayList<TestUserObj>();
        listUser.add(user1);
        listUser.add(user2);
        listUser.add(user3);

        Configuration config = new Configuration();
        config.setHostname("localhost");
        config.setPort(9092);

        final SocketIOServer server = new SocketIOServer(config);

        server.addEventListener("chatevent", ChatObject.class, new DataListener<ChatObject>() {
            @Override
            public void onData(SocketIOClient client, ChatObject data, AckRequest ackRequest) {
                // broadcast messages to all clients
                System.out.println("test-on-chat");
                server.getBroadcastOperations().sendEvent("chatevent", data);
            }
        });

        server.addEventListener("uidtest", TestUserObj.class, new DataListener<TestUserObj>() {

            @Override
            public void onData(SocketIOClient client, TestUserObj data, AckRequest ackRequest) {
                String user_name = "";
                for (TestUserObj i : listUser) {
                    if (i.user_id == data.user_id) {
                        user_name = i.getUser_name();
                        break;
                    } else {
                        user_name = "Unknown";
                        continue;
                    }
                }

                data.user_name = user_name;

                server.getBroadcastOperations().sendEvent("uidtest", data);
            }
        });

        server.start();

        Thread.sleep(Integer.MAX_VALUE);

        server.stop();
    }

}
