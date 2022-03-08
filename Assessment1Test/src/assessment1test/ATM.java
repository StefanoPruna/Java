/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assessment1test;

/**
 *
 * @author makem
 */
public abstract class ATM 
{
    protected Float withdraw;
    protected Float deposit;
    protected Float principal;
    //Limit is set by the user
    protected Integer withdrawLimit;
    public Float rate;
    protected Float interest;
    protected Float time;
    
    public abstract void calculateInterest();
    
}
