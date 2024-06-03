import java.util.Scanner;

public class atividade_vetores {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int soma = 0;
        int valor;
        int maior = 0, menor = 0;
        int muda1, muda2;
        int media;
        String validacao1, validacao2;

        System.out.println("Digite quantos índices você quer no seu vetor: ");
        valor = scanner.nextInt();
        if (valor <= 0){
            do {
                System.out.println("Digite novamente quantos índices você quer no seu vetor: ");
                valor = scanner.nextInt();
            }while(valor <= 0);
        }

        int [] shitpost = new int[valor];

        for (int i = 0; i < valor; i++) {
            System.out.println("Digite o valor do índice " + i);
            shitpost[i] = scanner.nextInt();
            soma += shitpost[i];

            if (shitpost[i] < menor){
                menor = shitpost[i];
            }
            if (shitpost[i] > maior){
                maior = shitpost[i];
            }
            if(i == 0){
                menor = shitpost[0];
                maior = shitpost[0];
            }
        }
        System.out.println("A soma desses valores é: " + soma); //SOMA PRIMEIRO

        System.out.println("A média de todos esses valores é " + soma/valor); //MEDIA PRIMEIRO

        System.out.println("Esse é o menor valor do vetor " + menor + ".");
        System.out.println("Esse é o maior valor do vetor " + maior + ".");


        //Mudar valor de um índice vetor
        System.out.println("Você quer mudar um valor de um índice do vetor? (Digite exatamente 'sim' ou 'não')");
        validacao1 = scanner.next();
        if (validacao1.equals("sim")) {
            System.out.println("Qual posição do vetor você quer mudar? (Em número) ");
            muda1 = scanner.nextInt();
            if (muda1 <= 0 || muda1 > valor) {
                do {
                    System.out.println("Posição inválida, tente novamente: ");
                    muda1 = scanner.nextInt();
                } while (muda1 <= 0 || muda1 > valor);
            }
            soma = soma - shitpost[muda1 - 1];
            System.out.println("Qual é o número da nova posição? ");
            shitpost[muda1 - 1] = scanner.nextInt();
            soma = soma + shitpost[muda1 - 1];


            //Mudar valor de um índice vetor (parte 2)
            System.out.println("Você quer mudar outro valor? (Digite exatamente 'sim'  ou 'não')");
            validacao2 = scanner.next();
            if (validacao2.equals("sim")) {
                System.out.println("Qual outra posição do vetor você quer mudar? (Em número) ");
                muda2 = scanner.nextInt();
                if (muda2 <= 0 || muda2 > valor) {
                    do {
                        System.out.println("Posição inválida, tente novamente: ");
                        muda2 = scanner.nextInt();
                    } while (muda2 <= 0 || muda2 > valor);
                }
                soma = soma - shitpost[muda2 - 1];
                System.out.println("Qual é o número da nova posição? ");
                shitpost[muda2 - 1] = scanner.nextInt();
                soma = soma + shitpost[muda2 - 1];
            }
        }

        media = soma/valor; //MÉDIA SEGUNDO

        System.out.println("A soma desses valores é: " + soma + "."); //SOMA SEGUNDO

        System.out.println("A média de todos esses valores é: " + media + "."); //MÉDIA SEGUNDO
    }
}
