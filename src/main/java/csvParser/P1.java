import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class P1 {

	public static String printCSV(BufferedReader br) {
		String output = "";
		String line;
		try {
		while ((line = br.readLine()) != null) { // read each line of csv
			// query each line at a time
			String[] aLine = line.split(",");
			String stringEN = aLine[0];
			String stringES = aLine[1];

			output = output.concat(stringEN + "," + stringES + "\n");
		}
		}
		catch(Exception e){
			return "";
		}
		return output;
	}

	public static void main(String[] args) throws IOException {

		final Scanner sc = new Scanner(System.in);
		System.out.println("Enter a filename to import:");
		String filename = sc.nextLine(); // get filename from user

		BufferedReader br = new BufferedReader(new FileReader(filename));
		String line = null;

		String correctAnswer = "A,A\nB,B\nC,C\n,CH\nD,D\nE,E\nF,F\nG,G\nH,H\nI,I\nJ,J\nK,K\nL,L\n,LL\nM,M\nN,N\n,Ñ\nO,O\nP,P\nQ,Q\nR,R\n,RR\nS,S\nT,T\nU,U\nV,V\nW,W\nX,X\nY,Y\nZ,Z";

		System.out.println(correctAnswer);
		System.out.println(printCSV(br));
		
		br.close();
		sc.close();
	}

}
