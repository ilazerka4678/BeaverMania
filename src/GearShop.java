import java.util.ArrayList;

public class GearShop {
    private ArrayList<Equipment> availableEquipment;
    private Player player;
    public GearShop(Player p){
        player = p;
        availableEquipment = new ArrayList<Equipment>();
        availableEquipment.add(new Equipment("Colt Army 1860", 6, 200));
        availableEquipment.add(new Equipment("3 inch Ordnance", 1, 500));
        availableEquipment.add(new Equipment("Gatling Gun", 30, 700));
    }
    public boolean sellEquipment(int index){
        if (player.subtractGold(availableEquipment.get(index).getCost())){
            player.setEquipment(availableEquipment.get(index));
            availableEquipment.add(player.getEquipment());
        }
        return false;
    }
}
