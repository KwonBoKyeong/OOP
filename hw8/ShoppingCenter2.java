package hw8;

import java.io.*;
import java.util.Calendar;
import java.util.Scanner;

import hw7.CustomerOrder;
import hw7.Product;

public class ShoppingCenter2 {
	public static Product[] shopProductList = new Product[5];
	
	public static void readCatalogFile() throws FileNotFoundException
	{
		FileReader fin = new FileReader("/Users/bokyeong/eclipse-workspace/oop2018/src/hw8/product.txt");
		Scanner scan = new Scanner(fin);
		String s = scan.nextLine();
		
		String[] array;
		
		array = s.split("\\,"); 
		
		for(int a=0; a<5; a++)
		{
			shopProductList[a] = new Product();
		}

		int j=0;
		for(int i=0; i<5; i++)
		{
			shopProductList[i].PName = array[j];
			j++;
			shopProductList[i].PPrice = Integer.parseInt(array[j]);
			j++;
			shopProductList[i].UPC = Integer.parseInt(array[j]);
			j++;
		}
	}
		
	public static void main(String[] args) throws IOException
	{
		FileWriter fout = new FileWriter("/Users/bokyeong/eclipse-workspace/oop2018/src/hw8/output.txt");
		int j;
		readCatalogFile();
		int LIMIT_CUSTOMER_NUMBER = 1;
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
				for(j=0; j<shopProductList.length; j++)
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
			fout.write("***** 영수증 *****\n");
			fout.write("주문 번호 : "+customerList[k].getTransactionID()+"\n");	
			fout.write("주문자 이름 : " +customerList[k].cName+"\n");
			int month = customerList[k].today.get(Calendar.MONTH) + 1;
			int day = customerList[k].today.get(Calendar.DAY_OF_MONTH);
			fout.write("주문 날짜 : " + month + "/" + day+"\n");
			fout.write("<주문 내역>"+"\n");
			for(j=0; j<numOfProduct; j++)
			{
				fout.write("제품 번호 : " + customerBuyList[j].UPC+"\t");
				fout.write("제품 가격 : " + customerBuyList[j].PPrice+"\n");
				sum += customerBuyList[j].PPrice;
			}
			
			fout.write("총 금액 : " + sum+"\n");
			fout.write("***************"+"\n");
			fout.write("\n");
			
		}
		
		int allSum = 0;
		for(int a=0; a<LIMIT_CUSTOMER_NUMBER; a++)
		{
			allSum += customerList[a].getProfit();
		}
		fout.write("쇼핑몰에서 판매한 총 금액 : " + allSum);
		
		fout.close();
		
	}
}
