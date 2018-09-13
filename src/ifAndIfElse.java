import javax.swing.*;

public class ifAndIfElse {
    public static void main(String[] args) {

        String name, taxIncomeString;
        float taxIncome, incomeAfterTax, tax, taxRate;

        name=JOptionPane.showInputDialog("Please enter your name");
        taxIncomeString=JOptionPane.showInputDialog("Please enter your taxable income");
        taxIncome=Float.parseFloat(taxIncomeString);

        if(taxIncome<=20000)
        {
            tax=0;
            taxRate=0;

            incomeAfterTax=taxIncome-tax;

            JOptionPane.showMessageDialog(null,"Gross Income: " + taxIncome +
                                          "\nTax Rate: " + taxRate + "%" + "\nTax: " +tax + "\nIncome After Tax: " +
                                           incomeAfterTax);
        }

        else if(taxIncome > 20000 && taxIncome <= 36000)
        {
            taxRate=.2f;
            tax=taxIncome*taxRate;

            incomeAfterTax=taxIncome-tax;

            JOptionPane.showMessageDialog(null,"Gross Income: " + taxIncome +
                    "\nTax Rate: " + taxRate + "%" + "\nTax: " +tax + "\nIncome After Tax: " +
                    incomeAfterTax);
        }

        else {
            taxRate=.41f;
            tax=taxIncome*taxRate;

            incomeAfterTax=taxIncome-tax;

            JOptionPane.showMessageDialog(null,"Gross Income: " + taxIncome +
                    "\nTax Rate: " + taxRate + "%" + "\nTax: " +tax + "\nIncome After Tax: " +
                    incomeAfterTax);
        }
    }
}
