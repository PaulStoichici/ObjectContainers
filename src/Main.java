import java.util.*;

public class Main {
    public static void main(String[] args) {
        TreeSet<Person> treeSetByName = new TreeSet<>(new PersonNameComparator());
        treeSetByName.add(new Person("Emil", 30));
        Employed adrian = new Employed("Adrian", 35);
        treeSetByName.add(adrian);
       Unemployed eva = new Unemployed("Eva",28);
       treeSetByName.add(eva);


        System.out.println("TreeSet sorted by name: " + treeSetByName);

        TreeSet<Person> treeSetByAge = new TreeSet<>(new PersonAgeComparator());
        treeSetByAge.add(new Person("Emil", 30));
        Employed adrian2 = new Employed("Adrian", 35);
        treeSetByAge.add(adrian2);
        Unemployed eva2 = new Unemployed("Eva",28);
        treeSetByAge.add(eva2);

        System.out.println("TreeSet sorted by age: " + treeSetByAge);

        Person emil = new Person("Emil", 30);
        Person emilInSet = treeSetByName.floor(emil);
        if (emilInSet != null) {
            List<String> addresses1 = new ArrayList<>();
            addresses1.add("Park Herastrau");
            addresses1.add("Park cismigiu");
            Hobby hobby = new Hobby("Running", 4, addresses1);
            emilInSet.addHobby(hobby);
            System.out.println("Emil has the hobby of " + emilInSet.getHobbies());
            System.out.println("Adresele unde practica Emil: "+emilInSet.getHobbies().get("Running").getAddresses());

        }
    }
}