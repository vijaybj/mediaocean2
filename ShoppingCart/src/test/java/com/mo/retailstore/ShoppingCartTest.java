package com.mo.retailstore;

import com.mo.retailstore.model.CategoryAProduct;
import com.mo.retailstore.model.CategoryBProduct;
import com.mo.retailstore.model.CategoryCProduct;
import com.mo.retailstore.model.Product;
import junit.framework.TestCase;

/**
 * Created by vijaybj on 20/03/16.
 */
public class ShoppingCartTest extends TestCase {

    public void setUp() throws Exception {
        super.setUp();

    }

    public void tearDown() throws Exception {

    }

    public void testCheckout() throws Exception {
        ShoppingCart cart = new ShoppingCart();

        CategoryAProduct categoryAProduct = new CategoryAProduct("CategoryA", 40.0);
        cart.addItem(categoryAProduct);

        CategoryBProduct categoryBProduct = new CategoryBProduct("CategoryB", 60.0);
        cart.addItem(categoryBProduct);

        CategoryCProduct categoryCProduct = new CategoryCProduct("CategoryC", 80.0);
        cart.addItem(categoryCProduct);

        assertEquals(180.0, cart.getTotalCost().doubleValue());
        assertEquals(16.0, cart.getTotalLevy().doubleValue());

        CategoryBProduct categoryBProduct2 = new CategoryBProduct("CategoryB 2", 20.0);
        cart.addItem(categoryBProduct2);

        assertEquals(200.0, cart.getTotalCost().doubleValue());
        assertEquals(20.0, cart.getTotalLevy().doubleValue());

    }
}