import javax.swing.*;

public class CalculationsIf {
    public static void main(String[] args) {

        String Fname, Sname, KmString;
        int Km;
        float total=0;

        Fname= JOptionPane.showInputDialog("Please enter your first name");
        Sname=JOptionPane.showInputDialog("Please enter your surname");
        KmString=JOptionPane.showInputDialog("Please enter the number of kilometers you traveled");
        Km=Integer.parseInt(KmString);

        System.out.printf("%.2f",total);

        for(int i=0;i<Km;i++)
        {
            if(i>10)
                total+=.1;
            else
                total+=.07;
        }

        JOptionPane.showMessageDialog(null,Fname + " " +Fname.charAt(0) +
                Sname.charAt(0) + " " + Sname + "\nTotal earned: €" + String.format("%.2f",total));
    }
}
