// Syntax = datatype array_name[] = {...};

public class javaArray{

    public static void main(String[] args){

        /* 
        STATIC DECLARATION
        int num[]={3,2,4,3};
        num[1]=6;
        */

        
        int num[]= new int[3];
        num[0]=1;
        num[1]=3;
        num[2]=2;
        for(int i=0;i<=3;i++)
        {
            System.out.println(num[i]);
        }

        
    }
}