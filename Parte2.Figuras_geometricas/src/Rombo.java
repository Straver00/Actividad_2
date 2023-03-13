public class Rombo {
    int lado;
    int diagonalMayor;
    int diagonalMenor;

    Rombo(int lado, int diagonalMenor, int diagonalMayor){
        this.lado=lado;
        this.diagonalMayor = diagonalMayor;
        this.diagonalMenor = diagonalMenor;
    }
    double calcularArea(){
        return diagonalMenor *diagonalMayor/2;
    }
    double calcularPerimetro(){
        return lado*4;
    }
}
