package Shop;

import java.util.Objects;

public class Product {

    private long id;
    private String name;
    private int price;
    private static long count;



    public Product(String name, int price) {
        this.name = name;
        this.price = price;
        this.id=count++;
    }

    public Product(long id, String name, int price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Product product = (Product) o;
        return id == product.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    @Override
    public String toString() {
        return "id=" + id +
                ", name='" + name  +
                ", price=" + price+"\n"
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
