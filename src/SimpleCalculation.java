import javax.swing.*;

public class SimpleCalculation {
    public static void main(String[] args) {

        String name, Cname, noOfSnacks;
        int snackPrice = 2, noOfSnacksInt;

        name = JOptionPane.showInputDialog("please enter your name");
        Cname = JOptionPane.showInputDialog("Please enter your class name");
        noOfSnacks = JOptionPane.showInputDialog("Please enter the number of snacks you want");

        noOfSnacksInt=Integer.parseInt(noOfSnacks);

        JOptionPane.showMessageDialog(null,name+"\n" + Cname + "\n" + "The Price of the snacks is €"+ noOfSnacksInt*snackPrice);
    }
}
