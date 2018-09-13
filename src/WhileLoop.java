import javax.swing.*;

public class WhileLoop {
    public static void main(String[] args) {

        String numberString;
        int number, i=0, total=0;

        numberString= JOptionPane.showInputDialog("Please enter a number (q to quit)");

        while(!numberString.equals("q"))
        {
            number=Integer.parseInt(numberString);

            i++;
            total+=number;

            numberString= JOptionPane.showInputDialog("Please enter another number (q to quit)");
        }
        System.out.printf("%.2f", 10.45f);
        System.out.println("string");
        JOptionPane.showMessageDialog(null,"Total: " + total + "\nNumber of entries: " + i);
    }
}
