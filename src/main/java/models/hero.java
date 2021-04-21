package models;

import java.util.ArrayList;
import javax.swing.text.html.HTMLWriter;
import java.lang.reflect.Array;

public class hero {
    private String name;
    private int age;
    private String power;
    private String weakness;
    private int id;
    private static  ArrayList instances = new ArrayList();

    public hero (String name, Integer age, String power, String weakness,){
        this.name = name;
        this.age = age;
        this.power = power;
        this.weakness = weakness;
        this.id = instances.size();
        instances.add(this);
    }

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

    //Find Id
    public static hero findById (int id){
        return instances.get(int id);
    }

    //creating setter methods

    public static hero setUpNewHero(){
        return new hero ("Aang", 30 , "Air Bender","Killing");
    }
}
