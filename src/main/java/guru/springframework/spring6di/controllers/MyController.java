/* Copyright Alcon 2023 */
package guru.springframework.spring6di.controllers;

import org.springframework.stereotype.Controller;

import guru.springframework.spring6di.services.GreetingService;
import guru.springframework.spring6di.services.GreetingServiceImpl;

@Controller
public class MyController {

    private final GreetingService greetingService;

    public MyController() {
        super();
        // bad example, controller has all the control on how greeting service gets created (dependency w/o injection)
        this.greetingService = new GreetingServiceImpl();
    }

    public void afterInit() {
        System.out.println("## - After Init - Called by Bean Post Processor");
    }

    public void beforeInit() {
        System.out.println("## - Before Init - Called by Bean Post Processor");
    }

    public String sayHello() {
        System.out.println("I'm in the controller");

        return this.greetingService.sayGreeting();
    }
}
