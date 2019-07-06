package Exercise1;

public class HoaQua {
    private int quantity;
    private String madeIn;
    private String dateIn;
    private int price;

    public HoaQua() {
    }

    public HoaQua(int quantity, String madeIn, String dateIn, int price) {
        this.quantity = quantity;
        this.madeIn = madeIn;
        this.dateIn = dateIn;
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String getMadeIn() {
        return madeIn;
    }

    public void setMadeIn(String madeIn) {
        this.madeIn = madeIn;
    }

    public String getDateIn() {
        return dateIn;
    }

    public void setDateIn(String dateIn) {
        this.dateIn = dateIn;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return null;
    }
}
