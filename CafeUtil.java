import java.util.ArrayList;
public class CafeUtil {

    public int getStreak() {
    int sum = 0;
    for (int i = 0; i < 11; i++) {
      sum += i;
    }
    return sum;
  }

  public double getOrderTotal(double[] lineItems){
    double total = 0;
    for (double item : lineItems ){
      total += item;
    }
    return total;
  }

  public void displayMenu(ArrayList<String> menu){
    for(int i = 0; i < menu.size(); i++){
      String name = menu.get(i);
      System.out.println(i + " " + name);
  }

}

  public void addCustomer(ArrayList<String> customers){
    System.out.println("Please enter your name:");
    String userName = System.console().readLine();
    System.out.printf("Hello, %s here!\n", userName);
    System.out.printf("There are %d people in front of you.", customers.size());
    customers.add(userName);
  }
}
