import java.util.Scanner;
public class BillMain {
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        Bill obj=new Bill();
        int ch = 1;
        do{
            System.out.println("1. New Bill 2.Get Bill 3.Exit");
            System.out.println("Enter choice");
            int choice=input.nextInt();
            switch(choice){
                case 1:
                    obj.newBill();
                    break;
                case 2:
                    obj.getBill();
                    break;
                case 3:
                    ch=0;
                    break;
                default:
                    System.out.println("Invalid choice");
            }
        }while(ch == 1);
    }
}
