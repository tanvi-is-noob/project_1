import java.util.Scanner;

public class prob1_2d {
    public static void main(String[] args)
    {
        Scanner inp=new Scanner(System.in);

        int x,y;
        System.out.print("Enter your row size of array: ");
        x=inp.nextInt();

        System.out.print("Enter your column size of array: ");
        y=inp.nextInt();

        int[][] num= new int[x][y];

        for(int w=0;w<num.length;w++)
        {
            for(int z=0;z<num[w].length;z++)
            {
                System.out.print("Enter integer for array element ["+w+"]["+z+"]: ");
                num[w][z]=inp.nextInt();
            }
        }

        System.out.print("\nYour array elements are={\n");
        for (int[] row : num)
        {
            System.out.print("{ ");
            for (int a : row)
            {
                System.out.print(a + " ");
            }
            System.out.print("}\n");
            
        }
            
        System.out.print("}");

        inp.close();
    }
    
}