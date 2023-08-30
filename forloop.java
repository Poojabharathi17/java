class forloop{
    public static void main(String[] args)
    {
       for(int i=1;i<=4;i++)
       {
            System.out.println("Hello:" + i);

            for(int j=1;j<=9;j++)
            {
                System.out.println("   "+(j+10));
            }
       }
    }
}