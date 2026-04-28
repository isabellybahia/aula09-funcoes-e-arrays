//Nome: Isabelly Alves T Bahia
//Matrícula: 1261946888

public class Main {

    public static int somarArray(int numeros[]) {
        int soma = 0;
        for (int i = 0; i < numeros.length; i++) {
             soma = soma + numeros[i];
    }
    return soma;
}
     public static void main(String[] args) {

        int numeros [] = {1,2,3,4,5};
        int resultado = somarArray(numeros);

        System.out.println ("A soma dos numeros é:" + resultado);
        
    }
}
