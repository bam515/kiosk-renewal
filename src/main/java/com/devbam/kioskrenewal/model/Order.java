package com.devbam.kioskrenewal.model;

public class Order {
    private String id;
    private String name;
    private int price;
    private int count;

    public Order(String id, String name, int price, int count) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.count = count;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }

    public int getCount() {
        return count;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }

        if (!(obj instanceof Order other)) {
            return false;
        }

        if ((this.id.equals(other.getId())) && (this.name.equals(other.getName()))
                && this.price == other.getPrice()) {
            return true;
        }
        return false;
    }
}
