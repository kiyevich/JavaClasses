package com.company;
import java.util.ArrayList;
import java.util.function.Predicate;
import java.util.*;
import java.util.stream.Stream;


public class Main {

   static public void printProducts(ArrayList Products){

        for (var product:  Products) {
            System.out.println(product.toString());
        }

    }

    public static void main(String[] args) {
        ArrayList<Product> Products = new ArrayList<Product>();

        Products.add(new Product(1,"Lenovo Legion","002352411452","Lenovo", 1020,2,10));
        Products.add(new Product(2,"Lenovo thinkpad t14","0036003423452","Lenovo", 2320,4,9));
        Products.add(new Product(3,"Asus rog zephyrus g14","00360432452","Asus", 3243,1,12));
        Products.add(new Product(4,"HP omen 15","0053000234452","Lenovo", 2754,3,4));

        printProducts(Products);

        String searchName = "Lenovo Legion";
        ArrayList<Product> newProducts = new ArrayList<Product>();
        for (var product:  Products) {
            if(product.getName() == searchName){
                newProducts.add(product);
            }
        }
        System.out.println("Products with name: " + searchName);
        printProducts(newProducts);


//
        searchName = "Lenovo Legion";
        int searchPriceLessThen = 2000;
        newProducts = new ArrayList<Product>();
        for (var product:  Products) {
            if(product.getName() == searchName &&  product.getPrice() < searchPriceLessThen){
                newProducts.add(product);
            }
        }
        System.out.println("Products with name: " + searchName + " and price less then " + searchPriceLessThen);
        printProducts(newProducts);
//
        int storagePeriodMoreThan = 1;
        newProducts = new ArrayList<Product>();
        for (var product:  Products) {
            if(product.getStoragePeriod() > storagePeriodMoreThan){
                newProducts.add(product);
            }
        }
        System.out.println("Products storage Period more than: " + storagePeriodMoreThan);
        printProducts(newProducts);
//





    }
}
