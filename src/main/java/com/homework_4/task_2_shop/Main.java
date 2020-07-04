package com.shop;

import com.shop.Person.Customer;
import com.shop.Product.Electronic.Appliance;
import com.shop.Product.Electronic.Computer;
import com.shop.Product.Food.FoodProduct;
import com.shop.Product.Product;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Main {
    private static class PurchaseManager {
        private void processPurchase(Product product, Customer customer) throws Exception {
            product.isAvailable();
            if (product instanceof FoodProduct && ((FoodProduct) product).hasExpirationDate()) {
                ((FoodProduct) product).isExpired();
            }
            this.isEnoughMoney(product.getPrice(), customer.getBalance());
            this.doesHavePermission(product.getAgeRestriction(), customer.getAge());
            product.setQuantity();
            System.out.println("Purchase success, product price is: " + product.getPrice()
                    + ", product quantity: " + product.getQuantity());
        }

        private void isEnoughMoney(double price, double money) throws Exception {
            if (price > money) {
                throw new Exception("buyer does not have enough money");
            }
        }

        private void doesHavePermission(AgeRastriction ageRastriction, int age) throws Exception {
            if (ageRastriction.age > age) {
                throw new Exception("buyer does not have permission");
            }
        }
    }

    public static void main(String[] args) throws Exception {
        List<Product> productList = new ArrayList<>();
        productList.add(new FoodProduct("cola", 16.5, 50, AgeRastriction.TEENAGER));
        productList.add(new FoodProduct("milk", 10.5, 50, AgeRastriction.NONE, new Date("8/17/2020")));
        productList.add(new Computer("Pentium", 156.56, 1500, AgeRastriction.TEENAGER));
        productList.add(new Appliance("electric drill", 756.56, 35, AgeRastriction.ADULT));

        Customer kolya1 = new Customer("Kolya1", 10, 50.5);

        List<Product> resoltList = new ArrayList<>();
        PurchaseManager manager = new PurchaseManager();
        for (Product product : productList) {
            try {
                manager.processPurchase(product, kolya1);
                resoltList.add(product);
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
    }
}
