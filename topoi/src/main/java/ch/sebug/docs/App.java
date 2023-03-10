package ch.sebug.docs;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        if (args.length < 2) {
            System.err.println("Usage: ch.sebug.docs.app input.docx output.pdf");
            System.exit(1);
        }
        System.out.println( "Converting..." );
    }
}
