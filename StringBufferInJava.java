class StringBufferInJava{
    public static void main(String[] args)
    {
        StringBuffer sb = new StringBuffer("Pooja");
        System.out.println(sb.capacity());
        System.out.println(sb.length());
        sb.append(" Bharathi");
        sb.deleteCharAt(2);
        sb.insert(0, " java");
        sb.substring(0, 3);
        sb.setLength(30);
        sb.ensureCapacity(100); //Minimum Capacity

        String str = sb.toString();
        System.out.println(str);

        /* stringBuffer is thread safe whereas in stringBuilder is not
           But the methods are same.
        */
    }
}