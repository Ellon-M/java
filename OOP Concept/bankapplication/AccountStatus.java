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
public class AccountStatus {
   
    private String FirstName;
    private String SurName;
    private int AccountNumber;
    
    
    
   
    public AccountStatus(String fName, String sName, int AccNum){
        FirstName = fName;
        SurName = sName;
        AccountNumber = AccNum; 
    }
   
    public String getFirstName(){
        return FirstName;
    }
    public String getSurName(){
        return SurName;
    }
    public int getAccountNumber(){
        return AccountNumber;
    }
    
    
}
