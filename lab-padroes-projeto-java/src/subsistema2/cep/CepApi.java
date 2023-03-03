package subsistema2.cep;

public class CepApi {

    private static CepApi instancia = new CepApi();

    public static CepApi getInstancia() {
        return instancia;
    }

    private CepApi() {
    }

    public String recuperarCidade(String cep) {
        return "Araraquara";
    }  

    public String recuperarEstado(String cep) {
        return "Sao Paulo";
    }    
}
