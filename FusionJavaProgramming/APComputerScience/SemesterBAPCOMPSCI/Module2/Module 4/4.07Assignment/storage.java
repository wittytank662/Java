public class storage {
    private String name;
    private String productNum;
    private double price;
    private int quantity;

    public storage(String n, String pN, double p, int q) {
        name = n;
        productNum = pN;
        price = p;
        quantity = q;
    }

    // getters
    public String getName() {
        return name;
    }

    public String getProductNum() {
        return productNum;
    }

    public double getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }

    // Setters
    public void setName(String n) {
        name = n;
    }

    public void setProductNum(String pN) {
        productNum = pN;
    }

    public void setPrice(double p) {
        price = p;
    }

    public void setQuantity(int q) {
        quantity = q;
    }

    // toString
    @Override
    public String toString() {
        String str = String.format(" %-18s %-18s $%-7.2g %-10d", name, productNum, price, quantity);
        return str;
    }
}
