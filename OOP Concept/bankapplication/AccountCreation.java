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
public class AccountCreation {
    private String firstName;
    private String surName;
    private int IDNumber;

    public AccountCreation(String fname, String sname){

        firstName = fname;     
        surName = sname;
    }
    public AccountCreation( int id){
        IDNumber = id;
    }
    public String getFirstName(){
        return firstName;
    }
    public String getSurName(){
        return surName;
    }
    public int getID(){
        return IDNumber;
    }
}






