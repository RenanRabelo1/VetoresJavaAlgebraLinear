public class Transformations {
    // Rotations
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

    public double[][] Projection2DX(double[][] vector) {
        LinearAlgebra linearAlgebra = new LinearAlgebra();

        //Recebe o vector
        double [][] vector2 = {
                {vector[0][0]},
                {vector[1][0]},
                {1}
        };

        //Multiplica para uma matriz 3x3 no qual [x, y, 1] vira [x, 0, 1]
        double[][] projectionMatrix = {
                {1, 0, 0},
                {0, 0, 0},
                {0, 0, 1}
        };

        double[][]result = linearAlgebra.dot(projectionMatrix, vector2);
        //Retorna o resultado
        double[][] vector3 = {
                {result[0][0]},
                {result[1][0]},
        };
        return vector3;

    }
// Projections
    public double [][] Projection2DY(double[][] vector) {
        LinearAlgebra linearAlgebra = new LinearAlgebra();

        double [][] vector2 = {
                {vector[0][0]},
                {vector[1][0]},
                {1}
        };

        //Multiplica para uma matriz 3x3 no qual [x, y, 1] vira [0, y, 1]
        double[][] projectionMatrix = {
                {0, 0, 0},
                {0, 1, 0},
                {0, 0, 1}
        };

        double[][]result = linearAlgebra.dot(projectionMatrix, vector2);

        double[][] vector3 = {
                {result[0][0]},
                {result[1][0]},
        };

        return vector3;
    }

    public double [][]  Projection3DX(double[][] vector) {
        LinearAlgebra linearAlgebra = new LinearAlgebra();
        double [][] vector2 = {
                {vector[0][0]},
                {vector[1][0]},
                {vector[2][0]},
                {1}
        };

        double[][] projectionMatrix = {
                {1, 0, 0, 0},
                {0, 0, 0, 0},
                {0, 0, 0, 0},
                {0, 0, 0, 1}
        };

        double[][]result = linearAlgebra.dot(projectionMatrix, vector2);

        double[][] vector3 = {
                {result[0][0]},
                {result[1][0]},
                {result[2][0]},
        };
        return vector3;
    }
    public double [][]  Projection3DY(double[][] vector) {
        LinearAlgebra linearAlgebra = new LinearAlgebra();
        double [][] vector2 = {
                {vector[0][0]},
                {vector[1][0]},
                {vector[2][0]},
                {1}
        };

        double[][] projectionMatrix = {
                {0, 0, 0, 0},
                {0, 1, 0, 0},
                {0, 0, 0, 0},
                {0, 0, 0, 1}
        };

        double[][]result = linearAlgebra.dot(projectionMatrix, vector2);

        double[][] vector3 = {
                {result[0][0]},
                {result[1][0]},
                {result[2][0]},
        };
        return vector3;
    }
    public double [][]  Projection3DZ(double[][] vector) {
        LinearAlgebra linearAlgebra = new LinearAlgebra();
        double [][] vector2 = {
                {vector[0][0]},
                {vector[1][0]},
                {vector[2][0]},
                {1}
        };

        double[][] projectionMatrix = {
                {0, 0, 0, 0},
                {0, 0, 0, 0},
                {0, 0, 1, 0},
                {0, 0, 0, 1}
        };

        double[][]result = linearAlgebra.dot(projectionMatrix, vector2);

        double[][] vector3 = {
                {result[0][0]},
                {result[1][0]},
                {result[2][0]},
        };
        return vector3;
    }

    public double[][] Shearing(double[][] vector, double kx, double ky) {
        LinearAlgebra linearAlgebra = new LinearAlgebra();

        // Converter o vetor para coordenadas homogêneas (3x1)
        double[][] vector2 = {
                {vector[0][0]},
                {vector[1][0]},
                {1}
        };

        // Matriz de cisalhamento 3x3
        double[][] shearingMatrix = {
                {1, kx, 0},
                {ky, 1, 0},
                {0, 0, 1}
        };

        // Aplicar o cisalhamento
        double[][] result = linearAlgebra.dot(shearingMatrix, vector2);

        // Converter de volta para coordenadas cartesianas (2x1)
        double[][] vector3 = {
                {result[0][0]},
                {result[1][0]}
        };

        return vector3;
    }
}
