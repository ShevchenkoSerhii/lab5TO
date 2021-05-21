package IR12.IR12;



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
        
        
    }
    
    @Test
    void Laba3Test()
    {
        IR12.IR12.lab3.Lab3Fib Lab3Fib = new IR12.IR12.lab3.Lab3Fib();

    }
    
    @Test
    void Laba4Test()
    {
        IR12.IR12.lab4.Lab4TextOperations Lab3TextOperations = new IR12.IR12.lab4.Lab4TextOperations();

    }
    @Test
    void Laba5Test()
    {
        IR12.IR12.lab5.Lab5 Lab3Fib = new IR12.IR12.lab5.Lab5();

    }
    
    @Test
    void Laba6and7Test()
    {
        IR12.IR12.lab6and7.Recursion Recursion = new IR12.IR12.lab6and7.Recursion();

    }
    
    @Test
    void Laba8Test()
    {
        IR12.IR12.lab3.Lab3Fib Lab3Fib = new IR12.IR12.lab3.Lab3Fib();

    }
}
