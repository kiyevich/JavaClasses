package com.company;

public class Product {

    private int id;
    private String name;
    private String UPC;
    private String manufacturer;
    private int price;
    private int storagePeriod;
    private int number;

    public Product(int id, String name, String UPC, String manufacturer, int price, int storagePeriod, int number) {
        this.id = id;
        this.name = name;
        this.UPC = UPC;
        this.manufacturer = manufacturer;
        this.price = price;
        this.storagePeriod = storagePeriod;
        this.number = number;

    }
    public Product() {
        this.id = 0;
        this.name = "";
        this.UPC = "";
        this.manufacturer = "";
        this.price = 0;
        this.storagePeriod = 0;
        this.number = 0;

    }




    @Override
    public String toString(){
        return "ID: " + id + "|  " + name + ", UPC :" + UPC + ", " + manufacturer + ", Price" + price + ", storagePeriod: "
                + storagePeriod + ",  Number: " + number;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUPC() {
        return UPC;
    }

    public void setUPC(String UPC) {
        this.UPC = UPC;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getStoragePeriod() {
        return storagePeriod;
    }

    public void setStoragePeriod(int storagePeriod) {
        this.storagePeriod = storagePeriod;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }


}
