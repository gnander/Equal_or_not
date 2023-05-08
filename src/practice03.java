public class practice03 {
    public static void main(String args[])
    {
        String string1 = new String("Morla.Gnander Kumar");
        String string2 = new String("M.Gnander kumar");
        String string3 = new String("Gnanu");
        String string4 = new String("Gnanu");

        System.out.println("Comparing " + string1 + " and " + string2
                + " : " + string1.equalsIgnoreCase(string2));

        System.out.println("Comparing " + string3 + " and " + string4
                + " : " + string3.equalsIgnoreCase(string4));

        System.out.println("Comparing " + string2 + " and " + string4
                + " : " + string2.equalsIgnoreCase(string4));
    }
}