
class Client {
    public static void main(String[] ignore) {
       Group company = new Group("Company");
       Group oregon = new Group("Oregon");
       Group idaho = new Group("Idaho");
       company.addMember(oregon);
       company.addMember(idaho);

       //in this case john is a atomic
       Individual john = new Individual("john");
       oregon.addMember(john);
       //john.pp(0);
       Individual jane = new Individual("Jane");
       oregon.addMember(jane);
       company.pp(0);
    }
}