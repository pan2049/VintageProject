package tw.pan.dao;

import java.util.List;

import javax.persistence.EntityManager;

import org.hibernate.Session;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import tw.pan.model.Product;

@Repository
public class ProductSelectDao2 {

	@Autowired
    private EntityManager entityManager;

    private Session getSession() {
        return entityManager.unwrap(Session.class);
    }
    
	public List<Product> findByMain(String main){
		String tableName = "Product";
		String columnName1 = "p_main";
		String hqlsql = String.format("from %s as l where %s = ?1", tableName,columnName1);
		
		Query<Product> query = getSession().createQuery(hqlsql,Product.class);
		query.setParameter(1, main);
		System.out.println(query.list());
		List<Product> pList = query.list();
		System.out.println(pList);
		return pList;
	}
}
