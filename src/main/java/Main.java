import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashMap;

public class Main {

    public static void main(String[] args) {

        HashMap<String, String> ownersAnimals= new HashMap<>();
        ownersAnimals.put("Kacpi", "Wilczurek");
        ownersAnimals.put("agi","Chmurka");
        ownersAnimals.put("Nowak", "Burek");
        ownersAnimals.put("Kowalski", "Azor");
        ownersAnimals.put("Migdal", "Kora");

//        System.out.println(ownersAnimals.get("agi"));

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

//        System.out.println(ownersAnimals2.get("Wilczurek"));


        HashMap<Owner, Dog> ownersDog = new HashMap<>();

        Owner kacpi = new Owner(1, "Kacpi", "Wilczurek", "kacpiwilczurek@buziaczek.pl", "+48782483985");
        Owner agi = new Owner(2, "Agi", "Wilczurek", "agiwilczurek@buziaczek.pl", "+48724153130");
        Owner robert = new Owner(3, "Robert", "Migdal", "wujekrobert@buziaczek.pl", "+48724153130");
        Owner darek = new Owner(4, "Darek", "Daro", "darodario@buziaczek.pl", "+48724153130");
        Owner monika = new Owner(5, "Monika", "Brozek", "monikabrozek@buziaczek.pl", "+48724153130");

        Dog chmura = new Dog(9, "Chmurka", 31.5, "Samoyed",1);
        Dog barnabasz = new Dog(8, "Barnabasz", 27.9, "Wilczur", 2);
        Dog adas = new Dog(7, "Adas", 13.6, "Szibka", 3);
        Dog kora = new Dog(6, "Kora", 13.1, "Wilczur", 8);
        Dog dario = new Dog(5, "Dario", 12.9, "Kundelek", 4);
        Dog boskiOski = new Dog(4, "Oski", 34, "Blablador", 6);

        ownersDog.put(kacpi,barnabasz );
        ownersDog.put(agi, chmura);
        ownersDog.put(robert, kora);
        ownersDog.put(darek,dario);
        ownersDog.put(monika,boskiOski);

        var result = ownersDog.get(kacpi);
        System.out.println(result.getName());


        ArrayList<Dog> dogs = new ArrayList<>();
        dogs.add(chmura);
        dogs.add(adas);

        HashMap<Owner, ArrayList> ownersDogs = new HashMap<>();
        ownersDogs.put(agi, dogs);


    }
}
