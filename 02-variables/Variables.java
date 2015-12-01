import java.util.HashMap;

class Variables {

  public static void main(String[] args) {
    System.out.println("Variables\n");

    int age = 62;
    String name = "Steve";

    System.out.println(name + " is " + age + ".");

    double rate = 3.4;

    System.out.println("The rate is " + rate + ".");

    int[] prices;

    prices = new int[5];

    prices[0] = 50;
    prices[1] = 100;
    prices[2] = 150;

    System.out.println(prices[1] + " " + prices[3]);
    System.out.println(prices.length);

    HashMap<String, Integer> cats = new HashMap<String, Integer>();

    cats.put("Fluff", 12);
    cats.put("Cannelle", 17);

    System.out.println(cats.get("Fluff"));
  }

}
