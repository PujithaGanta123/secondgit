package practicePrograms;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import interFacedemo.Product1;

public class Definitions {
	public static void main(String []arg) {
		TransactionParty tp1=new TransactionParty("pujitha","pravallika");
		Receipt ob1=new Receipt(tp1,"250,10@100,3@50,7");
		
		TransactionParty tp2=new TransactionParty("bindu","deepu");
		Receipt ob2=new Receipt(tp2,"300,5@270,4@100,8");
		
		GenerateReceipt ob=new GenerateReceipt();
		System.out.println(ob.VerifyParty(ob1));
		System.out.println("GST:"+ ob.calcGST(ob1));
		System.out.println(ob.VerifyParty(ob2));
		System.out.println("GST:"+ob.calcGST(ob2));
		
		
	}

}
class TransactionParty {
	
		String seller;
		String buyer;
		TransactionParty(String seller,String buyer){
			this.seller=seller;
			this.buyer=buyer;
		}
}
class  Receipt {
	TransactionParty transactionParty;
	String productsQR;
	Receipt(TransactionParty transactionParty,String productsQR){
		this.transactionParty=transactionParty;
		this.productsQR=productsQR;
	}
}
class GenerateReceipt{
	int verifiedcount=0;
	int price;
	int quantity;
	String productQR;
	public int VerifyParty(Receipt r) {
		String regex="^[A-Za-z]$";
		Pattern p=Pattern.compile(regex);
		Matcher m1=p.matcher(r.transactionParty.seller);
		boolean seller=m1.matches();
		Matcher m2=p.matcher(r.transactionParty.buyer);
		boolean buyer=m2.matches();
		if(seller && buyer)
			return 0;
			
		else if(seller || buyer)
			return 1;
		else
			
		return 2;
		
	}
	
	public String calcGST(Receipt r) {

		String product[]=new String[3];
		product=r.productsQR.split("@");
		int rate[]=new int[3];
		int quantity[]=new int[3];
		for(int j=0;j<3;j++)
		{
			String a[]=product[j].split(",");
			String r1=a[0];
			String q1=a[1];
			rate[j]=Integer.parseInt(r1);
			quantity[j]=Integer.parseInt(q1);
		}
		int GST=0;
		for(int j=0;j<3;j++)
		{
			GST+=rate[j]*quantity[j];
		}
		GST*=0.12;
		return (String)Integer.toString(GST);
	}
		
	
}


	
	









