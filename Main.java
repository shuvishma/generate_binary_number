import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.Buffer;
import java.util.Deque;
import java.util.LinkedList;

//import jdk.internal.org.jline.utils.InputStreamReader;

/**
 * Main
 */
public class Main {

    public static void main(String[] args) throws IOException{
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in)) ;
        int n = Integer.parseInt(read.readLine()) ;
        
        Deque<String> binary = new LinkedList<>() ;
        binary.add("1") ;
        while(n-- > 0) {
            String temp = new String(binary.peekFirst()) ;
            binary.pollFirst() ;
            System.out.print(temp + " ");

            String wemp = new String(temp) ;
            binary.addLast(temp + "0");
            binary.addLast(wemp + "1");
        }
    }
}