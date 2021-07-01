package SaveTheRopa;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        GuardaRoupa guarda = new GuardaRoupa();

        List<Vestuario> roupas = Arrays.asList(
                new Vestuario("Nike","camisa"),
                new Vestuario("Adidas","tenis")
        );

        List<Vestuario> roupas2 = Arrays.asList(
                new Vestuario("Puma", "short"),
                new Vestuario("Lacoste","bone" )
        );

        Integer id = guarda.guardarVestuarios(roupas);
        guarda.mostrarVestuarios();

        Integer id2 = guarda.guardarVestuarios(roupas2);
        guarda.mostrarVestuarios();

        roupas2 = guarda.devolverVestuarios(id2);
        guarda.devolverVestuarios(id);





    }
}
