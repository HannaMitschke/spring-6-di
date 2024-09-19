/* Copyright Alcon 2023 */
package guru.springframework.spring6di.services.i18n;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import guru.springframework.spring6di.services.GreetingService;

// @Profile("EN") // service will only be brought into context if ActiveProfiles = EN
@Profile({ "EN", "default" }) // active when no active profiles are available
@Service("i18NService")
public class EnglishGreetingService implements GreetingService {

    @Override
    public String sayGreeting() {
        return "Hello World - EN";
    }

}
