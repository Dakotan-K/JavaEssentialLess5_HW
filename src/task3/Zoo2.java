package task3;

import java.util.ArrayList;

public class Zoo2 {
    public static void main(String[] args) {

        ArrayList<String> animalsList = new ArrayList<>();

        animalsList.add(0, "Dog");
        animalsList.add(1, "Cat");
        animalsList.add(2, "Horse");
        animalsList.add(3, "Cow");
        animalsList.add(4, "Elephant");
        animalsList.add(5, "Giraffe");
        animalsList.add(6, "Hamster");
        animalsList.add(7, "Lion");

        System.out.println(animalsList);

        animalsList.remove(2);
        animalsList.remove("Elephant");
        animalsList.remove("Hamster");

        System.out.println(animalsList.size());

        System.out.println(animalsList);

        animalsList.add("Pig");
        System.out.println(animalsList);

        System.out.println(animalsList.contains("Lion"));

        animalsList.clear();
        System.out.println(animalsList);
    }
}
