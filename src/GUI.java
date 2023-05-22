import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GUI extends JFrame implements ActionListener {

    private JLabel UserName;
    private JTextField userName;
    private JButton startButton;
    private JPanel mainPanel;
    private JTextArea userInfo;

    public GUI(){

        setSize(600,600);
        setLocation(400,200);
        setContentPane(mainPanel);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setVisible(true);
        userInfo.setEditable(false);
        startButton.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        JButton button = (JButton)e.getSource();
        if (button.getText().equals("Start") && !userName.getText().equals("")){
            String userText = "Welcome to Beaver Hunt, " + userName.getText() + "!";
            userInfo.setText(userText);
        }
    }
}
