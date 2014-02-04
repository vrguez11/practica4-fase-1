package cartafrancesa;

public class CartaFrancesa {
    // DECLARACION DE CONSTANTES QUE DETERMINAN LOS PALOS
    private final int TREBOLES = 0;
    private final int DIAMANTES = 1;
    private final int CORAZONES = 2;
    private final int PICAS = 3;
    private final int COMODIN = 4;
    // DECLARACION DE VARIABLES DONDE GUARDAREMOS EL PALO, NUMERO, Y FORMATO
    // EN EL QUE MOSTRAREMOS EL NUMERO Y PALO
    private int numero;
    private int palo;
    private String formato;
    private String formatoFinal;
    // DECLARACIÓN DEL MÉTODO getNumero, EL CUAL NOS DARÁ EL NÚMERO DE LA CARTA
    public int getNumero() {
        return numero;
    }
    // DECLARACIÓN DEL MÉTODO getPalo, QUE NOS DARÁ EL PALO DE LA CARTA
    public int getPalo() {
        return palo;
    }
    // DECLARACIÓN DEL MÉTODO toString, QUE NOS DARÁ, SEGÚN EL PALO Y EL NUMERO
    // UN STRING DE COMO QUEREMOS QUE SE MUESTRE PARA SABER
    // NUMERO Y PALO DE LA CARTA, EL CUAL SE MOSTRARÁ EN PANTALLA MÁS ADELANTE
    public String toString() {
        switch(this.getPalo()) {
            case 0:
                return formato = " de Treboles";
            case 1:
                return formato = " de Diamantes";
            case 2:
                return formato = " de Corazones";
            case 3:
                return formato = " de Picas";
            case 4:
                return formato = " de Comodin";
        }
        
        switch(this.getNumero()) {
            case 0:
                return formatoFinal = "AS" + formato;
            case 1:
                return formatoFinal = "2" + formato;
            case 2:
                return formatoFinal = "3" + formato;
            case 3:
                return formatoFinal = "4" + formato;
            case 4:
                return formatoFinal = "5" + formato;
            case 5:
                return formatoFinal = "6" + formato;
            case 6:
                return formatoFinal = "7" + formato;
            case 7:
                return formatoFinal = "8" + formato;
            case 8:
                return formatoFinal = "9" + formato;
            case 9:
                return formatoFinal = "10" + formato;
            case 10:
                return formatoFinal = "J" + formato;
            case 11:
                return formatoFinal = "Q" + formato;
            case 12:
                return formatoFinal = "K" + formato;
        }
        return null;
    }
    // DECLARACIÓN DEL MÉTODO toCodigO, QUE NOS MOSTRARÁ EL CÓDIGO DE LA CARTA
    // EN FORMATO REDUCIDO
    public int toCodigo(int palo, int numero) {
        this.palo = palo;
        this.numero = numero;
            
    }
    
}
