class Computer{
    public void playMusic()
    {
        System.out.println("Music Playing");
    }
    public String getPen(int cost)
    {
        if(cost>=10)
            return "Pen";
        return "No Pen";
    }
}





class javaMethods{
    public static void main(String[] args)
    {
        Computer com = new Computer();
        com.playMusic();
        String result = com.getPen(11);
        System.out.println(result);
    }
}