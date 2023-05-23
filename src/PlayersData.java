import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class PlayersData {
    private ArrayList<Player> players;
    public PlayersData(){

    }
    public void newPlayer(Player p){
        players.add(p);
    }
    public boolean playerExists(String playerName){
        for (int i = 0; i < players.size(); i++){
            if (players.get(i).getName().equals(playerName)){
                return true;
            }
        }
        return false;
    }
    public void savePlayers(){
        try {
            File file = new File("src/playersData.data");
            file.createNewFile();
            FileWriter fileWriter = new FileWriter("src/playersData.data");
        }
        catch (IOException e){
            System.out.println("Can't create this file");
        }
    }
}
