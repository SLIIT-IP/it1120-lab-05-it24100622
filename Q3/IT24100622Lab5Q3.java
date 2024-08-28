import java.util.Scanner ;
public class IT24100622Lab5Q3{
public static void main(String[] args){
double discountRate,totalPayment;
discountRate=0;
Scanner x=new Scanner(System.in);
System.out.println("Enter start date (1-31): ");
int startDate=x.nextInt();
System.out.println("Enter end date (1-31): ");
int endDate=x.nextInt();
 final double CHARGE_PER_DAY=48000.00;
 final double DISCOUNT_3TO4_DAYS=0.1;
 final double DISCOUNT_5_ORMORE_DAYS=0.2;
			
     if (startDate<1||startDate>31||endDate<1||endDate>31){
	System.out.println("Error: Days must be between 1 and 31");
	return;
	}
    if (startDate>=endDate) {
	System.out.println("Error:Start date must be less than end date");
	return;
	}
int numOfDays=endDate-startDate;
   if (numOfDays>=3&&numOfDays<=4){
       discountRate=DISCOUNT_3TO4_DAYS;
   }
  else if (numOfDays>=5){
      discountRate=DISCOUNT_5_ORMORE_DAYS;
  }
totalPayment=(CHARGE_PER_DAY-(CHARGE_PER_DAY*discountRate))*numOfDays;

System.out.println("Room charge per day: "+CHARGE_PER_DAY);
System.out.println("Number of days reserved: "+numOfDays);
System.out.println("Total amount to be paid: "+totalPayment);
				
 }
}