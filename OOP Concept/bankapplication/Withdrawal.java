/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bankapplication;

/**
 *
 * @author angel
 */
public class Withdrawal {
    private int AccountNumber;
    private String FirstName;
    private String SurName;
    private float InitialAccountBalance;
    private float FinalAccountBalance;
    private float AmountWithdrawed;
    
    public Withdrawal(String fName, String sName, int accno, float w){
        FirstName = fName;
        SurName = sName;
        AccountNumber = accno;
        InitialAccountBalance = 10000;
        AmountWithdrawed = w;
        FinalAccountBalance = InitialAccountBalance - w ;
    }
    public int getAccountNumber(){
        return AccountNumber;
    }
    public float getAmountWithdrawed(){
        return AmountWithdrawed;
    }
    public String getFirstName(){
        return FirstName;
    }
    public String getSurName(){
        return SurName;
    }
    public float getInitialAccountBalance(){
        return InitialAccountBalance;
    }
    public float getFinaAccountBalance(){
        return FinalAccountBalance;
    }
}
