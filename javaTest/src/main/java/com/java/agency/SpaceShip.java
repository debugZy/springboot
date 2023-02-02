package com.java.agency;

public class SpaceShip  extends SpaceShipControls{
    private String name;

    public SpaceShip(String name) {
        this.name = name;
    }

    public static void main(String[] args) {
        SpaceShip protector = new SpaceShip("NSEA Protecor");
        protector.forward(100);
    }
}
