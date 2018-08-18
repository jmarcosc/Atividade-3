package br.com.fiap.exercicio2;

import java.time.LocalDateTime;
import java.time.Month;
import java.time.format.DateTimeFormatter;

import javax.swing.JOptionPane;

public class Exercicio2 {

	public static void main(String[] args) {
		
	  	 LocalDateTime dateTime = LocalDateTime.of(2012, Month.SEPTEMBER, 10, 12, 0);
	  	 String anoMesDiaHoraMin = dateTime.format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm"));
	  	 String diaMesAnoHoraMinSeg = dateTime.format(DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss"));
	  	 String diaSemana = dateTime.format(DateTimeFormatter.ofPattern("E"));
		 String ano = dateTime.format(DateTimeFormatter.ofPattern("u"));
		 String era = dateTime.format(DateTimeFormatter.ofPattern("G"));
	 
		 JOptionPane.showMessageDialog(null, "FORMATO (ANO-MES-DIA HORA:MINUTO): \n" + anoMesDiaHoraMin);
		 JOptionPane.showMessageDialog(null, "FORMATO (DIA-MES-ANO HORA:MINUTO:SEGUNDO): \n" + diaMesAnoHoraMinSeg);
		 JOptionPane.showMessageDialog(null, "FORMATO (DIA DA SEMANA): \n" + diaSemana);
		 JOptionPane.showMessageDialog(null, "FORMATO (ANO): \n" + ano);
		 JOptionPane.showMessageDialog(null, "FORMATO (ERA): \n" + era);
	  	 
	}
}