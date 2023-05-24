import java.util.ArrayList;

public class Player {
    private int gold;
    private String name;
    private int beavers;
    private ArrayList<Beaver> beaverList;
    private int nextBeaverPrice;
    public Player(String n){
        gold = 10;
        name = n;
        nextBeaverPrice = 10;
        beaverList = new ArrayList<Beaver>();
    }

    public Player(String n, int g, int b, ArrayList<Beaver> beaverList, int p){
        nextBeaverPrice = p;
        this.beaverList = beaverList;
        gold = g;
        name = n;
        beavers = b;
    }
    public Player(String n, int g, int b, int p){
        nextBeaverPrice = p;
        gold = g;
        name = n;
        beavers = b;
        beaverList = new ArrayList<Beaver>();
        for (int i = 0; i < b; i++){
            beaverList.add(new Beaver((int)(Math.random()*10),(int)(Math.random()*101)));
        }
    }
    public int addBeaver(Beaver beaver){
        if (subtractGold(nextBeaverPrice)){
            int paid = nextBeaverPrice;
            beavers++;
            beaverList.add(beaver);
            nextBeaverPrice+=5 * beavers;
            return paid;
        }
        return -1;
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
    public int getNextBeaverPrice(){
        return nextBeaverPrice;
    }
    public int getBeavers(){
        return beavers;
    }
    public ArrayList<Beaver> getBeaverList(){
        return beaverList;
    }
    public void savePlayer(){

    }



}
