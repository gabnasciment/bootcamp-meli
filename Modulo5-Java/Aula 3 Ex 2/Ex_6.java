public class Ex_6 {


    public static void main(String[] args) {
        //Dado um vetor de 10 posições,
        // sendo respectivamente ocupado pelos valores 52, 10, 85, 1324, 01, 13, 62, 30, 12 e 127.

        Integer[] array =  {52, 10, 85, 1324, 01, 13, 62, 30, 12, 127};

        System.out.println("Ordem crescente");

        for(int i = 0; i < array.length; i++){
            System.out.println(array[i]);
        }
        System.out.println();
        System.out.println("Ordem decrescente");

        for(int i = array.length-1; i >= 0; i--){
            System.out.println(array[i]);
        }

    }
}
