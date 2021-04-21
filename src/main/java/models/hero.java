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
     //Power
    public int getAge(){
        return this.age;
    }

}
