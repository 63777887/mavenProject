package understandMaven.example.jdbc;

public class Orderitems {
    private Integer num;
    private Integer item;
    private String id;
    private Integer quantity;
    private Double price;


    public Orderitems() {
    }

    public Orderitems(Integer num, Integer item, String id, Integer quantity, Double price) {
        this.num = num;
        this.item = item;
        this.id = id;
        this.quantity = quantity;
        this.price = price;
    }

    public Integer getItem() {
        return item;
    }

    public void setItem(Integer item) {
        this.item = item;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Integer getNum() {
        return num;
    }

    public void setNum(Integer num) {
        this.num = num;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Orderitems{" +
                "num=" + num +
                ", item=" + item +
                ", id='" + id + '\'' +
                ", quantity=" + quantity +
                ", price=" + price +
                '}';
    }
}
