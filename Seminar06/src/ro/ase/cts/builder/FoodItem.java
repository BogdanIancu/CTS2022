package ro.ase.cts.builder;

import java.time.LocalDate;

public class FoodItem {
    private String name;
    private String producer;
    private long barCode;
    private LocalDate expirationDate;
    private double price;
    private boolean isGlutenFree;
    private boolean isVegetarian;
    private boolean isVegan;

    FoodItem(String name, String producer, long barCode, LocalDate expirationDate, double price, boolean isGlutenFree, boolean isVegetarian, boolean isVegan) {
        this.name = name;
        this.producer = producer;
        this.barCode = barCode;
        this.expirationDate = expirationDate;
        this.price = price;
        this.isGlutenFree = isGlutenFree;
        this.isVegetarian = isVegetarian;
        this.isVegan = isVegan;
    }

    private FoodItem() {}

    @Override
    public String toString() {
        return "FoodItem{" +
                "name='" + name + '\'' +
                ", producer='" + producer + '\'' +
                ", barCode=" + barCode +
                ", expirationDate=" + expirationDate +
                ", price=" + price +
                ", isGlutenFree=" + isGlutenFree +
                ", isVegetarian=" + isVegetarian +
                ", isVegan=" + isVegan +
                '}';
    }

    public static class FoodItemBuilder {
        private FoodItem foodItem = new FoodItem();

        public FoodItemBuilder addName(String name) {
            foodItem.name = name;
            return this;
        }

        public FoodItemBuilder addProducer (String producer) {
            foodItem.producer = producer;
            return this;
        }

        public FoodItemBuilder addBarCode (long barCode) {
            foodItem.barCode = barCode;
            return this;
        }

        public FoodItemBuilder addExpirationDate (LocalDate expirationDate) {
            foodItem.expirationDate = expirationDate;
            return this;
        }

        public FoodItemBuilder addPrice (double price) {
            foodItem.price = price;
            return this;
        }

        public FoodItemBuilder setIsGlutenFree (boolean isGlutenFree) {
            foodItem.isGlutenFree = isGlutenFree;
            return this;
        }

        public FoodItemBuilder setIsVegetarioan (boolean isVegetarioan) {
            foodItem.isVegetarian = isVegetarioan;
            return this;
        }

        public FoodItemBuilder setIsVegan (boolean isVegan) {
            foodItem.isVegan = isVegan;
            return this;
        }

        public FoodItem build() {
            return foodItem;
        }
    }

}
