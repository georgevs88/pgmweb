package pmcg.imti.util;

import java.util.Formatter;
import java.util.HashMap;
import java.util.List;
import java.util.Random;

public class Formatacao {

	//Completa uma string com zeros a esquerda até o tamanho informado
	public static String zeroEsquerda(String valor, Integer numeroChar) {
		while(valor.length() < numeroChar)
		{
			valor = '0' + valor;
		}
		return valor;
	}
	
	//retorna verdadeiro se todos os caracteres de uma string são numéricos
	public static boolean isNumeric(String str) {
		for (int i = 0; i < str.length(); i++) {
			if(!Character.isDigit(str.charAt(i))){
				return false;
			}
		}
		return true;
	}
	
	//Como os meses em java vão de 0 a 11, soma um mes
	public static String somaMes(int i) {
		if(i==0){
			return "1";
		} else if(i==1){
			return "2";
		}else if(i==2){
			return "3";
		}else if(i==3){
			return "4";
		}else if(i==4){
			return "5";
		}else if(i==5){
			return "6";
		}else if(i==6){
			return "7";
		}else if(i==7){
			return "8";
		}else if(i==8){
			return "9";
		}else if(i==9){
			return "10";
		}else if(i==10){
			return "11";
		}else {
			return "12";
		}
	}
	
	public static String imprimeLista(List<String> lista){
    	String texto = "";
    	for (int i = 0; i < lista.size(); i++) {
    		texto = texto + lista.get(i) + ",";
		}
    	texto = texto.substring(0, texto.length() - 1); //retira a ultima virgula
    	return texto;
    }
	
	public static String imprimeListaSemEspaco(List<String> lista){
    	String texto = "";
    	for (int i = 0; i < lista.size(); i++) {
    		texto = texto + lista.get(i) + ",";
		}
    	texto = texto.substring(0, texto.length() - 1); //retira a ultima virgula
    	return texto;
    }
	
	public static String formataCpfCnpj(String cpfcnpj) {
		if(cpfcnpj.length() == 11){
			return cpfcnpj.substring(0, 3) + "." + cpfcnpj.substring(3, 6) + "." + cpfcnpj.substring(6, 9) + "-" + cpfcnpj.substring(9, 11);
		} else if (cpfcnpj.length() == 14) {
			return cpfcnpj.substring(0, 2) + "." + cpfcnpj.substring(2, 5) + "." + cpfcnpj.substring(5, 8) + "/" + cpfcnpj.substring(8, 12) + "-" + cpfcnpj.substring(12, 14);
		} else {
			return cpfcnpj;
		}
	}
	
	public static String geraSenha(){    
        Random ran = new Random();    
        String[] letras ={"1","2","3","4","5","6","7","8","9","A","B","C","D","E","F","G","H",
       		 "J","K","L","M","N","P","Q","R","S","T","U","V","W","X","Y","Z"};    
        String senha = "";        
        for ( int i = 0; i < 8; i++){ 
        	int a = ran.nextInt(letras.length);    
       	 	senha += letras[a];    
        }    
        return senha;    
    }
	
	public static Boolean isNullOrEmpty(String x){    
		if(x == null || x.isEmpty()){
			return true;
		} else {
			return false;
		}
	}
	
	public static Boolean isCEPValido(String cep){
		if(cep == null || cep.isEmpty()){
			return false;
		} else {
			String cepaux = FormatUtils.onlyNumbers(cep);
			if(cepaux.length() != 8){
				return false;
			} else {
				return true;
			}
		}
	}

	public static String valorMonetario(Double numero) {
		  if(numero != null){
			  return String.format("%1$,.2f", numero);
		  } else {
			  return "0,00";
		  }
	}
	
	public static String completaComCaracterADireita(String string, Integer tam, Character c) {
		
		if(string == null || string.isEmpty()){
			string = "";
		}
		
		StringBuilder resposta = new StringBuilder(string);
	
		if (resposta.length() < tam) {

			for (int i = string.length(); i < tam; i++) {
				resposta.insert(i, c);
			}
		}

		return resposta.toString();
	}
	
	public static String completaComZerosAEsquerda(String string, int tamanho) {
		StringBuffer buffer = new StringBuffer(string);
		if (string.length() > tamanho)
			buffer.setLength(tamanho);
		for (int i = 0; i < (tamanho - string.length()); i++) {
			buffer.insert(0, '0');
		}
		return buffer.toString();
	}
	
	public static String removeAcentuacaoString(String stringAcentuada) {

		if (stringAcentuada == null || stringAcentuada.isEmpty()) {
			return stringAcentuada;
		}

		char[] acentuados = new char[] { 'ç', 'á', 'à', 'ã', 'â', 'ä', 'é',
				'è', 'ê', 'ë', 'í', 'ì', 'î', 'ï', 'ó', 'ò', 'õ', 'ô', 'ö',
				'ú', 'ù', 'û', 'ü' };

		char[] naoAcentuados = new char[] { 'c', 'a', 'a', 'a', 'a', 'a', 'e',
				'e', 'e', 'e', 'i', 'i', 'i', 'i', 'o', 'o', 'o', 'o', 'o',
				'u', 'u', 'u', 'u' };

		for (int i = 0; i < acentuados.length; i++) {

			stringAcentuada = stringAcentuada.replace(acentuados[i],
					naoAcentuados[i]);

			stringAcentuada = stringAcentuada.replace(Character
					.toUpperCase(acentuados[i]), Character
					.toUpperCase(naoAcentuados[i]));
		}

		return stringAcentuada;
	}
}
