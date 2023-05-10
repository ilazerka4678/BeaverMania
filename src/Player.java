import java.util.ArrayList;

public class Player {
    private int gold;
    private String device;
    private String name;
    private ArrayList<Beaver> beavers;
    public Player(String n){
        gold = 0;
        device = "default";
        name = n;
    }
    public Player(String n, int g){
        gold = g;
        device = "default";
        name = n;
    }
    public Player(String n, int g, String d){
        gold = g;
        device = d;
        name = n;
    }
    public Player(String n, int g, String d, ArrayList<Beaver> b){
        gold = g;
        device = d;
        name = n;
        beavers = b;
    }



}
