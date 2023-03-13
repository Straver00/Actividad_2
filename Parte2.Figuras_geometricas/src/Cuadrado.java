public class Cuadrado {
    int lado;

    Cuadrado(int lado){
        this.lado =lado;
    }

    double calcularArea(){
        return lado*lado;

    }

    double calcularPerimetro(){
        return (lado*4);
    }
}
