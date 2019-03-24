package hw7;

import java.util.Calendar;

public class CustomerOrder extends Product implements InterfaceProfit{

	/* Attributes */
	public String cName; //주문자 
	public Calendar today; //주문 날짜 
	public Product[] productList; //구매 제품들 
	public int transactionID; //주문 번호 
	
	static int currentTransactionNumber = 1;
	
	/* Constructor */
	public CustomerOrder() 
	{
		cName = "Someone";
		today = Calendar.getInstance();
		productList = null;
		transactionID = currentTransactionNumber;
		currentTransactionNumber++;
	}
	
	public CustomerOrder(String cName, Calendar today, Product[] productList) 
	{
		this.cName = cName;
		this.today = today;
		this.productList = productList;
		this.transactionID = currentTransactionNumber;
		currentTransactionNumber++;	
	}
	
	/* getter & setter methods */
	public String getcName() {
		return cName;
	}

	public void setcName(String cName) {
		this.cName = cName;
	}

	public Calendar getToday() {
		return today;
	}

	public void setToday(Calendar today) {
		this.today = today;
	}

	public Product[] getProductList() {
		return productList;
	}

	public void setProductList(Product[] productList) {
		this.productList = productList;
	}

	public int getTransactionID() {
		return transactionID;
	}

	public void setTransactionID(int transactionID) {
		this.transactionID = transactionID;
	}
	
	
	/* toString() */
	@Override
	public String toString() {
		
		return "CustomerOrder [cName=" + cName + ", today=" + today + ", productList=" + productList.toString() + ", transactionID=" + transactionID + "]";
	}

	@Override
	/* getProfit() */
	public int getProfit() {
		// TODO Auto-generated method stub
		int sum = 0;
		for(int i=0; i<productList.length; i++)
		{
			sum += productList[i].getPPrice();
		}
		return sum;
	}
	
	
}