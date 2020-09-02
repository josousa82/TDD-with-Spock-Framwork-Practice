package org_practice_spock.basket_example;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * Created by sousaJ on 02/09/2020
 * in package - org_practice_spock.basket_example
 **/
public class Basket extends AbstractInventory implements InventoryInterface, BasketInterface{

    public List<Product> basketProducts = new ArrayList<>();

    public boolean addProduct(Product product){
        return super.addProduct(product, this.basketProducts);
    }

    public void addQuantityOfProduct(Product product, int quantity){
            super.addQuantityOfProduct(product, this.basketProducts, quantity);
    }

    public int getCurrentWeight(){
        return super.getCurrentWeight(this.basketProducts).intValue();
    }

    public Map<String, Long> getProductTypeCount(){
        return super.getProductTypesCount(this.basketProducts);
    }



    public static void main(String[] args) {


       List<Product> products = new ArrayList<>();
       Basket basket = new Basket();

        Product product1 = Product.builder()
                .name("product 1")
                .id(1L)
                .price(10)
                .type("T")
                .weight(10)
                .build();
        Product product5 = Product.builder()
                .name("product 1")
                .id(1L)
                .price(10)
                .type("t")
                .weight(10)
                .build();
        Product product2 = Product.builder()
                .name("product 2")
                .id(2L)
                .price(20)
                .type("T")
                .weight(20)
                .build();
        Product product3 = Product.builder()
                .name("product 1")
                .id(1L)
                .price(10)
                .type("C")
                .weight(10)
                .build();
        Product product4 = Product.builder()
                .name("product 2")
                .id(2L)
                .price(20)
                .type("C")
                .weight(20)
                .build();

        products.add(product1);
        products.add(product2);
        products.add(product3);
        products.add(product4);
        products.add(product1);
        products.add(product2);
        products.add(product3);
        products.add(product4);
        products.add(product5);

        Map<String, Long> productTypesCount = basket.getProductTypesCount(products);
        System.out.println("productTypesCount = " + productTypesCount);
        basket.addProduct(product1);


    }

}
