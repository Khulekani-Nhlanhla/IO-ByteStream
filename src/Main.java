import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {

        int bajt;

        try(FileInputStream fInput = new FileInputStream("Words.txt");
        FileOutputStream fOutput = new FileOutputStream("CopyOfFile.txt")){

            do {
            bajt = fInput.read();
            if ((char) bajt == ' ') bajt = '-';
            if (bajt != -1) fOutput.write(bajt);
            }while(bajt != -1);


        }catch(IOException e){
            System.out.println("Error IO");
        }


    }
}
