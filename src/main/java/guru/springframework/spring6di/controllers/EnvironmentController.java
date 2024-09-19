/* Copyright Alcon 2023 */
package guru.springframework.spring6di.controllers;

import org.springframework.stereotype.Controller;

import guru.springframework.spring6di.services.EnvironmentService;

@Controller
public class EnvironmentController {

    private final EnvironmentService environmentService;

    public EnvironmentController(final EnvironmentService environmentService) {
        super();
        this.environmentService = environmentService;
    }

    public String getEnvironment() {
        return "You are in the " + this.environmentService.getEnv() + " environment";
    }
}
