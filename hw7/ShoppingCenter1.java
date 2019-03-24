package hw7;

import java.util.Calendar;
import java.util.Scanner;

public class ShoppingCenter1 {
	
	public static void main(String[] args)
	{
		
		final int LIMIT_CUSTOMER_NUMBER = 2;
		
		/* Product 객체 */
		Product[] shopProductList;  
		int shopProductNumber = 5;
		
		if(args.length > 1)
			shopProductNumber = Integer.parseInt(args[0]);
		
		shopProductList = new Product[shopProductNumber];
		
		shopProductList[0] = new Product("치약", 2000, 111);
		shopProductList[1] = new Product("방석", 5000, 222);
		shopProductList[2] = new Product("마우스", 1700, 333);
		shopProductList[3] = new Product("볼펜", 3000, 444);
		shopProductList[4] = new Product("휴지", 1000, 555);
		
		CustomerOrder[] customerList = new CustomerOrder[LIMIT_CUSTOMER_NUMBER];
		for(int a=0; a<LIMIT_CUSTOMER_NUMBER; a++)
		{
			customerList[a] = new CustomerOrder();
		}
		
		/* customer's Order 객체 */
		for(int k=0; k<LIMIT_CUSTOMER_NUMBER; k++)
		{
			
			Scanner scanner = new Scanner(System.in);
				
			System.out.println("이름을 입력해주세요 : " );
			String name = scanner.nextLine();
			customerList[k].cName = name;
			
			System.out.println("몇 개의 물건을 사겠습니까? : ");
			int numOfProduct = scanner.nextInt(); 
			
			Product[] customerBuyList = new Product[numOfProduct];
			for(int z=0; z<numOfProduct; z++)
			{
				customerBuyList[z] = new Product();
			}
			
			/* 주문하려는 제품 목록 */
			int choice = 0;
			for(int i=0; i<customerBuyList.length; i++)
			{
				for(int j=0; j<shopProductList.length; j++)
				{
					System.out.println(j + " : " + shopProductList[j].getPName());
				}
				System.out.println("사고 싶은 물건의 번호를 입력하세요 : ");
				
				choice = scanner.nextInt(); //물건 번호 
				
				customerBuyList[i].UPC = shopProductList[choice].getUPC();
				customerBuyList[i].PPrice = (int) shopProductList[choice].getPPrice();				
			}
			
			customerList[k].productList = customerBuyList;
			
			Calendar today = Calendar.getInstance(); 
			customerList[k].today = today;
			
			/* 영수증 출력하기 */
			int sum = 0;
			System.out.println("***** 영수증 *****" );
			System.out.println("주문 번호 : " +customerList[k].getTransactionID());
			System.out.println("주문자 이름 : " +customerList[k].cName);
			int month = customerList[k].today.get(Calendar.MONTH) + 1;
			int day = customerList[k].today.get(Calendar.DAY_OF_MONTH);
			System.out.println("주문 날짜 : " + month + "/" + day);
			System.out.println("<주문 내역>");
			for(int j=0; j<numOfProduct; j++)
			{
				System.out.print("제품 번호 : " + customerBuyList[j].UPC);
				System.out.println("\t 제품 가격 : " + customerBuyList[j].PPrice);
				sum += customerBuyList[j].PPrice;
			}
			
			System.out.println("총 금액 : " + sum);
			System.out.println("***************");
			System.out.println();
			
		}
		
		int allSum = 0;
		for(int a=0; a<LIMIT_CUSTOMER_NUMBER; a++)
		{
			allSum += customerList[a].getProfit();
		}
		System.out.println("쇼핑몰에서 판매한 총 금액 : " + allSum);
		
		
	}
}
