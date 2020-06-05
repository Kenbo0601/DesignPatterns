
class Client {
    public static void main(String[] ignore) {
       Group company = new Group("Company");
       Group oregon = new Group("Oregon");
       Group idaho = new Group("Idaho");
       company.addMember(oregon);
       company.addMember(idaho);

       Individual john = new Individual("john");
       oregon.addMember(john);
       Individual jane = new Individual("Jane");
       oregon.addMember(jane);
       company.accept(new Printer(),0);

       String [] test = { "Jane", "California", "Oregon", "Jack", };
       for(String t : test)
           System.out.println(t + "  " + company.accept(new Finder(), t));
    }
}
