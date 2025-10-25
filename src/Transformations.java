public class Transformations {
        public double[][] Rotation2D(double[][]vector, double angle) {
            LinearAlgebra linearAlgebra = new LinearAlgebra();
           double [][] vector2 = {
                    {vector[0][0]},
                    {vector[1][0]},
                    {1}
            };
            double[][] rotationMatrix = {
                    {Math.cos(angle), -Math.sin(angle), 0},
                    {Math.sin(angle), Math.cos(angle), 0},
                    {0, 0, 1}
            };
            double [][] result = linearAlgebra.dot(rotationMatrix, vector2);

            double[][] vector3 = {
                    {result[0][0]},
                    {result[1][0]}
            };
            return vector3;
        }
    public double[][] Rotation3DX(double[][] vector, double angle) {
        LinearAlgebra linearAlgebra = new LinearAlgebra();

        // Converter o vetor 3D para coordenadas homogêneas (4x1)
        double[][] vector2= {
                {vector[0][0]},
                {vector[1][0]},
                {vector[2][0]},
                {1}
        };

        // Matriz de rotação 4x4 em torno do eixo X
        double[][] rotationMatrix = {
                {1, 0, 0, 0},
                {0, Math.cos(angle), -Math.sin(angle), 0},
                {0, Math.sin(angle), Math.cos(angle), 0},
                {0, 0, 0, 1}
        };


        double[][] result = linearAlgebra.dot(rotationMatrix, vector2);


        double[][] vector3 = {
                {result[0][0]},
                {result[1][0]},
                {result[2][0]}
        };

        return vector3;
    }
    public double[][] Rotation3DY(double[][] vector, double angle) {
        LinearAlgebra linearAlgebra = new LinearAlgebra();


        double[][] vector2 = {
                {vector[0][0]},
                {vector[1][0]},
                {vector[2][0]},
                {1}
        };


        double[][] rotationMatrix = {
                {Math.cos(angle), 0, Math.sin(angle), 0},
                {0, 1, 0, 0},
                {-Math.sin(angle), 0, Math.cos(angle), 0},
                {0, 0, 0, 1}
        };

        double[][] result = linearAlgebra.dot(rotationMatrix, vector2);

        double[][] vector3 = {
                {result[0][0]},
                {result[1][0]},
                {result[2][0]}
        };

        return vector3;
    }
    public double[][] Rotation3DZ(double[][] vector, double angle) {
        LinearAlgebra linearAlgebra = new LinearAlgebra();


        double[][] vector2 = {
                {vector[0][0]},
                {vector[1][0]},
                {vector[2][0]},
                {1}
        };


        double[][] rotationMatrix = {
                {Math.cos(angle), -Math.sin(angle), 0, 0},
                {Math.sin(angle), Math.cos(angle), 0, 0},
                {0, 0, 1, 0},
                {0, 0, 0, 1}
        };

        double[][] result = linearAlgebra.dot(rotationMatrix, vector2);

        double[][] vector3 = {
                {result[0][0]},
                {result[1][0]},
                {result[2][0]}
        };
        return vector3;
    }
}




