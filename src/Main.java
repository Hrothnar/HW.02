import java.util.*;

public class Main {
    public static void main(String[] args) {

        Product apple = new Product("Яблоко", 64, 1.5);
        Product banana = new Product("Банан", 44, 1.6);
        Product strawberry = new Product("Клубника", 88, 0.8);
        Product yogurt = new Product("Йогурт", 55, 0.34);
        Product orange = new Product("Апельсин", 104, 1.3);

        ShoppingList.addProductToList(apple);
//        ShoppingList.addProductToList(apple);
//        ShoppingList.addProductToList(banana);
        ShoppingList.addProductToList(strawberry);

//        ShoppingList.buyProductFromList(apple);
//        ShoppingList.buyProductFromList(apple);

        Recipe fruitSalad = new Recipe("Фруктовый салат");
        fruitSalad.getRecipe().put(apple, 2);
        fruitSalad.getRecipe().put(banana, 1);
        fruitSalad.getRecipe().put(orange, 1);
        fruitSalad.getRecipe().put(yogurt, 1);

        Recipe fruitSalad1 = new Recipe("Фруктовый салат на семью с клубникой");
        fruitSalad1.getRecipe().put(apple, 4);
        fruitSalad1.getRecipe().put(banana, 2);
        fruitSalad1.getRecipe().put(orange, 2);
        fruitSalad1.getRecipe().put(yogurt, 2);
        fruitSalad1.getRecipe().put(strawberry, 2);

        System.out.println("Стоимость: " + fruitSalad.getCostOfRecipe());
        System.out.println("Стоимость: " + fruitSalad1.getCostOfRecipe());

        Recipe.addRecipeToCookbook(fruitSalad);
//        Recipe.addRecipeToCookbook(fruitSalad);
        Recipe.addRecipeToCookbook(fruitSalad1);


    }
}