package org_practice_spock.basket_example;

import lombok.*;

import java.util.function.Supplier;

/**
 * Created by sousaJ on 02/09/2020
 * in package - org_practice_spock.basket_example
 **/
@Data
@Builder
public class Product {
    Long id;
    private String name;
    private int price;
    private int weight;
    private String type;

}
