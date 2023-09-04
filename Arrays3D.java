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
                for(int k=0;k<3;j++){
                    num[i][j][k]=0; //Math.random() will give only random double values less the 1.0
                }
                
            }
            
        }


         for(int i=0;i<3;i++)
        {
            for(int j=0;j<3;j++)
            {
                for(int k=0;k<3;j++){
                    System.out.print("num["+i+"]["+j+"]["+k+"] = " +num[i][j][k]+"\t");
                }
                
            }
            System.out.println();
        }

    }
}
