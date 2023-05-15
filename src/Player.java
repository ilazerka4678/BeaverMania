import java.util.ArrayList;

public class Player {
    private int gold;
    private Equipment equipment;
    private String name;
    private int beavers;
    private ArrayList<Beaver> beaverList;
    public Player(String n){
        gold = 0;
        equipment = new Equipment("Pattern Enfield 1853",1, 100);
        name = n;
    }
    public Player(String n, int g){
        gold = g;
        equipment = new Equipment("Pattern Enfield 1853", 1, 100);
        name = n;
    }
    public Player(String n, int g, Equipment e){
        gold = g;
        equipment = e;
        name = n;
    }
    public Player(String n, int g, Equipment e, int b, ArrayList<Beaver> beaverList){
        this.beaverList = beaverList;
        gold = g;
        equipment = e;
        name = n;
        beavers = b;
    }
    public void sellBeaver(int beaverIndex){
        if(beavers > 0){
            beavers--;
            gold+= beaverList.remove(beaverIndex).getBeaverPrice(Market.getPrice());
        }
    }
    public void catchBeaver(Beaver beaver){
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
    public void setEquipment(Equipment e){
        equipment = e;
    }
    public Equipment getEquipment(){
        return equipment;
    }
    public String getName(){
        return name;
    }



}
