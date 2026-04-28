//Nome: Isabelly Alves T Bahia 
// Matrícula: 1261946888
public class Main {
 public static int contarPares (int numeros[]) {
    int contador = 0;
    for (int i = 0 ; i < numeros.length; i++) {
        if (numeros[i] % 2 == 0) {
            contador++;
        }

    }
    return contador;
 }
    public static void main(String[] args) {
        int numeros [] = {1,2,3,4,5,6};
        int resultado = contarPares(numeros);
        System.out.println("O numero de elementos pares é:" + resultado);
        
    }
}
