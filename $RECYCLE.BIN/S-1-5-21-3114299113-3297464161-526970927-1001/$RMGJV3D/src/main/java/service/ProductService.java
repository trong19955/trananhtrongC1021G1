package service;

import model.Product;

import java.util.List;

public interface ProductService {
    //    Hiển thị danh sách sản phẩm o
//    Tạo sản phẩm mới o
//    Cập nhật thông tin sản phẩm  o
//    Xoá một sản phẩm o
//    Xem chi tiết một sản phẩm o
//    Tìm kiếm sản phẩm theo tên o
    List<Product> findAll();

    void save(Product product);

    Product findById(int id);

    void update(int id, Product product);

    void remove(int id);

}
