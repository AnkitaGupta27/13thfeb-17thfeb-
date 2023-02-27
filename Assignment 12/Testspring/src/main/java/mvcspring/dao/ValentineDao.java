package mvcspring.dao;

import javax.transaction.Transactional;


import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Propagation;

import mvcspring.model.Valentine;
@Repository
public class ValentineDao {
	@org.springframework.beans.factory.annotation.Autowired(required=true)
	private HibernateTemplate hibernateTemplate;
	
	@Transactional()
	public int saveValentine(Valentine valentine) {
		System.out.println("valentinedao");
		int r=(Integer)this.hibernateTemplate.save(valentine);
		System.out.println("Rows affected: "+r);
		return r;
	}
}

