package basket_example_tests

import org_practice_spock.basket_example.Basket
import org_practice_spock.basket_example.Product
import spock.lang.Specification


class BasketTest extends Specification{

    def "A Basket with one product heas equal weight"(){

        given: "An empty basket and a TV"
            def basket = new Basket()
            def tv = Product.builder()
                    .name("Bravia")
                    .id(1L)
                    .price(1200)
                    .type("TV")
                    .weight(18)
                    .build();

        when: "user wants to buy the tv"
            basket.addProduct(tv)

        then:
        basket.currentWeight == tv.weight
    }
}
