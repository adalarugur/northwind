package kodlamaio.northwind.dataAccess.abstracts;

import kodlamaio.northwind.entities.concretes.Product;
import org.springframework.data.jpa.repository.JpaRepository;
//interface interface extend eder
//jparepository verdiğin veri tipi entity anotaasyonu ile süslenmiş nesne için pk alanında ne olduğunu
//verki ben sorguları ona göre hazırlayayım Product için PK Integer
//ve crud operasyonlarımız hazır

public interface ProductDao extends JpaRepository  <Product,Integer>{


}
