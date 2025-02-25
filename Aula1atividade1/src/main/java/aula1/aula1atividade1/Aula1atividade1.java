package aula1.aula1atividade1;

/*Link Da Onde Eu encontrei os 
                              Atalhos de JAVA é: https://pt.linkedin.com/pulse/netbeans-teclas-de-atalho-e-modelos-c%C3%B3digo-mateus-barbosa
 */
public class Aula1atividade1 {

    public static void main(String[] args) {
        System.out.println("Vamos ver alguns ATALHOS: ");
        System.out.println("");

        /* Todos os comentarios abaixo são
            descrições do que os Atalhos printados 
            na saida fazem
         */
        //cria uma saida
        System.out.println("sout + Tab");

        /* cria uma saida mas com a variavel(v) 
        junto de um nome em string*/
        System.out.println("soutv + Tab");

        //faz uma estrutura de repetição
        System.out.println("for + Tab");

        //igual o de cima mas não atribui o valor 10 em i < 10
        System.out.println("FORi + Tab");
        System.out.println("");

        /*confere a partir de uma quantidade de nomes
          iguais qual é o primeiro nome, e os nomes
          afrente ou abaixo ficam pintado de amarelo*/
        System.out.println("ctrl + F3");

        /*pega o referencial do primeiro nome de cima
          e vai para o proximo ou anterior nome igual
          pintado de amarelo*/
        System.out.println("F3 ou Shift F3");

        /*vai encontrar nome igual,requerindo 
        digitação nome pensado e o H ainda
        vai dar opção de substituir por outro 
        nome
         */
        System.out.println("ctrl + F ou + H");

        System.out.println("eLE aLTERNA");
        System.out.println("Ctrl + U e S");

        System.out.println("");
        System.out.println("");

        // Abaixo
        //Teste de eficiência usando o atalho ctrl + shift + d
        //e tambem Ctrl + Shift + L
        float hora = 0;
        for (int i = 0; i < 2; i++) {
            hora = hora + 1.30f;
        }
        System.out.println("Hora da primeira fase: " + hora + "h");

        float hora2 = 0;
        for (int i = 0; i < 3; i++) {
            hora2 = hora2 + 1.30f;
        }
        System.out.println("hora da segunda fase: " + hora2 + "h");

        float hora3 = 0;

        for (int i = 0; i < 4; i++) {
            hora3 = +1.30f;
        }
        System.out.println("hora da terceira fase: " + hora3 + "h");

        float hora4 = 0;

        for (int i = 0; i < 16; i++) {
            hora4 = hora4 + 1.30f;
        }
        System.out.println("hora da quarta fase: " + hora4 + "h");

        System.out.println("");
        System.out.println("");
        System.out.println("Ctrl + Shift + L copia a ultima linha de comando");
        System.out.println("copiada no historico da area de transferencia");
        System.out.println("com o comando = Ctrl + Shift + D");

        System.out.println("");
        System.out.println("Alt +  F7 vai listar as linhas de codigos juntas"
                + "dentro do meu Public Static void Main()");
        System.out.println("F6 --> vai rodar meu programa dando um run");
        System.out.println("Ctrl + O --> Abrir um projeto - nos leva direto a janela"
                + "projetos");
    }
}
