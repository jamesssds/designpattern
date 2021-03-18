package com.design.pattern.creational.observerpattren;

import java.util.Observable;
import java.util.Observer;

public class Main {
    public static void main(String[] args) {
        new Observable();
        BossSubject bossSubject = new BossSubject();
        bossSubject.setAction("\n咳咳，我来了");
        new WatchObserver(bossSubject);
        new CahoObserver(bossSubject);
        bossSubject.notifyOberser();
    }
}
