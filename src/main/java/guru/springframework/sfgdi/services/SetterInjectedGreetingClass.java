package guru.springframework.sfgdi.services;

import org.springframework.stereotype.Service;

@Service
public class SetterInjectedGreetingClass implements GreetingService {

    @Override
    public String seyGreeting() {
        return "Hello Worldd - Setter";
    }
}

