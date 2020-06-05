class Client {
    public static void main(String [] ignore){
        Source source = new Source();
        VerifyPin verify = new VerifyPin(source);
        LateFee late = new LateFee(verify);
        
        TaxReturn discard = late.doTheJob();
    }
}