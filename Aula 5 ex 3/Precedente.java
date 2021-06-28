package exercicio3;

import java.util.Comparator;

public interface Precedente<T> {

    public int precedeA (T t);

    public void sort(T arr[], Comparator<T> c);
}
