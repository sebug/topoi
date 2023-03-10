package ch.sebug.docs;

public class App 
{
    public static void main( String[] args )
    {
        if (args.length < 2) {
            System.err.println("Usage: ch.sebug.docs.app input.docx output.pdf");
            System.exit(1);
        }
        var converter = new WordToPDF();
        converter.ConvertToPDF(args[0], args[1]);
    }
}
