/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package IR12.IR12.Exam;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 *
 * @author vshew
 */
public class FormulaCalculations {
    private Random rnd = new Random(1);
    
    
    public List<Float> makeRandomSequence(int begin, int end, int listLength) {
  List<Float> ret = new ArrayList<>(end - begin + 1);
  for (int i=begin; i<=end; i++) {
      //зміщено на 4 для доказу того, що елемент 1001 знаходитиметься на 1 позиції, а не на 1001
      //short k = (short)(i + 1234);
      float k = (float)rnd.nextInt(listLength);
    ret.add(k);
  }
  return ret;  
}
    
    public Float formula(Float number) {
    ////ФОРМУЛА
        float result = 9 / (9 * number - 10);
        return result;
    }
    
    
   public List<Float> makeResultList(List<Float> resList, int listLength) {
  List<Float> ret = new ArrayList<>(listLength);
  for (int i=0; i<=listLength; i++) {
      //зміщено на 4 для доказу того, що елемент 1001 знаходитиметься на 1 позиції, а не на 1001
      //short k = (short)(i + 1234);
      //float k = (float)rnd.nextInt(listLength);
      float k = (float)formula(resList.get(i));
    ret.add(k);
  }
  return ret;  
}
   
   
    
    /*List<Float> listWithResults = null;
    
    public List<Float> resLS(List<Float> list) {
    for (int i = 0; i < list.size(); i++) {
    float takVal = list.get(i);
    float newVal = formula(takVal);
    
    listWithResults.add(newVal);
    //listWithResults.add(formula(list.get(i)));
    }
    
    return listWithResults;
    }*/
    
}
