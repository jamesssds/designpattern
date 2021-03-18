package com.design.test;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class TestLinkedList {
    public static void main(String[] args) {
//        List list = new LinkedList();
//        list.add("第一");
//        list.add("第二");
//        list.add("第三");
//        list.add("第四");
//        List list2 = new LinkedList(Collections.singleton(4));
//
//        System.out.println(list.get(3));
        boolean flipedString = isFlipedString("waterbottle", "erbottlewat");
        System.out.println(flipedString);     
    }
    public static boolean isFlipedString(String s1, String s2)
    {
        return s1.equals(s2)||(s1.length()==s2.length()&&(s1+s1).contains(s2));
    }
}


