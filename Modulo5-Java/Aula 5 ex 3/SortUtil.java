package exercicio3;

import java.util.Comparator;

public class SortUtil<T> implements Precedente<T>{

    public void bubbleSort(T[] array, Comparator<T> c)
    {

        for(int i=0; i < array.length; i++){
            for(int j = i; j <array.length ;j++){
                if(c.compare(array[i], array[j]) >= 0){
                   T element = array[i];
                    array[i] =array[j];
                    array[j] = element;
                }
            }
        }
    }

    @Override
    public int precedeA(T t) {
        return 0;
    }

    @Override
    public void sort(T arr[], Comparator<T> c) {
        bubbleSort(arr,c);
    }

}
