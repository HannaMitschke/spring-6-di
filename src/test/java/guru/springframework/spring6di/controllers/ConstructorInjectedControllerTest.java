/* Copyright Alcon 2023 */
package guru.springframework.spring6di.controllers;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class ConstructorInjectedControllerTest {

    @Autowired
    ConstructorInjectedController constructorInjectedController;

    // @BeforeEach
    // void setUp() {
    // this.constructorInjectedController = new ConstructorInjectedController(new GreetingServiceImpl());
    // }

    @Test
    void testSayHello() {
        System.out.println(this.constructorInjectedController.sayHello());
    }

}
