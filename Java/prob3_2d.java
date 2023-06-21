import java.util.Scanner;

public class prob3_2d {
    public static void main(String[] args)
    {
        Scanner inp=new Scanner(System.in);

        int x,y, a=0;
        System.out.print("Enter your row size of array: ");
        x=inp.nextInt();

        System.out.print("Enter your column size of array: ");
        y=inp.nextInt();

        int[][] num= new int[x][y];
        int[] col= new int[y];

        for(int w=0;w<num.length;w++)
        {
            
            for(int z=0;z<num[w].length;z++)
            {
                System.out.print("Enter integer for array element ["+w+"]["+z+"]: ");
                num[w][z]=inp.nextInt();
            }

        }
        
        for(int z=0;z<num[a].length ;z++)
        {
            for(int w=0;w<num.length;w++)
            {
                col[a]+=num[w][z];
            }
            a++;
        }

        int h=0;
        for(int z=0;z<col.length;z++)
        {
            System.out.print("Sum of column ["+h+"] of array: ");
            for(int q: col)       
            {
                System.out.print(q);
                h++;
            }
        }

        inp.close();
    }
}
