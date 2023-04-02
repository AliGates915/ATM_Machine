package Bank_ATM;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;

class ATM_Operation_ImplementsImpl implements ATM_Operation_Interface
{
    LocalDateTime dt = LocalDateTime.now();
    ATM atm = new ATM();
    Map<Double,String > some_details= new HashMap<>();
    @Override
    public void view_Balance() {
        System.out.println("Available Balance is : " +atm.getBalance());
    }
    @Override
    public void depositAmount(double depositAmount) {
        some_details.put(depositAmount , " Amount is Deposited :) \t" + dt);
        System.out.println(depositAmount + " Deposited Amount is Successfully!!!");
        atm.setBalance(atm.getBalance() + depositAmount);
        view_Balance();
    }
    @Override
    public void WithDraw_Amount(double withdrawamount) {
        if(withdrawamount >= 500) {
            if (withdrawamount <= atm.getBalance()) {
                some_details.put(withdrawamount, " Amount is Withdrawn :)  \t" +dt);
                System.out.println("Collect the Cash :" + withdrawamount);
                atm.setBalance(atm.getBalance() - withdrawamount);
            } else {
                System.out.println("Insufficient Balance...");
                view_Balance();
            }
        }
        else{
            System.out.println("Please Enter the Amount Minimum 500");
        }
    }
    @Override
    public void View_Some_Details() {
        try {
            FileWriter file = new FileWriter("C:\\Users\\Anonymous User\\IdeaProjects\\ALi Gates\\src\\Bank_ATM\\Bank_Info.txt");
            for (Map.Entry<Double, String> detail : some_details.entrySet())
            {
                System.out.println(detail.getKey() + " " + detail.getValue());
                file.write(String.valueOf(detail.getKey() + detail.getValue()));
            }
            file.close();
            System.out.println();
        }
        catch (IOException e) {
            e.printStackTrace();
        }
    }
}

