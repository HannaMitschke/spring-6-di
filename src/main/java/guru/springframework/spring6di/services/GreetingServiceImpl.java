/* Copyright Alcon 2023 */
package guru.springframework.spring6di.services;

import org.springframework.stereotype.Service;

@Service // = spring managed component
public class GreetingServiceImpl implements GreetingService {

    @Override
    public String sayGreeting() {
        return "Hello Everyone From Base Service!!!";
    }

}
