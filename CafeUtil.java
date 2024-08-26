import java.text.NumberFormat;
import java.util.ArrayList;

public class CafeUtil {
    public int getStreakGoal() {
        int sum = 0;
        for (int i = 1; i <= 10; i++) {
            sum += i;
        }
        return sum;
    }
    
    

public void printPriceChart(String product, double price, int maxQuantity) {
    System.out.println(product);
    for (int i = 1; i <= maxQuantity; i++) {
        double totalPrice = price * i;
        System.out.println(i + " - " + NumberFormat.getCurrencyInstance().format(totalPrice));
    }
}



    
    public String getOrderTotal(double[] prices) {
        NumberFormat formatter = NumberFormat.getCurrencyInstance();
        double total = 0;
        for (double price : prices) {
            total += price;
        }
        return formatter.format(total);
    }
    
    public boolean displayMenu(ArrayList<String> menuItems, ArrayList<Double> prices) {
        if (menuItems.size() != prices.size()) {
            return false;
        }
        for (int i = 0; i < menuItems.size(); i++) {
            System.out.println(i + " " + menuItems.get(i) + " - " + NumberFormat.getCurrencyInstance().format(prices.get(i)));
        }
        return true;
    }

    public void displayMenu(ArrayList<String> menuItems) {
        for (int i = 0; i < menuItems.size(); i++) {
            System.out.println(i + " " + menuItems.get(i));
        }
    }
    
    
    public void addCustomer(ArrayList<String> customers) {
        System.out.println("Please enter your name:");
        String username = System.console().readLine();
        customers.add(username);
        System.out.println("Hello, " + username + "!");
        System.out.println("There are " + customers.size() + " people in front of you.");
    }
    
}


