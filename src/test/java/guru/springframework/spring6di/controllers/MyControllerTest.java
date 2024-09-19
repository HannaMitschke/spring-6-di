/* Copyright Alcon 2023 */
package guru.springframework.spring6di.controllers;

import org.junit.jupiter.api.Test;

class MyControllerTest {

    @Test
    void testSayHello() {
        final MyController myController = new MyController();

        System.out.println(myController.sayHello());
    }

}
