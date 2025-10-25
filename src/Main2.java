import java.sql.SQLOutput;

public class Main2 {
    public static void main(String[] args) {
        //ROTAÇÃO 2D
        System.out.println("ROTAÇÃO 2D");
        Transformations trans = new Transformations();
        double[][] vector = {{1}, {2}};
        double angleInRadians = Math.toRadians(90);
        double[][] result = trans.Rotation2D(vector, angleInRadians);
        System.out.println(result[0][0]);
        System.out.println(result[1][0]);
        System.out.println();


        //ROTAÇÃO 3DX
        System.out.println("ROTAÇÃO 3DX");
        Transformations transs = new Transformations();
        double[][] vector2 = {{1}, {2}, {3}};
        double angleInRadians2 = Math.toRadians(90);
        double[][] result2 = trans.Rotation3DX(vector2, angleInRadians2);
        System.out.println(result2[0][0]);
        System.out.println(result2[1][0]);
        System.out.println(result2[2][0]);

        //ROTAÇÃO 3DY

        System.out.println("ROTAÇÃO 3DY");
        Transformations transss = new Transformations();
        double[][] vector3 = {{1}, {2}, {3}};
        double angleInRadians3 = Math.toRadians(90);
        double[][] result3 = trans.Rotation3DY(vector3, angleInRadians3);
        System.out.println(result3[0][0]);
        System.out.println(result3[1][0]);
        System.out.println(result3[2][0]);

        //ROTAÇÃO 3DZ
        System.out.println("ROTAÇÃO 3DZ");
        Transformations transsss = new Transformations();
        double[][] vector4 = {{1}, {2}, {3}};
        double angleInRadians4 = Math.toRadians(90);
        double[][] result4 = trans.Rotation3DZ(vector4, angleInRadians4);
        System.out.println(result4[0][0]);
        System.out.println(result4[1][0]);
        System.out.println(result4[2][0]);
    }
}