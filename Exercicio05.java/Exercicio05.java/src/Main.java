public class Main {

    public static double calcularMedia(int numeros[]) {

        int soma = 0;

        for(int i = 0; i < numeros.length; i++) {
            soma += numeros[i];
        }

        return (double) soma / numeros.length;
    }

    public static void main(String[] args) {

        int numeros[] = {5, 10, 15, 20};

        double media = calcularMedia(numeros);

        System.out.printf("Média: %.2f", media);
    }
}