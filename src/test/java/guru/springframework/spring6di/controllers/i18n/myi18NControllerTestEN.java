/* Copyright Alcon 2023 */
package guru.springframework.spring6di.controllers.i18n;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;

@ActiveProfiles("EN") // will ignore Spanish b/c ES profile is not active
@SpringBootTest
class myi18NControllerTestEN {

    @Autowired
    Myi18NController myi18NController;

    @Test
    void sayHello() {
        System.out.println(this.myi18NController.sayHello());
    }

}
