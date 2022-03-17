package exercicio01;

public class Main {
    public static void main(String[] args) {

        int[] numeros = {15485448, 2195498, 12, 98716549, 999999899, 1654891};

        for (int numero: numeros) {
            System.out.println(numero+" -> "+ inverteInt(numero));
        }
    }

    static int inverteInt(int numero) {
        // Converte inteiro para String
        String stringNumero = Integer.toString(numero);

        // Usando o método reverse do StringBuffer para inverter a string
        String invertida = new StringBuffer(stringNumero).reverse().toString();

        // Retorna a string invertida convertida para inteiro
        return Integer.parseInt(invertida);
    }
}