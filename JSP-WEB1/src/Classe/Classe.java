package Classe;

import java.util.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import Entidade.Data;
import Entidade.LoginSenha;

public class Classe {
	public static void main(String[] args) throws ParseException {
				
		System.out.println(login.validarSenha("matheus", "1403"));
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		Date dataNasc;
		dataNasc = sdf.parse("14/03/2015");
		Data dd = new Data("01/03/2001", (short)2019, (byte)1, (byte)1);
		dd.CalcularIdade();
		
		System.out.println(dd.getIdade());
		System.out.println(dd.getDia());
		System.out.println(dd.getMes());
		System.out.println(dd.getAno());		
	}
}
