public class Main2 {
    public static void main(String[] args) {
        Transformations trans = new Transformations();

        //ROTAÇÃO 2D
        System.out.println("ROTAÇÃO 2D");
        Vector vector = new Vector(2, new double[]{1, 2});
        double angleInRadians = Math.toRadians(90);
        Vector result = trans.Rotation2D(vector, angleInRadians);
        result.mostrarVector();
        System.out.println();

        //ROTAÇÃO 3DX
        System.out.println("ROTAÇÃO 3DX");
        Vector vector2 = new Vector(3, new double[]{1, 2, 3});
        double angleInRadians2 = Math.toRadians(90);
        Vector result2 = trans.Rotation3DX(vector2, angleInRadians2);
        result2.mostrarVector();
        System.out.println();

        //ROTAÇÃO 3DY
        System.out.println("ROTAÇÃO 3DY");
        Vector vector3 = new Vector(3, new double[]{1, 2, 3});
        double angleInRadians3 = Math.toRadians(90);
        Vector result3 = trans.Rotation3DY(vector3, angleInRadians3);
        result3.mostrarVector();
        System.out.println();

        //ROTAÇÃO 3DZ
        System.out.println("ROTAÇÃO 3DZ");
        Vector vector4 = new Vector(3, new double[]{1, 2, 3});
        double angleInRadians4 = Math.toRadians(90);
        Vector result4 = trans.Rotation3DZ(vector4, angleInRadians4);
        result4.mostrarVector();
        System.out.println();

        // CISALHAMENTO 2D
        System.out.println("CISALHAMENTO 2D");
        Vector vector5 = new Vector(2, new double[]{1, 2});
        double kx = 0.3;
        double kz = 0.5;
        Vector result5 = trans.Shearing(vector5, kx, kz);
        result5.mostrarVector();
        System.out.println();

        // TRANSLAÇÃO 2D
        System.out.println("TRANSLAÇÃO 2D");
        Vector vector6 = new Vector(2, new double[]{1, 2});
        double dx = 0.3;
        double dy = 0.5;
        Vector result6 = trans.translate2D(vector6, dx, dy);
        result6.mostrarVector();
        System.out.println();

        // TRANSLAÇÃO 3D
        System.out.println("TRANSLAÇÃO 3D");
        Vector vector7 = new Vector(3, new double[]{1, 2, 3});
        double dx1 = 0.3;
        double dy1 = 0.5;
        double dz1 = 0.6;
        Vector result7 = trans.translate3D(vector7, dx1, dy1, dz1);
        result7.mostrarVector();
        System.out.println();

        // REFLEXÃO 2D no eixo X
        System.out.println("REFLEXÃO 2DX");
        Vector vector8 = new Vector(2, new double[]{1, 2});
        Vector result8 = trans.reflection2DX(vector8);
        result8.mostrarVector();
        System.out.println();

        // REFLEXÃO 2D no eixo Y
        System.out.println("REFLEXÃO 2DY");
        Vector vector9 = new Vector(2, new double[]{1, 2});
        Vector result9 = trans.reflection2DY(vector9);
        result9.mostrarVector();
        System.out.println();

        // REFLEXÃO 3D no eixo X
        System.out.println("REFLEXÃO 3DX");
        Vector vector10 = new Vector(3, new double[]{1, 2, 3});
        Vector result10 = trans.reflection3DX(vector10);
        result10.mostrarVector();
        System.out.println();

        // REFLEXÃO 3D no eixo Y
        System.out.println("REFLEXÃO 3DY");
        Vector vector11 = new Vector(3, new double[]{1, 2, 3});
        Vector result11 = trans.reflection3DY(vector11);
        result11.mostrarVector();
        System.out.println();

        // REFLEXÃO 3D no eixo Z
        System.out.println("REFLEXÃO 3DZ");
        Vector vector12 = new Vector(3, new double[]{1, 2, 3});
        Vector result12 = trans.reflection3DZ(vector12);
        result12.mostrarVector();
        System.out.println();

        // PROJEÇÃO 2D no eixo X
        System.out.println("PROJEÇÃO 2DX");
        Vector vector13 = new Vector(2, new double[]{1, 2});
        Vector result13 = trans.Projection2DX(vector13);
        result13.mostrarVector();
        System.out.println();

        // PROJEÇÃO 2D no eixo Y
        System.out.println("PROJEÇÃO 2DY");
        Vector vector14 = new Vector(2, new double[]{1, 2});
        Vector result14 = trans.Projection2DY(vector14);
        result14.mostrarVector();
        System.out.println();

        // PROJEÇÃO 3D no eixo X
        System.out.println("PROJEÇÃO 3DX");
        Vector vector15 = new Vector(3, new double[]{1, 2, 3});
        Vector result15 = trans.Projection3DX(vector15);
        result15.mostrarVector();
        System.out.println();

        // PROJEÇÃO 3D no eixo Y
        System.out.println("PROJEÇÃO 3DY");
        Vector vector16 = new Vector(3, new double[]{1, 2, 3});
        Vector result16 = trans.Projection3DY(vector16);
        result16.mostrarVector();
        System.out.println();

        // PROJEÇÃO 3D no eixo Z
        System.out.println("PROJEÇÃO 3DZ");
        Vector vector17 = new Vector(3, new double[]{1, 2, 3});
        Vector result17 = trans.Projection3DZ(vector17);
        result17.mostrarVector();
        System.out.println();
    }
}