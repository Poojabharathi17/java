class Mobile{
    String brand; //instance variables
    int price;
    static String name;

    public void show(){
        System.out.println(brand + ":" + price + ":" + name);
    }

}


class StaicInJava{
    public static void main(String[] args)
    {
        Mobile obj1= new Mobile();
        obj1.brand="Apple";
        obj1.price=15000;
        obj1.name="Smartphone";

        Mobile obj2= new Mobile();
        obj2.brand="Redmi";
        obj2.price=10000;
        obj2.name="Smartphone";

        Mobile.name="Phone"; //use class for static variables and not object

        obj1.show();
        obj2.show();
    }
}