package com.mo.retailstore.model;

import com.mo.retailstore.ProductScanner;

/**
 * Created by vijaybj on 19/03/16.
 */
public interface Product {

    String getName();

    Double getPrice();

    Double getFinalPrice();

    Double getLevy();

    void accept(ProductScanner scanner);

}
