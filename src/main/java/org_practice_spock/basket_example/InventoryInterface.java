package org_practice_spock.basket_example;

import java.util.List;
import java.util.Map;

/**
 * Created by sousaJ on 02/09/2020
 * in package - org_practice_spock.basket_example
 **/
public interface InventoryInterface {
     int isProductAvailable(String productName, List<Product> products );
     boolean isProductAvailable(String productName, List<Product> products, int count);
     boolean isEmpty(List<Product> products);

     boolean addProduct(Product product);
     void addQuantityOfProduct(Product product, int quantity);
     Map<String, Long> getProductTypesCount(List<Product> products);
     void setWarehouseInventory(WareHouseInventory warehouseInventory);
     boolean canShipCompletely();


}
