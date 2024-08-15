public class Pessoa {
    String nome;
    double altura;
    double peso;
    char sexo;
    double IMC;


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    public double getIMC() {
        return IMC;
    }

    public void setIMC() {
       IMC = calcularIMC();
    }

    public double calcularIMC() {
        return peso / (altura*altura);
    }

    public String toString(){
        return "Nome: " + getNome() + "\n" +
                "Altura: " + getAltura() + "\n" +
                "Peso: " + getPeso() + "\n" +
                "Sexo: " + getSexo() + "\n" +
                "Imc: " + String.format("%.2f", calcularIMC());

    }


}







