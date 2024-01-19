package estore.services.implem.src.main;

import estore.services.implem.src.core.Bank;
import estore.services.implem.src.core.Client;
import estore.services.implem.src.core.Provider;
import estore.services.implem.src.core.Store;

public class Main {

	public static void main(String[] args) {
		Provider prov = new Provider();
		Bank bank = new Bank();
		Store store = new Store(prov,bank);
		Client cl = new Client(store);
		
		cl.run();

	}

}
