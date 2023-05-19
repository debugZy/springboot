package com.java.test;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class Test {
    public static void main(String[] args) {
        List<Object> list = new ArrayList<>();
        List list1 = new ArrayList();
        List list2 = new ArrayList();
        list.add(list1);
        list.add(list2);
        for (int i = 0; i < list.size(); i++) {
            Object o = list.get(i);
            Map map = (Map) o;
            if (map.size()>0) {
                System.out.println("abc");
            }else{
                System.out.println("cba");
            }
        }

    }

    public static boolean isNull(Object object) {
        return object == null;
    }
}
