package com.java.enumpackage;

public enum OzWitch {
    WEST("Miss Gulch,aka the wicked witch of the west", 20),
    NORTH("Glinda,the Good witch of the North", 30),
    EAST("Wicked witch of the East,wearer of the Ruby Slippers,crushed by Dorothy's house", 40),
    SOUTH("Good by inference,but missing", 50);
    private String description;
    private int value;

    private OzWitch(String description, int value) {
        this.description = description;
        this.value = value;
    }

    public String getDescription() {
        return description + ":" + value;
    }

    @Override
    public String toString() {
        String id = name();
        String lower = id.substring(1).toLowerCase();
        return id.charAt(0) + lower;
    }

    public static void main(String[] args) {
        for (OzWitch witch : OzWitch.values()) {
            System.out.println(witch + " : " + witch.getDescription());
        }
    }
}
