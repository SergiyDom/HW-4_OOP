package com.homework_4.task_2_shop.Service;

public enum AgeRastriction {
    NONE(0),
    TEENAGER(15),
    ADULT(18);

    public int age;

    AgeRastriction(int age) {
        this.age = age;
    }
}
