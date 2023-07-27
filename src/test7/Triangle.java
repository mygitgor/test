package test7;

public class Triangle {
    private double sideA;
    private double sideB;
    private double sideC;

    public Triangle(double sideA, double sideB, double sideC){
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
    }

    public double getSideA(){
        return sideA;
    }

    public double getSideB(){
        return sideB;
    }

    public double getSideC(){
        return sideC;
    }

    public double calculateArea(){
        double semiPerimeter = calculatePerimeter() / 2.0;
        return Math.sqrt(semiPerimeter *(semiPerimeter - sideA)*(semiPerimeter - sideB)*(semiPerimeter - sideC));
    }

    public double calculatePerimeter(){
        return sideA + sideB + sideC;
    }

    public Point calculateMedianIntersectionPoint(){
        double centerX = (getVertexA().getX() +getVertexB().getX()+ getVertexC().getX()) /3.0;
        double centerY = (getVertexA().getY() +getVertexB().getY()+ getVertexC().getY()) /3.0;
        return new Point(centerX, centerY);
    }

    private Point getVertexA(){
        return new Point (0,0);
    }

    private Point getVertexB(){
        return new Point(sideA,0);
    }

    private Point getVertexC(){
        double angle = Math.acos((sideA * sideA + sideC*sideC - sideB*sideB)/(2.0*sideA*sideC) );
        double x = sideA * Math.cos(angle);
        double y = sideA * Math.sin(angle);
        return new Point(x,y);
    }

    @Override
    public String toString(){
        return "Triangle [sideA=" + sideA + ", sideB=" + sideB + ", sideC=" + sideC + "]";
    }

    static class Point{

        private double x;
        private double y;

        public Point(double x, double y){
            this.x = x;
            this.y = y;
        }

        public double getX(){
            return x;
        }

        public double getY(){
            return y;
        }

        @Override
        public String toString(){
            return "Point x="+x+", y="+y;
        }
    }
}

class Test{
    public static void main(String[] args) {
        Triangle triangle = new Triangle(3, 3, 3);
        double area = triangle.calculateArea();
        double perimetr = triangle.calculatePerimeter();
        Triangle.Point median = triangle.calculateMedianIntersectionPoint();

        System.out.println("Triangle= "+triangle);
        System.out.println("area= "+area);
        System.out.println("perimetr= "+perimetr);
        System.out.println("median= "+median);
    }
}

