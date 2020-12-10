package dandyloper;

import java.util.HashMap;
import java.util.Map;

public class Main {
    // Declear constants for keys:
    public static final String BREAKFAST = "breakfast";
    public static final String LUNCH = "lunch";
    public static final String DINNER = "dinner";

    public static void main(String[] args) {
        Map<String, String> meals = new HashMap<>();
        meals.put(BREAKFAST, "waffles");
        meals.put(LUNCH, "chicken salad");
        meals.put(DINNER, "bossam");

        System.out.println(meals);

        String lunch = meals.remove(LUNCH);
        boolean hasLunch = meals.containsKey(LUNCH);
        boolean hasChickenSalad = meals.containsValue("chicken salad");
        int size = meals.size();

        System.out.println(lunch + " " + hasLunch + " " + hasChickenSalad + " " + size);
    }
}
