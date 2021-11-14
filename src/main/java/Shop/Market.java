package Shop;


import java.util.ArrayList;
import java.util.List;


public class Market {
    List<Product> productList = new ArrayList<>();

    public void allProductList() {
        for (int i = 0; i < productList.size(); i++) {
            System.out.println(productList.get(i).toString());
        }

    }
    public void addProduct(Product product){
        for (int i = 0; i < productList.size(); i++) {
            if(product.getId()!=productList.get(i).getId()){
            }else {
                return;
            }
        }
                this.productList.add(product);
    }
    public void deleteProduct(long id){
        for (int i = 0; i < productList.size(); i++) {
            if(id==productList.get(i).getId()){
                productList.remove(i);
                System.out.println("Product removed successfully.");
                return;
            }else{
            }
        }
        System.out.println("Product not found");
    }
    public void changeProduct(Product product){
        for (int i = 0; i < productList.size(); i++) {
            if(product.equals(productList.get(i))){
                productList.remove(i);
                productList.add(product);
            }
        }
    }


}
