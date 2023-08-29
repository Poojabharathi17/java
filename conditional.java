class conditional{
    public static void main(String[]args)
    {
        /*  //if else statements
        int x=10;  
        if(x>10)
        {
            System.out.println("Hi");
        }
        else{
            System.out.println("Bye");
        }*/

        //else if statements

        int x = 89;
        int y = 7;
        int z = 10;

        if(x>y && x>z)
        {
            System.out.println("X is greater");
        }
        else if(y>x && y>z)
        {
            System.out.println("Y is greater");
        }
        else{
            System.out.println("Z is greater");
        }

    }
}