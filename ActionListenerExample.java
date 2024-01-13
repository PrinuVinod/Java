import java.awt.*;
import java.awt.event.*;

public class ActionListenerExample extends Frame implements ActionListener {
    TextField tf; // Declare tf as an instance variable

    public static void main(String[] args) {
        ActionListenerExample example = new ActionListenerExample();
        example.launchFrame();
    }

    public ActionListenerExample() {
        tf = new TextField();
        tf.setBounds(50, 50, 150, 20);
        Button b = new Button("Click Here");
        b.setBounds(50, 100, 60, 30);
        b.addActionListener(this);
        add(b);
        add(tf);
        setSize(400, 400);
        setLayout(null);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        tf.setText("Welcome to Javatpoint.");
    }

    private void launchFrame() {
        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent we) {
                System.exit(0);
            }
        });
    }
}
