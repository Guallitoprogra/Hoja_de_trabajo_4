package src;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

/**
 * @author Rodrigo Ramirez Y Dilary Cruz
 * @description Clase que se encarga de leer los datos contenidos en un archivo de texto linea por linea
 */

public class Reader {
    private File file;

    public Reader(String fileName){
        this.file = new File(fileName);
    }

    /**
    * @description Método encargado de leer un archivo de texto y retornar sus caracteres, puede leer multiples lineas y retornar una lista de ellas  
    * @return ArrayList<String>
    * @throws IOException
    */
    public ArrayList<String> read() throws IOException {
        ArrayList<String> expressions = new ArrayList<>();
        try (BufferedReader buffer = new BufferedReader(new FileReader(file))) {
            String line = buffer.readLine();
            while (line != null) {
                expressions.add(line);
                line = buffer.readLine();
            }
        }
        return expressions;
    }
}
