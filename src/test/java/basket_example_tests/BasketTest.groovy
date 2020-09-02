package basket_example_tests

import org_practice_spock.basket_example.Basket
import org_practice_spock.basket_example.Product
import spock.lang.Shared
import spock.lang.Specification


class BasketTest extends Specification{

    @Shared
    def tv

    @Shared
    def camera

    void setupSpec(){
        tv = Product.builder()
                .name("Bravia")
                .id(1L)
                .price(1200)
                .type("TV")
                .weight(18)
                .build();
        camera = Product.builder()
                .name("Panasonic")
                .id(2L)
                .price(350)
                .type("camera")
                .weight(2)
                .build();
    }

    def "A Basket with one product heas equal weight"(){
        given: "An empty basket and a TV"
            def basket = new Basket()

        when: "user wants to buy the tv"
            basket.addProduct(tv)

        then:
        basket.currentWeight == tv.weight
    }

    def "A Basket with two products weights as their sum"(){
        given: "An empty Basket"
            def basket = new Basket()
        when: "User buys a tv and a camera"
            basket.addProduct(tv)
            basket.addProduct(camera)

        then:
        basket.currentWeight == (tv.weight + camera.weight)
    }
}
