public class Ex_7 {
    public static void main(String[] args) {
        // Em 2021 uma startup de tecnologia, denominada de “Empresa X” é avaliada em 1,13 milhão e
        // possui uma média de crescimento anual de 148%, uma concorrente do ramo, “Empresa Y”,
        // é avaliada em 18,4 milhões e com sua média de crescimento anual em 32%.

        //Considerando este cenário, imprima no console (conforme formatação acima) a
        // evolução anual até que a empresa X ultrapasse a empresa Y em seu valor de empresa.


        double valorEmpresaX = 1.13;
        double percentualX = 1.48;

        double valorEmpresaY = 18.4;
        double percentualY = 0.32;

        int ano = 2021;

        System.out.println("Empresa X - 01/01"+ano+ " - Valor da empresa X: "+ valorEmpresaX);
        System.out.println("Empresa Y - 01/01"+ano+ " - Valor da empresa Y: "+ valorEmpresaY);


        while(valorEmpresaX <= valorEmpresaY){
            valorEmpresaX = valorEmpresaX + (valorEmpresaX * percentualX);
            valorEmpresaY = valorEmpresaY + (valorEmpresaY * percentualY);

            ano+=1;

        }
        System.out.println();
        System.out.println("Empresa X - " +ano+ " - Valor da empresa X: "+ valorEmpresaX);
        System.out.println("Empresa Y - " +ano+ " - Valor da empresa Y: "+ valorEmpresaY);

    }
}
