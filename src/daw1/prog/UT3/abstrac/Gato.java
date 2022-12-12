package daw1.prog.UT3.abstrac;

public class Gato extends Animal{
    final static Integer NUMPATA=4;
    @Override
    Integer getNumPata() {
        return NUMPATA;
    }

    Boolean esMamifero(){
        return mamifero;
    }
}
