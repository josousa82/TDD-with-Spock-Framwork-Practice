package basket_example_tests

import org_practice_spock.basket_example.Product
import spock.lang.Specification


class BasketTest extends Specification{

    def "A Basket with one product heas equal weight"(){
        given:
        def tv = Product.builder()
        .id(3)
        .name("bravia")
        .price(1200)
        .type("tv")
//        when:
//        then:
//        true
    }
}
