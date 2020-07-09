package guru.springframework.sfgdi.services;


import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Service
@Profile("Cat")
public class CatPetService implements  PetService{
    @Override
    public String whichIsBestpet() {
        return "The best pet is Cat";
    }
}
