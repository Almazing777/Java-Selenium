package sprintFour;

import java.util.*;


public class Collections {
    public static void main(String[] args){
//      Write a Java program to test if a map contains a mapping for the specified key.
        Map<Integer, String> map1 = new HashMap<>();
        map1.put(1, "JavaScript");
        map1.put(2, "Python");
        map1.put(3, "Java");
        map1.put(4, "C++");
        map1.put(5, "MySQL");

//      Write a Java program to copy all of the mappings from the specified map to another map.
        boolean check = map1.containsKey(2);
        System.out.println(check);

        Map<Integer, String> map2 = new HashMap<>();
        map2.putAll(map1);
        System.out.println("Map is being copied to Map2: " + map2);

//      Remove a value from HashMap based on key
        map1.remove(3);
        System.out.println(map1);

//      Part 2 Sets:
//      Initiate a Set. Using For loop add integers from 1 to 10
        Set<Integer> hset = new HashSet<>();
        for (int i = 1; i <= 10; i++) {
            hset.add(i);
        }
        System.out.println(hset);

//      Remove all odd numbers from sets.
        Iterator<Integer> iterator = hset.iterator();
        while(iterator.hasNext()){
            Integer i = iterator.next();
            if(i % 2 == 1){
                iterator.remove();
            }
        }
        System.out.println(hset);

//      Try to create a set with duplicate values
        try{
            hset.add(12);
            hset.add(12);
            hset.add(30);
            hset.add(30);
            hset.add(2);
            System.out.println("adding entries, but not allowing duplicates " + hset);
        } catch(Exception e){
            System.out.println("can't add duplicates");
        }
//
//      Part 3 Lists:
//      Initiate an Arraylist. Using For loop add integers from 1 to 10
        ArrayList<Integer> array = new ArrayList<>();
        for (int i = 1; i < 11; i++) {
            array.add(i);
        }
        System.out.println(array);

//      Create an ArrayList [1,2,3,6,7,3,2,1]. Remove all 2 from Arraylist
        ArrayList<Integer> newarr = new ArrayList<>(Arrays.asList(1,2,3,4,6,7,3,2,1));
        System.out.println(newarr);

        newarr.removeAll(Arrays.asList(2));
        System.out.println(newarr);

//      Remove all odd numbers;
        Iterator<Integer> numbers = newarr.iterator();
        while(numbers.hasNext()){
            Integer i = numbers.next();
            if(i % 2 == 1){
                numbers.remove();
            }
        }
        System.out.println(newarr);

    }

}
