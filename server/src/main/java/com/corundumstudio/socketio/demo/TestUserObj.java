package com.corundumstudio.socketio.demo;

class items {
    public int item_id;
    public String item_name;
    public int is_sold;

    public items(int id, String name, int is_sold) {
        this.item_id = id;
        this.item_name = name;
        this.is_sold = is_sold;
    }

    public items(int id, String name) {
        this.item_id = id;
        this.item_name = name;
    }

    public items() {
    }
}

class purchases {
    public int auction_id;
    public String item_name;
    public int price;

    public purchases(int id, String name, int price) {
        this.auction_id = id;
        this.item_name = name;
        this.price = price;
    }

    public purchases() {
    }
}

public class TestUserObj {
    public int user_id;
    public String user_name;
    public items _items;
    public purchases _purchases;

    public String getUser_name() {
        return user_name;
    }

    public int getUser_id() {
        return user_id;
    }

    public items get_items() {
        return _items;
    }

    public purchases get_purchases() {
        return _purchases;
    }

    public void set_purchases(purchases _purchases) {
        this._purchases = _purchases;
    }

    public void setUser_id(int user_id) {
        this.user_id = user_id;
    }

    public void setUser_name(String user_name) {
        this.user_name = user_name;
    }

    public void set_items(items _items) {
        this._items = _items;
    }

    public TestUserObj() {
    }

    public TestUserObj(int id, String name) {
        this.user_id = id;
        this.user_name = name;
    }

}
