import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

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
    private Player player;
    private PlayersData playerData;


    public GUI() {
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
                    userText += "\n" + "Next beaver will cost: " + player.getNextBeaverPrice();
                    userInfo.setText(userText);
                } else {
                    player = new Player(userName.getText());
                    playerData.newPlayer(player);
                    userText = "Welcome to Beaver Hunt, " + player.getName() + "!";
                    userInfo.setText(userText);
                }
            }
            else{
                userInfo.setText("You need to set your username first.");
            }
        }
        if (button.getText().equals("Buy Beaver")) {
            if (player.addBeaver(new Beaver((int)(Math.random()*10),(int)(Math.random()*101),(int)(Math.random()*5))) != -1){
                userText = "Bought a beaver!";
                userText += "\n" + "It's a " + player.getBeaverList().get(player.getBeaverList().size()-1).getBeaverType() + "!!!";
                userText += "\n" + "Gold: " + player.getGold();
                userText += "\n" + "Next beaver will cost: " + player.getNextBeaverPrice();
                userInfo.setText(userText);
            }


        }
        if (button.getText().equals("Quit")){
            playerData.savePlayers();
            this.dispose();
        }
    }
}
