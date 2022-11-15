import java.util.ArrayList;
import java.util.List;

public class ShoppingList {
    private static List<Product> list = new ArrayList<>();

    public static void addProductToList(Product product) {
        try {
            if (product.getCost() == 0 || product.getWeight() == 0) {
                throw new RuntimeException("Заполните карточку товара полностью");
            }
            if (!list.contains(product)) {
                list.add(product);
            } else {
                throw new Exception(product.getType() + " уже есть в списке, у тебя амнезия, сходи к доктору, а пока продолжим.");
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }

    public static void buyProductFromList(Product product) {
        if (list.contains(product)) {
            list.remove(product);
            System.out.printf("Купили %.2f кг. %s за %.2f руб.\n", product.getWeight(), product.getType(), product.getCost());
        } else {
            throw new RuntimeException("Продукт отсутствует в списке...не у тебя точно склероз.");
        }
    }


}
