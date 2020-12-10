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
    }
}
