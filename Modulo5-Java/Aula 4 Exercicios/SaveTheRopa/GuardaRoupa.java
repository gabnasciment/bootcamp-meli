package SaveTheRopa;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GuardaRoupa {
    private Map<Integer, List<Vestuario>> guardaRoupa;
    private static int id = 1;

    public GuardaRoupa(){
        this.guardaRoupa = new HashMap< Integer,List<Vestuario>>();
    }

    public GuardaRoupa(Map<Integer, List<Vestuario>> guardaRoupa) {
        this.guardaRoupa = guardaRoupa;
    }

    public Integer guardarVestuarios(List<Vestuario> listaDeVestuario){
        this.guardaRoupa.put(id,listaDeVestuario);
        return id++;
    }

    public void mostrarVestuarios(){
        for (Map.Entry<Integer, List<Vestuario>> entry : guardaRoupa.entrySet()) {
            Integer identificador = entry.getKey();
            List<Vestuario> listaVestuario = entry.getValue();

            System.out.println("Vestuario: "+ identificador);
            System.out.println("Roupas");
            listaVestuario.forEach(l -> System.out.println("\t" + l));
        }
    }

    public List<Vestuario> devolverVestuarios (Integer id) throws RuntimeException{
        if(!guardaRoupa.containsKey(id)){
            throw new RuntimeException("Não existe uma lista de vestiario com o id informado!");
        }
        return guardaRoupa.remove(id);
    }

    @Override
    public String toString() {
        return "GuardaRoupa{" +
                "guardaRoupa=" + guardaRoupa +
                '}';
    }
}

