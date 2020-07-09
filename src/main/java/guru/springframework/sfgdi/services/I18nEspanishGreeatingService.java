package guru.springframework.sfgdi.services;


import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Profile({"ES","default"})
@Service("i18nService")
public class I18nEspanishGreeatingService implements GreetingService {
    @Override
    public String seyGreeting() {
        return "Helou Mondo-in Spanish";
    }
}
