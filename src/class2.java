import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class class2 extends Frame implements ActionListener {
    Button b;

    class2() {
        b = new Button("Submit");
        b.setBounds(50, 50, 100, 50);
        b.addActionListener(this);

        add(b);
        setSize(400, 400);
        setLayout(null);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        System.out.println("Clicked");
    }

    public static void main(String[] args) {
        new class2();
    }
}
