class switch1{
    public static void main(String[] args)
    {
         String day = "Wednesday";
         String result ="";


         /*switch(day)
         {
            case "Monday", "Tuesday" -> result ="6am";
                //break;
            case "Wedday", "Thursday" -> result ="7am";
                //break;
            case "Saturday", "Sunday" -> result ="8am";
               //break;
            default -> System.out.println("Invalid Input");
         }*/

        /*result = switch(day)
         {
            case "Monday", "Tuesday" -> "6am";
                //break;
            case "Wedday", "Thursday" -> "7am";
                //break;
            case "Saturday", "Sunday" -> "8am";
               //break;
            default -> "9am";
         };*/

        result = switch(day)
         {
            case "Monday", "Tuesday" : yield "6am";
                //break;
            case "Wedday", "Thursday" : yield "7am";
                //break;
            case "Saturday", "Sunday" : yield "8am";
               //break;
            default : yield "9am";
         };


         System.out.println(result);
    }
}