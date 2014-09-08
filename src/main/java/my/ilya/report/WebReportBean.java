package my.ilya.report;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.context.support.WebApplicationContextUtils;

import my.ilya.model.Customer;
import my.ilya.model.CustomerRepository;

public class WebReportBean {

	private String startDate;
	private String endDate;
	
	private WebApplicationContext context;
	
	public void processRequest(HttpServletRequest request){
		context = WebApplicationContextUtils.getWebApplicationContext(request.getServletContext());
	}

	public String getEndDate() {
		return endDate;
	}

	public void setEndDate(String endDate) {
		this.endDate = endDate;
	}

	public String getStartDate() {
		return startDate;
	}

	public void setStartDate(String startDate) {
		this.startDate = startDate;
	}
	
	public String print(){
		CustomerRepository customerRepository = (CustomerRepository) context.getBean("customerRepository");
		List list = customerRepository.findAll();
		return list.toString();
	}
}
