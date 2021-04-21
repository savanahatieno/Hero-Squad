package models;


import java.util.ArrayList;

public class squad {

    private String squadName;
    private int squadQuantity;
    private String squadReason;
    private int squadId;
    private ArrayList squadMembers = new ArrayList();
    private static ArrayList instances = new ArrayList();


    public squad (String name, int quantity, String reason, String cause){
        this.squadName = name;
        this.squadQuantity = quantity;
        this.squadReason = reason;
        this.squadMembers = new ArrayList();
        final boolean add = instances.add(this);
        this.squadId = instances.size();
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

    public static squad setUpNewSquad (){
        return  new squad("Team Avatar", 4,"Defeat the fire nation","Save people from being killed")
    }

    public static squad setUpNewSquad (){
        return  new squad("Winter Soldier", 6,"Defeat the Super Soldiers","Hope for a new world")
    }

    public static squad setUpNewSquad (){
        return  new squad("DareDevil", 2,"Save New York","Passion of being heroes")
    }

    public static squad setUpNewSquad (){
        return  new squad("Infinity ", 12,"Defeat Aliens","Defeat Aliens")
    }


}
