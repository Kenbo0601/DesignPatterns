class Client {
    public static void main(String [] ignore) {
        Branch aleaf = null;
        if (aleaf == null)
            aleaf = new Branch(5, null, null);
        else
            aleaf.insert(5);
        // aleaf.pp(0);

        Branch search = null;
        if (search == null) {
            search = new Branch(4, null, null);
            search.insert(8).insert(2).insert(3).insert(7);
        } else
            search.insert(4).insert(8).insert(2).insert(3).insert(7);
        search.pp(0);
    }
}
