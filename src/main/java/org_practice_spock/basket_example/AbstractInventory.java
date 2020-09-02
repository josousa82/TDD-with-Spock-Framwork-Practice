package org_practice_spock.basket_example;

import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

/**
 * Created by sousaJ on 02/09/2020
 * in package - org_practice_spock.basket_example
 **/
public abstract class AbstractInventory {



    public int isProductAvailable(String productName, List<Product> products ) {
        return (int) products.stream().filter(product -> product.getName().equals(productName)).count();
    }

    public boolean isProductAvailable(String productName, List<Product> products, int count){
        return isProductAvailable(productName,products) == count;
    }

    public boolean isEmpty(List<Product> products){
        return products.isEmpty();
    }

    public boolean addProduct(Product product, List<Product> products){
        return products.add(product);
    }

    public void addQuantityOfProduct(Product product, List<Product> products, int quantity){
        for (int i = 0; i < quantity; i++) {
            products.add(product);
        }
    }

    public Map<String, Long> getProductTypesCount(List<Product> products){
        return products.stream()
                .map(AbstractInventory::apply)
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
    }
    private static String apply(Product p) {
        return p.getType().toLowerCase();
    }

    public void setWarehouseInventory(WareHouseInventory warehouseInventory){

    }

    public boolean canShipCompletely(){
        return false;
    }

    public Long getCurrentWeight(List<Product> products){
        return products.stream()
                .mapToLong(Product::getWeight)
                .sum();
    }



}
