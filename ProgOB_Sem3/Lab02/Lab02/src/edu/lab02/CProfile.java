package edu.lab02;

public class CProfile {
    private double A;
    private double B;
    private double G;
    private double R;
    private double R1;
    private final static String Standard = "PN-EN 10056-1:2000";
    private String Name;
    double area(){
        return (A*G)+G*(B-G)+(1-Math.PI/4)*((R*R)-2*(R1*R1));
    }
    public static String getStandard(){
        return Standard;
    }
    public final Boolean assignData(String Name, Double A, Double B, Double G, Double R, Double R1){
        this.Name = Name;
        this.A = A;
        this.B = B;
        this.G = G;
        this.R = R;
        this.R1 = R1;
        return A > 0 && B > 0 && G > 0 && R > 0 && R1 > 0;
    }

    public CProfile(String name,double a, double b, double g, double r, double r1) {
        Name = name;
        A = a;
        B = b;
        G = g;
        R = r;
        R1 = r1;
        assignData(Name, A, B, G, R, R1);
    }

    public CProfile() {
        assignData("none",50.,50.,5.,7.,3.5);
    }

    Double getResult(){
        return area();
    }

    String getResult(Integer prec){
        return (Name + " A: " + A + " B: " + B + " G: " + G + " R: " + R + " R1: " + R1 + " " + String.format("%."+prec.toString()+"f",area()));
    }
}
