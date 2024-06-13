public class InterfaceExample03 {
    // Implementar o Shape para as classes: Circulo, triangulo, retangulo, losangulo, quadrado.

    interface Shape {
        double area();
        double perimetro();
    }

    public static void mostrar(Shape shape) {
        System.out.println("Area: " + shape.area());
        System.out.println("Perimetro: " + shape.perimetro());
        System.out.println("\n");
    }

    public static class Quadrado implements Shape {
        double lado;

        @Override
        public double area() {
            return lado * lado;
        }

        @Override
        public double perimetro() {
            return 4 * lado;
        }
    }

    public static class Circulo implements Shape {
        double raio;

        @Override
        public double area() {
            return 3.14 * (raio * raio);
        }

        @Override
        public double perimetro() {
            return (2 * 3.14) * raio;
        }
    }

    public static class Triangulo implements Shape {
        double base;
        double altura;
        double lado1;
        double lado2;
        double lado3;

        @Override
        public double area() {
            return 0.5 * (base * altura);
        }

        @Override
        public double perimetro() {
            return lado1 + lado2 + lado3;
        }
    }

    public static class Retangulo implements Shape {
        double largura;
        double altura;

        @Override
        public double area() {
            return largura * altura;
        }

        @Override
        public double perimetro() {
            return 2 * (largura + altura);
        }
    }

    public static class Losango implements Shape {
        double lado1;
        double lado2;
        double lado3;
        double lado4;
        double diagonalMaior;
        double diagonalMenor;

        @Override
        public double area() {
            return (diagonalMaior * diagonalMenor) / 2;
        }

        @Override
        public double perimetro() {
            return lado1 + lado2 + lado3 + lado4;
        }
    }

    public static void main(String[] args) {
        Quadrado quadrado = new Quadrado();
        quadrado.lado = 10;

        Circulo circulo = new Circulo();
        circulo.raio = 5;

        Triangulo triangulo = new Triangulo();
        triangulo.base = 12;
        triangulo.altura = 5;
        triangulo.lado1 = 12;
        triangulo.lado2 = 6;
        triangulo.lado3 = 9;

        Retangulo retangulo = new Retangulo();
        retangulo.largura = 10;
        retangulo.altura = 20;

        Losango losango = new Losango();
        losango.diagonalMaior = 5;
        losango.diagonalMenor = 2;
        losango.lado1 = 2;
        losango.lado2 = 3;
        losango. lado3 = 4;
        losango.lado4 = 21;

        mostrar(quadrado);
        mostrar(circulo);
        mostrar(triangulo);
        mostrar(retangulo);
        mostrar(losango);
    }
}