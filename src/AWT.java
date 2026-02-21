import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

//Driver class
public class AWT {
    //main function
    public static void main(String[] args) {
        //create a frame
        Frame frame = new Frame("AWT Button Example");

        //Create a button
        Button b = new Button("Click");
        Label label = new Label("Label");
        TextField tf = new TextField("TextField");

        //set the position of the button
        b.setBounds(160, 80, 80, 40);
        tf.setBounds(80, 100, 200, 50);
        label.setBounds(100, 100, 200, 50);

        //Add a background color
        b.setBackground(Color.GREEN);
        label.setForeground(Color.BLUE);
        label.setFont(new Font("Arial", Font.BOLD, 20));

        //Add background color to the frame
        frame.setBackground(Color.LIGHT_GRAY);

        //Set the size
        frame.setSize(400, 400);
        frame.setLayout(null);
        frame.setVisible(true);

        //Add button to the frame
        frame.add(b);
        frame.add(tf);

        //Add label
        frame.add(label);

        //add an action listener to the button
        b.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String tb_s = tf.getText();
                label.setText(
                        "Hey" +tb_s + ", Welcome to DEC");
            }
        });




        tf.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                label.setText("Someone is typing...");
            }
        });


        //scrollbar

        //checkbox

        //choice
    }
}
