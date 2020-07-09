package guru.springframework.sfgdi.services;


import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Profile("EN")
@Service("i18nService")
public class I18nEnglishGreeatingService implements GreetingService{


    @Override
    public String seyGreeting() {
        return "Hello World - in English";
    }
}
