package dandyloper;

import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) {
        Map<String, String> meals = new HashMap<>();
        meals.put("breakfast", "waffles");
        meals.put("lunch", "chicken salad");
        meals.put("dinner", "bossam");

        System.out.println(meals);

        String lunch = meals.remove("lunch");
        boolean hasLunch = meals.containsKey("lunch");
        boolean hasChickenSalad = meals.containsValue("chicken salad");
        int size = meals.size();

        System.out.println(lunch + " " + hasLunch + " " + hasChickenSalad + " " + size);
    }
}
