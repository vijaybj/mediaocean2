package com.mo.retailstore;

import com.mo.retailstore.model.Product;

import java.util.ArrayList;

/**
 * Created by vijaybj on 20/03/16.
 */
public class ShoppingCart extends ArrayList<Product> {
    private final ProductScanner scanner = new ProductScanner();
    private Boolean scanned = false;

    public void addItem(Product product) {
        this.add(product);
        scanned = false;
    }

    public void checkout() {
        scanAll();
        for(Product product: this) {
            System.out.println(product.getName() + ": Cost Rs. " + product.getPrice() + " Levy: Rs." + product.getLevy());
        }
        System.out.println("---------------------------------------");
        System.out.println("Total Cost Rs. " + getTotalCost() + " Total Levy Rs. " + getTotalLevy());
        System.out.println("---------------------------------------");
        System.out.println("Final Total Rs. " + (getTotalCost() + getTotalLevy()));
        System.out.println("---------------------------------------");
    }

    private void scanAll() {
        if(!scanned) {
            this.scanner.init();
            for(Product product: this) {
                this.scanner.scan(product);
            }
            scanned = true;
        }
    }

    public Double getTotalCost() {
        scanAll();
        return this.scanner.getTotalPrice();
    }

    public Double getTotalLevy() {
        scanAll();
        return this.scanner.getTotalLevy();
    }
}
