package Lesson_11;

import Lesson_11.Pets.Cat;
import Lesson_11.Pets.Crocodile;
import Lesson_11.Pets.Dog;
import Lesson_11.Pets.Pet;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Set<String> set =  new HashSet<>();
        set.add("hello");
        set.add("world");
        set.add(" !");
        set.add("Oh");

        System.out.println(set);

        System.out.println();

        // task 2
        System.out.println("Task 2");
        Set<Integer> set1 = new TreeSet<>();
        set1.add(1);
        set1.add(10);
        set1.add(55);
        set1.add(4);
        set1.add(25);
        set1.add(9);
        set1.add(658);

        System.out.println(set1);
        System.out.println();

        // task 3
        System.out.println("Task 3");
        Dog dog = new Dog("Pirat");
        Dog dog1 = new Dog("Jo");
        Dog dog2 = new Dog("Dinar");

        Set<Dog> set2 = new HashSet<>();
        set2.add(dog1);
        set2.add(dog);
        set2.add(dog2);
        for (Dog d: set2) System.out.println(d.getName());
        System.out.println();

        // task 4
        System.out.println("Task 4");
        Set <Cat> set3 = createCats();
        set3.remove(set3.toArray()[0]);
        printCats(set3);

        // task 5
        System.out.println();
        System.out.println("Task 5");
        Set<Integer> set4 =new HashSet<>();
        Set<Integer> set5 =new HashSet<>();
        set4.add(11);
        set4.add(22);
        set4.add(33);

        set5.add(44);
        set5.add(55);
        set5.add(66);

        Set<Integer> unionSet = union(set4, set5);
        System.out.println(unionSet);

        //task 6
        System.out.println();
        System.out.println("Task 6");
        Map<Integer, String> map = new HashMap<>();
        map.put(4, "honey");
        map.put(3, "No");
        map.put(2, "money");
        map.put(1, "No ");

        for (Map.Entry<Integer, String> entry: map.entrySet()){
            System.out.print(entry.getValue() + " ");
        }
        System.out.println();

        //task 7
        System.out.println();
        System.out.println("Task 7");
        Map<String, String> map1 = new HashMap<>();
        map1.put("кавун", "ягода");
        map1.put("банан", "фрукт");
        map1.put("мандарин", "ягода");
        map1.put("вишня", "ягода");
        map1.put("малина", "ягода");
        map1.put("слива", "фрукт");
        map1.put("яблуко", "фрукт");
        map1.put("картопля", "корнеплід");
        map1.put("морква", "корнеплід");
        map1.put("буряк", "корнеплід");

        for (Map.Entry<String, String> entry: map1.entrySet()){

            System.out.print(entry.getKey() + " - це " + entry.getValue() + ", ");
        }
        System.out.println();

        // task 8
        System.out.println();
        System.out.println("Task 8");
        Toy carToy = new Toy("Машинка на радіоуправлінні");
        Toy bearToy = new Toy("Плюшевий медвідь");
        Toy planeToy = new Toy("Літак");
        Toy gunWaterToy = new Toy("Водяний пістолет");
        Toy doll = new Toy("Лялька");

        Map<String, Toy> toyMap = new HashMap<>();
        toyMap.put(carToy.getName(), carToy);
        toyMap.put(bearToy.getName(), bearToy);
        toyMap.put(planeToy.getName(), planeToy);
        toyMap.put(gunWaterToy.getName(), gunWaterToy);
        toyMap.put(doll.getName(), doll);

        for (Map.Entry<String, Toy> toyEntry: toyMap.entrySet()){
            System.out.println(toyEntry.getValue().getName() + ", ");
        }

        // task 9
        System.out.println();
        System.out.println("Task 9");
        Dog dog3 = new Dog("Блек");
        Crocodile crocodile = new Crocodile("Геннадій");
        Cat cat = new Cat("Васька");

        Map<String, Pet> petMap = new HashMap<>();
        petMap.put(cat.getName(), cat);
        petMap.put(dog3.getName(), dog3);
        petMap.put(crocodile.getName(), crocodile);

        for(Map.Entry<String, Pet> petEntry: petMap.entrySet() ){
            petEntry.getValue().getWhoAmI();
            System.out.println(petEntry.getValue().getName());
        }






    }
    // Task 4
    public static Set createCats(){
        Cat cat = new Cat("Tom");
        Cat cat1 =  new Cat("Pushok");
        Cat cat2 = new Cat("Snizhok");
        Set<Cat> catSet = new HashSet<>();
        catSet.add(cat1);
        catSet.add(cat2);
        catSet.add(cat);

        return catSet;
    }
    // task 4
    public static void printCats(Set<Cat> catSet){
        for (Cat c: catSet){
            System.out.println(c.getName());
        }
    }

    // task 5
    public static Set union (Set<Integer> integers_1, Set<Integer> integers_2){
        Set<Integer> unionSet = new HashSet<>();
        for (Integer i: integers_1){
            unionSet.add(i);
        }
        for (Integer j: integers_2){
            unionSet.add(j);
        }
        return unionSet;
    }
}
