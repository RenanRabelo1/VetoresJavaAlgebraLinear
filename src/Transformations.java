public class Transformations {

    // ========== VECTOR METHODS ==========

    public Vector translate2D(Vector vector, double dx, double dy) {
        LinearAlgebra linearAlgebra = new LinearAlgebra();
        double[][] v = {
                {vector.getValor(1)},
                {vector.getValor(2)},
                {1}
        };

        double[][] T = {
                {1, 0, dx},
                {0, 1, dy},
                {0, 0, 1}
        };

        double[][] resultado = linearAlgebra.dot(T, v);

        double[] novosElementos = {resultado[0][0], resultado[1][0]};
        return new Vector(2, novosElementos);
    }

    public Vector translate3D(Vector vector, double dx, double dy, double dz) {
        LinearAlgebra linearAlgebra = new LinearAlgebra();
        double[][] v = {
                {vector.getValor(1)},
                {vector.getValor(2)},
                {vector.getValor(3)},
                {1}
        };

        double[][] T = {
                {1, 0, 0, dx},
                {0, 1, 0, dy},
                {0, 0, 1, dz},
                {0, 0, 0, 1}
        };

        double[][] resultado = linearAlgebra.dot(T, v);

        double[] novosElementos = {resultado[0][0], resultado[1][0], resultado[2][0]};
        return new Vector(3, novosElementos);
    }

    public Vector reflection2DX(Vector vector) {
        LinearAlgebra linearAlgebra = new LinearAlgebra();
        double[][] v = {
                {vector.getValor(1)},
                {vector.getValor(2)},
                {1}
        };

        double[][] R = {
                {1, 0, 0},
                {0, -1, 0},
                {0, 0, 1}
        };

        double[][] resultado = linearAlgebra.dot(R, v);

        double[] novosElementos = {resultado[0][0], resultado[1][0]};
        return new Vector(2, novosElementos);
    }

    public Vector reflection2DY(Vector vector) {
        LinearAlgebra linearAlgebra = new LinearAlgebra();
        double[][] v = {
                {vector.getValor(1)},
                {vector.getValor(2)},
                {1}
        };

        double[][] R = {
                {-1, 0, 0},
                {0, 1, 0},
                {0, 0, 1}
        };

        double[][] resultado = linearAlgebra.dot(R, v);
        double[] novosElementos = {resultado[0][0], resultado[1][0]};
        return new Vector(2, novosElementos);
    }

    public Vector reflection3DX(Vector vector) {
        LinearAlgebra linearAlgebra = new LinearAlgebra();
        double[][] v = {
                {vector.getValor(1)},
                {vector.getValor(2)},
                {vector.getValor(3)},
                {1}
        };

        double[][] R = {
                {1, 0, 0, 0},
                {0, -1, 0, 0},
                {0, 0, -1, 0},
                {0, 0, 0, 1}
        };

        double[][] resultado = linearAlgebra.dot(R, v);
        double[] novosElementos = {resultado[0][0], resultado[1][0], resultado[2][0]};
        return new Vector(3, novosElementos);
    }

    public Vector reflection3DY(Vector vector) {
        LinearAlgebra linearAlgebra = new LinearAlgebra();
        double[][] v = {
                {vector.getValor(1)},
                {vector.getValor(2)},
                {vector.getValor(3)},
                {1}
        };

        double[][] R = {
                {-1, 0, 0, 0},
                {0, 1, 0, 0},
                {0, 0, -1, 0},
                {0, 0, 0, 1}
        };

        double[][] resultado = linearAlgebra.dot(R, v);
        double[] novosElementos = {resultado[0][0], resultado[1][0], resultado[2][0]};
        return new Vector(3, novosElementos);
    }

    public Vector reflection3DZ(Vector vector) {
        LinearAlgebra linearAlgebra = new LinearAlgebra();
        double[][] v = {
                {vector.getValor(1)},
                {vector.getValor(2)},
                {vector.getValor(3)},
                {1}
        };

        double[][] R = {
                {-1, 0, 0, 0},
                {0, -1, 0, 0},
                {0, 0, 1, 0},
                {0, 0, 0, 1}
        };

        double[][] resultado = linearAlgebra.dot(R, v);
        double[] novosElementos = {resultado[0][0], resultado[1][0], resultado[2][0]};
        return new Vector(3, novosElementos);
    }

    // Rotations
    public Vector Rotation2D(Vector vector, double angle) {
        LinearAlgebra linearAlgebra = new LinearAlgebra();
        double[][] vector2 = {
                {vector.getValor(1)},
                {vector.getValor(2)},
                {1}
        };
        double[][] rotationMatrix = {
                {Math.cos(angle), -Math.sin(angle), 0},
                {Math.sin(angle), Math.cos(angle), 0},
                {0, 0, 1}
        };
        double[][] result = linearAlgebra.dot(rotationMatrix, vector2);

        double[] novosElementos = {result[0][0], result[1][0]};
        return new Vector(2, novosElementos);
    }

    public Vector Rotation3DX(Vector vector, double angle) {
        LinearAlgebra linearAlgebra = new LinearAlgebra();

        double[][] vector2 = {
                {vector.getValor(1)},
                {vector.getValor(2)},
                {vector.getValor(3)},
                {1}
        };

        double[][] rotationMatrix = {
                {1, 0, 0, 0},
                {0, Math.cos(angle), -Math.sin(angle), 0},
                {0, Math.sin(angle), Math.cos(angle), 0},
                {0, 0, 0, 1}
        };

        double[][] result = linearAlgebra.dot(rotationMatrix, vector2);

        double[] novosElementos = {result[0][0], result[1][0], result[2][0]};
        return new Vector(3, novosElementos);
    }

    public Vector Rotation3DY(Vector vector, double angle) {
        LinearAlgebra linearAlgebra = new LinearAlgebra();

        double[][] vector2 = {
                {vector.getValor(1)},
                {vector.getValor(2)},
                {vector.getValor(3)},
                {1}
        };

        double[][] rotationMatrix = {
                {Math.cos(angle), 0, Math.sin(angle), 0},
                {0, 1, 0, 0},
                {-Math.sin(angle), 0, Math.cos(angle), 0},
                {0, 0, 0, 1}
        };

        double[][] result = linearAlgebra.dot(rotationMatrix, vector2);

        double[] novosElementos = {result[0][0], result[1][0], result[2][0]};
        return new Vector(3, novosElementos);
    }

    public Vector Rotation3DZ(Vector vector, double angle) {
        LinearAlgebra linearAlgebra = new LinearAlgebra();

        double[][] vector2 = {
                {vector.getValor(1)},
                {vector.getValor(2)},
                {vector.getValor(3)},
                {1}
        };

        double[][] rotationMatrix = {
                {Math.cos(angle), -Math.sin(angle), 0, 0},
                {Math.sin(angle), Math.cos(angle), 0, 0},
                {0, 0, 1, 0},
                {0, 0, 0, 1}
        };

        double[][] result = linearAlgebra.dot(rotationMatrix, vector2);

        double[] novosElementos = {result[0][0], result[1][0], result[2][0]};
        return new Vector(3, novosElementos);
    }

    // Projections
    public Vector Projection2DX(Vector vector) {
        LinearAlgebra linearAlgebra = new LinearAlgebra();

        double[][] vector2 = {
                {vector.getValor(1)},
                {vector.getValor(2)},
                {1}
        };

        double[][] projectionMatrix = {
                {1, 0, 0},
                {0, 0, 0},
                {0, 0, 1}
        };

        double[][] result = linearAlgebra.dot(projectionMatrix, vector2);

        double[] novosElementos = {result[0][0], result[1][0]};
        return new Vector(2, novosElementos);
    }

    public Vector Projection2DY(Vector vector) {
        LinearAlgebra linearAlgebra = new LinearAlgebra();

        double[][] vector2 = {
                {vector.getValor(1)},
                {vector.getValor(2)},
                {1}
        };

        double[][] projectionMatrix = {
                {0, 0, 0},
                {0, 1, 0},
                {0, 0, 1}
        };

        double[][] result = linearAlgebra.dot(projectionMatrix, vector2);

        double[] novosElementos = {result[0][0], result[1][0]};
        return new Vector(2, novosElementos);
    }

    public Vector Projection3DX(Vector vector) {
        LinearAlgebra linearAlgebra = new LinearAlgebra();
        double[][] vector2 = {
                {vector.getValor(1)},
                {vector.getValor(2)},
                {vector.getValor(3)},
                {1}
        };

        double[][] projectionMatrix = {
                {1, 0, 0, 0},
                {0, 0, 0, 0},
                {0, 0, 0, 0},
                {0, 0, 0, 1}
        };

        double[][] result = linearAlgebra.dot(projectionMatrix, vector2);

        double[] novosElementos = {result[0][0], result[1][0], result[2][0]};
        return new Vector(3, novosElementos);
    }

    public Vector Projection3DY(Vector vector) {
        LinearAlgebra linearAlgebra = new LinearAlgebra();
        double[][] vector2 = {
                {vector.getValor(1)},
                {vector.getValor(2)},
                {vector.getValor(3)},
                {1}
        };

        double[][] projectionMatrix = {
                {0, 0, 0, 0},
                {0, 1, 0, 0},
                {0, 0, 0, 0},
                {0, 0, 0, 1}
        };

        double[][] result = linearAlgebra.dot(projectionMatrix, vector2);

        double[] novosElementos = {result[0][0], result[1][0], result[2][0]};
        return new Vector(3, novosElementos);
    }

    public Vector Projection3DZ(Vector vector) {
        LinearAlgebra linearAlgebra = new LinearAlgebra();
        double[][] vector2 = {
                {vector.getValor(1)},
                {vector.getValor(2)},
                {vector.getValor(3)},
                {1}
        };

        double[][] projectionMatrix = {
                {0, 0, 0, 0},
                {0, 0, 0, 0},
                {0, 0, 1, 0},
                {0, 0, 0, 1}
        };

        double[][] result = linearAlgebra.dot(projectionMatrix, vector2);

        double[] novosElementos = {result[0][0], result[1][0], result[2][0]};
        return new Vector(3, novosElementos);
    }

    public Vector Shearing(Vector vector, double kx, double ky) {
        LinearAlgebra linearAlgebra = new LinearAlgebra();

        double[][] vector2 = {
                {vector.getValor(1)},
                {vector.getValor(2)},
                {1}
        };

        double[][] shearingMatrix = {
                {1, kx, 0},
                {ky, 1, 0},
                {0, 0, 1}
        };

        double[][] result = linearAlgebra.dot(shearingMatrix, vector2);

        double[] novosElementos = {result[0][0], result[1][0]};
        return new Vector(2, novosElementos);
    }


}