class Arrays3D{
    public static void main(String[] args){

        /*int num[][]= new int [3][]; //jagged array

        num[0]= new int[3];
        num[1]= new int[4];
        num[2]= new int[2];


        for(int i=0;i<num.length;i++)
        {
            for(int j=0;j<num[i].length;j++)
            {
                num[i][j]=(int)(Math.random()*10); //Math.random() will give only random double values less the 1.0
            }
            
        }*/

        int num[][][] = new int [3][3][3];

        for(int i=0;i<3;i++)
        {
            for(int j=0;j<3;j++)
            {
                for(int k=0;k<3;k++){
                    num[i][j][k]=i+j+k; //Math.random() will give only random double values less the 1.0
                }
                
            }
            
        }


        /* for(int i=0;i<3;i++)
        {
            for(int j=0;j<3;j++)
            {
                for(int k=0;k<3;k++){
                    System.out.print(" "+num[i][j][k]);
                }
                
            }
            System.out.println();
        }*/

        for(int i[][]:num)
        {
            for(int j[]:i)
            {
                for(int k:j)
                {
                    System.out.print(" "+ k);
                }
            }
            System.out.println();
        }

    }
}
