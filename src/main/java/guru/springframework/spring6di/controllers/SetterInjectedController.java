/* Copyright Alcon 2023 */
package guru.springframework.spring6di.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

import guru.springframework.spring6di.services.GreetingService;

// better dependency injection method
@Controller // = spring managed component
public class SetterInjectedController {
    // set greetingService using setter

    private GreetingService greetingService;

    public String sayHello() {
        return this.greetingService.sayGreeting();
    }

    @Autowired
    public void setGreetingService(@Qualifier("setterGreetingBean") final GreetingService greetingService) {
        this.greetingService = greetingService;
    }

}
