import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class PlayersData {
    private ArrayList<Player> players;
    public PlayersData(){
        loadPlayers();
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
    public Player getPlayer(String playerName){
        for (int i = 0; i < players.size(); i++){
            if (players.get(i).getName().equals(playerName)){
                return players.get(i);
            }
        }
        return null;
    }
    public void savePlayers(){
        try {
            File file = new File("src/playersData.data");
            file.createNewFile();
            FileWriter fileWriter = new FileWriter("src/playersData.data");
            String data = "";
            for (int i = 0; i < players.size(); i++) {
                data = players.get(i).getName() + "|" + players.get(i).getGold() + "|" + players.get(i).getBeavers() + "|" + players.get(i).getNextBeaverPrice();
                fileWriter.write(data + "\n");
            }
            fileWriter.close();
        }
        catch (IOException e){
            System.out.println("Can't create this file");
        }
    }
    public void loadPlayers(){
        try{
            players = new ArrayList<Player>();
            File file = new File("src/playersData.data");
            Scanner scan = new Scanner(file);
            while (scan.hasNextLine()){
                String playerData = scan.nextLine();
                String[] playerStats = playerData.split("\\|");
                Player player = new Player(playerStats[0], Integer.parseInt(playerStats[1]), Integer.parseInt(playerStats[2]), Integer.parseInt(playerStats[3]));
                players.add(player);
            }
            scan.close();

        }
        catch (FileNotFoundException fileNotFound){
            players = new ArrayList<Player>();
        }
    }
}
