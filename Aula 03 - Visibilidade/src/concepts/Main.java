package concepts;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.*;

/*
 Visibility: public, protected, default and private.
 UML: + [public], - [private] and # [protected].
 Getter and Setters.
 API Collections.
 Interator.
 LocalDate.
*/
public class Main {

    public static void main(String[] args){
        System.out.println(Collections.min(Arrays.asList(10,2,5,20,1,100)));
        System.out.println(Collections.max(Arrays.asList(10,2,5,20,1,100)));
        System.out.println();

        LinkedList<Integer> myList = new LinkedList<>(Arrays.asList(10,5,100,20,1));

        for (int number: myList) {
            System.out.print(number + " ");
        }
        System.out.println("\n");

        HashMap<String, Integer> myHashMap = new HashMap<String, Integer>();

        myHashMap.put("Diego", 35);
        myHashMap.put("Amanda", 28);
        myHashMap.put("Rodrigo", 20);

        for (String name: myHashMap.keySet()) {
            System.out.println(name + " : " + myHashMap.get(name));
        }
        System.out.println();

        Iterator myHashMapIterator = myHashMap.entrySet().iterator();

        while (myHashMapIterator.hasNext()){
            System.out.println(myHashMapIterator.next());
        }

        System.out.println();
        LocalDate todayDate = LocalDate.now();
        LocalTime todayTime = LocalTime.now();
        System.out.println(todayDate);
        System.out.println(todayTime);
    }
}
