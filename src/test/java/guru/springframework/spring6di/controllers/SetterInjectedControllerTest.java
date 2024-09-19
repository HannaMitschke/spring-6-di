/* Copyright Alcon 2023 */
package guru.springframework.spring6di.controllers;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class SetterInjectedControllerTest {

    @Autowired
    SetterInjectedController setterInjectedController;

    // @BeforeEach
    // void setUp() {
    // this.setterInjectedController = new SetterInjectedController();
    // this.setterInjectedController.setGreetingService(new GreetingServiceImpl());
    // }

    @Test
    void testSayHello() {
        System.out.println(this.setterInjectedController.sayHello());
    }

}
