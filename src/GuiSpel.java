import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class GuiSpel extends JFrame implements ActionListener {
    JPanel panel = new JPanel();
    ArrayList<JButton> buttons = new ArrayList<JButton>();

    public GuiSpel() {
        panel.setLayout(new GridLayout(4,4));
        this.createButtons();

        add(panel,BorderLayout.NORTH);
        setVisible(true);
        setSize(500,500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        this.pack();
        System.out.println("axel testing");
    }
    public void createButtons(){
        for(int n = 1; n <= 15; n++){
            JButton button = new JButton(Integer.toString(n));
            panel.add(button);
            button.addActionListener(this);
            buttons.add(button);
        }
        JButton emptyButton = new JButton(" ");
        panel.add(emptyButton);
        buttons.add(emptyButton);

    }

    public static void main(String[] args) {
        GuiSpel gui = new GuiSpel();
    }


    @Override
    public void actionPerformed(ActionEvent e) {

    }
}