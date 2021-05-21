/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package IR12.IR12.lab5;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Map.Entry;
import java.util.Random;
import java.util.Collections;  
import java.util.Comparator;  
import java.util.HashMap;  
import java.util.LinkedHashMap;  
import java.util.LinkedList;   
import java.util.Map;  
import java.util.Map.Entry;  

/**
 *
 * @author vshew
 */
public class Lab5 {
    private Map<String, Integer> map = new HashMap<String, Integer>();
    private Random rnd = new Random(1);
    private List<Integer> unsortedList;
    
    //Щоб згенерувати випадковий список, треба замінити fineList у lab5.jsp  на це:
   //List<Short> fineList = lST.makeRandomSequence(0, numberOfElementsInList, numberOfElementsInList);
    public List<Short> makeRandomSequence(int begin, int end, int listLength) {
  List<Short> ret = new ArrayList<>(end - begin + 1);
  for (int i=begin; i<=end; i++) {
      //зміщено на 4 для доказу того, що елемент 1001 знаходитиметься на 1 позиції, а не на 1001
      //short k = (short)(i + 1234);
      short k = (short)rnd.nextInt(listLength);
    ret.add(k);
  }
  return ret;  
}
    
    
    
    
    public List<Short> makeSequence(int begin, int end) {
  List<Short> ret = new ArrayList<>(end - begin + 1);
  for (int i=begin; i<=end; i++) {
      //зміщено на 4 для доказу того, що елемент 1001 знаходитиметься на 1 позиції, а не на 1001
      short k = (short)(i + 1234);
    ret.add(k);
  }
  return ret;  
}
    
    //////////////також можна використати 
    //////////////boolean contains(Object o)
    //////////////але це заборонено умовою завдання
    
   public int binarySearch(List<Short> elements, int target) {
      int left = 0;
      int right = elements.size() - 1;
      while (left <= right)
      {
         int middle = (left + right) / 2;
         if (target < elements.get(middle))
         {
            right = middle - 1;
         }
         else if (target > elements.get(middle))
         {
            left = middle + 1;
         }
         else {
            return middle;
         }
       }
       return -1;
   }
    
   public int linearSearch(List<Short> elements, int target)
   {
     for (int j = 0; j < elements.size(); j++)
     {
       if (elements.get(j) == target)
       {
         return j;
       }
     }
     return -1;
   }
    
    
    
     public List<Integer> sortApproach2() {

        int s, t; //temp indexes

        List<Integer> result = new ArrayList<>();
        result.addAll(unsortedList);

        int n = result.size() - 1;
        int k = 0;

        while (k != n) {
            t = k + 1;

            while (t > 0 && result.get(t) < result.get(t - 1)) {
                s = result.get(t);
                result.set(t, result.get(t - 1));
                result.set(t - 1, s);
                t--;
            }

            k++;

        }

        return result;
    }

     
     
     
     
     public static String[] getUniqueKeys(String[] keys)
    {
        String[] uniqueKeys = new String[keys.length];

        uniqueKeys[0] = keys[0];
        int uniqueKeyIndex = 1;
        boolean keyAlreadyExists = false;

        for(int i=1; i<keys.length ; i++)
        {
            for(int j=0; j<=uniqueKeyIndex; j++)
            {
                if(keys[i].equals(uniqueKeys[j]))
                {
                    keyAlreadyExists = true;
                }
            }           

            if(!keyAlreadyExists)
            {
                uniqueKeys[uniqueKeyIndex] = keys[i];
                uniqueKeyIndex++;               
            }
            keyAlreadyExists = false;
        }       
        return uniqueKeys;
    }
     
     
     
     
     
    public String sortByValue(boolean order)   
{  
//convert HashMap into List   
List<Entry<String, Integer>> list = new LinkedList<Entry<String, Integer>>(map.entrySet());  
//sorting the list elements  
Collections.sort(list, new Comparator<Entry<String, Integer>>()   
{  
public int compare(Entry<String, Integer> o1, Entry<String, Integer> o2)   
{  
if (order)   
{  
//compare two object and return an integer  
return o1.getValue().compareTo(o2.getValue());}   
else   
{  
return o2.getValue().compareTo(o1.getValue());  
}  
}  
});  
//prints the sorted HashMap  
Map<String, Integer> sortedMap = new LinkedHashMap<String, Integer>();  
for (Entry<String, Integer> entry : list)   
{  
sortedMap.put(entry.getKey(), entry.getValue());  
}   
return printMap(sortedMap);  
}  
     
    public String printMap(Map<String, Integer> map)   
{  
    String result = ""; 
for (Entry<String, Integer> entry : map.entrySet())   
{  
result += entry.getKey() + " "+entry.getValue() +"-------";  
}  
System.out.println("\n");  
        return result;
}  

    public void setMap(Map<String, Integer> map) {
        this.map = map;
    }
     
}
