import java.io.IOException;
import java.util.*;
/*
*Saving Account
Current Account


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
class Account{
    int id;
    String name;

    void deposit(){
        System.out.println("Amount Deposit....");
    }
    void withDraw(){
        System.out.println("Amount Withdraw....");
    }
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
        System.out.println("Saving Account ROI is 5%");
        AdvancedSummary summary = new AdvancedSummary();
        return summary;
    }
}
public class IS_A {
    public static void main(String[] args) throws Exception {
        SavingAccoutn sa = new SavingAccoutn();
        sa.deposit();
        sa.withDraw();
        sa.roi();
        sa.limit();
        System.out.println("***********************************************");
        CurrentAccount ca = new CurrentAccount();
        ca.deposit();
        ca.withDraw();
        ca.roi();
        ca.odLimit();
    }
}
