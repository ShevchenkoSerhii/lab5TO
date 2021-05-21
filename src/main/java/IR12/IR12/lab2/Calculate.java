/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package IR12.IR12.lab2;

/**
 *
 * @author vshew
 */
public class Calculate {
    public static float a = 3;
    public static float b = -1;
    public static float c = -8;
    public static float d = 8;
        
    public static Float lab2equation(float x){
       
       float res = d /(a * x * x + b * x + c);
       return res;
    }
    public static Float lab2CheckOut(float x){
       float res = a * x * x + b * x + c;
       return res;
    }
}
