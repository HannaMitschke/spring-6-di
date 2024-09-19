/* Copyright Alcon 2023 */
package guru.springframework.spring6di.services;

import org.springframework.stereotype.Service;

@Service("propertyGreetingService") // custom name (default is greetingServicePropertyInjected)
public class GreetingServicePropertyInjected implements GreetingService {

    @Override
    public String sayGreeting() {
        return "Friends don't let friends do property injection!!!!";
    }

}
