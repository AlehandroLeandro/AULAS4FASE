package heranca.exemplo;

public class TesteHeranca {
    public static void main(String[] args) {

        Pessoa p = new Pessoa();
        p.setNome("Pessoa1");
        p.setIdade(10);

        System.out.println(p);

        Medico m = new Medico();
        m.setNome("Medico1");
        m.setIdade(20);
        m.setCrm(123456);

        System.out.println(m);

        Pediatra pd = new Pediatra();
        pd.setNome("Pediatra1");
        pd.setIdade(80);
        pd.setCrm(123457);
        pd.setIdadeMax(14);
        System.out.println(pd);

        Cardiologista c = new Cardiologista();
        c.setNome("Cardiologista1");
        c.setIdade(46);
        c.setCrm(124588);
        System.out.println(c);
    }
}
