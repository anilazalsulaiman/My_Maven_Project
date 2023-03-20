package assignment41;
import java.util.*;

public interface RbiClass {
	
	Scanner scanObj=new Scanner(System.in);
	public static final int storeAmount=scanObj.nextInt();
	public static final int scanDuration=scanObj.nextInt();
	
//	public static final int amount=1000;
//	public static final int duration=10;
	
	int interest=2;
	int interestAbove=5;
	
	abstract void recurringDeposit();
	
	
	

}
