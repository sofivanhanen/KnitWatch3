package knitwatch3;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;

public class Writer {
    
    public static void rewriteFile(String fileName, Container container) {
        try {
            File tmp = File.createTempFile("tmp", ".txt");
            File orig = new File(fileName);
            FileWriter filewriter = new FileWriter(tmp);
            BufferedWriter bw = new BufferedWriter(filewriter);
            for(Item i : container.getList()) {
                bw.write(i.line);
                bw.newLine();
            }
            bw.close();
            filewriter.close();
            orig.delete();
            tmp.renameTo(orig);
        } catch (Exception e) {
            System.out.println("Problem in Writer.java (file not found probably??)");
            System.out.println(e.getStackTrace());
        }
    }
    
}
