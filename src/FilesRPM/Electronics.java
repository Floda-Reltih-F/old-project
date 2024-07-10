package FilesRPM;

public class Electronics extends Product{
    private int warrantyPeriod;

    public Electronics(String productName, double price, int warrantyPeriod) {
        super(productName, price);
        this.warrantyPeriod = warrantyPeriod;
    }

    public int getWarrantyPeriod() {return warrantyPeriod;}

    public void setWarrantyPeriodInfo(){
        System.out.println("*************************");
        System.out.println("Name: "+ getProductName());
        System.out.println("price: "+ getPrice());
        System.out.println("wareny: "+ getWarrantyPeriod());
        System.out.println("**************************");
    }
      /*
    Project: Retail Product Management

Objective: Demonstrate single inheritance in a retail context.

Steps:

    1. Create a base class called Product.
    2. Define private member variables: productName (type String) and price (type double).
    3. Provide a constructor to initialize these variables.
    4. Implement public methods getProductName() and getPrice() to access these variables.
    5. Create a derived class called Electronics that extends Product.
    6. Add a private member variable: warrantyPeriod (type int).
    7. Provide a constructor to initialize all variables.
    8. Implement public method getWarrantyPeriod() to access the warranty period.
    9. In a main method, create an Electronics object and display all the details.
     */
}
