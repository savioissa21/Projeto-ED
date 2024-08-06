import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;
import java.util.Arrays;

public class Utilidades {

    // Método para gerar vetores de teste
    public static Item[] gerarItens(int numItens, int tamanhoVetor, int maxValor) {
        Random rd = new Random();
        Item[] itens = new Item[numItens];
        for (int i = 0; i < itens.length; i++) {
            int[] vetor = new int[tamanhoVetor];
            for (int j = 0; j < tamanhoVetor; j++) {
                vetor[j] = rd.nextInt(maxValor);
            }
            itens[i] = new Item(vetor);
        }
        return itens;
    }

    // Método para calcular o tempo médio de execução de um método de ordenação
    public static long calcularTempoMedio(Ordena ordena, String metodo, Item item, int numExecucoes) {
        long totalDuration = 0;
        for (int i = 0; i < numExecucoes; i++) {
            int[] vetorCopia = Arrays.copyOf(item.getVetor(), item.getVetor().length);
            long startTime = System.nanoTime();
            if (metodo.equals("bubbleSort")) {
                ordena.bubbleSort(vetorCopia);
            } else if (metodo.equals("shellSort")) {
                ordena.shellSort(vetorCopia);
            } else if (metodo.equals("insertionSort")) {
                ordena.insertionSort(vetorCopia);
            }
            long endTime = System.nanoTime();
            totalDuration += (endTime - startTime);
        }
        return totalDuration / numExecucoes;
    }

    // Método para escrever resultados no arquivo
    public static void escreverResultado(String path, String texto) {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(path, true))) {
            bw.write(texto);
            bw.newLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
