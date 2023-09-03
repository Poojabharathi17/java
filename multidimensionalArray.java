class multidimensionalArray{
    public static void main(String[] args){

        int num[][] = new int[4][4];
         
        
        for(int i=0;i<4;i++)
        {
            for(int j=0;j<4;j++)
            {
                num[i][j]=(int)(Math.random()*10); //Math.random() will give only random double values less the 1.0
            }
            
        }

        for(int i=0;i<4;i++)
        {
            for(int j=0;j<4;j++)
            {
                System.out.print(num[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println();

        for(int n[]: num)
        {
            for(int m:n)
            {
                System.out.print(m + " ");
            }
            System.out.println();
        }

    }
}