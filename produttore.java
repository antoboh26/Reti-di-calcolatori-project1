import java.io.*;

// Produttore NON e' un filtro
public class Produttore {
	public static void main(String[] args) {		
		
		Scanner in = new Scanner(System.in);
		if (args.length != 1){
			System.out.println("Utilizzo: produttore <inputFilename>");
			System.exit(0);
		}
		
			
		FileWriter fout;
		try {
			fout = new FileWriter(args[0]);
			String inputl = in.nextLine();
			while(inputl != null){
				fout.write(inputl, 0, inputl.length());
				System.out.println("Inserisci la nuova riga");
				 inputl = in.nextLine();
			}		
			fout.close();
		} 
		catch (NumberFormatException nfe) { 
			nfe.printStackTrace(); 
			System.exit(1); // uscita con errore, intero positivo a livello di sistema Unix
		}
	    catch (IOException e) { 
			e.printStackTrace();
			System.exit(2); // uscita con errore, intero positivo a livello di sistema Unix
		}
	}
}

