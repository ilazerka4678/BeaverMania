import java.util.ArrayList;

public class Player {
    private int gold;
    private String device;
    private String name;
    private int beavers;
    private ArrayList<Beaver> beaverList;
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
    public Player(String n, int g, String d, int b, ArrayList<Beaver> beaverList){
        this.beaverList = beaverList;
        gold = g;
        device = d;
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


}
