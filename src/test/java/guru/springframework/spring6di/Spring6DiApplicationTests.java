/* Copyright Alcon 2023 */
package guru.springframework.spring6di;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;

import guru.springframework.spring6di.controllers.MyController;

@SpringBootTest
class Spring6DiApplicationTests {

    @Autowired
    ApplicationContext applicationContext;

    @Autowired
    MyController       myController;

    @Test
    void contextLoads() {
    }

    @Test
    // spring is injecting the application context
    void testAutowireOfController() {
        System.out.println(this.myController.sayHello());
    }

    @Test
    // manually injecting a controller instance
    void testGetControllerFromCtx() {
        final MyController myController = this.applicationContext.getBean(MyController.class);

        System.out.println(myController.sayHello());
    }

}
