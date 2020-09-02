package org_practice_spock.basket_example;

import lombok.Data;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by sousaJ on 02/09/2020
 * in package - org_practice_spock.basket_example
 **/
@Data
public class WareHouseInventory extends AbstractInventory implements InventoryInterface{

    List<Product> inventory = new ArrayList<>();

}
