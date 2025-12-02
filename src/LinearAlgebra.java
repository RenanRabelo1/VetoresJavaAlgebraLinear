public class LinearAlgebra {


    public double[][] transpose(double elements[][]) {
        double resultado[][] = new double[elements[0].length][elements.length];
        for (int i = 0; i < elements.length; i++) {
            for (int j = 0; j < elements[0].length; j++) {
                resultado[j][i] = elements[i][j];
            }
        }
        return resultado;
    }
    public double[] transposeVector(double elements[]) {
        double resultado[] = new double[elements.length];

        for (int i = 0; i < elements.length; i++) {

                resultado[elements.length-1-i] = elements[i];

        }
        return resultado;
    }


    public double[][] sum(double elements[][], double elements2[][]) {

        double resultado[][] = new double[elements.length][elements[0].length];
        if (elements.length == elements2.length && elements[0].length == elements2[0].length) {
            for (int i = 0; i < elements.length; i++) {
                for (int j = 0; j < elements[0].length; j++) {
                    resultado[i][j] = elements[i][j] + elements2[i][j];
                }
            }
        } else {
            System.out.println("Impossível");
            return null;
        }

        return resultado;
    }

    public double[] sumVector(double elements[], double elements2[]) {

        double resultado[] = new double[elements.length];
        if (elements.length == elements2.length) {
            for (int i = 0; i < elements.length; i++) {
                resultado[i]= elements[i] + elements2[i];
            }

        } else {
            System.out.println("Impossível");
            return null;

        }

        return resultado;
    }


    public double[][] times(double elements[][], double elements2[][]) {
        double resultado[][] = new double[elements.length][elements2[0].length];

        if (elements.length == elements2.length && elements[0].length == elements2[0].length) {

            for (int i = 0; i < elements.length; i++) {
                for (int j = 0; j < elements[0].length; j++) {
                     resultado[i][j] = elements[i][j] * elements2[i][j];

                }
            }
        } else {
            System.out.println("Impossível");
            return null;
        }

        return resultado;
    }


    public double[] timesVector (double elements[], double elements2[]){
        double resultado[]= new double[elements.length];
        if (elements.length==elements2.length){
            for (int i=0; i<elements.length; i++){
                resultado[i]= elements[i] * elements2[i];
            }
        } else{
            System.out.println("Impossível");
            return null;
        }
        return resultado;
    }


    public double[][] dot(double elements[][], double elements2[][]) {
        double resultado[][] = new double[elements.length][elements2[0].length];

        if (elements[0].length == elements2.length) {



            for (int i = 0; i < elements.length; i++) {
                for (int j = 0; j < elements2[0].length; j++) {
                    double soma = 0;
                    for (int a = 0; a < elements[0].length; a++) {
                        soma += elements[i][a] * elements2[a][j];
                    }
                    resultado[i][j] = soma;
                }
            }


        } else{
            System.out.println("Impossível");
            return null;
        }


        return resultado;

    }


    public double[][] gauss(double[][] matriz) {
        int n = matriz.length;
        double[][] mat = new double[n][matriz[0].length];


        for (int i = 0; i < n; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                mat[i][j] = matriz[i][j];
            }
        }

        for (int i = 0; i < n; i++) {
            double pivo = mat[i][i];


            if (pivo == 0) {
                for (int t = i + 1; t < n; t++) {
                    if (mat[t][i] != 0) {
                        double[] temp = mat[i];
                        mat[i] = mat[t];
                        mat[t] = temp;
                        pivo = mat[i][i];
                        break;
                    }
                }
            }


            for (int j = i + 1; j < n; j++) {
                double fator = mat[j][i] / pivo;
                for (int k = i; k < mat[0].length; k++) {
                    mat[j][k] = mat[j][k] - fator * mat[i][k];


                    if (Math.abs(mat[j][k]) < 0.000001) {
                        mat[j][k] = 0.0;
                    }
                }
            }
        }
        return mat;
    }



    public double[][] solve(double[][] mat) {
        int n = mat.length;
        int m = mat[0].length;


        double[][] res = new double[n][m];
        for (int i = 0; i < n; i++)
            for (int j = 0; j < m; j++)
                res[i][j] = mat[i][j];


        for (int i = 0; i < n; i++) {
            double pivo = res[i][i];


            if (pivo == 0) {
                for (int t = i + 1; t < n; t++) {
                    if (res[t][i] != 0) {
                        double[] temp = res[i];
                        res[i] = res[t];
                        res[t] = temp;
                        pivo = res[i][i];
                        break;
                    }
                }
            }


            for (int j = i; j < m; j++) {
                res[i][j] = res[i][j] / pivo;
                if (Math.abs(res[i][j]) < 0.000001) {
                    res[i][j] = 0.0;
                }
            }


            for (int k = 0; k < n; k++) {
                if (k != i) {
                    double fator = res[k][i];
                    for (int j = i; j < m; j++) {
                        res[k][j] = res[k][j] - fator * res[i][j];
                        if (Math.abs(res[k][j]) < 0.000001) {
                            res[k][j] = 0.0;
                        }
                    }
                }
            }
        }

        boolean impossivel = false;
        boolean indeterminado = false;

        for (int i = 0; i < n; i++) {
            boolean linhaTodaZero = true;
            for (int j = 0; j < m - 1; j++) {
                if (res[i][j] != 0) {
                    linhaTodaZero = false;
                    break;
                }
            }

            if (linhaTodaZero && res[i][m - 1] != 0) {
                impossivel = true;
                break;
            }

            if (linhaTodaZero && res[i][m - 1] == 0) {
                indeterminado = true;
            }
        }

        if (impossivel) {
            System.out.println("Sistema impossível (sem solução).");
            return null;
        } else if (indeterminado) {
            System.out.println("Sistema possível indeterminado (infinitas soluções).");

        } else {
            System.out.println("Sistema possível determinado (solução única).");
        }

        return res;
    }

    public void mostrarMatriz(double elements[][]) {
        if (elements == null) {
            return;
        }

        for (int i = 0; i < elements.length; i++) {
            for (int j = 0; j < elements[0].length; j++) {
                System.out.print(elements[i][j] + " ");
            }
            System.out.println();
        }
    }

    public void mostrarVector(double vector[]){
        if (vector==null){
            return;
        }
        for (int i=0; i<vector.length; i++){
            System.out.print(vector[i]);
            System.out.print(" ");
        }
    }

    public double[] times2(double[][] matrix, double[] vector) {


        if (vector.length != matrix[0].length) {
            System.out.println("Impossível: tamanho do vetor deve ser igual ao número de COLUNAS da matriz");
            return null;
        }

        double[] resultado = new double[matrix.length];

        for (int i = 0; i < matrix.length; i++) {
            double soma = 0;
            for (int j = 0; j < matrix[0].length; j++) {
                soma += matrix[i][j] * vector[j];
            }
            resultado[i] = soma;
        }

        return resultado;
    }


    // AV3


    public static double[] somarColunas(double[][] matriz) {
        int colunas = matriz[0].length;
        int linhas = matriz.length;

        double[] resultado = new double[colunas];

        for (int j = 0; j < colunas; j++) {
            double soma = 0;

            for (int i = 0; i < linhas; i++) {
                soma += matriz[i][j];
            }

            resultado[j] = soma;
        }

        return resultado;
    }

    public double norma(double[] valor) {
        double soma = 0;
        for (int i = 0; i < valor.length; i++) {
            soma += valor[i] * valor[i];
        }
        return Math.sqrt(soma);
    }


    public double[] dividirVetor(double[] vetor, double escalar) {
        double[] r = new double[vetor.length];
        for (int i = 0; i < vetor.length; i++) {
            r[i] = vetor[i] / escalar;
        }
        return r;
    }

    public void ordemDecrescente(double[] v) {
        for (int i = 0; i < v.length - 1; i++) {
            int posMaior = i;
            for (int j = i + 1; j < v.length; j++) {
                if (v[j] > v[posMaior]) {
                    posMaior = j;
                }
            }
            double temp = v[i];
            v[i] = v[posMaior];
            v[posMaior] = temp;
        }
    }

    public double[] operacao(double[][] A) {
        double TOL = 0.0001;
        int n = A.length;
        int iteracoes = 0;

        double[] a0 = somarColunas(A);


        double[] hn;
        double[] an = new double[n];
        double erro = 1;


        while (erro > TOL) {


            double[] u = times2(A, a0);
            double r = norma(u);
            hn = dividirVetor(u, r);


            double[][] AT = transpose(A);
            double[] v = times2(AT, hn);
            double s = norma(v);
            an = dividirVetor(v, s);


            erro = 0;
            for (int i = 0; i < n; i++) {
                double diff = Math.abs(an[i] - a0[i]);
                if (diff > erro) erro = diff;
            }


            for (int i = 0; i < n; i++) {
                a0[i] = an[i];
            }

            iteracoes++;




            if (erro <= TOL) {

                break;
            }
        }

        System.out.println("Quantidade de Iterações: " + iteracoes);
        return an;
    }


    public void printVet(double[] v) {
        for (int i = 0; i < v.length; i++) {
            System.out.printf("%.6f\n", v[i]);
        }
        System.out.println();
    }


}









