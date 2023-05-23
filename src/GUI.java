import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GUI extends JFrame implements ActionListener {

    private JLabel UserName;
    private JTextField userName;
    private JButton startButton;
    private JPanel mainPanel;
    private JTextArea userInfo;
    private JButton quitButton;
    private JButton button1;
    private JButton button2;
    private JButton button3;


    public GUI() {

        setSize(600, 500);
        setLocation(700, 200);
        setContentPane(mainPanel);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setVisible(true);
        setResizable(false);
        userInfo.setEditable(false);
        startButton.addActionListener(this);
        quitButton.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        JButton button = (JButton) e.getSource();
        if (button.getText().equals("Start")) {
            if (!userName.getText().equals("")) {
                String userText = "Welcome to Beaver Hunt, " + userName.getText() + "!";
                userInfo.setText(userText);
            }
            else{
                userInfo.setText("You need to set your username first.");
            }
        }
        if (button.getText().equals("Quit")){
            this.dispose();
        }
    }
}
