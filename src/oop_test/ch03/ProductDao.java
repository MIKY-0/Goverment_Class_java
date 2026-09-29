package oop_test.ch03;

public class ProductDao {
    public void insertProduct(Product product) {
        System.out.printf("상품명 : %s , 가격 : %d원 - 상품이 DB에 등록되었습니다." , product.getName() , product.getPrice() );
    }
}
