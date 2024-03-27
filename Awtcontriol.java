import java.awt.*;
import java.awt.event.*;
public class Awtcontriol {
    public static void main(String[] args) {
        Frame f=new Frame("THis is my Frame ");
        Label label=new Label("This is Label");
        label.setBounds(100, 100, 100, 100);
        TextField txt=new TextField("TEXTFIELD");
        txt.setBounds(60, 50, 180, 25);
        Button btn=new Button("CLick me ");
        btn.setBounds(100, 120, 80, 30);


        f.add(label);
        f.add(txt);
        f.add(btn);

        f.setSize(800,500);
        f.setVisible(true);

        
        btn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e){
                 txt.setText("My button is clicked");
            }
        });
    }
}
