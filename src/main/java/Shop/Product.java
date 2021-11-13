package Shop;

public class Product {
    public Product(String name, int price) {
        this.id++;
        this.name = name;
        this.price = price;
    }

    private long id=1;
    private String name;
    private int price;

    @Override
    public String toString() {
        return "\nProduct:" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", price=" + price
                ;
    }

    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }
}
