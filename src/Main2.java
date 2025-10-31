import java.sql.SQLOutput;

public class Main2 {
    public static void main(String[] args) {
        Transformations trans = new Transformations();
        //ROTAÇÃO 2D
        System.out.println("ROTAÇÃO 2D");
        double[][] vector = {{1}, {2}};
        double angleInRadians = Math.toRadians(90);
        double[][] result = trans.Rotation2D(vector, angleInRadians);
        System.out.println(result[0][0]);
        System.out.println(result[1][0]);
        System.out.println();


        //ROTAÇÃO 3DX
        System.out.println("ROTAÇÃO 3DX");
        double[][] vector2 = {{1}, {2}, {3}};
        double angleInRadians2 = Math.toRadians(90);
        double[][] result2 = trans.Rotation3DX(vector2, angleInRadians2);
        System.out.println(result2[0][0]);
        System.out.println(result2[1][0]);
        System.out.println(result2[2][0]);

        //ROTAÇÃO 3DY

        System.out.println("ROTAÇÃO 3DY");
        double[][] vector3 = {{1}, {2}, {3}};
        double angleInRadians3 = Math.toRadians(90);
        double[][] result3 = trans.Rotation3DY(vector3, angleInRadians3);
        System.out.println(result3[0][0]);
        System.out.println(result3[1][0]);
        System.out.println(result3[2][0]);

        //ROTAÇÃO 3DZ
        System.out.println("ROTAÇÃO 3DZ");
        double[][] vector4 = {{1}, {2}, {3}};
        double angleInRadians4 = Math.toRadians(90);
        double[][] result4 = trans.Rotation3DZ(vector4, angleInRadians4);
        System.out.println(result4[0][0]);
        System.out.println(result4[1][0]);
        System.out.println(result4[2][0]);

        // CISALHAMENTO 2D
        System.out.println("CISALHAMENTO 2D");
        double[][] vector5 = {{1}, {2}};
        double kx = 0.3;
        double kz = 0.5;
        double[][] result5 = trans.Shearing(vector5,kx,kz);
        System.out.println(result5[0][0]);
        System.out.println(result5[1][0]);

        // TRANSLAÇÃO 2D
        System.out.println("TRANSLAÇÃO 2D");
        double[] vector6 = {1,2};
        double dx = 0.3;
        double dy = 0.5;
        double[] result6 = trans.translate2D(vector6, dx, dy);
        System.out.println(result6[0]);
        System.out.println(result6[1]);

        // TRANSLAÇÃO 3D
        System.out.println("TRANSLAÇÃO 3D");
        double[] vector7 = {1,2,3};
        double dx1 = 0.3;
        double dy1 = 0.5;
        double dz1 = 0.6;
        double[] result7 = trans.translate3D(vector7, dx1, dy1,dz1);
        System.out.println(result7[0]);
        System.out.println(result7[1]);
        System.out.println(result7[2]);

        // REFLEXÃO 2D no eixo X
        System.out.println("REFLEXÃO 2DX");
        double[] vector8 = {1,2};
        double[] result8 = trans.reflection2DX(vector8);
        System.out.println(result8[0]);
        System.out.println(result8[1]);

        // REFLEXÃO 2D no eixo Y
        System.out.println("REFLEXÃO 2DY");
        double[] vector9 = {1,2};
        double[] result9 = trans.reflection2DY(vector9);
        System.out.println(result9[0]);
        System.out.println(result9[1]);
        // REFLEXÃO 3D no eixo X

        System.out.println("REFLEXÃO 3DX");
        double[] vector10 = {1,2,3};
        double[] result10 = trans.reflection3DX(vector10);
        System.out.println(result10[0]);
        System.out.println(result10[1]);
        System.out.println(result10[2]);

        // REFLEXÃO 3D no eixo Y

        System.out.println("REFLEXÃO 3DY");
        double[] vector11 = {1,2,3};
        double[] result11 = trans.reflection3DY(vector11);
        System.out.println(result11[0]);
        System.out.println(result11[1]);
        System.out.println(result11[2]);

        // REFLEXÃO 3D no eixo Z

        System.out.println("REFLEXÃO 3DZ");
        double[] vector12 = {1,2,3};
        double[] result12 = trans.reflection3DZ(vector12);
        System.out.println(result12[0]);
        System.out.println(result12[1]);
        System.out.println(result12[2]);

        // PROJEÇÃO 2D no eixo X
        System.out.println("PROJEÇÃO 2DX");
        double[][] vector13 = {{1}, {2}};
        double[][] result13 = trans.Projection2DX(vector13);
        System.out.println(result13[0][0]);
        System.out.println(result13[1][0]);

        // PROJEÇÃO 2D no eixo Y
        System.out.println("PROJEÇÃO 2DY");
        double[][] vector14 = {{1}, {2}};
        double[][] result14 = trans.Projection2DY(vector14);
        System.out.println(result14[0][0]);
        System.out.println(result14[1][0]);

        // PROJEÇÃO 3D no eixo X
        System.out.println("PROJEÇÃO 3DX");
        double[][] vector15 = {{1}, {2}, {3}};
        double[][] result15 = trans.Projection3DX(vector15);
        System.out.println(result15[0][0]);
        System.out.println(result15[1][0]);
        System.out.println(result15[2][0]);

        // PROJEÇÃO 3D no eixo Y
        System.out.println("PROJEÇÃO 3DY");
        double[][] vector16 = {{1}, {2}, {3}};
        double[][] result16 = trans.Projection3DY(vector16);
        System.out.println(result16[0][0]);
        System.out.println(result16[1][0]);
        System.out.println(result16[2][0]);

        // PROJEÇÃO 3D no eixo Z
        System.out.println("PROJEÇÃO 3DZ");
        double[][] vector17 = {{1}, {2}, {3}};
        double[][] result17 = trans.Projection3DZ(vector17);
        System.out.println(result17[0][0]);
        System.out.println(result17[1][0]);
        System.out.println(result17[2][0]);

    }
}
