import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("===== RENT-GIVERS RENT-SEEKERS SERVICE =====\n");
        Scanner sc = new Scanner(System.in);
        String choice;
        String name = null;
        String surname = null;
        String status = null;
        int index = 0;
        boolean exit = false;
        while (!exit) {
            System.out.println("===== CHOOSE ROLE =====");
            System.out.println("1.Rent-Giver");
            System.out.println("2.Rent-Seeker");
            System.out.print("Choice: ");
            choice = sc.next();

            switch (choice) {
                case "1":
                    index = 1;
                    System.out.println("===== NAME/SURNAME =====");
                    System.out.print("Name: ");
                    name = sc.next();
                    System.out.print("Surname: ");
                    surname = sc.next();
                    RentGiver rg = new RentGiver(name, surname, 5000);
                    break;
                case "2":
                    index = 2;
                    System.out.println("===== NAME/SURNAME =====");
                    System.out.print("Name: ");
                    name = sc.next();
                    System.out.print("Surname: ");
                    surname = sc.next();
                    System.out.print("Status(vip/ordinary): ");
                    status =  sc.next();
                    RentSeeker rs = new RentSeeker(name, surname, 5000, status);
                    break;
                default:
                    System.out.println("Working");
                    break;
            }
            if (index == 1) {
                while (!exit) {
                    System.out.println("===== RENTGIVER MENU =====");
                    System.out.println("1.Add item");
                    System.out.println("2.Delete item");
                    System.out.println("3.View items");
                    System.out.println("4.Update item");
                    System.out.println("5.Profile");
                    System.out.println("6.Exit");
                    System.out.print("Choose: ");
                    String choice1 = sc.next();

                    switch (choice1) {
                        case "1":
                            System.out.println("===== ADD ITEM =====");
                            System.out.print("Item: ");
                            String item = sc.next();
                            System.out.print("Description: ");
                            String description = sc.next();
                            System.out.print("Price: ");
                            float price = sc.nextFloat();
                            RentGiver_Functions add = new RentGiver_Functions();
                            add.items(item, description, price);
                            break;
                        case "2":
                            System.out.println("===== ITEMS =====");
                            RentGiver_Functions view1 = new RentGiver_Functions();
                            view1.view_items();
                            System.out.println("===== DELETE ITEM =====");
                            System.out.print("Id: ");
                            String id = sc.next();
                            RentGiver_Functions delete = new RentGiver_Functions();
                            delete.item_delete(id);
                            break;
                        case "3":
                            System.out.println("===== VIEW ITEM =====");
                            RentGiver_Functions view = new RentGiver_Functions();
                            view.view_items();
                            break;
                        case "4":
                            System.out.println("===== ITEMS =====");
                            RentGiver_Functions view2 = new RentGiver_Functions();
                            view2.view_items();
                            System.out.println("===== UPDATE ITEM =====");
                            System.out.print("Item: ");
                            item = sc.next();
                            System.out.print("New description: ");
                            String new_description = sc.next();
                            System.out.print("New price: ");
                            float new_price = sc.nextFloat();
                            RentGiver_Functions update = new RentGiver_Functions();
                            update.item_update(item, new_description, new_price);
                            break;
                        case "5":
                            System.out.println("===== PROFILE =====");
                            RentGiver rg = new RentGiver(name, surname, 5000);
                            System.out.println("Name: " + rg.getName());
                            System.out.println("Surname: " + rg.getSurname());
                            System.out.println("Money: " + rg.getMoney());
                            System.out.println("Email: " + rg.getEmail());
                            break;
                        case "6":
                            exit = true;
                            break;
                        default:
                            System.out.println("Error");
                    }
                }
            }
            if (index == 2) {
                while (!exit) {
                    System.out.println("===== RENTSEEKER MENU =====");
                    System.out.println("1.View items");
                    System.out.println("2.Rent item");
                    System.out.println("3.My rents");
                    System.out.println("4.Delete rent");
                    System.out.println("5.Profile");
                    System.out.println("6.Exit");
                    System.out.print("Choose: ");
                    String choice1 = sc.next();

                    switch (choice1) {
                        case "1":
                            System.out.println("===== VIEW ITEM =====");
                            RentGiver_Functions view = new RentGiver_Functions();
                            view.view_items();
                            break;
                        case "2":
                            Rent rsd = new Rent();
                            rsd.rents();
                            System.out.println("===== ITEMS =====");
                            RentGiver_Functions view1 = new RentGiver_Functions();
                            view1.view_items();
                            System.out.println("===== RENT ITEM =====");
                            System.out.print("Id: ");
                            String id = sc.next();
                            RentSeeker_Functions rent = new RentSeeker_Functions();
                            rent.rents(id);

                            break;
                        case "3":
                            System.out.println("===== MY RENTS =====");
                            Rent rentt = new Rent();
                            rentt.view_rent();
                            break;
                        case "4":
                            System.out.println("===== MY RENTS =====");
                            Rent rent2 = new Rent();
                            rent2.view_rent();
                            System.out.println("===== DELETE ITEM =====");
                            System.out.print("Id: ");
                            String id1 = sc.next();
                            Rent rent1 = new Rent();
                            rent1.delete_rent(id1);
                            break;
                        case "5":
                            System.out.println("===== PROFILE =====");
                            RentSeeker rg = new RentSeeker(name, surname, 5000, status);
                            System.out.println("Name: " + rg.getName());
                            System.out.println("Surname: " + rg.getSurname());
                            System.out.println("Money: " + rg.getMoney());
                            System.out.println("Email: " + rg.getStatus());
                            break;
                        case "6":
                            exit = true;
                            break;
                        default:
                            System.out.println("Error");
                    }
                }
            }
        }
    }
}