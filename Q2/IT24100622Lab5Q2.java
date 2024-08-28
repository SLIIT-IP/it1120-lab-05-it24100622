import java.util.Scanner ;
public class IT24100622Lab5Q2 {
public static void main (String []args){
Scanner input = new Scanner(System.in);
System.out.print("Enter the number of new members introduced: ");
int num = input.nextInt();
  if (num>=5) {
     System.out.print("Prize is a: Headphone");
}
 else {
  switch (num){
     case 0: System.out.print("No Prize");
            break;
     case 1: System.out.print("price is a : pen");
            break;
     case 2: System.out.print("price is a : Umbrella");
            break;
     case 3: System.out.print("price is a : Bag");
            break;
     case 4: System.out.print("price is a : Travelling chair");
            break;
    default : System.out.print("Input must be a number 0 or greater");
  }
 }
}
}