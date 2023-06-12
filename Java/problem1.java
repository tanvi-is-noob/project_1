import java.util.Scanner;

public class problem1 {
    public static void main(String[] args)
    {
        Scanner inp=new Scanner(System.in);
        int[] num= new int[10];

        for(int i=0;i<num.length;i++)
        {
            num[i]=inp.nextInt();
        }
        inp.close();
    } 
    
}
