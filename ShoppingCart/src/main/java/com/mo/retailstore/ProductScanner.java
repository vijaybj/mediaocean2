package com.mo.retailstore;

import com.mo.retailstore.model.Product;

/**
 * Created by vijaybj on 19/03/16.
 */
public class ProductScanner implements Scanner{
    private Double totalPrice = 0.0;
    private Double totalLevy = 0.0;

    public ProductScanner() {
        init();
    }

    public void scan(Product product) {
        this.totalPrice += product.getPrice();
        this.totalLevy += product.getLevy();
    }

    public void init() {
        this.totalPrice = 0.0;
        this.totalLevy = 0.0;
    }

    public Double getTotalPrice() {
        return this.totalPrice;
    }

    public Double getTotalLevy() {
        return this.totalLevy;
    }
}
