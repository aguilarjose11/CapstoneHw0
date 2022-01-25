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
        String ret = P1.printCSV(br);
        String correctAnswer = "A,A\nB,B\nC,C\n,CH\nD,D\nE,E\nF,F\nG,G\nH,H\nI,I\nJ,J\nK,K\nL,L\n,LL\nM,M\nN,N\n,Ñ\nO,O\nP,P\nQ,Q\nR,R\n,RR\nS,S\nT,T\nU,U\nV,V\nW,W\nX,X\nY,Y\nZ,Z";
        assertTrue(ret.equals(correctAnswer));
    }
}