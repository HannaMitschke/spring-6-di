/* Copyright Alcon 2023 */
package guru.springframework.spring6di.controllers;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class PropertyInjectedControllerTest {

    @Autowired
    PropertyInjectedController propertyInjectedController;

    // @BeforeEach
    // void setUp() {
    // this.propertyInjectedController = new PropertyInjectedController();
    // this.propertyInjectedController.greetingService = new GreetingServiceImpl();
    // }

    @Test
    void testSayHello() {
        System.out.println(this.propertyInjectedController.sayHello());
    }

}
