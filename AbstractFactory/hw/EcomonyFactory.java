
public class EcomonyFactory implements AbstractFactory {
   public AccountIF createAccount(int loginId) {
       return new AccountEconomy(loginId);
   } 

   public SecurityManagerIF createManager() {
       return new SecurityManagerEconomy();
   }
}