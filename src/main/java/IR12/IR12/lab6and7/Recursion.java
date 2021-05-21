/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package IR12.IR12.lab6and7;

/**
 *
 * @author vshew
 */
public class Recursion {
    private int Exponentiation;
    private int casualWay;

    public int getExponentiation(int n) {
        if(n == 0){
        return 0 ;
    } else {
        return getExponentiation(n - 1) + 2 *(n - 1) + 1 ;
    }
    }

    
    
    public void setExponentiation(int Exponentiation) {
        this.Exponentiation = Exponentiation;
    }

    public int getCasualWay(int n) {
        
        return (n - 1) * (n - 1) + 2 * (n - 1) + 1;
    }

    public void setCasualWay(int casualWay) {
        this.casualWay = casualWay;
    }
    
}
