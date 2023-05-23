import java.util.ArrayList;

public class Player {
    private int gold;
    private String name;
    private int beavers;
    private ArrayList<Beaver> beaverList;
    public Player(String n){
        gold = 0;
        name = n;
    }
    public Player(String n, int g){
        gold = g;
        name = n;
    }
    public Player(String n, int g, int b, ArrayList<Beaver> beaverList){
        this.beaverList = beaverList;
        gold = g;
        name = n;
        beavers = b;
    }
    public void addBeaver(Beaver beaver){
        beavers++;
        beaverList.add(beaver);
    }
    public int getGold(){
        return gold;
    }
    public void addGold(int add){
        gold += add;
    }
    public boolean subtractGold(int subtract){
        if (gold < subtract){
            return false;
        }
        gold -= subtract;
        return true;
    }
    public String getName(){
        return name;
    }
    public void savePlayer(){

    }



}
