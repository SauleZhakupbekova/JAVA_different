package L2_Switch_For_If;

public class Example_Denominator {
    public static void main(String[] args) {
        int denominator_1 = 3;
        int denominator_2 = 9;
        int generalDenominator_0 = 0; //highest denominator

        if (denominator_1 > denominator_2) {
            generalDenominator_0 = denominator_1;
        } else {
            generalDenominator_0 = denominator_2;
        }

        System.out.println(generalDenominator_0);

        for (int i = generalDenominator_0; i <= denominator_1 * denominator_2; i++) {
            if (i % denominator_1 == 0 && i % denominator_2 == 0) {
                System.out.println("Min General Denominator: " + i);

                }
            }
        }
    }



// Cntr_Alt_L - align;
// Cntr_Z - step back;
//Cntr_Y - go forward;
//Cntr_X - cut
