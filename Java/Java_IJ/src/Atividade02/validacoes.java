package Atividade02;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;

public class validacoes {
    public static boolean validartipoGasto(int tipoGasto){
        return tipoGasto >= 1 && tipoGasto <= 5;
    }

    public static boolean validarData(String dataStr){
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        try {
            LocalDate.parse(dataStr, formatter);
            return true;
        } catch (DateTimeParseException e) {
            return false;
        }
    }

    public static boolean validarValor(double valor){
        return valor >= 0;
    }

    public static boolean validarFormadePagamento (int formaDePagamento) {
        return formaDePagamento >= 1 && formaDePagamento <= 4;
    }
}
