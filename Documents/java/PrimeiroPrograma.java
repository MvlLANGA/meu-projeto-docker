/*public class primeiroprograma {
    public static PrimeiroPrograma(String[] args) { *Sempre temos que ter  uma chamada com o nome do programa.                                                                                                                                                                                                                                                                                                                                                          empre apresentamos uma classe
       
    /*Tipos primitivos
       Numeros Interios: 100, 50, 111509
       Tipos de inteiros: byte, short, int, long
       byte b =100; // 8 bits => -128 a 127
        short s = 1000; // 16 bits => -32.768 a 32.767
        int i = 100000; // 32 bits => -2.147.483.648 a 2.147.483.647
        long l = 100000L; // 64 bits => -9.223. depois de declarar um numero long colocamos o L no final 
        do numero para indicar que é um long

        //numero decimais, numeros que acompanha ,
        float f = 10.5f; // 32 bits => 6 casas decimais, precisão simples
        double d = 85.5; // 64 bits => 15 casas decimais, precisão dupla
        
        //strings representa palavras ou frases
        char c = 'A'; // 16 bits => representa um unico caracter
        String str = "Ola Mundo"; // 16 bits => representa uma sequencia de caracteres / *A p[alavra string 
        sempre vai ficar da cor branca, pois é uma classe do java* /]
        boolean bo = true; // 1 bit => verdadeiro ou falso

    }
    /*Condicionais- if(bool){
        //codigo a ser executado se a condicao for verdadeira
        } else {
        //codigo a ser executado se a condicao for falsa

        exemplo:
        int idade = 18;
        if(idade >= 18){
            System.out.println("Verdadeiro");
        } 
        else if(idade < 18){
            System.out.println("Menor de idade");
        } else {
            System.out.println("Falso");
        }
    /*Vetores 
        Arrays são estruturas de dados que permitem armazenar múltiplos valores do mesmo tipo em uma única variável.
        * Exemplo de declaração e inicialização de um vetor de inteiros:
        * int[] numeros = new int[2]; // Cria um vetor de inteiros
        * numeros[0] = 10; // Atribui o valor 10 ao primeiro elemento do vetor
        * numeros[1] = 20; // Atribui o valor 20 ao segundo elemento do vetor
        * numeros[2] = 30; // Atribui o valor 30 ao terceiro elemento do vetor
        Posso criar arrays de boleanos, strings, doubles, etc.

        ArrayList Cria uma lista de objetos que podem ser adicionados dinamicamente.
        Para se usar ArrayList, é necessário importar a classe java.util.ArrayList.
        * Exemplo de uso:
        * ArrayList<String> nomes = new ArrayList<>(); // Cria uma lista de nomes
        o .add é usado para adicionar elementos à lista.
        * nomes.add("João"); // Adiciona o nome "João" à lista
        * nomes.add("Maria"); // Adiciona o nome "Maria" à lista

        O .get é usado para acessar elementos da lista pelo índice.
        * System.out.println(nomes.get(0)); // Imprime o primeiro nome da lista
        * System.out.println(nomes.get(1)); // Imprime o segundo nome da lista

        O metodo .remove é usado para remover elementos da lista.
        * nomes.remove(0); // Remove o primeiro nome da lista
        * System.out.println(nomes.size()); // Imprime o tamanho da lista
        * System.out.println(nomes.isEmpty()); // Verifica se a lista está vazia
        * System.out.println(nomes.contains("Maria")); // Verifica se a lista contém o nome "Maria"
        * System.out.println(nomes.indexOf("Maria")); // Retorna o índice do nome "Maria" na lista
        * System.out.println(nomes.lastIndexOf("Maria")); // Retorna o último índice do nome "Maria" na lista
        * System.out.println(nomes.toArray()); // Converte a lista para um array
        * System.out.println(nomes.toString()); // Converte a lista para uma string
        * System.out.println(nomes.clear()); // Limpa todos os elementos da lista
        * System.out.println(nomes.isEmpty()); // Verifica se a lista está vazia após limpar
        * System.out.println(nomes.size()); // Imprime o tamanho da lista após limpar
        * System.out.println(nomes.get(0)); // Tenta acessar o primeiro elemento da lista após limpar, o que resultará
        * em uma exceção, pois a lista estará vazia.

     /*Loops
     for (int i = 0; i < 10; i++) {
        System.out.println(i);
        }
        // código a ser executado enquanto a condição for verdadeira
        no caso enquanto i for menor que 10
        O i++ é usado para incrementar o valor de i em 1 a cada iteração do loop.
        Posso incrementar de 2 em 2, ou de 3 em 3, etc. Exemplo: i+=2;
        Se eu tiver um nome de varianel tipo numero ao inves de i eu faria o for assim:
        for (int numero = 0; numero < 10; numero++) {
            System.out.println(numero);
        
        

    */
   

