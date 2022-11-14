import java.util.*;

public class Recipe {
    private String recipeName;
    private int costOfRecipe;
    private HashMap<Product, Integer> recipe = new HashMap<>();
    public static Set<Recipe> allRecipes = new HashSet<>();


    public Recipe(String recipeName) {
        if (recipeName != null && !recipeName.isBlank())
            this.recipeName = recipeName;
    }

    public double getCostOfRecipe() {
        double result = 0;
        for (Product one : recipe.keySet()) {
            if (one.getCost() > 0 && recipe.get(one) > 0)
                result += one.getCost() * recipe.get(one);
            else
                throw new RuntimeException("Укажите стоимость или количество продукта " + one.getType());
        }
        return result;
    }

    public String getRecipeName() {
        return recipeName;
    }

    public HashMap<Product, Integer> getRecipe() {
        return recipe;
    }

    public static Set<Recipe> getAllRecipes() {
        return allRecipes;
    }

    public static void addRecipeToCookbook(Recipe anotherOne) {
        if (!allRecipes.contains(anotherOne))
            allRecipes.add(anotherOne);
        else
            throw new RuntimeException("Такой рецепт присутствует");
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Recipe recipe1 = (Recipe) o;
        return costOfRecipe == recipe1.costOfRecipe && Objects.equals(recipeName, recipe1.recipeName) && Objects.equals(recipe, recipe1.recipe);
    }

    @Override
    public int hashCode() {
        return Objects.hash(recipeName, costOfRecipe, recipe);
    }
}

