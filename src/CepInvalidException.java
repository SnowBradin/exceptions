public class CepInvalidException extends Exception {
    public static void main(String[] args) {
        try {
            String cepFormatado = formatarCep("56485453");
            System.out.println(cepFormatado);
        } catch (CepInvalidException e) {
            //TODO Auto-generated catch block
            e.printStackTrace();
            //^ou System.out.println("O CEP não segue regras previstas")
        }
    }
    static String formatarCep(String cep) throws CepInvalidException{
        if(cep.length() !=8)
        throw new CepInvalidException();

        //simulando um cep formatado
        return "23.765-064";
    }
}
