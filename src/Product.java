public class Product {
    private int productId;
    private double mrp;
    private int qty;
    private String name;
    Product(int pid,String name,int qty,double mrp){
        this.productId=pid;
        this.name=name;
        this.qty=qty;
        this.mrp=mrp;
    }
    Product(){}

    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    public void setMrp(double mrp) {
        this.mrp = mrp+(0.18*mrp);
    }

    public void setQty(int qty) {
        this.qty = qty;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getMrp() {
        return mrp;
    }

    public int getQty() {
        return qty;
    }

    public String getName() {
        return name;
    }
    int sell(int qty){
        int finalQty=this.qty-qty;
        return finalQty;
    }
}
