public class Operadores {
    public static void main(String[] args) {
      //Operador Unário  
      int numero = 10;  
      System.out.println(numero++); // 10 (11)  
      System.out.println(++numero); // 12  
      System.out.println(numero--); // 12 (11)  
      System.out.println(--numero); // 10  
      System.out.println("\n==========================================================================");

      //operadore Unário ex: 2
      int numeroDois = 10;  
      int numeroTres = 10;  
      System.out.println (numeroDois++ + ++numeroDois); // 10 + 12 = 22  
      System.out.println (numeroTres++ + numeroTres++); // 10 + 11 = 21 
      System.out.println("\n============================================================================");

      //Operadore unário com ~
      int numeroQuatro = 10;  
      int numeroCinco = -10;  
      boolean numeroSeis = true;  
      boolean numeroSete = false;  
      System.out.println (~numeroQuatro); // - 11 (Inverte o sinal e subtrai com 1)  
      System.out.println (~numeroCinco); // 9 (Inverte o sinal e subtrai com 1)  
      System.out.println (!numeroSeis); // false (oposto ao valor booleano)  
      System.out.println (!numeroSete); // true
      System.out.println("\n============================================================================"); 
      //Operadores Aritméticos
      int numeroOito =10;  
      int numeroNove = 5;  
      System.out.println (numeroOito + numeroNove); // 15  
      System.out.println (numeroOito - numeroNove); // 5  
      System.out.println (numeroOito * numeroNove); // 50  
      System.out.println (numeroOito / numeroNove); // 2  
      System.out.println (numeroOito % numeroNove); // 0 
      System.out.println("\n=================================================================================");
      //Operador Ternário
      int numeroDez = 2;  
      int numeroOnze = 5;  
      int min = (numeroDez < numeroOnze) ? numeroDez : numeroOnze;  
      System.out.println(min);  
      System.out.println("======================================================================================");
      //Operador Lógico OR "OU" so precisa atender apenas uma das condições. apenas uma tem que ser verdadeira.
      int numeroDoze = 10;  
      int numeroTreze = 5;  
      int numeroQuatorze = 20;  
      System.out.println(numeroDoze > numeroTreze || numeroDoze < numeroQuatorze); // true || true = true   
      System.out.println(numeroDoze < numeroTreze || numeroDoze < numeroQuatorze); 
    }
     
}
