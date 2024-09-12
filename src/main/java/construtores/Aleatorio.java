package construtores;

import java.util.Random;

public class Aleatorio {

    int number;

    public Aleatorio(){
        number = new Random().nextInt(20);
    }

}
