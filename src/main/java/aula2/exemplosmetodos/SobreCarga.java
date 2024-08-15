package aula2.exemplosmetodos;

public class SobreCarga {

    //metodos não podem ter a mesma assinatura(nome+atributo)
    /*int somar(int a, int b) {
        return a+b;
    }
    double somar(int a, int b){
        return a+b;
    }
     */
    int somar(int a, int b) {
        return a+b;
    }
    double somar(double a, int b){
        return a+b;
    }
    double somar(int a, double b){
        return a+b;
    }
    double somar(double a, double b){
        return a+b;
    }

}
