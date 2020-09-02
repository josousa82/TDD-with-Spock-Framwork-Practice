package basket_example_tests

import org_practice_spock.basket_example.Basket
import org_practice_spock.basket_example.Product
import spock.lang.Shared
import spock.lang.Specification


class BasketTest extends Specification{

    @Shared def tv
    @Shared def camera
    @Shared def hifi

    void setupSpec(){
        tv = new Product(1L,"Bravia", 1200,  18,"TV" )
        camera = new Product(2L,"Panasonic", 350,  2,"camera" )
        hifi = new Product(3L,"jvc", 600,  5,"HiFi" )
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

    def " A basket with three products weights as their sum"(){
        given: "Given an empty basket"
            def basket = new Basket()

        when: "User buys three products"
            basket.addProduct(tv)
            basket.addProduct(camera)
            basket.addProduct(hifi)

        then: "Basket weight should be the sum of the products in the basket"
        basket.currentWeight == (tv.weight + camera.weight + hifi.weight)

    }


}
