package producer_consumer;

import java.util.HashMap;

/**
 * Created by Dmitry Natalenko on 15.10.2015.
 */
public class MenuUtil {

    private static  HashMap<Integer, String> menu = initMenu();
    private static  HashMap<Integer, Double> price = initPrice();

    public static String foodMap(int choice){
        return menu.get(choice);
    }

    public static Double priceMap(int choice){
        return price.get(choice);
    }

    private static HashMap<Integer, String> initMenu(){
        HashMap<Integer, String> menu = new HashMap<>();
        menu.put(1, "Дабл Чізбургер Меню");
        menu.put(2, "МакЧікен Меню");
        menu.put(3, "Біг Мак® Меню");
        menu.put(4, "Філе-о-фіш® Меню");
        menu.put(5, "Чікен МакНагетс® Меню");
        menu.put(6, "Роял Чізбургер® Меню");
        return menu;
    }

    private static HashMap<Integer, Double> initPrice(){
        HashMap<Integer, Double> price = new HashMap<>();
        price.put(1, 54.99d);
        price.put(2, 49.99d);
        price.put(3, 54.99d);
        price.put(4, 49.99d);
        price.put(5, 49.99d);
        price.put(6, 54.99d);
        return price;
    }
}
