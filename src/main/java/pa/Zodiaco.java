
package pa;


public class Zodiaco {
    private int dia;
    private int mes;
    private boolean fecha;
    private String signo = "Desconocido";
    
    public Zodiaco(int dia, int mes) {
        this.dia = dia;
        this.mes = mes;
    }

    public int getDia() {
        return dia;
    }

    public int getMes() {
        return mes;
    }
    /**
     * Devuelve cierto si la fecha es válida ¨(día: 1..31, mes:1..12), y
       falso en caso contrario   
    */  
    private boolean fecha_valida() {
        if (31 < dia || 0 > dia){
            fecha = false;
        }
        else{
            switch (mes){
                case 1:
                case 3:
                case 5:
                case 7:
                case 8:
                case 10:
                case 12:
                    fecha = true;
                case 2:
                    if (dia > 28){
                        fecha = false;
                    }
                    else{
                        fecha = true;
                    }
                    break;
                case 4:
                case 6:
                case 9:
                case 11:
                    if (dia > 30){
                        fecha = false;
                    }
                    else{
                        fecha = true;
                    }
                    break;
                default:
                    fecha = false;
            }
        }
        return fecha;
    }
 
    /**
     * Devuelve el nombre del signo asociado al día y mes de nacimiento    
    */
    public String averiguar_signo() {
        if(fecha_valida() == false){
            signo = "Fecha inválida";
        }
        else{
            switch (mes){
                case 1:
                    if (1 <= dia && dia <= 20){
                        signo = "Capricornio";
                    }
                    if (21 <= dia && dia <= 31){
                        signo = "Acuario";
                    }
                    break;
                case 2:
                    if (1 <= dia && dia <= 19){
                        signo = "Acuario";
                    }
                    if (20 <= dia && dia <= 28){
                        signo = "Piscis";
                    }
                    break;
                case 3:
                    if (1 <= dia && dia <= 20){
                        signo = "Piscis";
                    }
                    if (21 <= dia && dia >= 31){
                        signo = "Aries";
                    }
                    break;
                case 4:
                    if (1 <= dia && dia <= 20){
                        signo = "Aries";
                    }
                    if (21 <= dia && dia <= 30){
                        signo = "Tauro";
                    }
                    break;
                case 5:
                    if (1 <= dia && dia <= 21){
                        signo = "Tauro";
                    }
                    if (22 <= dia && dia <= 31){
                        signo = "Géminis";
                    }
                    break;
                case 6:
                    if (1 <= dia && dia <= 21){
                        signo = "Géminis";
                    }
                    if (22 <= dia && dia <= 30){
                        signo = "Cáncer";
                    }
                    break;
                case 7:
                    if (1 <= dia && dia <= 23){
                        signo = "Cáncer";
                    }
                    if (24 <= dia && dia <= 31){
                        signo = "Leo";
                    }
                    break;
                case 8:
                    if (1 <= dia && dia <= 24){
                        signo = "Leo";
                    }
                    if (25 <= dia && dia <= 31){
                        signo = "Virgo";
                    }
                    break;
                case 9:
                    if (1 <= dia && dia <= 23){
                        signo = "Virgo";
                    }
                    if (24 <= dia && dia <= 30){
                        signo = "Libra";
                    }
                    break;
                case 10:
                    if (1 <= dia && dia <= 23){
                        signo = "Libra";
                    }
                    if (24 <= dia && dia <= 31){
                        signo = "Escorpio";
                    }
                    break;
                case 11:
                    if (1 <= dia && dia <= 22){
                        signo = "Escorpio";
                    }
                    if (23 <= dia && dia <= 30){
                        signo = "Sagitario";
                    }
                    break;
                case 12:
                    if (1 <= dia && dia <= 21){
                        signo = "Sagitario";
                    }
                    if (22 <= dia && dia <= 31){
                        signo = "Capricornio";
                    }
                    break;
                default:
                    signo = "Error";
            }
        }
        return signo;
    }
}
