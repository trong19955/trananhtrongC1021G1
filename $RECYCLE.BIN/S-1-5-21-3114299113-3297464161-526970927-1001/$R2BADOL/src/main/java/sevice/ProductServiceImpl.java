package sevice;

import model.Product;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ProductServiceImpl implements ProductService {
    private static Map<Integer,Product> products;
    static {
        products = new HashMap<>();
        products.put(1,new Product(1,"SamSum","10000000","Kết cấu siêu bền", "JaPan"));
        products.put(2,new Product(2,"Apple","9000000","Chụp hình siêu nét", "USA"));
        products.put(3,new Product(3,"Xiaomi","8000000","Giá cả phải chăng", "China"));
        products.put(4,new Product(4,"IphoneX","15000000","Pin Sài cực trâu", "USA"));
        products.put(5,new Product(5,"Vsmart","10000000","Hàng Việt Nam chất lượng cao", "Việt Nam"));

    }
    @Override
    public List<Product> findAll() {
        return new ArrayList<>(products.values());
    }

    @Override
    public void save(Product product) {
        products.put(product.getId(),product);
    }

    @Override
    public Product findById(int id) {
        return products.get(id);
    }

    @Override
    public void update(int id, Product product) {
        products.put(id,product);
    }

    @Override
    public void remove(int id) {
        products.remove(id);
    }
}
