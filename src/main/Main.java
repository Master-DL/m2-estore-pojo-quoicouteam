package estore.services.interfaces.src.main;

import estore.services.interfaces.src.core.Bank;
import estore.services.interfaces.src.core.Client;
import estore.services.interfaces.src.core.Provider;
import estore.services.interfaces.src.core.Store;

public class Main {

	public static void main(String[] args) {
		Provider prov = new Provider();
		Bank bank = new Bank();
		Store store = new Store(prov,bank);
		Client cl = new Client(store);
		
		cl.run();

	}

}
