package com.shop.Product.Electronic;

import com.shop.AgeRastriction;

public class Computer extends ElectornicsProduct {
    final double discount = 0.95;
    final int discountConditionAmount = 1000;

    public Computer(String name, double price, int quantity, AgeRastriction ageRestriction) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
        this.ageRestriction = ageRestriction;
        this.guaranteePeriod = 24;
    }

    @Override
    public double getPrice() {
        return this.quantity > this.discountConditionAmount
                ? this.price * this.discount
                : this.price;
    }
}
