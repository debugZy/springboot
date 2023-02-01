package com.java.enumpackage;

public class Burriito {
    Spiciness degree;

    public Burriito(Spiciness degree) {
        this.degree = degree;
    }
    public void deescribe(){
        System.out.println("This burrito is ");
        switch (degree){
            case NOT:
                System.out.println("not spicy at all.");
                break;
            case MILD:
            case MEDIUM:
                System.out.println("a little hot.");
                break;
            case HOT:
            case FLAMING:
            default:
                System.out.println("maybe too hot.");
        }
    }

    public static void main(String[] args) {
        Burriito plain = new Burriito(Spiciness.NOT),
                greenChile = new Burriito(Spiciness.MEDIUM),
                jalapeno = new Burriito(Spiciness.HOT);
        plain.deescribe();
        greenChile.deescribe();
        jalapeno.deescribe();
    }
}
