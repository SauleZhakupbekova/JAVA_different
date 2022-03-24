package L14_HashMap;

public class Main_Fridge {
    public static void main(String[] args) {

        Fridge fridge = new Fridge();
        fridge.addProduct("Apple", 2);
        fridge.addProduct("Potato", 4);
        fridge.addProduct("Tomato", 1);
        fridge.addProduct("Lemon", 4);
        fridge.addProduct("Rice", 5);
        fridge.addProduct("Solt", 1);

        fridge.getProduct("Apple", 1);
        fridge.printProduct();

        System.out.println("---------RECIPE PART--------");

        Recipe recipe = new Recipe("Fruit Salat");
        recipe.addIngredient("Apple", 1);
        recipe.addIngredient("Tomato", 1);
        recipe.addIngredient("Solt", 1);

        fridge.CanCook(recipe);
    }

}
