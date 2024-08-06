public class Main {
    public static void main(String[] args) {
        String path = "C:\\Users\\savio\\OneDrive\\Documentos\\ProjectED\\temporizador.txt";
        Ordena ordena = new Ordena();

        // Definir 20 itens de teste
        Item[] itens = Utilidades.gerarItens(20, 100, 1000);

        long somaTotalMediasBubble = 0;
        long somaTotalMediasShell = 0;
        long somaTotalMediasInsertion = 0;
        int numeroDeItens = itens.length;

        // Para cada item
        for (Item item : itens) {
            // Calcular tempo médio para Bubble Sort
            long averageDurationBubble = Utilidades.calcularTempoMedio(ordena, "bubbleSort", item, 100);
            somaTotalMediasBubble += averageDurationBubble;
            Utilidades.escreverResultado(path, "Bubble Sort - Média de tempo: " + averageDurationBubble + " nanosegundos");
            System.out.println("Bubble Sort - Média de tempo: " + averageDurationBubble + " nanosegundos");

            // Calcular tempo médio para Shell Sort
            long averageDurationShell = Utilidades.calcularTempoMedio(ordena, "shellSort", item, 100);
            somaTotalMediasShell += averageDurationShell;
            Utilidades.escreverResultado(path, "Shell Sort - Média de tempo: " + averageDurationShell + " nanosegundos");
            System.out.println("Shell Sort - Média de tempo: " + averageDurationShell + " nanosegundos");

            // Calcular tempo médio para Insertion Sort
            long averageDurationInsertion = Utilidades.calcularTempoMedio(ordena, "insertionSort", item, 100);
            somaTotalMediasInsertion += averageDurationInsertion;
            Utilidades.escreverResultado(path, "Insertion Sort - Média de tempo: " + averageDurationInsertion + " nanosegundos");
            System.out.println("Insertion Sort - Média de tempo: " + averageDurationInsertion + " nanosegundos");
        }

        // Calcular a média geral das médias para cada algoritmo
        long mediaGeralBubble = somaTotalMediasBubble / numeroDeItens;
        Utilidades.escreverResultado(path, "Média geral das médias para Bubble Sort: " + mediaGeralBubble + " nanosegundos");
        System.out.println("Média geral das médias para Bubble Sort: " + mediaGeralBubble + " nanosegundos");

        long mediaGeralShell = somaTotalMediasShell / numeroDeItens;
        Utilidades.escreverResultado(path, "Média geral das médias para Shell Sort: " + mediaGeralShell + " nanosegundos");
        System.out.println("Média geral das médias para Shell Sort: " + mediaGeralShell + " nanosegundos");

        long mediaGeralInsertion = somaTotalMediasInsertion / numeroDeItens;
        Utilidades.escreverResultado(path, "Média geral das médias para Insertion Sort: " + mediaGeralInsertion + " nanosegundos");
        System.out.println("Média geral das médias para Insertion Sort: " + mediaGeralInsertion + " nanosegundos");
    }
}
