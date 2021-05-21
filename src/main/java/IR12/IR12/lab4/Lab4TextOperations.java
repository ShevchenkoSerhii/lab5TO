/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package IR12.IR12.lab4;


/*import java.util.HashSet;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;*/
import java.util.*; 
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import org.springframework.util.StringUtils;
/**
 *
 * @author vshew
 */
public class Lab4TextOperations {
    public String  text = "Animals or people that are provided with unique identifiers (UIDs) and the ability to transfer data over a network without requiring human-to-human or human-to-computer interaction. A thing in the internet of things can be a person with a heart monitor implant, a farm animal with a biochip transponder, an automobile that has built-in sensors to alert the driver when tire pressure is low or any other natural or man-made object that can be assigned an Internet Protocol (IP) address and is able to transfer data over a network. Increasingly, organizations in a variety of industries are using IoT to operate more efficiently, better understand customers to deliver enhanced customer service, improve decision-making and increase the value of the business. How IoT works An IoT ecosystem consists of web-enabled smart devices that use embedded systems, such as processors, sensors and communication hardware, to collect, send and act on data they acquire from their environments. IoT devices share the sensor data they collect by connecting to an IoT gateway or other edge device where data is either sent to the cloud to be analyzed or analyzed locally. Sometimes, these devices communicate with other related devices and act on the information they get from one another. The devices do most of the work without human intervention, although people can interact with the devices -- for instance, to set them up, give them instructions or access the data. The connectivity, networking and communication protocols used with these web-enabled devices largely depend on the specific IoT applications deployed. IoT can also make use of artificial intelligence (AI) and machine learning to aid in making data collecting processes easier and more dynamic .The internet of things helps people live and work smarter, as well as gain complete control over their lives. In addition to offering smart devices to automate homes, IoT is essential to business. IoT provides businesses with a real-time look into how their systems really work, delivering insights into everything from the performance of machines to supply chain and logistics operations.";
    
    //2
    private int wordsInTextNumber = 0;
    
    //3
    private int uniqueWordsInTextNumber = 0;
    
    //4
    private String mostUsedWords = "";
    
    //5
    private String forbiddenLetter = "";
    private int wordsWithForbiddenLetter = 0;
    
    //6
    private int numberOfLettersInWord = 0;
    private int wordsWithXLetters = 0;
    
    //7
    private int firstXLettersNumber = 0;
    private String wordsBeginWithXLetters = "";

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public int getWordsInTextNumber(String input) {
        if (input == null || input.isEmpty()) { 
            return 0; } 
        String[] words = input.split("\\s+"); 
        return words.length;


    }

    public void setWordsInTextNumber(int wordsInTextNumber) {
        this.wordsInTextNumber = wordsInTextNumber;
    }

    
    //Унікальні слова - слова, що трапляються в тексті лишень один раз.
    public int getUniqueWordsInTextNumber(String str) {
        
        str = str.toLowerCase();
       
        String[] words = str.split(" ");
        boolean[] array = new boolean[words.length];
        int j, i = 0;
        int count = 0;
        for (i = 0; i < words.length; i++) {
            if (!array[i]) {
                count++;
                for (j = i + 1; j < words.length; j++) {
                    if (words[j].compareTo(words[i]) == 0) {
                        array[j] = true;
                        count--;
                    }
                }
            }
        }
        return count;
    }

    public void setUniqueWordsInTextNumber(int uniqueWordsInTextNumber) {
        this.uniqueWordsInTextNumber = uniqueWordsInTextNumber;
    }

