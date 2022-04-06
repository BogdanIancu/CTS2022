package ro.ase.cts.builder;

import java.time.LocalDate;
import java.util.List;

public class Shampoo {
    private String producer;
    private List<String> ingredients;
    private String name;
    private String scalpType;
    private double price;
    private boolean isCrueltyFree;
    private LocalDate expireDate;
    private double quantity;

    private Shampoo() {
    }

    Shampoo(String producer, List<String> ingredients, String name, String scalpType, double price, boolean isCrueltyFree, LocalDate expireDate, double quantity) {
        this.producer = producer;
        this.ingredients = ingredients;
        this.name = name;
        this.scalpType = scalpType;
        this.price = price;
        this.isCrueltyFree = isCrueltyFree;
        this.expireDate = expireDate;
        this.quantity = quantity;
    }

    public static class ShampooBuilder {
        private Shampoo shampoo = new Shampoo();

        public ShampooBuilder addProducer(String producer) {
            shampoo.producer = producer;
            return this;
        }

        public ShampooBuilder addPrice(double price) {
            shampoo.price = price;
            return this;
        }

        //...
        public Shampoo build() {
            return shampoo; //or shampoo.clone() if we need to avoid shallow copies
        }
    }
}
