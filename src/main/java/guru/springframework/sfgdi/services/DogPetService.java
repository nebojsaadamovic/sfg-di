package guru.springframework.sfgdi.services;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Service
@Profile({"Dog","default"})
public class DogPetService implements PetService {
    @Override
    public String whichIsBestpet() {
        return "The best is Dog pet";
    }
}
