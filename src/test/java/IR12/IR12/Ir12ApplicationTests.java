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

}
