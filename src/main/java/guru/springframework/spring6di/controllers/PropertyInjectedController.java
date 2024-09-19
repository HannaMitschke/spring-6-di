/* Copyright Alcon 2023 */
package guru.springframework.spring6di.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

import guru.springframework.spring6di.services.GreetingService;

// worst dependency injection method == field injection
@Controller // = spring managed component
public class PropertyInjectedController {
    // set greetingService by directly accessing property

    @Qualifier("propertyGreetingService")
    @Autowired // spring doesn't know what to do in this case w/o this
    GreetingService greetingService;

    public String sayHello() {
        return this.greetingService.sayGreeting();
    }

}
