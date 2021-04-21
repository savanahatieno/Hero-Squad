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

}
