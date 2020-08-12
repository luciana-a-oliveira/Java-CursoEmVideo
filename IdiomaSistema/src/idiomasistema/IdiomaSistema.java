
package idiomasistema;

import java.util.Locale;

/**
 *
 * @author Luciana
 */
public class IdiomaSistema {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    Locale  idioma = Locale.getDefault();
        System.out.print("Seu sistema está em ");
        System.out.println(idioma.getDisplayLanguage());// TODO code application logic here
    }
    
}
