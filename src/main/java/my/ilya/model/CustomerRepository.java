package my.ilya.model;

import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

@Repository
@Transactional
public class CustomerRepository extends AbstractFacade<Customer>{
	
	public CustomerRepository() {
		super(Customer.class);
	}
	
}
