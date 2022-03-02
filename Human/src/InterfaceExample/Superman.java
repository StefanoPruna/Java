/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package InterfaceExample;

//BECAUSE SUPERMAN CAN EXTENDS FROM HUMAN AND SUPERPOWERS,
//BUT JAVA DOES NOT ALLOW TO EXTEND FROM MORE THAN ONE CLASS
//SO WE HAVE TO USE INTERFACE 

public class Superman extends Human implements SuperPowers
{
    //Extends from Human
    @Override
    public void howISay() 
    {
        System.out.println("I'm not actually a human");
    }

    //Implements from SuperPowers
    @Override
    public void whatSuperPower() 
    {
        System.out.println("All of them!!!");
    }
    
    
}
