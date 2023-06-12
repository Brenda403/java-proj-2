import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //Classes for project pt 1

        //pt1.2. Generic Cupcake
        class Cupcake {
            public double price;
            public double getPrice(){
                return price;
            };
            public void setPrice(double price){
               this.price = price;
            };

            public void type() {
                System.out.println("A basic, generic cupcake, with vanilla frosting.");
            }
        }

        //pt1.3. Cupcake Variants
        class RedVelvet extends Cupcake {
            public void type() {
                System.out.println("A red velvet based cupcake, with cream cheese frosting.");
            }
        }

        class Chocolate extends Cupcake {
            public void type() {
                System.out.println("A chocolate based cupcake, with chocolate frosting.");
            }
        }

        // Classes for proj pt 2

        class Drink {
            public double price;

            public double getPrice(){
                return price;
            }

            public void setPrice(double price){
                this.price = price;
            }

            public void type() {
                System.out.println("A bottle of water");
            }
        }

        class Soda extends Drink {
            public void type() {
                System.out.println("A bottle of soda");
            }
        }

        class Milk extends Drink {
            public void type(){
                System.out.println("A bottle of milk");
            }
        }

    //pt1.4. Object Declaration
        ArrayList<Cupcake> cupcakeMenu = new ArrayList<Cupcake>();

        Cupcake cupcake = new Cupcake();

        RedVelvet redVelvet = new RedVelvet();

        Chocolate chocolate = new Chocolate();


    //pt1.5. Pricing

        System.out.println("We are in the middle of creating the cupcake menu. We currently have three cupcakes on the menu but we need to decide pricing.");

        Scanner input = new Scanner(System.in);

        System.out.println("We are deciding on the price for our standard cupcake. Here is the description.");
        cupcake.type();
        System.out.println("How much would you like to charge for the cupcake? (insert a numerical number taken to 2 decimal places.)");
        String priceText = input.nextLine();
        double price = Double.parseDouble(priceText);
        cupcake.setPrice(price);

        // repeat redVelvet
        System.out.println("We are deciding on the price for our red velvet cupcake. Here is the description: ");
        redVelvet.type();
        System.out.println("How much would you like to charge for the cupcake? (Input a numerical number taken to 2 decimal places)");
        priceText = input.nextLine();
        price = Double.parseDouble(priceText);
        redVelvet.setPrice(price);

        // repeat chocolate
        System.out.println("We are deciding on the price for our chocolate cupcake. Here is the description: ");
        chocolate.type();
        System.out.println("How much would you like to charge for the cupcake? (Input a numerical number taken to 2 decimal places)");
        priceText = input.nextLine();
        price = Double.parseDouble(priceText);
        chocolate.setPrice(price);

        //add each cupcake object to cupcakeMenu array list
        cupcakeMenu.add(cupcake);
        cupcakeMenu.add(redVelvet);
        cupcakeMenu.add(chocolate);

        //Proj 2.4 Object Declaration

        ArrayList<Drink> drinkMenu = new ArrayList<Drink>();
        Drink water = new Drink();
        Soda soda = new Soda();
        Milk milk = new Milk();

        //Proj 2.5 Pricing

        //repeat water
        System.out.println("We are deciding on the price for our water. Here is the description: ");
        water.type();
        System.out.println("How much would you like to charge for the water? (Input a numerical number taken to 2 decimal places)");
        priceText = input.nextLine();
        price = Double.parseDouble(priceText);
        water.setPrice(price);

        //repeat soda
        System.out.println("We are deciding on the price for our soda. Here is the description: ");
        soda.type();
        System.out.println("How much would you like to charge for the soda? (Input a numerical number taken to 2 decimal places)");
        priceText = input.nextLine();
        price = Double.parseDouble(priceText);
        soda.setPrice(price);

        //repeat milk
        System.out.println("We are deciding on the price for our milk. Here is the description: ");
        milk.type();
        System.out.println("How much would you like to charge for the water? (Input a numerical number taken to 2 decimal places)");
        priceText = input.nextLine();
        price = Double.parseDouble(priceText);
        milk.setPrice(price);

        //add each drink to drink menu
        drinkMenu.add(water);
        drinkMenu.add(soda);
        drinkMenu.add(milk);
        // Project 3.5
        new Order(cupcakeMenu, drinkMenu);



    }
}