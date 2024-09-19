/* Copyright Alcon 2023 */
package guru.springframework.spring6di;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import guru.springframework.spring6di.controllers.MyController;

@SpringBootApplication
public class Spring6DiApplication {

    public static void main(final String[] args) {

        final ApplicationContext ctx = SpringApplication.run(Spring6DiApplication.class, args);

        // spring context sees controller that has been annotated with @Controller
        final MyController controller = ctx.getBean(MyController.class);

        System.out.println("In main method");
        System.out.println(controller.sayHello());
    }

}
