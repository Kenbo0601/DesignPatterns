
public class EcomonyFactory extends FactoryMethod {
   public AccountIF createAccount(int loginId) {
       return new AccountEconomy(loginId);
   } 

   public SecurityManagerIF createManager() {
       return new SecurityManagerEconomy();
   }
}
