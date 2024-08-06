public class Ordena {
    public void bubbleSort(int v[]) {
        for (int k = v.length; k >= 1; k--) {
            for (int j = 1; j < k; j++) {
                if (v[j - 1] > v[j]) {
                    troca(v, j, j - 1);
                }
            }
        }
    }
    public void troca(int v[], int m, int n) {
        int aux = v[m];
        v[m] = v[n];
        v[n] = aux;
    }

    public static void insertionSort(int v[]){
        int j = 0;
        for(int i=1; i< v.length;i++){
            int aux = v[i];
            j = i;
            while (j>0 && aux <= v[j-1]){
                v[j] = v[j-1];
                j--;
            }
            v[j] = aux;
        }
        }

        public static void shellSort(int[] array) {
            int n = array.length;
    
            for (int gap = n / 2; gap > 0; gap /= 2) {
                for (int i = gap; i < n; i++) {
                    int temp = array[i];
                    int j;
                    for (j = i; j >= gap && array[j - gap] > temp; j -= gap) {
                        array[j] = array[j - gap];
                    }
                    array[j] = temp;
                }
            }
        }
}
