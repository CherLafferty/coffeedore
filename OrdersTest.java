import java.util.ArrayList;

public class OrdersTest {
    public static void main(String[] args){

        // Instantiate CoffeKiosk
        CoffeeKiosk coffeeKiosk = new CoffeeKiosk();

        // Create Menu items
        coffeeKiosk.addMenuItem("cappucino", 4.95);
        coffeeKiosk.addMenuItem("mocha", 4.75);
        coffeeKiosk.addMenuItem("drip coffee", 2.95);
        coffeeKiosk.addMenuItem("latte", 5.25);

        // Create orders
        coffeeKiosk.addMenuItemByInput();
        coffeeKiosk.newOrder();







    }
}