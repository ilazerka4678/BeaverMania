
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;

public class GUI extends JFrame implements ActionListener{

    private JLabel UserName;
    private JTextField userName;
    private JButton startButton;
    private JPanel mainPanel;
    private JTextArea userInfo;
    private JButton quitButton;
    private JButton feedBeaversButton;
    private JButton shaveBeaversButton;
    private JButton buyBeaverButton;
    private JLabel beaverSlot1;
    private JLabel beaverSlot2;
    private JLabel beaverSlot3;
    private JLabel beaverSlot4;
    private JLabel beaverSlot5;
    private JLabel beaverSlot6;
    private JLabel beaverSlot7;
    private JLabel beaverSlot8;
    private JLabel beaverSlot9;
    private JLabel beaverSlot10;
    private JLabel beaverSlot11;
    private JLabel beaverSlot12;
    private Player player;
    private PlayersData playerData;
    private int slot;
    private boolean hungryBeavers;


    public GUI() {
        slot = 1;
        playerData = new PlayersData();
        setSize(600, 500);
        setLocation(700, 200);
        setContentPane(mainPanel);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setVisible(true);
        setResizable(false);
        userInfo.setEditable(false);
        startButton.addActionListener(this);
        quitButton.addActionListener(this);
        feedBeaversButton.addActionListener(this);
        shaveBeaversButton.addActionListener(this);
        buyBeaverButton.addActionListener(this);
        hungryBeavers = false;

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        JButton button = (JButton) e.getSource();
        String userText = "";
        if (button.getText().equals("Start")) {
            if (!userName.getText().equals("")) {
                if (playerData.playerExists(userName.getText())) {
                    player = playerData.getPlayer(userName.getText());
                    userText = "Welcome back, " + player.getName() + "!";
                    userText += "\n" + "Gold: " + player.getGold();
                    userText += "\n" + "Food will cost: " + player.getBeavers() * 5;
                    userText += "\n" + "Next beaver will cost: " + player.getNextBeaverPrice();
                    userInfo.setText(userText);
                    ImageIcon icon = new ImageIcon("src\\beaver.png");
                    icon.setImage(icon.getImage());
                    Image image = icon.getImage();
                    image = image.getScaledInstance(50,50, Image.SCALE_SMOOTH);
                    ImageIcon scaledIcon = new ImageIcon(image);
                    slot = player.getBeavers() + 1;
                    if (player.getBeavers() > 0){
                        beaverSlot1.setIcon(scaledIcon);
                        if (player.getBeavers() > 1){
                            beaverSlot2.setIcon(scaledIcon);
                            if (player.getBeavers() > 2) {
                                beaverSlot3.setIcon(scaledIcon);
                                if (player.getBeavers() > 3){
                                    beaverSlot4.setIcon(scaledIcon);
                                    if (player.getBeavers() > 4){
                                        beaverSlot5.setIcon(scaledIcon);
                                        if (player.getBeavers() > 5){
                                            beaverSlot6.setIcon(scaledIcon);
                                            if (player.getBeavers() > 6){
                                                beaverSlot7.setIcon(scaledIcon);
                                                if (player.getBeavers() > 7){
                                                    beaverSlot8.setIcon(scaledIcon);
                                                    if (player.getBeavers() > 8){
                                                        beaverSlot9.setIcon(scaledIcon);
                                                        if (player.getBeavers() > 9){
                                                            beaverSlot10.setIcon(scaledIcon);
                                                            if (player.getBeavers() > 10){
                                                                beaverSlot11.setIcon(scaledIcon);
                                                                if (player.getBeavers() > 11){
                                                                    beaverSlot12.setIcon(scaledIcon);
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                } else {
                    player = new Player(userName.getText());
                    playerData.newPlayer(player);
                    userText = "Welcome to Beaver Hunt, " + player.getName() + "!";
                    userText += "\n" + "Gold: " + player.getGold();
                    userText += "\n" + "Food will cost: " + player.getBeavers() * 5;
                    userText += "\n" + "Next beaver will cost: " + player.getNextBeaverPrice();
                    userInfo.setText(userText);
                }
            }
            else{
                userInfo.setText("You need to set your username first.");
            }
        }
        if (button.getText().equals("Buy Beaver") && !(userName.getText().equals(""))) {
            if (player.addBeaver(new Beaver((int)(Math.random()*10),(int)(Math.random()*101),(int)(Math.random()*5))) != -1){
                userText = "Bought a beaver!";
                userText += "\n" + "It's a " + player.getBeaverList().get(player.getBeaverList().size()-1).getBeaverType() + "!!!";
                userText += "\n" + "Gold: " + player.getGold();
                userText += "\n" + "Food will cost: " + player.getBeavers() * 5;
                userText += "\n" + "Next beaver will cost: " + player.getNextBeaverPrice();
                userInfo.setText(userText);
                ImageIcon icon = new ImageIcon("src\\beaver.png");
                icon.setImage(icon.getImage());
                Image image = icon.getImage();
                image = image.getScaledInstance(50,50, Image.SCALE_SMOOTH);
                ImageIcon scaledIcon = new ImageIcon(image);
                if (slot == 1) {
                    beaverSlot1.setIcon(scaledIcon);
                }
                if (slot == 2) {
                    beaverSlot2.setIcon(scaledIcon);
                }
                if (slot == 3){
                    beaverSlot3.setIcon(scaledIcon);
                }
                if (slot == 4){
                    beaverSlot4.setIcon(scaledIcon);
                }
                if (slot == 5){
                    beaverSlot5.setIcon(scaledIcon);
                }
                if (slot == 6){
                    beaverSlot6.setIcon(scaledIcon);
                }
                if (slot == 7){
                    beaverSlot7.setIcon(scaledIcon);
                }
                if (slot == 8){
                    beaverSlot8.setIcon(scaledIcon);
                }
                if (slot == 9){
                    beaverSlot9.setIcon(scaledIcon);
                }
                if (slot == 10){
                    beaverSlot10.setIcon(scaledIcon);
                }
                if (slot == 11){
                    beaverSlot11.setIcon(scaledIcon);
                }
                if (slot == 12){
                    beaverSlot12.setIcon(scaledIcon);
                }
                slot++;
            }


        }
        if (button.getText().equals("Feed Beavers")){
            if (player.getBeavers() < 1) {
                userText = "No beavers to feed!";
                userText += "\n" + "Gold: " + player.getGold();
                userText += "\n" + "Food will cost: " + player.getBeavers() * 5;
                userText += "\n" + "Next beaver will cost: " + player.getNextBeaverPrice();
                userInfo.setText(userText);
            }
            if (player.subtractGold(player.getBeavers() * 5)){
                userText = "Fed beavers for " + player.getBeavers() * 5 + "!";
                userText += "\n" + "Gold: " + player.getGold();
                userText += "\n" + "Food will cost: " + player.getBeavers() * 5;
                userText += "\n" + "Next beaver will cost: " + player.getNextBeaverPrice();
                userInfo.setText(userText);
                hungryBeavers = false;
            }
        }
        if (button.getText().equals("Shave Beavers")){
            if (player.getBeavers() < 1){
                userText = "You have no beavers to shave! Get a beaver!";
                userText += "\n" + "Gold: " + player.getGold();
                userText += "\n" + "Food will cost: " + player.getBeavers() * 5;
                userText += "\n" + "Next beaver will cost: " + player.getNextBeaverPrice();
                userInfo.setText(userText);
            }
            if (hungryBeavers){
                userText = "Your beavers are too hungry to shave! Feed them!";
                userText += "\n" + "Gold: " + player.getGold();
                userText += "\n" + "Food will cost: " + player.getBeavers() * 5;
                userText += "\n" + "Next beaver will cost: " + player.getNextBeaverPrice();
                userInfo.setText(userText);
            }
            else{
                int profit = 0;
                for (int i = 0; i < player.getBeavers(); i++){
                    profit += player.getBeaverList().get(i).getBeaverPrice(5);
                }
                userText = "You shaved all your precious beavers and made " + profit + " gold!";
                player.addGold(profit);
                userText += "\n" + "Gold: " + player.getGold();
                userText += "\n" + "Food will cost: " + player.getBeavers() * 5;
                userText += "\n" + "Next beaver will cost: " + player.getNextBeaverPrice();
                userInfo.setText(userText);
                hungryBeavers = true;
            }
        }
        if (button.getText().equals("Quit")){
            playerData.savePlayers();
            this.dispose();
        }
    }
}
