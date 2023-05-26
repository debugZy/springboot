package com.java.rtti;

import java.util.Calendar;
import java.util.HashMap;

public class PetCount {
    static class PetCounter extends HashMap<String, Integer> {
        public void count(String type) {
            Integer quantity = get(type);
            if (quantity == null)
                put(type, 1);
            else put(type, quantity + 1);
        }
    }

    //    public static void  countPets(pet)
    public static void main(String[] args) {
        String time = "20231117";
        String time1 = "20231116";
        System.out.println(time.compareTo(time1));
    }
}
