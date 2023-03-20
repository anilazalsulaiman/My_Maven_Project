package assignment41;

public class HdfcClass implements RbiClass{
	int calculate;
	int interestcalculate;
	
	 static String colorGreen="\u001B[32m";
	 static String color_RESET = "\u001B[0m";
	
	public void scannershow() {
		System.out.println("(Interest for 30 days= 2%, Above 30 days= 5%)");
		System.out.println("Deposit an amount and set duration(in days) for interest");
	}

	public void recurringDeposit() {
		
		if(scanDuration <= 30) {
			calculate=storeAmount * 2 / 100;
			interestcalculate= storeAmount + calculate;
			System.out.println(colorGreen+"Congratulations..!! Deposited Amount is: Rs." +storeAmount+color_RESET);
			System.out.println(interest+" % interest for " +scanDuration+" days = Rs." +calculate);
			System.out.println("Total amount credited = Rs." +interestcalculate);
		}else {
			calculate=storeAmount * 5 / 100;
			interestcalculate= storeAmount + calculate;
			System.out.println("Congratulations..!! Deposited Amount is: Rs." +storeAmount);
			System.out.println(interestAbove+" % interest for " +scanDuration+" days = Rs." +calculate);
			System.out.println("Total amount credited = Rs." +interestcalculate);
		}
		
	}
	
	public static void main(String[] args) {
		HdfcClass firstobj=new HdfcClass();
		firstobj.scannershow();
		
		RbiClass obj=new HdfcClass();
		obj.recurringDeposit();
		
	}

}
