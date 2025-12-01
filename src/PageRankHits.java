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
        double [] h5 = la.operacao(A5);
        la.ordemDecrescente(h5);
        la.printVet(h5);

        System.out.println("Questão 6: ");
        double [] h6 = la.operacao(A6);
        la.ordemDecrescente(h6);
        la.printVet(h6);

        System.out.println("Questão 7: ");
        double [] h7 = la.operacao(A7);
        la.ordemDecrescente(h7);
        la.printVet(h7);

        System.out.println("Questão 8: ");
        double [] h8 = la.operacao(A8);
        la.ordemDecrescente(h8);
        la.printVet(h8);
    }
}
