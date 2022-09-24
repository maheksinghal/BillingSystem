import java.util.Scanner;
import java.lang.Character;
public class Bill {
    private String name;
    private long phoneNo;
    private String address;
    private int billNo;
    Inventory objects=new Inventory();
    void newBill(){
        Scanner input=new Scanner(System.in);
        System.out.println("Enter address of customer");
        address= input.nextLine();
        System.out.println("Enter name of customer");
        name=input.next();
        System.out.println("Enter phone number of customer");
        phoneNo= input.nextLong();
        billNo= 100;
        Product[] obj=new Product[0];
        int[] qtyObj=new int[0];
        int ch=1;
        /*System.out.println("Enter choice");
        String choice=input.next();*/
        String pId;
        int qty;
        boolean flag=true;
        //do{
            /*.out.println("Enter choice");
            String choice=input.next();*/
        while(flag) {
            System.out.println("Enter product id for adding product and exit for exit");
            pId = input.next();
            boolean flag2 = true;
            for (int i = 0; i < obj.length; i++) {
                if (!Character.isDigit(pId.charAt(i))) {
                    flag2 = false;
                }
            }
            if (flag2) {
                System.out.println("Enter quantity");
                qty = input.nextInt();
                int len = obj.length;
                Product[] temp = new Product[len + 1];
                int[] tempQty = new int[qtyObj.length + 1];
                for (int i = 0; i < obj.length; i++) {
                    temp[i] = obj[i];
                    tempQty[i] = qtyObj[i];
                }
                temp[len] = objects.getDetails(Integer.parseInt(pId),qty);
                obj = temp;
                tempQty[qtyObj.length] = qty;
                qtyObj = tempQty;
            } else {
                if(pId.equals("exit")||pId.equals("EXIT")||pId.equals("Exit")){
                    flag=false;
                }
                else{
                    System.out.println("Invalid Input");
                }
            }
        }
            /*System.out.println("1. Add product 2.Exit");
            System.out.println("Enter choice");
            String choice=input.next();*/
            /*switch(choice){
                case 1:
                    System.out.println("Enter product id");
                    int pId= input.nextInt();
                    System.out.println("Enter quantity");
                    int qty= input.nextInt();
                    int len=obj.length;
                    Product[] temp=new Product[len+1];
                    int[] tempQty=new int[qtyObj.length+1];
                    for(int i=0;i<obj.length;i++){
                        temp[i]=obj[i];
                        tempQty[i]=qtyObj[i];
                    }
                    temp[len]=objects.getDetails(pId);
                    obj=temp;
                    tempQty[qtyObj.length]=qty;
                    qtyObj=tempQty;
                    break;
                case 2:
                    ch =0;
                    break;
                default:
                    System.out.println("Invalid choice");
            }*/
        //}while(!pId.equals("exit"));
        double total=0;
        for(int i=0;i< obj.length;i++){
            if(obj[i]!=null){
                double price=obj[i].getMrp()*qtyObj[i];
                total=total+price;
            }
        }
        double tax=0.18*total;
        double fPrice=total+tax;
        System.out.println("---------------------------------------------------------------------------------------------------------------------------");
        System.out.printf("%62s","All in one grocery");
        System.out.println();
        System.out.println("---------------------------------------------------------------------------------------------------------------------------");
        System.out.printf("%-15s %5s %70s %5s","Name:",name,"Bill No.:",billNo);
        System.out.println();
        System.out.printf("%-15s %5s","Phone number:",phoneNo);
        System.out.println();
        System.out.printf("%-15s %5s","Address:",address);
        System.out.println();
        System.out.println("---------------------------------------------------------------------------------------------------------------------------");
        System.out.printf("%15s %5s","Sno.","|");
        System.out.printf("%15s %5s","ProductId","|");
        System.out.printf("%15s %5s","Name","|");
        System.out.printf("%15s %5s","Quantity","|");
        System.out.printf("%15s %5s","MRP","|");
        System.out.printf("%15s","Price");
        System.out.println();
        System.out.println("---------------------------------------------------------------------------------------------------------------------------");
        for(int i=0;i< obj.length;i++){
            if(obj[i]!=null){
                System.out.printf("%15s %5s",i+1,"|");
                System.out.printf("%15s %5s",obj[i].getProductId(),"|");
                System.out.printf("%15s %5s",obj[i].getName(),"|");
                System.out.printf("%15s %5s",qtyObj[i],"|");
                System.out.printf("%15s %5s",obj[i].getMrp(),"|");
                System.out.printf("%15s",obj[i].getMrp()*qtyObj[i]);
                System.out.println();
            }

        }
        System.out.println("---------------------------------------------------------------------------------------------------------------------------");
        System.out.printf("%15s %90s","Total","|");
        System.out.printf("%15s",total);
        System.out.println();
        System.out.println("---------------------------------------------------------------------------------------------------------------------------");
        System.out.printf("%15s %90s","Tax","|");
        System.out.printf("%15s",tax);
        System.out.println();
        System.out.println("---------------------------------------------------------------------------------------------------------------------------");
        System.out.printf("%15s %90s","Final Price","|");
        System.out.printf("%15s",fPrice);
        System.out.println();
        System.out.println("---------------------------------------------------------------------------------------------------------------------------");
    }
    void getBill(){}
}

