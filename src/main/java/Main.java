import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashMap;

public class Main {

    public static void main(String[] args) {

        HashMap<String, String> ownersAnimals= new HashMap<>();
        ownersAnimals.put("Kacpi", "Wilczurek");
        ownersAnimals.put("Agi","Chmurka");
        ownersAnimals.put("Nowak", "Burek");
        ownersAnimals.put("Kowalski", "Azor");
        ownersAnimals.put("Migdal", "Kora");

        System.out.println(ownersAnimals.get("Agi"));

        ArrayList <String> wilczureksAnimals = new ArrayList<>();
        wilczureksAnimals.add("Chmurka");
        wilczureksAnimals.add("Wilczurek");
        wilczureksAnimals.add("Barnabasz");

        ArrayList<String> ktostamAnimals = new ArrayList<>();
        ktostamAnimals.add("Azor");
        ktostamAnimals.add("Burek");
        ktostamAnimals.add("Murzyn");

        HashMap<String, ArrayList> ownersAnimals2 = new HashMap<>();
        ownersAnimals2.put("Wilczurek", wilczureksAnimals);
        ownersAnimals2.put("Ktostam", ktostamAnimals);

        System.out.println(ownersAnimals2.get("Wilczurek"));


        HashMap<Owner, Dog> ownersDog = new HashMap<>();

        Owner Kacpi = new Owner(1, "Kacpi", "Wilczurek", "kacpiwilczurek@buziaczek.pl", 782483985);
        Owner Agi = new Owner(2, "Agi", "Wilczurek", "agiwilczurek@buziaczek.pl", 724153130);

        Dog Chmura = new Dog(9, "Chmurka", 31.5, "Samoyed",1, Agi);
        Dog Barnabasz = new Dog(8, "Barnabasz", 27.9, "Wilczur", 2, Kacpi);
        Dog Adas = new Dog(7, "Adas", 13.6, "Szibka", 3, Agi);

        ownersDog.put(Kacpi,Barnabasz );
        ownersDog.put(Agi, Chmura);

        var result = ownersDog.get(Kacpi);
        System.out.println(result.getName());


        ArrayList<Dog> dogs = new ArrayList<>();
        dogs.add(Chmura);
        dogs.add(Adas);

        HashMap<Owner, ArrayList> ownersDogs = new HashMap<>();
        ownersDogs.put(Agi, dogs);


    }
}
