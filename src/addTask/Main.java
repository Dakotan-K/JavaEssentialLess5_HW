package addTask;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<>();

        list.add("Мария Ивановна");
        list.add("Анастасия Филипповна");
        list.add("Светлана Николаевна");
        list.add("Нина Сергеевна");
        list.add("Ирина Борисовна");

        System.out.println(Arrays.toString(list.toArray()));
        System.out.println("Лучший учитель: Мария Ивановна, индекс учителя - " + list.indexOf("Мария Ивановна"));
        System.out.println("Учитель не очень: Ирина Борисовна, индекс учителя - " + list.indexOf("Ирина Борисовна"));

        for (String list1 : list) {
            System.out.println(list1);
        }
    }
}
