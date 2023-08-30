class dowhileloop{
    public static void main(String[] args)
    {
        int i=5;
        
        do{
            System.out.println("Roll no :"+ i);

            int j=1;
           
            do{
                System.out.println("Hello " + j);
                j++;
            }while(j<=3);

            i++;
        }while(i<=4);
    }
}