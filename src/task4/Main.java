package task4;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class Main {
    public static void main(String[] args) {

        ArrayList <Integer> listInteger = new ArrayList<>();

        listInteger.add(5);
        listInteger.add(10);
        listInteger.add(15);
        listInteger.add(20);
        listInteger.add(25);

//        Iterator<Integer> iterator = listInteger.iterator();
//        while (iterator.hasNext()) {
//            Integer integer = iterator.next();
//            integer ++;
//            System.out.println(integer);
//        }

        ListIterator<Integer> iterator1 = listInteger.listIterator();
        while (iterator1.hasNext()) {
            Integer integer1 = iterator1.next();
            integer1 ++;
            System.out.println(integer1);
        }
    }
}
