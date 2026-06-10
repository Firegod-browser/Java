import java.util.Scanner;

public class Main {

  @SuppressWarnings("resource")
  public static void main(String[] args) {

    System.out.println("Welcome To Spider Man Heros!");
    System.out.println("Enter a Name for Your Hero...");

    Scanner scan = new Scanner(System.in);
    String n = scan.nextLine();
    Hero h = new Hero(n, 1);

    h.printStats();
    System.out.println("");
    System.out.println("You wake up in a dark cave. You see a sword and a bow. You can only carry one...");

    Item bow = new Item("Bow", 0, 0, 1, 0, 15);

    Item sword = new Item("Sword", 0, 0, 2, 0, 0);

    Item Sheild = new Item("Sheild", 9, 1, 0, 9, 1);

    Item Gun = new Item("Web Shooter", 9, 1, 10, 1, 9);

    Item Diamond = new Item("Diamond", 10, 4, 0, 9, 1);

    Item Mythic = new Item("Mythic", 90, 80, 100, 90, 100);

    Item laser = new Item("_Spider_Number_42_", 900, 900, 1000, 700, 500);

    bow.stats();
    sword.stats();
    System.out.println("");
    System.out.println(" Choose your first weapon (bow) or (sword)");

    String choice = scan.nextLine();

    while (true) {

      if (choice.equals("bow") || choice.equals("b")) {
        System.out.println("");
        System.out.println("You pick up the bow");
        h.pickup(bow);
        break;
      }
      if (choice.equals("sword") || choice.equals("s")) {
        System.out.println("");
        System.out.println("You pick up the sword");
        h.pickup(sword);
        break;
      }
      System.out.println("(take bow) or (take sword)");
      choice = scan.nextLine();

    }

    System.out.println("");
    System.out.println("Mysterio Attacks from the Darkness!");
    System.out.println("Fighting him may grant loot...");
    System.out.println("(fight) or (run)");

    choice = scan.nextLine();

    while (true) {
      if (choice.equals("f8888  ight")) {
        Enemy e1 = new Enemy("Mysterio", 11, 3, 0, new Item("Leather", 0, 0, 0, 1, 0));
        h.fight(e1);
        break;
      }
      if (choice.equals("run")) {
        System.out.println("You escaped, but dropped your weapon...");
        h.drop(0);
        break;
      }
      System.out.println("(fight) or (run)");
      choice = scan.nextLine();
    }

    System.out.println("");
    System.out.println("You see a light in the distance. There are scurrying noises in the cave");
    System.out.println("(investigate light) or (rest)");

    choice = scan.nextLine();

    while (true) {
      if (choice.equals("rest")) {
        System.out.println("You stop to catch your breath, 3 health restored");

        h.heal(3);
        h.printStats();

        System.out.println("Vulture attacks!");

        h.fight(new Enemy("Vulture", 5, 5, 0, null));
        break;
      }
      if (choice.equals("investigate light")) {
        break;
      }
      System.out.println("(investigate light) or (rest)");
      choice = scan.nextLine();
    }

    System.out.println("");
    System.out.println("You head towards the light.");
    System.out.println("");
    h.heal(9);
    Enemy Venom = new Enemy("Venom", 13, 9, 3, Sheild);

    h.pickup(Gun);
    h.fight(Venom);
    h.heal(10);
    System.out.println("You see metal arms in the distance");
    Enemy name = new Enemy("Dock ock", 12, 6, 5, Diamond);

    h.heal(14);

    h.fight(name);
    System.out.println("You get out of the cave and you head to the city.");
    System.out.println("In the city you find Rhino robbing a bank");
    System.out.println("(stop and fight) (run away)");
    choice = scan.nextLine();
    while (true) {
      if (choice.equals("stop and fight")) {
        Enemy rhi = new Enemy("Rhino", 12, 7, 4, Diamond);
        h.fight(rhi);
        System.out.println("You beat Rhino and the city is safe" + "\n");
        break;
      }
      if (choice.equals("run away")) {
        System.out.println("You run away and the city gets destroyed");
        break;

      }
    }
    System.out.println("You go out of the city and you see blue electricity");
    h.heal(10);
    System.out.println("You see Electro terrorizing people in the suburbs");

    Enemy electro = new Enemy("Electro", 12, 7, 4, null);

    h.fight(electro);

    System.out.println("You continue on you journey and you wonder into another city");
    System.out.println("You see Green Goblin bombing the buildings");
    Enemy Greegob = new Enemy("Green Goblin", 12, 7, 4, null);
    h.fight(Greegob);
    System.out.println("You go adventuring and find Sand Man");
    Enemy sm = new Enemy("Sand Man", 14, 3, 6, Mythic);
    h.fight(sm);
    System.out.println("You reach your final destination to fight your archnemesis" + "\n");
    System.out.println("KING PIN");
    Enemy kp = new Enemy("King Pin", 160, 90, 90, laser);
    h.fight(kp);
    System.out.println("Good job you just saved some innocent lives");

  }
}
