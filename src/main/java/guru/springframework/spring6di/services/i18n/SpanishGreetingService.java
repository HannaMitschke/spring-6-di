/* Copyright Alcon 2023 */
package guru.springframework.spring6di.services.i18n;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import guru.springframework.spring6di.services.GreetingService;

@Profile("ES") // service will only be brought into context if ActiveProfiles = ES
@Service("i18NService")
public class SpanishGreetingService implements GreetingService {

    @Override
    public String sayGreeting() {
        return "Hola Mundo - ES";
    }

}
