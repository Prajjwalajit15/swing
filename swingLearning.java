import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class swingLearning extends JFrame implements ActionListener {
    JButton button;
    boolean change = false;
    swingLearning(){
         setTitle("this is my first window");
         button = new JButton("click");
         setLayout(null);
         button.setSize(100,50);
         button.setLocation(250,175);
         button.addActionListener(this);
         add(button);
         setSize(600,400);
         setResizable(false);
         setVisible(true);
         getContentPane().setBackground(Color.red);
    }

    public static void main(String[] args) {
        swingLearning a =   new swingLearning();

    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        String e = actionEvent.getActionCommand();
        if(e.equals("click") && change==false) {
            getContentPane().setBackground(Color.black);
            change=true;
        }
        else{
            getContentPane().setBackground(Color.red);
            change=false;
        }
    }
}
