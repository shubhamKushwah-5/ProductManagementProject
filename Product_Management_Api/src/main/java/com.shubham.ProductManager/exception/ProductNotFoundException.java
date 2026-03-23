package com.shubham.ProductManager.exception;

public class ProductNotFoundException extends RuntimeException{

    public ProductNotFoundException(){
        super("product not found with given details ");
    }
}
