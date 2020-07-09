package guru.springframework.sfgdi.services;


import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

@Primary
@Service
public class PrimaryGreetingService implements GreetingService{


    @Override
    public String seyGreeting() {
        return "Hello World - from Primary Service Bean";
    }
}
