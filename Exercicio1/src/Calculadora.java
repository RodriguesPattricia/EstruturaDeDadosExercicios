public class Calculadora {
    
    private double xa;
    private double ya;
    private double xb;
    private double yb;

    public Calculadora (double xa, double ya, double xb, double yb){
        this.xa = xa;
        this.ya = ya;
        this.xb = xb;
        this.yb = yb;
    }

    public double getXa(){return xa;}
    public void setXa(double xa){this.xa = xa;}

    public double getYa(){return ya;}
    public void setYa(double ya){this.ya = ya;}

    public double getXb(){return xb;}
    public void setXb(double xb){this.xb = xb;}

    public double getYb(){return yb;}
    public void setYb(double yb){this.yb = yb;}

    public double calculaDistancia(double xa, double ya, double xb, double yb){
        double distancia = Math.sqrt(Math.pow((xb - xa), 2) + Math.pow((yb - ya), 2));
        return distancia;
    }
}