package InterfaceAbstractDemo.concretes;

import InterfaceAbstractDemo.abstracts.BaseCustomerManager;
import InterfaceAbstractDemo.abstracts.ICustomerCheckService;
import InterfaceAbstractDemo.entities.Customer;

public class StarbucksCustomerManager extends BaseCustomerManager  {

ICustomerCheckService customerCheckService;
	
	public StarbucksCustomerManager(ICustomerCheckService customerCheckService) {
		super();
		this.customerCheckService = customerCheckService;
	}
	
	@Override
	public void Save(Customer customer) {
		if(this.customerCheckService.CheckIfRealPerson(customer))
		{
			System.out.println("valid person");
			super.Save(customer);
		}
		else 
		{
			System.out.println("not a valid person");
		}
		super.Save(customer);
	}
}
