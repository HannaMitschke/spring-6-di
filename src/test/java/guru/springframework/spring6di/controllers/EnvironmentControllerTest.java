/* Copyright Alcon 2023 */
package guru.springframework.spring6di.controllers;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;

@ActiveProfiles({ "prod", "EN" })
@SpringBootTest
class EnvironmentControllerTest {

    @Autowired
    EnvironmentController enviornmentController;

    @Test
    void getEnvironment() {
        System.out.println(this.enviornmentController.getEnvironment());
    }

}
