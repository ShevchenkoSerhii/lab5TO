/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package IR12.IR12.lab3;

/**
 *
 * @author vshew
 */
public class Lab3Fib {
private int k;
private int fibNumber;
   private String result;



     public Lab3Fib() {
    }

    public Lab3Fib(int k) {
        this.k = k;
    }
     

    public int getK() {
        return k;
    }

    public void setK(int k) {
        this.k = k;
    }

    public int getFibNumber(int n) {
        int f1 = 0, f2 = 1, i;
        int last = 0;
        if (n < 1)
            return 0;
        for (i = 1; i < n; i++)
        {
            last = f2;
            int next = f1 + f2;
            f1 = f2;
            f2 = next;
        }
        
        
        return last;
    }

    public void setFibNumber(int fibNumber) {
        this.fibNumber = fibNumber;
    }

    
   
    
    
    
    
    @Override
    public String toString() {
        return "Lab3Fib{" + "k=" + k + '}';
    }

    public String toStringResult() {
        return "Lab3Fib{" + "fibNumber=" + fibNumber + '}';
    }

    public String getResult(int n) {
        int f1 = 0, f2 = 1, i;
        String result = "";
        if (n < 1)
            return "The number is way too small";
        result += f1 + " ";
        for (i = 1; i < n; i++)
        {
            result += f2 + " ";
            int next = f1 + f2;
            f1 = f2;
            f2 = next;
        }
        
        
        return result;
    }

    public void setResult(String result) {
        this.result = result;
    }
    

    
    

   
    
}
