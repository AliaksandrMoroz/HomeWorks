package Shop;


import java.util.ArrayList;
import java.util.List;


public class Market {
    List<Product> productList = new ArrayList<>();

    @Override
    public String toString() {
        return "Market: "+productList.toString();
    }

    public void addProduct(Product product){
        this.productList.add(product);
    }
    public void deleteProduct(long id){
        for (int i = 0; i < productList.size(); i++) {
            if(id==productList.get(i).getId()){
                productList.remove(i);
                System.out.println("Product removed successfully.");
            }
        }
        System.out.println("Product not found");
    }


}
