package service;

import model.Product;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
//id, tên sản phẩm, giá sản phẩm, mô tả của sản phẩm, nhà sản xuất.

//        Hướng dẫn
public class ProductServiceImpl implements ProductService {
    private static Map<Integer,Product> products;
    static{
        products = new HashMap<>();
        products.put(1,new Product(1,"Samsum",10000000,"good","SamSum Galaxy"));
        products.put(2,new Product(2,"Nokia",5000000,"good","China"));
        products.put(3,new Product(3,"Apple",11000000,"good","Japan"));
        products.put(4,new Product(4,"VinSmart",9000000,"good","VietNam"));
        products.put(5,new Product(5,"Xiaomi",10000000,"good","China"));
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

