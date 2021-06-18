package IR12.IR12;



import static IR12.IR12.lab2.Calculate.lab2CheckOut;
import static IR12.IR12.lab2.Calculate.lab2equation;
import java.util.Arrays;
import java.util.List;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class Ir12ApplicationTests {

	@Test
	void contextLoads() {
	}
        
        @Test
        void test1(){
            assertEquals(0.02f,0.025f,0.01f);
        }
 @Test
    void Laba2Test()
    {
        IR12.IR12.lab2.Calculate calculator = new IR12.IR12.lab2.Calculate();
        float actual2 = lab2equation((float) 12.03);
        assertEquals(0.01931747980415821, actual2);
    }
    
    @Test
    void Laba3Test()
    {
        IR12.IR12.lab3.Lab3Fib Lab3Fib = new IR12.IR12.lab3.Lab3Fib();
        int actual3 = Lab3Fib.getFibNumber(8);
        assertEquals(13, actual3);
    }
    
    @Test
    void Laba4Test()
    {
        IR12.IR12.lab4.Lab4TextOperations Lab4TextOperations = new IR12.IR12.lab4.Lab4TextOperations();
String text = "la text lol test";
        int actual4 = Lab4TextOperations.getWordsInTextNumber(text);
        int actual4Sec = Lab4TextOperations.getUniqueWordsInTextNumber(text);
        int actual4thir = Lab4TextOperations.getWordsWithForbiddenLetter(text, "e");
        String actual4fo = Lab4TextOperations.MostPopularSequences(text, 1, 2);
        int actual4Six = Lab4TextOperations.getWordsWithXLetters(text, 4);
        assertEquals(4, actual4);
        assertEquals(4, actual4Sec);
        assertEquals(2, actual4thir);
        assertEquals("[te=2]", actual4fo);
        assertEquals(2, actual4Six);
    }
    @Test
    void Laba5Test()
    {
        IR12.IR12.lab5.Lab5 Lab5 = new IR12.IR12.lab5.Lab5();
        List<Short> list = Arrays.asList(new Short[]{100, 101, 102, 103, 104});
        int actual5 = Lab5.binarySearch(list, 101);
        int actual5Sec = Lab5.linearSearch(list, 101);
        
        assertEquals(1, actual5);
        assertEquals(1, actual5Sec);
        assertEquals(actual5, actual5Sec);
    }
    
    @Test
    void Laba6and7Test()
    {
        IR12.IR12.lab6and7.Recursion Recursion = new IR12.IR12.lab6and7.Recursion();
        int actual6 = Recursion.getExponentiation(2);
        int actual6Sec = Recursion.getCasualWay(2);
        assertEquals(4, actual6);
        assertEquals(4, actual6Sec);
    }
    
    @Test
    void Laba8Test()
    {
        IR12.IR12.lab8.Lab8TwoAlgorithms Lab8TwoAlgorithms = new IR12.IR12.lab8.Lab8TwoAlgorithms();
        int[] arrayOfInt = new int[] {2, 11, 7, 15};
        String actual8 =  Arrays.toString(Lab8TwoAlgorithms.getFirstResult(arrayOfInt, 9));
        String actual8Sec =  Arrays.toString(Lab8TwoAlgorithms.getSecondResult(arrayOfInt, 9));
        String result8 = Arrays.toString(new int[] {0, 2});
        assertEquals(result8, actual8);
        assertEquals(result8, actual8Sec);
    }

    
    @Test
    void ExamTest()
    {
        IR12.IR12.Exam.FormulaCalculations Exam = new IR12.IR12.Exam.FormulaCalculations();
        float resultByMethod = Exam.formula((float)13.0);
       List<Float> list = Arrays.asList(new Float[]{(float)35.0, (float)38.0});
        List<Float> mathodResultlist = Exam.makeResultList(list, 1);
        
        List<Float> checkResultList = Arrays.asList(new Float[]{(float)0.029508196, (float)0.027108435});
        
       assertEquals((float)0.08411215, resultByMethod);
       assertEquals(checkResultList, mathodResultlist);

    }
    
    
    private int getFibNumber(int i) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
