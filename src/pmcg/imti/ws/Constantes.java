package pmcg.imti.ws;

public class Constantes {
	public static class Certificados {
    	//PRODUCAO
    	public static String arquivo_pfx = new Constantes().getClass().getResource("").getPath() + "1000804681.pfx";
		public static String senha_pfx = "dev@2019@dpge";
    }
	
	public static class Servico {
		private static String url_base = "http://webhml.tjms.jus.br/tjwssgpge/services/";
		public static String url_servico = url_base + "ServicoPJ2";
		
    }
	
}
