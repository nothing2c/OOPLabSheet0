import javax.swing.*;

public class Switch {
    public static void main(String[] args) {

        char opperation;
        String opperationString, num1String, num2String;
        float num1, num2, answer=0;
        boolean valid=true;

        opperationString=JOptionPane.showInputDialog("Please enter an opperation:\n\t\"A\" = addition\n\t\"S\" = subtraction" +
                                               "\n\t\"M\" = multiplication\n\t\"D\" = division");

        opperation=opperationString.charAt(0);

        num1String=JOptionPane.showInputDialog("Please enter a number");
        num1=Float.parseFloat(num1String);

        num2String=JOptionPane.showInputDialog("Please enter another number");
        num2=Float.parseFloat(num2String);

        switch(opperation) {
            case 'a': answer = num1+num2;
                      break;

            case 's': answer = num1 - num2;
                      break;

            case 'm': answer = num1*num2;
                      break;

            case 'd': answer = num1/num2;
                      break;

            default: JOptionPane.showMessageDialog(null,"Invalid opperator entered");
                     valid=false;
        }

        if(valid)
        {
            JOptionPane.showMessageDialog(null,"" + answer);
        }


    }
}
