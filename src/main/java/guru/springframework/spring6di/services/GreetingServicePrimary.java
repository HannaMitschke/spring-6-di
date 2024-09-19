/* Copyright Alcon 2023 */
package guru.springframework.spring6di.services;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

@Primary // give this greeting service preference over other instances of greeting services
@Service
public class GreetingServicePrimary implements GreetingService {

    @Override
    public String sayGreeting() {
        return "Hello from the Primary Bean!!";
    }

}
