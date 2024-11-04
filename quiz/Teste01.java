package quiz;
import java.util.Scanner;

public class Teste01 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int score = 0; // Pontuação do usuário
// como principal otmizacao fiz um array bidimensional para subistituir a grande quantidade de system.out.println e fazer um unico filtro de respostas em vez de ter um verificador por pergunta como era o original 
        System.out.println("Bem-vindo ao Quiz de Programação Orientada a Objetos e Estrutura de Dados!");
        System.out.println("Responda as perguntas e veja sua pontuação no final.\n");

        // Array de perguntas e respostas, sei que normalmente e usado em matriz maaaas fiz com auxilio de uma ai e ela me deu essa opcao pra otimizar e achei innteresante e quiz manter 
        String[][] perguntasERespostas = {
            {
                "1) Qual das seguintes afirmações descreve corretamente o ciclo de vida de um objeto em Java?",
                "A) Um objeto é criado quando o código é compilado e destruído assim que o método principal é finalizado.",
                "B) Um objeto é criado pela invocação de um método estático e destruído imediatamente após seu uso.",
                "C) Um objeto é criado através de uma instância de classe e destruído pelo coletor de lixo quando não é mais referenciado.",
                "D) Um objeto é criado automaticamente pelo Java e destruído manualmente pelo desenvolvedor.",
                "C"
            },
            {
                "2) Em Java, qual é a principal vantagem de usar polimorfismo?",
                "A) Permite que métodos com o mesmo nome sejam chamados de diferentes classes e produzam o mesmo resultado.",
                "B) Permite que um objeto de uma classe filha seja tratado como se fosse de sua classe pai, promovendo flexibilidade no código.",
                "C) Permite que uma classe herde os atributos e métodos de outra classe sem a necessidade de reescrevê-los.",
                "D) Permite que múltiplas classes compartilhem o mesmo nome de método, sem considerar a assinatura do método.",
                "B"
            },
            {
                "3) Qual das opções a seguir descreve corretamente a diferença entre uma lista encadeada simples e uma lista duplamente encadeada?",
                "A) Uma lista encadeada simples permite acessar os elementos em qualquer ordem, enquanto a lista duplamente encadeada só permite acesso sequencial.",
                "B) Uma lista encadeada simples possui nós com ponteiros apenas para o próximo elemento, enquanto a lista duplamente encadeada possui ponteiros para o próximo e o anterior.",
                "C) Uma lista encadeada simples armazena todos os elementos de forma contínua na memória, enquanto a lista duplamente encadeada armazena de forma fragmentada.",
                "D) Uma lista encadeada simples pode ser percorrida em qualquer direção, enquanto a lista duplamente encadeada só pode ser percorrida de frente para trás.",
                "B"
            },
            {
                "4) Qual das seguintes opções descreve corretamente a principal diferença entre uma fila e uma pilha?",
                "A) Em uma fila, os elementos são removidos na ordem inversa à que foram inseridos, enquanto em uma pilha os elementos são removidos na ordem de inserção.",
                "B) Em uma fila, a inserção e a remoção de elementos seguem o princípio FIFO (First In, First Out), enquanto em uma pilha seguem o princípio LIFO (Last In, First Out).",
                "C) Em uma pilha, os elementos podem ser inseridos e removidos de qualquer posição, enquanto em uma fila, os elementos só podem ser removidos do final.",
                "D) Em uma fila, os elementos seguem o princípio LIFO (Last In, First Out), enquanto em uma pilha seguem o princípio FIFO (First In, First Out).",
                "B"
            },
            {
                "5) Qual das seguintes afirmações sobre o algoritmo de ordenação por 'inserção' (Insertion Sort) é verdadeira?",
                "A) O algoritmo de ordenação por inserção é eficiente para grandes conjuntos de dados não ordenados.",
                "B) O Insertion Sort compara os elementos de forma aleatória, inserindo-os em posições corretas dentro da lista ordenada.",
                "C) O algoritmo de ordenação por inserção insere cada elemento na posição correta dentro de uma lista já parcialmente ordenada, sendo mais eficiente para conjuntos pequenos ou quase ordenados.",
                "D) O Insertion Sort é um algoritmo de ordenação baseado em árvores, que usa uma estrutura de árvore binária para ordenar os dados.",
                "C"
            }
        };

        // Iterar sobre as perguntas e calcular a pontuação
        for (String[] pergunta : perguntasERespostas) {
            if (fazerPergunta(scanner, pergunta)) {
                score++;
            }
        }

        // Resultado final
        System.out.println("\nQuiz finalizado! Sua pontuação é: " + score + "/5");
        if (score == 5) {
            System.out.println("Excelente! Você dominou os conceitos.");
        } else if (score >= 3) {
            System.out.println("Bom trabalho! Mas ainda pode melhorar.");
        } else {
            System.out.println("Continue estudando, você pode melhorar.");
        }

        scanner.close();
    }
// aq e o metodo pras perguntas aparerecem individuallmente e ver se ta certo ou errado
    private static boolean fazerPergunta(Scanner scanner, String[] pergunta) {
        System.out.println(pergunta[0]);
        for (int i = 1; i < pergunta.length - 1; i++) {
            System.out.println(pergunta[i]);
        }

        System.out.print("Sua resposta: ");
        String resposta = scanner.nextLine(); // aq ele le
        return resposta.equalsIgnoreCase(pergunta[pergunta.length - 1]);
    }
}