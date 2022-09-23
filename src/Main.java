import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        Inventory object=new Inventory();
        int ch = 1;
        do{
            System.out.println("1.Add product 2.Get details 3.Out of stock 4.Exit");
            System.out.println("Enter choice");
            int choice=input.nextInt();
            switch(choice){
                case 1:
                    object.addProd();
                    break;
                case 2:
                    System.out.println("Enter product id you want to get details about");
                    int prodId= input.nextInt();
                    object.showDetails(prodId);
                    break;
                case 3:
                    object.showOutOfStock();
                    break;
                case 4:
                    ch =0;
                    break;
                default:
                    System.out.println("Invalid choice");
            }
        }while(ch == 1);
    }
}