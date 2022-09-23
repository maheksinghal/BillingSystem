import java.util.Scanner;
public class Inventory {
    Scanner input=new Scanner(System.in);
    Product[] obj=new Product[0];
    Product[] obj1={
            new Product(1,"Horlicks",13,70),
            new Product(2,"Bournvita",15,80),
            new Product(3,"Rasna",10,10),
            new Product(4,"Glucose",10,55),
            new Product(5,"Tang",7,15)
    };
    void addProd(){
        Product object=new Product();
        System.out.println("Enter product id");
        object.setProductId(input.nextInt());
        System.out.println("Enter product name");
        object.setName(input.next());
        System.out.println("Enter product quantity");
        object.setQty(input.nextInt());
        System.out.println("Enter product mrp");
        object.setMrp(input.nextDouble());
        int len=this.obj.length;
        Product[] temp=new Product[len+1];
        for(int i=0;i<this.obj.length;i++){
            temp[i]=this.obj[i];
        }
        temp[len]=object;
        this.obj=temp;
        System.out.println("Product added successfully");
    }
    void showDetails(int productId){
        System.out.println("----------------------------------------------------------------------------");
        System.out.printf("%15s %5s","ProductId","|");
        System.out.printf("%15s %5s","Name","|");
        System.out.printf("%15s %5s","Quantity","|");
        System.out.printf("%15s","MRP");
        System.out.println();
        System.out.println("----------------------------------------------------------------------------");
        for(int i=0;i<this.obj.length;i++){
            if(productId==obj[i].getProductId()){
                System.out.printf("%15s %5s",obj[i].getProductId(),"|");
                System.out.printf("%15s %5s",obj[i].getName(),"|");
                System.out.printf("%15s %5s",obj[i].getQty(),"|");
                System.out.printf("%15s",obj[i].getMrp());
                System.out.println();
            }
        }
    }
    void showOutOfStock(){
        System.out.println("----------------------------------------------------------------------------");
        System.out.printf("%15s %5s","ProductId","|");
        System.out.printf("%15s %5s","Name","|");
        System.out.printf("%15s %5s","Quantity","|");
        System.out.printf("%15s","MRP");
        System.out.println();
        System.out.println("----------------------------------------------------------------------------");
        for(int i=0;i<this.obj.length;i++){
            if(obj[i].getQty()==0){
                System.out.printf("%15s %5s",obj[i].getProductId(),"|");
                System.out.printf("%15s %5s",obj[i].getName(),"|");
                System.out.printf("%15s %5s",obj[i].getQty(),"|");
                System.out.printf("%15s",obj[i].getMrp());
                System.out.println();
            }
        }
    }
}

