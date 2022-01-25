import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.io.BufferedReader;
import java.io.FileReader;



 
class JUnit5ExampleTest {
 
    @Test
    void justAnExample() {

        BufferedReader br;
        try{
            br = new BufferedReader(new FileReader("src/test/resources/csvFile.csv"));
        }
        catch(Exception e){
            assertTrue(false);
            return;
        }
        P1.printCSV(br);
        assertTrue(true);
    }
}