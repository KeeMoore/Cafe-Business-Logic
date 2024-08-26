import java.util.ArrayList;

public class TestCafe {
    public static void main(String[] args) {
        CafeUtil cafeUtil = new CafeUtil();


        // Test getOrderTotal
        double[] prices = {3.5, 1.5, 4.0, 2.5};
        System.out.println("Order Total: " + cafeUtil.getOrderTotal(prices));

        // Test displayMenu
        ArrayList<String> menuItems = new ArrayList<>();
        menuItems.add("drip coffee");
        menuItems.add("cappuccino");
        menuItems.add("latte");
        menuItems.add("mocha");
        cafeUtil.displayMenu(menuItems);

        // Test addCustomer
        ArrayList<String> customers = new ArrayList<>();
        cafeUtil.addCustomer(customers);

        // Test printPriceChart
        cafeUtil.printPriceChart("Colombian Coffee Grounds", 15.0, 3);
        // Expected:
        // Colombian Coffee Grounds
        // 1 - $15.00
        // 2 - $30.00
        // 3 - $45.00

        // Test printPriceChart with discount
        cafeUtil.printPriceChart("Discounted Coffee", 2.0, 4);
        // Expected:
        // Discounted Coffee
        // 1 - $2.00
        // 2 - $3.50
        // 3 - $5.00
        // 4 - $6.50

        // Test displayMenu with prices
        ArrayList<Double> pricesList = new ArrayList<>();
        pricesList.add(2.5);
        pricesList.add(3.0);
        pricesList.add(4.0);
        pricesList.add(4.5);
        boolean menuDisplayed = cafeUtil.displayMenu(menuItems, pricesList);
        System.out.println("Menu displayed: " + menuDisplayed); // Expected: true

        // Test displayMenu with mismatched sizes
        pricesList.remove(3); // Remove one item to create a mismatch
        menuDisplayed = cafeUtil.displayMenu(menuItems, pricesList);
        System.out.println("Menu displayed: " + menuDisplayed); // Expected: false
    }
}
