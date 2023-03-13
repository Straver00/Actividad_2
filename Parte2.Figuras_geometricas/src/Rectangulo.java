public class Rectangulo {
    int base;
    int altura;

    Rectangulo(int base, int altura){
        this.base=base;
        this.altura =altura;
    }
    double calcularArea(){
        return base*altura;
    }
    double calcularPerimetro(){
        return (base*2)+(altura*2);
    }
}
