public class MinhaClasse {

    // Método principal
    public static void main (String [] args) {
        String primeiroNome = "Marcelo";
        String segundoNome = "Gonçalves";

        String nomeCompleto = nomeCompleto (primeiroNome, segundoNome);

        System.out.println(nomeCompleto);
    }

    // Método
    public static String nomeCompleto (String primeiroNome, String segundoNome) {
        return "Resultado do método " + primeiroNome.concat(" ").concat(segundoNome);
    }
}
