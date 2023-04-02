public class TiposVariaveis {
    /**
     * int so pode numeros interiros numeros inteiros
     * float so pode numeros decimais ex: 2,0 = 2.0F
     * double pode digitar 200 saida 200.0
     * long numeros grandes
     */
    public static void main(String[] args) throws Exception {
        int  idade = 20;
        float numeroDecimal = 20.0F;
        double salario = 20000;
        long  numeroGrande= 20000000000L;

        /*
         * final utilizado para a variavel ser contanstante nunca ser alterada depois de atribuida. ja o nome da variavel
         * para esse tipo de utilização deve ser em caixa alta como mostradao abaixo. NUMERO_PI
         */
        final double NUMERO_PI = 3.14;

        System.out.println(idade);
        System.out.println(salario);
        System.out.println(numeroGrande);
        System.out.println(numeroDecimal);
        System.out.println(NUMERO_PI);
    }
}
