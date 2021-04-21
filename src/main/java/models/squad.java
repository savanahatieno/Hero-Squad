package models;


import java.util.ArrayList;

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


}
