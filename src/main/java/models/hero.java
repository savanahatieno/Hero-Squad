package models;

import java.util.ArrayList;

public class hero {
    private String name;
    private int age;
    private String power;
    private String weakness;
    private int id;
    private static  ArrayList instances = new ArrayList();

    public hero (String name, Integer age, String power, String weakness){
        this.name = name;
        this.age = age;
        this.power = power;
        this.weakness = weakness;
        this.id = instances.size();
        instances.add(this);
    }

//    public static hero setUpNewHero() {
//        return null;
//    }

    //Return

    public String getName(){
        return this.name;
    }
     //Age
    public int getAge(){
        return this.age;
    }

    //Power
    public String getPower(){
        return this.power;
    }

    //Weakness

    public String getWeakness(){
        return this.weakness;
    }

    //getting all instances

    public static ArrayList getInstances(){
        return instances;
    }

    //Clear heroes

    public static void clearHeroes (){
        instances.clear();
    }

    //get heroes id

    public int getId(){
        return id;
    }

    public static Object findById (int id){
        return instances.get(id-1);
    }


    //creating setter methods

    public static hero setUpNewHero1(){
        return new hero ("Aang", 130 , "Air Bender","Killing");
    }

    public static hero setUpNewHero2(){
        return new hero ("Katara", 24 , "Water Bender","Killing");
    }

    public static hero setUpNewHero3(){
        return new hero ("Zuko", 26 , "Fire Bender","Love");
    }

    public static hero setUpNewHero4(){
        return new hero ("Toph Beifong", 18, "Metal Bender","Emotions");
    }
}
