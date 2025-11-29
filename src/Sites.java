public class Sites {
    public static void main(String[] args) {

        Matrix a = new Matrix(4, 4, new double[][] {
                {0, 0, 1, 0},
                {1, 0, 0, 0},
                {1, 0, 0, 1},
                {1, 1, 1, 0}
        });

        // Copiando os elementos para outra matriz
        double[][] A = a.elements;

        LinearAlgebra LinearAlgebra = new LinearAlgebra();

        // 3. Calcule a norma que gera o valor que precisamos
        // Vetor de somas das colunas
        int n = A.length;
        double[] SomaColunas = new double[n];
        for (int j = 0; j < n; j++) {
            for (int i = 0; i < n; i++) {
                SomaColunas[j] += A[i][j];
            }
        }

        // Calcular norma
        double norm = 0.0;
        for (double value : SomaColunas) {
            norm += value * value;
        }
        norm = Math.sqrt(norm);

        // 4. Multiplique a norma por cada elemento do vetor -> vetor a0
        double[][] a0 = new double[n][1];
        for (int i = 0; i < n; i++) {
            a0[i][0] = SomaColunas[i] / norm;
        }

        // 5. Calcular MultiplicationAtion = (A^T * A) * a0
        double[][] AT = LinearAlgebra.transpose(A);
        double[][] ATA = LinearAlgebra.dot(AT, A);
        double[][] MultiplicationAtion = LinearAlgebra.dot(ATA, a0);

        // 6. Dividir cada elemento pela norma do vetor MultiplicationAtion -> a1
        double normMultiplication = 0.0;
        for (int i = 0; i < n; i++) {
            normMultiplication += MultiplicationAtion[i][0] * MultiplicationAtion[i][0];
        }
        normMultiplication = Math.sqrt(normMultiplication);

        double[][] a1 = new double[n][1];
        for (int i = 0; i < n; i++) {
            a1[i][0] = MultiplicationAtion[i][0] / normMultiplication;
        }

        // 7. Tolerância
        double tolerance = 0.1;


    }
}
