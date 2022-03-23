package L1_Type_Conversion;

public class Main1 {
    public static void main(String[] args) {
        int rub = 1000;
        int pizzaCost = 230;
        int bubbleCost = 26;
        double candyCost = 2.5;

        int pizzaQty = rub / pizzaCost;
        int rubAfterPizza = rub % pizzaCost;
        int bubbleQty = rubAfterPizza / bubbleCost;
        int rubAfterBubble = rubAfterPizza % bubbleQty;
        int candyQty = (int)(rubAfterBubble / candyCost); // if one of arguments is double (candyCost) then another argument in int (rubAfterBubble) will be transformed into double- higher level
                                                          // for getting result in INT we should transform full expression (formula) to type (INT)
        double rubAtEnd =  rubAfterBubble - (candyCost * candyQty);

        System.out.println("List of purchases for RUB 1000:");
        System.out.println("Pizza -" + pizzaQty);
        System.out.println("Bubble -" + bubbleQty);
        System.out.println("Candy -" + candyQty);
        System.out.println("RestRub -" + rubAtEnd + " RUB");

    }
}
