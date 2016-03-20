package com.mo.retailstore.model;

import com.mo.retailstore.ProductScanner;

/**
 * Created by vijaybj on 20/03/16.
 */
abstract class AbstractProduct implements Product {
    private String name;
    private Double price;

    public AbstractProduct(String name, Double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return this.name;
    }

    public Double getPrice() {
        return this.price;
    }

    abstract public Double getFinalPrice();

    abstract public void accept(ProductScanner scanner);

    abstract public Double getLevy();
}
