public class Ex_6 {


    public static void main(String[] args) {
        //Dado um vetor de 10 posições,
        // sendo respectivamente ocupado pelos valores 52, 10, 85, 1324, 01, 13, 62, 30, 12 e 127.

        Integer[] array =  {52, 10, 85, 1324, 01, 13, 62, 30, 12, 127};

        int cont = 0;

        System.out.println("ORDEM CRESCENTE");
        while(cont < array.length) {
            System.out.println(array[cont]);
            cont++;
        }

        System.out.println();

        System.out.println("ORDEM DECRESCENTE");
        for(int i=array.length-1; i>=0; i--){
            System.out.println(array[i]);
        }


    }
}
