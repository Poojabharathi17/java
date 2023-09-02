class Calculator{

    int a;//instance variabale

    public int add(int n1, int n2)
    {
        int r = n1+n2;
        return r;
    }

}



class demoObjects{
    public static void main(String[] args)
    {

        int a = 9;
        int b = 9;

        //num1 and num2 are primitve variables since they are of type int.
        //But calc is a reference variable since it is of type Calculator.
        //How to create an object:
        Calculator calc = new Calculator(); //obj is instance variable

        int result = calc.add(a, b);

        System.out.println(result);
        

    }
}

/*
JDK - Java Development Kit
JVM - Java Virtual Machine
JRE - Java Runtime Environment

JDK -> JRE -> JVM 

Instance variables will be stored in heap
Local variables willl be stores in stack

*/


