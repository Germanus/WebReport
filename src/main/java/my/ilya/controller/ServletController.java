package my.ilya.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import my.ilya.model.Customer;
import my.ilya.model.CustomerRepository;

import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.context.support.WebApplicationContextUtils;

public class ServletController extends HttpServlet{

	private static final long serialVersionUID = 1L;
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		super.doGet(req, resp);
	}
	
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse resp) throws ServletException, IOException {
		WebApplicationContext context = WebApplicationContextUtils.getWebApplicationContext(request.getServletContext());
		CustomerRepository repository = context.getBean(CustomerRepository.class);
		Customer customer = new Customer();
		customer.setCity("my city2");
		customer.setFirstName("ilya");
		customer.setLastName("kazakevich");
		customer.setStreet("luchiny");
		repository.create(customer);
	}

}
