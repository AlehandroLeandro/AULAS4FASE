package aula2.exemplosmetodos;

public class MainsSobrecarga {

    public static void main(String[] args) {
        int n1 = 10;
        int n2 = 20;
        double n3= 5.5;
        double n4 = 10.3;

        SobreCarga calc = new SobreCarga();
//diferentes atributos podem ser usados em um metodo com o mesmo nome, isso é a sobre carga
        System.out.println(calc.somar(n1,n2));
        System.out.println(calc.somar(n1,n3));
        System.out.println(calc.somar(n2,n4));
        System.out.println(calc.somar(n3,n4));



    }
}
