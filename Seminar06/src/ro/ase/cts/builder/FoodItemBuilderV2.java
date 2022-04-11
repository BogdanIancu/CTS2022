package ro.ase.cts.builder;

import java.time.LocalDate;

public class FoodItemBuilderV2 {
    private String name;
    private String producer;
    private long barCode;
    private LocalDate expirationDate;
    private double price;
    private boolean isGlutenFree;
    private boolean isVegetarian;
    private boolean isVegan;

    public FoodItemBuilderV2 addName(String name) {
        this.name = name;
        return this;
    }

    public FoodItemBuilderV2 addProducer (String producer) {
        this.producer = producer;
        return this;
    }

    public FoodItemBuilderV2 addBarCode (long barCode) {
        this.barCode = barCode;
        return this;
    }

    public FoodItemBuilderV2 addExpirationDate (LocalDate expirationDate) {
        this.expirationDate = expirationDate;
        return this;
    }

    public FoodItemBuilderV2 addPrice (double price) {
        this.price = price;
        return this;
    }

    public FoodItemBuilderV2 setIsGlutenFree (boolean isGlutenFree) {
        this.isGlutenFree = isGlutenFree;
        return this;
    }

    public FoodItemBuilderV2 setIsVegetarioan (boolean isVegetarioan) {
        this.isVegetarian = isVegetarioan;
        return this;
    }

    public FoodItemBuilderV2 setIsVegan (boolean isVegan) {
        this.isVegan = isVegan;
        return this;
    }

    public FoodItem build() {
        return new FoodItem(name, producer, barCode, expirationDate, price, isGlutenFree, isVegetarian, isVegan);
    }
}
