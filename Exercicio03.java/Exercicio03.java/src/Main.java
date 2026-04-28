public class Main {


    public static int encontrarMaior (int[] numeros) {
        int maior = numeros[0];
        for (int i=1; i < numeros.length; i++) {
            if (numeros[i] > maior) {
                maior = numeros[i];
            }
        }
        return maior;
    }
    public static void main(String[] args) throws Exception {
            int[] numeros = {4,7,2,9,1};
        
        int resultado = encontrarMaior(numeros);
        System.out.println("Maior valor: " + resultado);
    }
}
