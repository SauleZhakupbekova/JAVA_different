package L14_HashMap;

import java.util.HashMap;

public class Recipe {
    private String title;
    private HashMap<String, Integer> ingredients = new HashMap<>();

    public Recipe(String title){
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public HashMap<String, Integer> getIngredients() {
        return ingredients;
    }

    public void setIngredients(HashMap<String, Integer> ingredients) {
        this.ingredients = ingredients;
    }

    public void addIngredient(String ingredient, int qty){
        if (ingredients.containsKey(ingredient)) {
            ingredients.put(ingredient, qty + ingredients.get(ingredient));
        } else {
            ingredients.put(ingredient, qty);
        }
    }

    }

