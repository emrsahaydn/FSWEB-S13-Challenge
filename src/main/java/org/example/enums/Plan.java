package org.example.enums;

public enum Plan {
    BASIC("BASIC", 1000),
    MEDIUM("MEDIUM", 2000),
    ADVANCED("ADVANCED", 5000);

    private final String name;
    private final int price;

    Plan(String name, int price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }
}