package com.mo.retailstore.model;

import com.mo.retailstore.ProductScanner;

/**
 * Created by vijaybj on 19/03/16.
 */
public class CategoryCProduct extends AbstractProduct {
    final Integer levyPercentage = 0;

    public CategoryCProduct(String name, Double price) {
        super(name, price);
    }

    public Integer getLevyPercentage() {
        return this.levyPercentage;
    }

    @Override
    public Double getFinalPrice() {
        return this.getPrice() + this.getLevy();
    }

    @Override
    public Double getLevy() {
        return getPrice() * getLevyPercentage() / 100;
    }

    @Override
    public void accept(ProductScanner scanner) {
        scanner.scan(this);
    }
}
