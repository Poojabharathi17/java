class StringsInJava{
    public static void main(String[] args)
    {
        //String name = "Pooja"; Here object will be created in the background.
        
        String name = new String("Hello"+" "+"Pooja");
        System.out.println(name);
        System.out.println(name.charAt(1));
        System.out.println(name.concat(" "+"Bharathi"));
    }
}