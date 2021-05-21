/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package IR12.IR12.lab2;

import java.text.DecimalFormat;
import org.springframework.stereotype.Service;


/**
 *
 * @author vshew
 */
@Service
public class Lab2View {
    
    DecimalFormat df = new DecimalFormat("###.##"); 
    
    public String showResult(String xString){
        if(xString.equals("")) { return "Please enter x";}
        Float x = Float.parseFloat(xString);
        
        
        
       // double res = d/(a * x * x + b * x + c);
        if(Calculate.lab2CheckOut(x) == 0) {
            return "Bottom part of the division equals 0";
        } else {
           return df.format(Calculate.lab2equation(x));
                   
        }
    }
    
}
