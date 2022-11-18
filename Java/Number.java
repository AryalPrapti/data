import java. awt.event.*;
import java.awt.*;

class Number extends Frame{
    TextField textField;
    Number(){
        textField=new TextField();
        textField.setBounds(60,50,170,20);
        Button  btn=new Button ("Quote");
        btn.setBounds(90,140,75,40);
        add(btn);
        add(textField);
        setSize(250,250);
        setLayout(null);
        setVisible(true);
    }
    public static void main(String[]args){
        new Number();

    }
    public void actionperformed(ActionEvent e){
        textField.setText();
        

    }

}

    





