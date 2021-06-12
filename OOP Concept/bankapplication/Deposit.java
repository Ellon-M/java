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
public class Deposit {
    private int AccountNumber;
    private String FirstName;
    private String SurName;
    private float InitialAccountBalance;
    private float FinalAccountBalance;
    private float AmountDeposited;
    
    public Deposit(String fName, String sName, int accno, float d){
        FirstName = fName;
        SurName = sName;
        AccountNumber = accno;
        InitialAccountBalance = 10000;
        AmountDeposited = d;
        FinalAccountBalance = InitialAccountBalance + d ;
    }
    public int getAccountNumber(){
        return AccountNumber;
    }
    public float getAmountDeposited(){
        return AmountDeposited;
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

