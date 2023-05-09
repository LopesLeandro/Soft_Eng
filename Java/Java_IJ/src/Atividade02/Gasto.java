package Atividade02;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Gasto {
    private int tipo;
    private LocalDate data;
    private double valor;
    private int formaDePagamento;

    public Gasto(int tipo, LocalDate data, double valor, int formaDePagamento) {
        this.tipo = tipo;
        this.data = data;
        this.valor = valor;
        this.formaDePagamento = formaDePagamento;
    }

    public int getTipo() {
        return tipo;
    }

    public String getData() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        return data.format(formatter);
    }

    public double getValor() {
        return valor;
    }

    public int getFormaDePagamento() {
        return formaDePagamento;
    }
}
