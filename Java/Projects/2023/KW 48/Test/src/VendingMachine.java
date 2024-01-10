import java.util.ArrayList;
import java.util.Scanner;

public class VendingMachine {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        ArrayList<Product> products = new ArrayList<>();
        products.add(new Product("CocaCola", 0, 4));
        products.add(new Product("Fanta", 0, 4));
        products.add(new Product("Mezomix", 0, 4));
        products.add(new Product("Water", 0, 3));
        products.add(new Product("Mars", 0, 2.50));
        products.add(new Product("Twix", 0, 2.5));
        products.add(new Product("Bounty", 0, 3.5));
        products.add(new Product("Milky Way", 0, 3));

        UserLogic userLogic = new UserLogic(products);
        BusinessLogic businessLogic = new BusinessLogic(products);

        userLogic.printAutomat();

        while (true) {
            System.out.print("Enter product number x to exit: ");
            String input = in.next();

            if (input.equalsIgnoreCase("x")) {
                break;
            } else if (input.equalsIgnoreCase("Hi")) {
                businessLogic.BusinessOption();
            } else {
                userLogic.UserInput(input);
            }
        }
    }
}

class Product {
    private String name;
    private int count;
    private double price;
    private int maxCapacity = 10;

    public Product(String name, int count, double price) {
        this.name = name;
        this.count = count;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public void fillProduct() {
        this.count = maxCapacity;
    }

    public double getPrice() {
        return price;
    }

    public void printProductDetails() {
        System.out.println("Product details: " + name + " - Price: " + price + " - Count: " + count);
    }
}

class UserLogic {
    private ArrayList<Product> products;
    private double userBalance;
    private Scanner scanner;

    public UserLogic(ArrayList<Product> products) {
        this.products = products;
        this.userBalance = 0;
        this.scanner = new Scanner(System.in);
    }

    public void printAutomat() {
        for (int i = 0; i < products.size(); i++) {
            Product product = products.get(i);
            System.out.println("Product " + (i + 1) + ": " + product.getName() +
                    " - Price: " + product.getPrice() + " - Count: " + product.getCount());
        }
    }

    public void UserInput(String input) {
        int productIndex = Integer.parseInt(input) - 1;
        if (productIndex < 0 || productIndex >= products.size()) {
            System.out.println("Invalid product number. Please try again.");
            return;
        }

        Product selectedProduct = products.get(productIndex);
        selectedProduct.printProductDetails();
        insertMoney();

        if (userBalance < selectedProduct.getPrice()) {
            System.out.println("Insufficient funds. Additional funds required: " + (selectedProduct.getPrice() - userBalance));
            return;
        }

        giveOutProduct(selectedProduct);
    }

    private void insertMoney() {
        while (true) {
            System.out.print("Insert money (or 'x' to cancel): ");
            String input = scanner.next();

            if (input.equalsIgnoreCase("x")) {
                return;
            }

            try {
                double amount = Double.parseDouble(input);
                userBalance += amount;
                System.out.println("Current balance: " + userBalance);
                return;
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter a valid amount.");
            }
        }
    }

    private void giveOutProduct(Product product) {
        if (userBalance > product.getPrice()) {
            double change = userBalance - product.getPrice();
            System.out.println("Change: " + change);
        }

        System.out.println("Dispensing " + product.getName());
        product.setCount(product.getCount() - 1);
        userBalance = 0;
    }
}

class BusinessLogic {
    private ArrayList<Product> products;
    private String secretKey = "Hi"; // Replace with a secure secret key

    public BusinessLogic(ArrayList<Product> products) {
        this.products = products;
    }


    private void printAutomatDetails() {
        for (Product product : products) {
            System.out.println(product.getName() + " - Count: " + product.getCount());
        }
    }

    public void BusinessOption() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Options:");
            System.out.println("1. Fill Automat");
            System.out.println("2. Change Price");
            System.out.println("3. Change Product");
            System.out.println("4. Exit Busines-Logic");

            System.out.print("Enter option: ");
            int option = scanner.nextInt();

            switch (option) {
                case 1:
                    fillAutomat();
                    break;

                case 4:
                    return; //Verlässt die Business-Logic
                default:
                    System.err.println("Invalid option");
            }
        }
    }

    private void fillAutomat() {
        for (Product product : products) {
            product.fillProduct();
        }

        System.out.println("The products in the automat have been filled to their max. capacity.");
    }


}
