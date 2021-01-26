package tw.pan.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import tw.pan.model.Product;

public interface ProductSelectDao extends JpaRepository<Product,Long> {

	// 載入頁面時，顯示全部
	@Query(value="select p_name,price,p_img from Product",nativeQuery = true)
	List<Product> selectAll();
		
	// 查詢大項
	@Query(value="select p_name,price,p_img from Product where p_main = ?1")
	List<Product> selectMain(String p_main);
		
	// 查詢大項 + 小項
	@Query(value="select p_name,price,p_img from Product where p_main = ?1 and p_detail = ?2")
	List<Product> selectMainAndDetail(String p_main,String p_detail);
		
	// 查詢名稱  select * from Product where p_name like '%手工%';
	@Query(value="select p_name,price,p_img from Product where p_name like %?1%")
	List<Product> selectName(String p_name);
}
