package com.example.expenses.readers;

import org.json.simple.JSONArray;

public class Reader {

    public static void main(String[] args) {
        array();
    }

    public static void array() {
        JSONArray jsonArray = new JSONArray();
        jsonArray.add("hello");
        jsonArray.add("hello2");
        jsonArray.add("hello3");
        System.out.println(jsonArray.toJSONString());
    }

}
