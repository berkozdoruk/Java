
package labguide12.q1;

import java.util.ArrayList;

public class AnimalList {

    private static ArrayList<Animal> animals = new ArrayList<Animal>();

    public static boolean addAnimal(Animal obj) {
        for (int i = 0; i <= animals.size(); i++) {
            if (!animals.isEmpty()) {
                if ((animals.get(i).id != obj.getId())) {
                    return animals.add(obj);
                }
            }
            else
                 return animals.add(obj);
        }
        return false;
    }

    public static boolean removeAnimal(int id) {

        for (int i = 0; i < animals.size(); i++) {
            if (animals.get(i).id == id) {
                return animals.remove(animals.get(i));
            }
        }
        return true;

    }

    public static Animal searchAnimal(int id) {

        for (int i = 0; i < animals.size(); i++) {
            if ((animals.get(i).id == id)) {
                return animals.get(i);
            }

        }
        return null;
    }

    public static ArrayList<Animal> getAllAnimals() {
        return animals;
    }

}