    public String getMostUsedWords(String text, int k) {
        
        int wordStart = 0;
    int wordCount = 0;
    String word = "";
    String mostFrequentWords = "";
    
    
    
        for (int i = 0; i < k; i++) {
            for (int wordEnd = wordStart; wordEnd < text.length(); wordEnd++) {
        if (wordEnd > text.length() || text.charAt(wordEnd) == ' ') {
            String thisWord = text.substring(wordStart, wordEnd);
            int thisWordCount = 0;
            int search = -1;
            while ((search = text.indexOf(thisWord, search + 1)) >= 0) {
                thisWordCount += 1;
            }
            if (thisWordCount > wordCount) {
                word = thisWord;
                wordCount = thisWordCount;
            }
            wordStart = wordEnd + 1;
        }
    }
            
            
            
            
            mostFrequentWords += word + ", ";
            
            
            
            
            if (text.contains(word)) {
  
          
            String tempWord = word + " ";
            text = text.replaceAll(tempWord, "");
  
            
            tempWord = " " + word;
            text = text.replaceAll(tempWord, "");
        }
           
            
            
            
            wordStart = 0;
          wordCount = 0;
          word = "";
            
            
            
        }
    
    
    return mostFrequentWords;
        //return mostUsedWords;
    }

    public void setMostUsedWords(String mostUsedWords) {
        this.mostUsedWords = mostUsedWords;
    }

    public String getForbiddenLetter() {
        return forbiddenLetter;
    }

    public void setForbiddenLetter(String forbiddenLetter) {
        this.forbiddenLetter = forbiddenLetter;
    }

    public int getWordsWithForbiddenLetter(String text, String forbLetter) {
        
        
        int count = 0;
        for (String word : text.split("\\s+")) {
            if (word.toLowerCase().contains(forbLetter)) {
                count++;
            }
        }
        
        
        
        return count;
    }

    public void setWordsWithForbiddenLetter(int wordsWithoutForbiddenLetter) {
        this.wordsWithForbiddenLetter = wordsWithoutForbiddenLetter;
    }

    public int getNumberOfLettersInWord() {
        return numberOfLettersInWord;
    }

    public void setNumberOfLettersInWord(int numberOfLettersInWord) {
        this.numberOfLettersInWord = numberOfLettersInWord;
    }

    public int getWordsWithXLetters(String text, int numberOfLetters) {
        int count = 0;
        
        
        if (text == null || text.isEmpty()) { 
            return 0; } 
        String[] words = text.split("\\s+"); 
        
        for (int i = 0; i < words.length; i++) {
            int wordLen = words[i].length();
            if (wordLen == numberOfLetters) {
                count++;
            }
        }
        
        //return words.length;

        
        return count;
    }

    public void setWordsWithXLetters(int wordsWithXLetters) {
        this.wordsWithXLetters = wordsWithXLetters;
    }

    public String getFirstXLettersNumber(String text, int prefixLength, int topNumber) {
        
        String result = "";
        /*if (text == null || text.isEmpty()) {
        //return 0;
        } */
        String[] words = text.split("\\s+"); 
        String[] prefixes = null;
        /*for (int i = 0; i < words.length; i++) {
        prefixes[i] = words[i].substring(0, prefixLength++);
        
        }*/
        
        

      
        
        return result;
    }

    public void setFirstXLettersNumber(int firstXLettersNumber) {
        this.firstXLettersNumber = firstXLettersNumber;
    }

    public String getWordsBeginWithXLetters() {
        
        
        
        
        
        
        return wordsBeginWithXLetters;
    }
    
    
    
    public String MostPopularSequences(String text, int number, int length)
    {
        
        String[] words = text.split("\\s+");
        
        Map<String, Integer> dictionary = new HashMap<>();
        int currentWordLength;
        String sequence;
        for (String word : words) {
            currentWordLength = word.length();
            for (int j = 0; j < currentWordLength - length; j++) {
                sequence = word.substring(j, j + length);
                if(dictionary.containsKey(sequence))
                    dictionary.put(sequence, dictionary.get(sequence) + 1);
                else
                    dictionary.put(sequence, 1);
            }
        }
        List<Entry<String, Integer>> list = new ArrayList<>(dictionary.entrySet());
        list.sort(Entry.comparingByValue());
        Collections.reverse(list);
        Object[] sortedArray = list.toArray();
        return Arrays.toString(Arrays.copyOfRange(sortedArray, 0, number));
    }
    
    
    public void setWordsBeginWithXLetters(String wordsBeginWithXLetters) {
        this.wordsBeginWithXLetters = wordsBeginWithXLetters;
    }

    public List<String> getList(String text) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
    
}
