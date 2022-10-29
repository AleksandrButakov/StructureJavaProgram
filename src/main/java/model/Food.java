package model;

public abstract class Food {

    private int amount;
    private double price;
    private boolean isVegetarian;

    /*
    public GroundTransport(boolean ground, int wheelsCount) {
    this.ground = ground;
    this.wheelsCount = wheelsCount;
    }

    public boolean isGround() {
        return ground;
    }

    public int getWheelsCount() {
        return wheelsCount;
    }
     */

    public Food(int amount, double price, boolean isVegetarian) {
        this.amount = amount;
        this.price = price;
        this.isVegetarian = isVegetarian;
    }




}
