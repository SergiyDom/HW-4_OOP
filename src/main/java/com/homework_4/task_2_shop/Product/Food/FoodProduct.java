package com.homework_4.task_2_shop.Product.Food;

import com.homework_4.task_2_shop.Product.Product;
import com.homework_4.task_2_shop.Service.AgeRastriction;
import com.homework_4.task_2_shop.Service.Expirable;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

public class FoodProduct extends Product implements Expirable {
    private Date expirationDate;
    final double discount = 0.7;

    public FoodProduct(String name, double price, int quantity, AgeRastriction ageRestriction) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
        this.ageRestriction = ageRestriction;
    }

    public FoodProduct(String name, double price, int quantity, AgeRastriction ageRestriction, Date expirationDate) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
        this.ageRestriction = ageRestriction;
        this.expirationDate = expirationDate;
    }

    @Override
    public Date getExpirationDate() {
        return this.expirationDate;
    }

    @Override
    public double getPrice() {
        if (expirationDate == null) {
            return this.price;
        } else if (this.onSale()) {
            return this.price * discount;
        } else {
            return this.price;
        }
    }

    private boolean expired() {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("MM/dd/yyyy");
        Date now = new Date();
        now.setHours(0);
        now.setMinutes(0);
        now.setSeconds(0);
        long diff = (this.expirationDate.getTime() - now.getTime());
        long day = TimeUnit.DAYS.convert(diff, TimeUnit.MILLISECONDS);
        return day < 0;
    }

    private boolean onSale() {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("MM/dd/yyyy");
        Date now = new Date();
        now.setHours(0);
        now.setMinutes(0);
        now.setSeconds(0);
        long diff = (this.expirationDate.getTime() - now.getTime());
        long day = TimeUnit.DAYS.convert(diff, TimeUnit.MILLISECONDS);
        return day < 15;
    }

    public void isExpired() throws Exception {
        if (this.expired()) {
            throw new Exception("Is expired");
        }
    }

    public boolean hasExpirationDate() {
        return this.expirationDate != null;
    }
}
