import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;

// Produttore NON e' un filtro
public class produttore {
    public static void main(String[] args) {
        BufferedReader in = null;

        /*if (args.length != 1){
            System.out.println("Utilizzo: produttore <inputFilename>");
            System.exit(0);
        }*/
        in = new BufferedReader(new InputStreamReader(System.in));
        FileWriter fout;
        try {
            fout = new FileWriter("ciao4.txt");
            int n;
            while ((n=in.read()) != -1) {
                fout.write((char)n);
                String inp = in.readLine()+"\n";
                fout.write(inp, 0, inp.length());
            }
            fout.close();


        } catch (NumberFormatException nfe) {
            nfe.printStackTrace();
            System.exit(1); // uscita con errore, intero positivo a livello di sistema Unix
        } catch (IOException e) {
            e.printStackTrace();
            System.exit(2); // uscita con errore, intero positivo a livello di sistema Unix
        }
    }
}
