import java.io.IOException;
import java.util.*;
/*
*Saving Account
Current Account

UP CASTING  (convert child object into parent object, runs common functions only)

private -> default -> protected -> public

/////   rules for Override   /////

1. you can increase the access but can not decrease it. public -> private XX ||  private -> public OO
2. return type can be of parent class or child class  (covarient return type)
3. child can throw same of sub exception of parent function 
   sub exception (child exception class  of of a parent exception class)
*/



class Summary{
    String title;
    String desc;
    double amount;

}
class AdvancedSummary extends Summary{
    String dayWise;
    String monthWise;
}
abstract class Account{
    int id;
    String name;

    void deposit(){
        System.out.println("Amount Deposit....");
    }
    // void withDraw(){
    //     System.out.println("Amount Withdraw....");
    // }

    abstract void withDraw();

    Summary roi ()throws Exception{
        System.out.println("Amount ROI....");
        Summary summary = new Summary();
        summary.title = "....ROI REPORT....";
        summary.desc = "Jan - March";
        summary.amount = 20000;
        return summary;
    }
}


class SavingAccoutn extends Account{
    void limit(){
        System.out.println("Saving Account Daily Limit of 50 Lakh");
    }
    @Override
    void withDraw(){
        System.out.println("Saving acount withdraw with limit");
    }
}


class CurrentAccount extends Account{
    void odLimit(){
        System.out.println("Current Account No Limit Extra Withdraw");
    }
    ////    overRiding the parent function(means hiding the parent function)
    @Override
    protected AdvancedSummary roi() throws IOException{  
        // (change in access scope )
        // you can increase the access but can not decrease it. public -> private XX ||  private -> public OO

        // super.roi();  // super has reference of parent class members
        System.out.println("Current Account ROI is 5%");
        AdvancedSummary summary = new AdvancedSummary();
        return summary;
    }
    @Override
    void withDraw() {
        System.out.println("CA withdraw with odLimit");
    }
}

class AccountCaller{
    void call(Account account)throws Exception{
        // Common Code
        account.deposit();
        account.withDraw();
        account.roi();
        if(account instanceof SavingAccoutn){
            // down casting 
            ((SavingAccoutn)account).limit();
        }else if(account instanceof CurrentAccount){
            ((CurrentAccount)account).odLimit();
        }
        System.out.println("***************");
    }
}

public class IS_A {

    static void print(List<Integer> list){   
        // polymorphic function
        list.add(23);
        System.out.println(list);
    }


    public static void main(String[] args) throws Exception {

        print(new ArrayList<>());      /////     polymorphic sunction call 
        print(new LinkedList<>());     //     ArrayList, LinkedList, Vector are all child class of List class
        print(new Vector<>());         // this follows SOLID L (Liskov substitution rule)


        AccountCaller ac = new AccountCaller();
        // SavingAccoutn sa = new SavingAccoutn();
        // Account account = new SavingAccoutn(); // UP CASTING
        ac.call(new SavingAccoutn());  // UP CASTING
        ac.call(new CurrentAccount()); // UP CASTING 


        // ac.call(new Account()); // can not makea  object as main class is abstract, can only be inherited 


        // sa.deposit();
        // sa.withDraw();
        // sa.roi();
        // sa.limit();
        // System.out.println("***********************************************");
        // CurrentAccount ca = new CurrentAccount();
        // ca.deposit();
        // ca.withDraw();
        // ca.roi();
        // ca.odLimit();
    }
}
