class StringType{
    public static void main(String[] args)
    {
        String name = "Pooja"; 
        name = name + "Bharathi";
        System.out.println(name);

     // Here s1 and s2 will have same object which will be present at string constant pool in heap memory

        String s1="Dog";
        String s2="Dog";

        System.out.println(s1==s2);
        

     /* Strings can be mutable and immutable
       Mutable -> can be changed (String buffer and String builder)
       Immutbale -> cannot be changed (Default) */

    }
}