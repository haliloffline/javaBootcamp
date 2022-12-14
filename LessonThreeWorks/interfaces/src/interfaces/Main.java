package interfaces;

public class Main {

	public static void main(String[] args) {
		
//		ICustomerDal customerDal = new ICustomerDal() {
//		interface'ler newlenemez abstract class'a benzer
		
		ICustomerDal customerDal = new OracleCustomerDal();
		
		
		CustomerManager customerManager = new CustomerManager(new OracleCustomerDal());
//		customerManager.customerDal = new MySqlCustomerDal(); //bunun yerine aktif kullan�m daha do�rudur.
		customerManager.add();
	}

}
