package javaPractice;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

 class TransactionParty {
	String seller;
	String buyer;
	
	public TransactionParty(String seller, String buyer) {
		this.seller=seller;
		this.buyer=buyer;
	}
	class  Receipt{
		TransactionParty transactionParty;
		String productsQR;
		
		public Receipt(TransactionParty transactionParty,String productsQR) {
			this.transactionParty=transactionParty;
			this.productsQR=productsQR;
		}
		public class GenerateReceipt{
			int verifyParty(Receipt r){
				String seller=r.transactionParty.seller;
				String buyer=r.transactionParty.buyer;
				Pattern p=Pattern.compile("^[a-zA-Z' -]+$");
				Matcher m1=p.matcher(seller);
				Matcher m2=p.matcher(buyer);
				boolean isseller=m1.matches();
				boolean isbuyer=m2.matches();
				if(isseller && isbuyer) {
					return 2;	
				}
				else if(isseller || isbuyer) {
					return 1;
				}
				else {
					return 0;
				}
			}
				 public String calcGST(Receipt r) {
				        String[] products = r.productsQR.split("@");
				        int gstRate = 12;
				        int totalGST = 0;

				        for (String product : products) {
				            String[] details = product.split(",");
				            int rate = Integer.parseInt(details[0]);
				            int quantity = Integer.parseInt(details[1]);
				            totalGST += rate * quantity;
				        }

				        totalGST *= gstRate;
				        return Integer.toString(totalGST);
				    }

				    public static void main(String[] args) {
				        TransactionParty party = new TransactionParty("Seller Name", "Buyer Name");
				        Receipt receipt = new Receipt(party, "250,10@100,3@50,7");
				        GenerateReceipt generateReceipt = new GenerateReceipt();

				        int verificationResult = generateReceipt.verifyParty(receipt);
				        String gst = generateReceipt.calcGST(receipt);

				        System.out.println("Verification result: " + verificationResult);
				        System.out.println("GST: " + gst);
				    }
			
		}
	}

	

}
