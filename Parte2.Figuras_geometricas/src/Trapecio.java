public class Trapecio {
    int altura;
    int baseMayor;
    int baseMenor;

    Trapecio(int basemayor, int basemenor, int altura){
        this.altura=altura;
        this.baseMayor = basemayor;
        this.baseMenor = basemenor;
    }
    double calcularArea(){
        return (baseMayor + baseMenor)/2*altura;
    }
    double calcularPerimetro(){
        return (baseMayor + baseMenor +(determinarHipotenusa())+(determinarHipotenusa()));
    }
    double determinarHipotenusa(){
        return Math.pow(((baseMayor-baseMenor)/2)*((baseMayor-baseMenor)/2)+altura*altura, 0.5);
    }
}
