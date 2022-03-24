package L14_HashMap;

import java.util.HashMap;
import java.util.Map;

public class Fridge {
    private HashMap<String, Integer> products = new HashMap<>();

    public void addProduct(String newProduct, int qty) {
        if (products.containsKey(newProduct)) {
            products.put(newProduct, qty + products.get(newProduct));
        } else {
            products.put(newProduct, qty);
        }
    }

    public void printProduct() {
//         //1 option through keySet - mass of unique keys
//        for(String newProduct:products.keySet()){
//            System.out.println(newProduct + "-" + products.get(newProduct));
//        }

        // 2 option through Map.Entry - take all objects from map. It means that
        // we cannot clearly identify by key or by value objects were taken
        for (Map.Entry<String, Integer> mapEntry : products.entrySet()) {
            System.out.println(mapEntry.getKey() + "-" + mapEntry.getValue());
        }
    }

    public void getProduct(String product, int qty) {
        if (!products.containsKey(product)) {
            System.out.println("No asked product! - " + product);
            return;
        }
        //products.get(product) - call qty by key, where products - products in Fridge,
        // get.product - variable of product qty which we want to take from Fridge
        if (products.get(product) < qty) {
            System.out.println("Not enough " + (qty - products.get(product)) + " kg " + product);
            products.remove(product); //take this product through its removing.
            return; //stop fulfilment of this method
        }

        if (products.get(product) == qty) {
            System.out.println("We took last: " + product);
            products.remove(product);
            return;
        }
        //calculation of stock (suppose that we put stock)
        products.put(product, products.get(product) - qty);

    }
    public void CanCook(Recipe recipe){
        //products - HashMap - with all products
        //recipe.getIngredients() - HashMap with required ingredients

        for(String neededIngredient:recipe.getIngredients().keySet()){
            if (!products.containsKey(neededIngredient)) {
                System.out.println("No asked ingredient! - " + neededIngredient);
                return;
            }

            if (products.get(neededIngredient) < recipe.getIngredients().get(neededIngredient)) {
                System.out.println("Not enough " + (recipe.getIngredients().get(neededIngredient) - products.get(neededIngredient)) + " kg " + neededIngredient);
                return;
            }

        }
        System.out.println("Yes! We can cook by Recipe!" + recipe.getTitle());

        }
    }

