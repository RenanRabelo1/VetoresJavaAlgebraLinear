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


        double [] h5 = la.operacao(A5);
        double [] h6 = la.operacao(A6);
        double [] h7 = la.operacao(A7);
        double [] h8 = la.operacao(A8);



        la.ordemDecrescente(h5);
        la.ordemDecrescente(h6);
        la.ordemDecrescente(h7);
        la.ordemDecrescente(h8);


        System.out.println("Questão 5: ");
        la.printVet(h5);
        System.out.println("Questão 6: ");
        la.printVet(h6);
        System.out.println("Questão 7: ");
        la.printVet(h7);
        System.out.println("Questão 8: ");
        la.printVet(h8);
    }
}
