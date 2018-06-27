import java.rmi.Naming;

public class CalculatorClient{

public static void main(String[] args){

try{

Calculator c = (Calculator)Naming.lookup("//127.0.0.1:1099/CalculatorService");
System.out.println("addition of 10 and 15 is:  "+c.add(10,15));
System.out.println("Subtraction of 10 from 15 is: "+c.sub(10,15));
System.out.println("Multiplication of 10 and 15 is: "+c.mul(10,15));
System.out.println("Division of 10 by 15 is: "+c.div(10,15));
}catch(Exception e){
System.out.println(e);

}
}


}
