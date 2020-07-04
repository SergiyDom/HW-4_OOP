package com.shop.Product.Electronic;

import com.shop.AgeRastriction;

public class Appliance extends ElectornicsProduct {
    final double discount = 1.05;
    final int discountConditionAmount = 50;

    public Appliance(String name, double price, int quantity, AgeRastriction ageRestriction) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
        this.ageRestriction = ageRestriction;
        this.guaranteePeriod = 6;
    }

    @Override
    public double getPrice() {
        return this.quantity < this.discountConditionAmount
                ? this.price * this.discount
                : this.price;
    }
}