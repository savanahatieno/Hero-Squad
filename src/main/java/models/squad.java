package models;


import java.util.ArrayList;
import java.util.List;

public class squad {

    private String squadName;
    private int squadQuantity;
    private String squadReason;
    private int squadId;
    private ArrayList squadMembers = new ArrayList();
    private static ArrayList instances = new ArrayList();


    public squad (String name, int quantity, String reason){
        this.squadName = name;
        this.squadQuantity = quantity;
        this.squadReason = reason;
        this.squadMembers = new ArrayList();
        final boolean add = instances.add(this);
        this.squadId = instances.size();
    }

    public squad(int parseInt, String name, String cause) {
    }

    public String getSquadName(){
        return squadName;
    }
    public int getSquadQuantity(){
        return squadQuantity;
    }
    public String getSquadReason(){
        return squadReason;
    }
    public int getSquadId(){
        return squadId;
    }
    public static Object findBySquadId (int id){
        return instances.get(id -1);
    }

    //ArrayLIst
    public static ArrayList getInstances(){
        return instances;
    }

    public ArrayList getSquadMembers(){
        return squadMembers;
    }

    //Setter methods

    public void setSquadMembers( hero newMember){
        squadMembers.add(newMember);
    }

    //clearing all Members
    public static void clearAllSquads(){
        instances.clear();
    }
    public void clearAllSquadMembers(){
        getSquadMembers().clear();
    }

    //Setting new members

    public static squad setUpNewSquad1 (){
        return  new squad("Team Avatar", 4,"Defeat the fire nation");
    }

    public static squad setUpNewSquad2 (){
        return  new squad("Winter Soldier", 6,"Defeat the Super Soldiers");
    }

    public static squad setUpNewSquad3 (){
        return  new squad("DareDevil", 2,"Save New York");
    }

    public static squad setUpNewSquad4 (){
        return  new squad("Infinity ", 12,"Defeat Aliens");
    }


}
