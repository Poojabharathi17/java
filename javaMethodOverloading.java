/* Method Overloading - You can many number of methods with same name but paramaters are different(size or data type)*/


class Calci{
    public int add(int n1, int n2)
    {
        return n1+n2;
    }
    public int add(int n1, int n2, int n3)
    {
        return n1+n2+n3;
    }
}


class javaMethodOverloading{
    public static void main(String[] args)
    {
        Calci cal = new Calci();
         int res = cal.add(3, 4);

         System.out.println(res);
    }
}