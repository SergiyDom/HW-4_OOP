<<<<<<< HEAD
package com.homework_4.task_2_shop.Product.Electronic;

import com.homework_4.task_2_shop.Service.AgeRastriction;
=======
package com.shop.Product.Electronic;
>>>>>>> origin/master

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
