public class RestoApp {
    public static void main(String []args){
        MenuItem burger = new MenuItem("Classic Burger", 250.00);
        MenuItem fries = new MenuItem("Large Fries", 85.00);
        MenuItem soda = new MenuItem("Root Beer", 60.00);

        MenuCategory soloMeal = new MenuCategory("--- BARKADA SOLO MEAL ---");
        soloMeal.add(burger);
        soloMeal.add(fries);
        soloMeal.add(soda);

        Menuitem sundae = new MenuItem("Vanilla Sundae", 45.00);

        MenuCategory mainMenu = new MenuCategory("--- MAIN MENU ---");
        mainMenu.add(soloMeal);
        mainMenu.add(sundae);
        
        mainMenu.print();
        System.out.println("\n==============================");
        System.out.printf("Total Menu Value: P%.2f\n", mainMenu.getPrice());
    }
}
