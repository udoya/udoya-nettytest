# README
このプロジェクトは netty-socketioのdemoプロジェクトをカスタマイズして、yamada/udoyaがsocketioをテストしただけのものです。下記に単なるsocketioのreadmeを載せますが、それがなくとも動かせるようにしておきます。

1. mvnは入ってますか？
   `mvn --version`
2. serverディレクトリに行き、mvnでビルドしよう。
   `cd udoya-nettytest/server`
   `mvn clean install`
   調子が悪かったら先に`mvn clean`してもいいかもしれない。
3. serverを起動しよう。
   `mvn exec:java -Dmain.class=com.corundumstudio.socketio.demo.TestLauncher`
   追加したのは`TestLauncher.java`と`TestUserObj.java`の2つになります。ほかはもとからあるやつ。
4. `/client/index.html`をブラウザかなんかで立ち上げよう。
   適当にsenduidというボタンを追加してます。1,2,3,4あたりを打ち込むとデータ拾えてることが確認できてるかもしれない。
5. 質問はyamada/udoyaまで。

---

# Netty-socketio Demo

Demo for [Netty-socketio](https://github.com/mrniko/netty-socketio) project.

# Usage example

1. Build or install Netty-socketio lib to your maven repository.
   `mvn clean install`

2. Switch to /server folder and build server by maven.

3. Run server by command
   `mvn exec:java`

4. Run client in browser, by opening* file /client/index.html

# Note about Chrome and IE browsers
 If you want to open index.html in Chrome or IE browser you need to host it somewhere (nginx or apache, for example),
 or page will not work due to absence of correct "origin" http header.

# Demo scenarios

By default you will run a chat which communcate with server via json objects.
There are several demo scenarios available:

 `Class` - `Web client page`

 `com.corundumstudio.socketio.demo.ChatLauncher` - `/client/index.html`

 `com.corundumstudio.socketio.demo.EventChatLauncher` - `/client/event-index.html`

 `com.corundumstudio.socketio.demo.SslChatLauncher` - `/client/ssl-event-index.html`

 `com.corundumstudio.socketio.demo.NamespaceChatLauncher` - `/client/namespace-index.html`

 `com.corundumstudio.socketio.demo.AckChatLauncher` - `/client/ack-index.html`

 `com.corundumstudio.socketio.demo.BinaryEventLauncher` - `/client/binary-event-index.html`


You can select appropriate server launcher by command with `main.class` parameter:

 `mvn exec:java -Dmain.class=com.corundumstudio.socketio.demo.SslChatLauncher`


   
