package models;



import java.util.ArrayList;
import java.util.List;

public class hero {
    private String name;
    private int age;
    private String power;
    private String weakness;
    private int id;
    private static List<hero> instances = new ArrayList<hero>();

    public hero (String name, Integer age, String power, String weakness){
        this.name = name;
        this.age = age;
        this.power = power;
        this.weakness = weakness;
        id = instances.size();
        instances.add(this);
    }

//    public static hero setUpNewHero() {
//        return null;
//    }

    //Return

    public String getName(){
        return name;
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


    public static List<hero> all() {
        return instances;
    }

    public static void clear() {
        instances.clear();
    }



    //Clear heroes

    public static void clearHeroes (){
        instances.clear();
    }

    //get heroes id

    public int getId(){
        return id;
    }

    public static hero find(int id) {
        try {
            return instances.get(id - 1);
        } catch (IndexOutOfBoundsException exception) {
            return null;
        }
    }

    public static boolean findHeroByName(String name)
    {
        boolean isAvailable = false;
        for (int i =0; i<instances.size(); i++)
        {
            if (name.equalsIgnoreCase(instances.get(i).name) )
            {
                isAvailable = true;
            }
        }

        return isAvailable;
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

