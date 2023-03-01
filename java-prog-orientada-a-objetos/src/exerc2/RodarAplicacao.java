package exerc2;

public class RodarAplicacao {
    public static void main(String[] args) {

        //Forma Upcast
        Funcionario funcionaro = new Funcionario();

        Funcionario gerente = new Gerente();
        Funcionario faxineiro = new Faxineiro();
        Funcionario vendedor = new Vendedor();

        
        //Forma Downcast
        Vendedor vendedor_ = (Vendedor) new Funcionario();
        Gerente gerente_ = (Gerente) new Funcionario();
        Faxineiro faxineiro_ = (Faxineiro) new Funcionario();
    }
}
