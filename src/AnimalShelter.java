import java.util.ArrayList;
import java.util.List;

/**
 * Created by Niklas on 2016-02-07.
 */

/*Titta på koden för AnimalShelter med tillhörande kring-klasser. 
 * Kika särskilt på
ShelterError. Hur kan vi tänka om, så att det inte är möjligt 
att sätta hundar i ett katt-
    hem, och vice versa, utan att förlora code reuse eller 
    extensibility? Vi vill få ett statiskt
     felmeddelande, inte ett fel (exception) vid runtime.*/

public class AnimalShelter {

    private List<Animal> animalsInShelter = new ArrayList<>(20);

    Animal adoptAnimal(){
        return animalsInShelter.remove(0);
    }

    void putAnimal(Animal animal){
        animalsInShelter.add(animal);
    }

}
