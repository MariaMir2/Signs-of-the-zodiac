
package pa;

public class Prueba {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Zodiaco signo1 = new Zodiaco(23, 9);
        Zodiaco signo2 = new Zodiaco(9, 40);
        Zodiaco signo3 = new Zodiaco(-3, 8);
        Zodiaco signo4 = new Zodiaco(23, 11);
        Zodiaco signo5 = new Zodiaco(21, 1);
        Zodiaco signo6 = new Zodiaco(23, 8);
        
        int dia1 = signo1.getDia();
        int dia2 = signo2.getDia();
        int dia3 = signo3.getDia();
        int dia4 = signo4.getDia();
        int dia5 = signo5.getDia();
        int dia6 = signo6.getDia();
        int mes1 = signo1.getMes();
        int mes2 = signo2.getMes();
        int mes3 = signo3.getMes();
        int mes4 = signo4.getMes();
        int mes5 = signo5.getMes();
        int mes6 = signo6.getMes();
        
        System.out.println(dia1 + ", " + mes1 + " --> " + signo1.averiguar_signo());
        System.out.println(dia2 + ", " + mes2 + " --> " + signo2.averiguar_signo());
        System.out.println(dia3 + ", " + mes3 + " --> " + signo3.averiguar_signo());
        System.out.println(dia4 + ", " + mes4 + " --> " + signo4.averiguar_signo());
        System.out.println(dia5 + ", " + mes5 + " --> " + signo5.averiguar_signo());
        System.out.println(dia6 + ", " + mes6 + " --> " + signo6.averiguar_signo());
        
    }
}    