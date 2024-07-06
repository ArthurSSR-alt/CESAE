package FichaPratica07;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class Exercicio02 {
    public static void usingPrintWriter() throws FileNotFoundException{
     File file = new File("exemplo1.txt");
     PrintWriter printWriter = new PrintWriter(file);
     printWriter.println("olá");
     printWriter.close();
}

    public static void main(String[] args) throws FileNotFoundException{
        usingPrintWriter();
    }
}
