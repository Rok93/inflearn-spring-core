package main;

import module.roki.Roki;
import woowa.pobi.Pobi;

public class Main {

    public static void main(String[] args) {
        Roki roki = new Roki();
        System.out.println(roki.hello());
        Pobi pobi = new Pobi();
        System.out.println(pobi.hello());
    }
}
