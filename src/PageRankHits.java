import java.util.Arrays;
import java.util.Comparator;

public class PageRankHits {

    public static void main(String[] args) {

        double[][] A5 = {
                {0, 0, 1, 0},
                {1, 0, 0, 0},
                {1, 1, 0, 0},
                {0, 1, 0, 0}
        };
        double[][] A6 = {
                {0, 1, 1, 0},
                {0, 0, 1, 0},
                {1, 0, 0, 1},
                {1, 0, 0, 0}
        };

        double[][] A7 = {
                {0, 1, 1, 1, 0},
                {1, 0, 0, 0, 1},
                {0, 0, 0, 0, 1},
                {0, 1, 0, 0, 0},
                {0, 1, 1, 0, 0}
        };
        double[][] A8 = {
                {0, 1, 1, 0, 1, 1, 0, 0, 0, 1},
                {0, 0, 1, 0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 0, 0, 1},
                {0, 1, 1, 0, 0, 1, 1, 0, 0, 1},
                {0, 0, 0, 1, 0, 0, 0, 0, 0, 0},
                {0, 1, 0, 0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 0, 1, 0},
                {0, 0, 0, 0, 0, 1, 0, 0, 0, 0},
                {0, 1, 1, 0, 0, 1, 0, 1, 0, 1},
                {0, 0, 0, 0, 0, 1, 0, 0, 0, 0}
        };

        LinearAlgebra la = new LinearAlgebra();

        System.out.println("Questão 5: ");
        double[] h5 = la.operacao(A5);
        printResultadoComSites(h5, "A5");

        System.out.println("Questão 6: ");
        double[] h6 = la.operacao(A6);
        printResultadoComSites(h6, "A6");

        System.out.println("Questão 7: ");
        double[] h7 = la.operacao(A7);
        printResultadoComSites(h7, "A7");

        System.out.println("Questão 8: ");
        double[] h8 = la.operacao(A8);
        printResultadoComSites(h8, "A8");
    }


















    public static void printResultadoComSites(double[] vetor, String nomeMatriz) {
        // Criar array de índices [0, 1, 2, ..., n-1]
        Integer[] indices = new Integer[vetor.length];
        for (int i = 0; i < vetor.length; i++) {
            indices[i] = i;
        }

        // Ordenar os índices com base nos valores do vetor (ordem decrescente)
        Arrays.sort(indices, new Comparator<Integer>() {
            @Override
            public int compare(Integer i1, Integer i2) {
                // Ordenação decrescente: comparar vetor[i2] com vetor[i1]
                return Double.compare(vetor[i2], vetor[i1]);
            }
        });

        // Ordenar o vetor em ordem decrescente (para manter compatibilidade)
        Arrays.sort(vetor);
        // Inverter para ordem decrescente (porque Arrays.sort ordena em ordem crescente)
        for (int i = 0; i < vetor.length / 2; i++) {
            double temp = vetor[i];
            vetor[i] = vetor[vetor.length - 1 - i];
            vetor[vetor.length - 1 - i] = temp;
        }

        // Imprimir os resultados
        System.out.println("Resultados para " + nomeMatriz);
        for (int i = 0; i < vetor.length; i++) {
            // indices[i] é o índice original do site (começando de 0)
            // Adicionamos 1 para representar o site (Site 1, Site 2, ...)
            int siteOriginal = indices[i] + 1;
            System.out.printf("  Posição %d: Site %d (valor = %.6f)\n", i + 1, siteOriginal, vetor[i]);
        }
        System.out.println();
    }
}