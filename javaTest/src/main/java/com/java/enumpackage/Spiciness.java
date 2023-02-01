package com.java.enumpackage;

/**
 * 枚举类型
 */
public enum Spiciness {
    NOT, MILD, MEDIUM, HOT, FLAMING;

    public static void main(String[] args) {
        Spiciness enumObjectTest = Spiciness.HOT;
        System.out.println(enumObjectTest);
        for (Spiciness en : Spiciness.values()) {
            System.out.println(en + "ordinal " + en.ordinal());
        }
    }

}
