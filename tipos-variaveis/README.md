# Tipos e Variáveis

Em Java, nós temos **8 tipos primitivos**:

 1. - byte
2. -  short
3. -   int
4. -   long
5. -   boolean
6. -   char
7. -   float
8. -   double

# Podemos dividir os tipos em dois grandes grupos

O  **tipo boolean**  só recebe dois valores:

-   **true**  = **verdadeiro**
-   **false** = **falso**

Dentro dos  **tipos numéricos**, temos duas subdvisões:

-   **Tipos integrais**
-   **Tipos de ponto flutuante**

Os  **tipos numéricos integrais**  são compostos por:

-   **byte**
-   **short**
-   **int**
-   **long**
-   **char**
Apesar de uma variável do  **tipo char**  receber um caractere, essa variável também pode receber valores:

-   **Literais do tipo int**  (por isso o tipo ser numérico integral)
-   **Unicode**

# Intervalos dos tipos numéricos integrais da Linguagem Java

**BSIL**:

-   **byte**
-   **short**
-   **int**
-   **long**

**1329**:

-   **byte**: vai de -128 a 127
-   **short**: vai de -32.768 a 32.767
-   **int**: vai de 2 bilhões e alguma coisa negativos a 2 bilhões e alguma coisa positivos
-   **long**: vai de 9 e uma imensa quantidade de números negativos a 9 e uma imensa 	quantidade de números positivos.

# Uma variável do tipo:

-   **byte**: possui 1 byte de informação ou 8 bits
-   **short**: possui 2 bytes de informação ou 16 bits
-   **int**: possui 4 bytes de informação ou 32 bits
-   **long**: possui 8 bytes de informação ou 64 bits

# A família BCFD segue a mesma sequência da família BSIL, exceto pelo tipo boolean:

-   **boolean**: possui normalmente 1 bit de informação, pois depende da arquitetura de computador
#### A partir do char em diante, a sequência é a mesma do BCFD:
-   **char**: possui 2 bytes de informação ou 16 bits;
-   **float**: possui 4 bytes de informação ou 32 bits;
-   **double**: possui 8 bytes de informação ou 64 bits.

BSIL BCFD 1329.

## Existem muitos tipos de operadores em Java aqui está alguns deles.

1. -   Operador Unário,
 2. -   Operador aritmético,
 3. -  Operador Ternário,
 4. - Operador Lógico OR

#### Operador unário
Os operadores unários requerem apenas um operando. Operadores unários são usados para executar várias operações, ou seja:

-   Incrementando / decrementando um valor em um
-   Negando uma expressão
-   Invertendo o valor de um **boolean**

#### Operadores aritméticos

Operadores aritméticos são usados para executar: adição, subtração, multiplicação e divisão. Eles agem como operações matemáticas básicas.

####  Operador Ternário
O operador ternário é usado como um substituto para a instrução if-then-else e muito usado na programação Java. É o único operador condicional que leva três operandos.

####  Operador OR: Lógico ||
O operador lógico || não verifica a segunda condição se a primeira condição for verdadeira. Ele verifica a segunda condição apenas se a primeira for falsa.