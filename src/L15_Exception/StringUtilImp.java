package L15_Exception;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StringUtilImp implements StringUtils{
    @Override
    public double div(String number1, String number2) throws NullPointerException, NumberFormatException, ArithmeticException {
        if (number1 == null || number2 == null) {
            throw new NullPointerException("number1 == null || number2 == null");
        }

        //Double.parseDouble() (return float decimal from string expression).
        // FnF4 - we see that it throw NumberFormatException.
        // We see that JAVA doesn`t inform us about exception when we wrote Double.parseDouble(number1)
        // It means that Double.parseDouble(number1) - is not checked exception

        double num1 = 0;
        try {
            num1 = Double.parseDouble(number1);
        } catch (NumberFormatException e) {
            throw new NumberFormatException("number1 is not decimal!");
        }

        double num2 = 0;
        try {
            num2 = Double.parseDouble(number2);
        } catch (NumberFormatException e) {
            throw new NumberFormatException("number2 is not decimal!");
        }

        if(num2 == 0.0){
            throw new ArithmeticException("Deliminator is 0!");
        }
        return num1 / num2;
    }

    @Override
    public int[] findWord(String text, String word) throws NullPointerException {
        return new int[0];
    }

    @Override
    public double[] findNumbers(String text) throws CustomException {
        //create pattern
        Pattern p = Pattern.compile("(\\d+(?:\\.\\d+))"); //anu decimal (\\d ) + possible or not possible decimal (?:\.\d+)
        //matcher - command to keep this par
        Matcher m = p.matcher(text);
        while(m.find()) {//while m - smb who looking for pattern
            double d = Double.parseDouble(m.group(1));
            System.out.println(d);
        }
        return new double[0];
    }
}
