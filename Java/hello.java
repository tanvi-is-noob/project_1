import java.util.Scanner;

public class hello{  
    public static void main(String args[]){ 

    Scanner inp= new Scanner(System.in);

    System.out.println("Hello world");

    int num1= inp.nextInt();

    System.out.println("Your number is: "+num1); 

    inp.close();
    }  
} 