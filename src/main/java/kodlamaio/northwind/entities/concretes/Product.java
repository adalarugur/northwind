package kodlamaio.northwind.entities.concretes;

import lombok.Data;

import javax.persistence.*;

//Entity Anataion burada class bir entity belirttik jpa altyapısnı kullanır.
//Entity demek bir veritabanı nesnesi demektir
//Anatasyon solid dışına çıkılır community bunu prensip edinmiştir
//Table hangi tabloya denk gelmesi gerektiğini bildirir
@Entity
@Table(name="products")
@Data //lombok data anotaion ile getter setter constructor otomatize eder
public class Product {
    @Id //pk belirtmeliyiz
    @GeneratedValue //id birer olarak artırıldığını belirtiyoruz
    @Column(name="product_id")  //kolon db isimleri
    private int id;

    @Column(name="category_id")
    private int categoryId;

    @Column(name="product_name")
    private  String productName;

    @Column(name="unit_price")
    private Double unitPrice;

    @Column(name="units_in_stocks")
    private short unitsInStock;

    @Column(name="quantity_per_unit")
    private String quantityPerUnit;


}
