package com.homework_4.task_2_shop.Product.Electronic;

import com.homework_4.task_2_shop.Service.AgeRastriction;

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