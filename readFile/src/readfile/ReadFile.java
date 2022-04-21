package readfile;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class ReadFile {

    public static void main(String[] args) 
    {
        FileReader in = null;
        FileWriter out = null;
        BufferedReader br = null;
        PrintWriter pt = null;
        try
        {
            File inputFile = new File("infile.txt");
            File outputFile = new File("outagain.txt");
            in = new FileReader(inputFile);
            out = new FileWriter(outputFile);
             //If I want to include the bufferring, add the line below
            //I can avoid to add the buffering
//            int c;
//            while((c = in.read()) != -1)
//            {
//                out.write(c);
//            }  
            br = new BufferedReader(in);
            pt = new PrintWriter(out);
            
            String line;
            while((line = br.readLine()) != null)
            {
                pt.println(line);
            }            
        }catch(FileNotFoundException ex)
        {
            System.err.println("File does not exist");
        }catch (IOException ex)
        {
            System.out.println("exception reading / writing from / to the file");
        } finally
        {
            try
            {
                br.close();
                pt.close();
                in.close();
                out.close();
            }
            catch(IOException ex)
            {
                
            }
        }
    }
    
}
