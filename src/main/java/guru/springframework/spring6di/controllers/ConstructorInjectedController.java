/* Copyright Alcon 2023 */
package guru.springframework.spring6di.controllers;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

import guru.springframework.spring6di.services.GreetingService;

// best dependency injection method
@Controller // = spring managed component
public class ConstructorInjectedController {
    // set greetingService using constructor

    // final, private property
    private final GreetingService greetingService;

    // @Qualifer() = pick up that implementation of greeting service
    public ConstructorInjectedController(@Qualifier("greetingServiceImpl") final GreetingService greetingService) {
        super();
        this.greetingService = greetingService;
    }

    public String sayHello() {
        return this.greetingService.sayGreeting();
    }
}
