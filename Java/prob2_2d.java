public class prob2_2d {
    public static void main(String[] args)
    {
        int[][] num={{1,2,3},{4,5,6},{7,8,9}};

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

    }
    
}
