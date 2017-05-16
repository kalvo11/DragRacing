/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dragracingproject;

/**
 *
 * @author bbsuser
 */
public class Spieler 
{
    private String name;
    private Auto Auto;
    public Spieler(String name)
    {
        this.name = name;
    }
    
    public void setcar(Auto auto)
    {
        Auto = auto;
    }
    
    public Auto getcar()
    {
        return Auto;
    }
}
