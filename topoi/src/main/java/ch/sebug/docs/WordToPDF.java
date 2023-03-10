package ch.sebug.docs;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import org.apache.poi.xwpf.usermodel.XWPFDocument;
import org.apache.poi.xwpf.converter.pdf.PdfOptions;

public class WordToPDF {
    public void ConvertToPDF(String inputPath, String outputPath) {
        System.out.println( "Converting " + inputPath + " to " + outputPath );
        try (var inputStream = new FileInputStream(inputPath))
        {
            var document = new XWPFDocument(inputStream);
            document.createStyles();
            var options = PdfOptions.create();
            
        } catch (FileNotFoundException fnex) {
            System.err.println(fnex.getMessage());
        } catch (IOException ioe) {
            System.err.println(ioe.getMessage());
        }

    }
}