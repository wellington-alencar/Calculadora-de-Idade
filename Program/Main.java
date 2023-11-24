package Program;

import javax.swing.*;
import java.time.LocalDate;
import java.time.Period;

public class Main {
    public static void main(String[] args) {
        LocalDate dataAtual = LocalDate.now();
        int nascimento = Integer.parseInt(JOptionPane.showInputDialog("Digite sua data de nascimento (ex: 10072000 ddMMyyy)"));

        String numeroDaData = String.valueOf(nascimento);

        Integer dia = Integer.parseInt(numeroDaData.substring(0,2));
        Integer mes = Integer.parseInt(numeroDaData.substring(2,4));
        Integer ano = Integer.parseInt(numeroDaData.substring(4, 8));


        LocalDate nascimentoFormatado = LocalDate.of(ano, mes, dia);

        Period diferenca = Period.between( nascimentoFormatado, dataAtual);

        JOptionPane.showMessageDialog(null,"Você tem " + diferenca.getYears() + " Anos, "+ diferenca.getMonths()+ " Meses e, "+  diferenca.getDays() + " dias");




    }
}
