import java.util.ArrayList;
import java.util.HashMap;

class Animal {

}

/**
 * Created by LordwolF on 8/8/2016.
 */


public class App {
    public static void main(String[] args) {


        /////// before java 5 ///////////
        ArrayList list = new ArrayList();

        list.add("apple");
        list.add("banana");
        list.add("orange");

        String fruit = (String)list.get(1);

        System.out.println(fruit);

        /////now we have generics

        ArrayList<String> strings = new ArrayList<String>();

        strings.add("cat");
        strings.add("dog");
        strings.add("alligator");

        String animal = strings.get(1);
        System.out.println(animal);

        ///////////there can bve more than 1 type of arguemanet

        HashMap<Integer, String> map = new HashMap<Integer, String>();

        ///////////////Java 7 style empty <> allow multiple types

        ArrayList<Animal> someList = new ArrayList<>();


    }

}
