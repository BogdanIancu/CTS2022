package ro.ase.cts.builder;

import java.time.LocalDate;
import java.util.List;

public class ShampooBuilder2 {
    private String producer;
    private List<String> ingredients;
    private String name;
    private String scalpType;
    private double price;
    private boolean isCrueltyFree;
    private LocalDate expireDate;
    private double quantity;

    public ShampooBuilder2 addProducer(String producer) {
        this.producer = producer;
        return this;
    }

    public ShampooBuilder2 addPrice(double price) {
        this.price = price;
        return this;
    }
    //...

    public Shampoo build() {
        return new Shampoo(producer, ingredients, name,
                scalpType, price, isCrueltyFree, expireDate, quantity);
    }
}
