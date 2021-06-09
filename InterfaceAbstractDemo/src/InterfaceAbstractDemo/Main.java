package InterfaceAbstractDemo;

import java.time.LocalDate;

import InterfaceAbstractDemo.abstracts.BaseCustomerManager;
import InterfaceAbstractDemo.concretes.NeroCustomerManager;
import InterfaceAbstractDemo.entities.Customer;
import InterfaceAbstractDemo.concretes.StarbucksCustomerManager;
import InterfaceAbstractDemo.adapters.MernisServiceAdapter;

public class Main {

	public static void main(String[] args) {
		
		BaseCustomerManager customerManager = new NeroCustomerManager();
		customerManager.Save(new Customer(1, "Eda", "Donmez", "25465898745", LocalDate.of(1998, 05, 13)));
		
		BaseCustomerManager customerManager2=new StarbucksCustomerManager(new MernisServiceAdapter());
		customerManager2.Save(new Customer(1,"Seyma","Donmez","29867445321",LocalDate.of(1985,01, 06)));
		
	}

}
