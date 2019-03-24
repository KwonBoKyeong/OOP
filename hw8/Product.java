package hw8;

public class Product {

	/* Attributes */
	public String PName; //제품명 
	public int PPrice; //가격 
	public int UPC; //제품번호 
	
	/* Constructor */
	public Product() 
	{
		PName = "None"; 
		PPrice = 0;
		UPC = 0;
	}
		
	public Product(String PName, int PPrice, int UPC) 
	{
		this.PName = PName;
		this.PPrice = PPrice;
		this.UPC = UPC;
	}
	
	/* getter & setter methods */
	public String getPName() {
		return PName;
	}

	public void setPName(String pName) {
		PName = pName;
	}

	public double getPPrice() {
		return PPrice;
	}

	public void setPPrice(int pPrice) {
		PPrice = pPrice;
	}

	public int getUPC() {
		return UPC;
	}

	public void setUPC(int uPC) {
		UPC = uPC;
	}

	/* toString() */
	@Override
	public String toString() {
		return "Product [PName=" + PName + ", PPrice=" + PPrice + ", UPC=" + UPC + "]";
	}
}
