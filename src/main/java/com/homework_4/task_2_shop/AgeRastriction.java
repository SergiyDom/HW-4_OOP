package com.shop;

public enum AgeRastriction {
    NONE(0),
    TEENAGER(15),
    ADULT(18);

    public int age;

    AgeRastriction(int age) {
        this.age = age;
    }
}
