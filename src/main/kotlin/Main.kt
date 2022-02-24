fun main() {
   /*
   Estruturas de Repetição

   While (ou seja, enquanto) - Looping que só vai ser executado se a condição for verdadeira
   While (condição){
    bloco que vai se repetir
   }

   do...while (ou seja, faça...enquanto) - Looping que vai ser executado pelo
   menos uma vez, independene da condição

   do{
   Bloco que vai ser executado por ao menos uma vez e rodária em looping se a
   condição for verdadeira
   }

    */

    /*Exemplo prático do while

    var soma= 0
    var num = 5

    while (num != 0) {

        print("Digite um número de 0: ")
        num = readLine()!!.toInt()

        soma += num
    }

    println("A soma de todos os números digitados é $soma")
    */

    /*for (ou seja, para) - Vai repetir o bloco de códigos
    pegando a referencia de uma variável de controle

    Exemplo para Portugol
    para(inteiro i = 0; i < 10; i ++) {

    }

    Exemplo for no Kotlin - Estrutura básica

    for(variavel range passos){
    Bloco que vai se repetir
    }

    for(i in 1..10 step 2){

    }

     */

    /*Exemplo prático do...while

    do {

        print("Tem o Pet e o Repete, o Pete morreu, quem sobrou?")
        val resp = readLine()!!

    }while (resp == "Repete" || resp == "repete")*/

    /*print("Digite um valor para calcular a sua tabuada: ")
    val tab = readLine()!!.toInt()

    for (i in 1 .. 10 step 2){

        println("$tab * $i = ${tab * i}")
    }*/

    /* Exemplo louco que meus alunos pediram
    var passo = 2

    for (i in 1.. 20 step passo){
        println("$i")

        if (i == 9){
            passo = 3
        }

        for(i in 10 .. 20 step passo){
            println("$i")

        if(i == 21){
            println("$i")

        }

        }
        break

    }*/

    //num1..num2 -> num1 downTo num2

    /*print("Digite um valor para calcular a sua tabuada: ")
    val tab = readLine()!!.toInt()

    for (i in 10 downTo 1){

        println("$tab * $i = ${tab * i}")


    }*/

    /*Ler 10 números e imprimir quantos são pares e quantos são
    ímpares. (FOR)

    import kotlin.math.pow

            print("Digite um número: ")
    val num = readLine()!!.toInt()

    if (num % 2 == 0.0){
        val calc = num.pow(2)
        println("O número $num é impar ")
    }*/

    /*Crie um programa que leia um número do teclado até que encontre um
    número igual a zero. No final, mostre a soma dos números digitados.
    (DO...WHILE)

    var soma= 0
    var num = 5

    while (num != 0) {

        print("Digite um número de 0: ")
        num = readLine()!!.toInt()

        soma += num
    }

    println("A soma de todos os números digitados é $soma")*/

    /*
    Escrever um programa que receba vários números inteiros no teclado. E
    no final imprimir a média dos números múltiplos de 3. Para sair digitar
    0(zero).(DO...WHILE)



print("Digite um valor: ")
val tab = readLine()!!.toInt()

for (i in 1 .. 10){

    println("$tab * $i = ${tab * i}")


} */

    /*Ler 10 números e imprimir quantos são pares e quantos são ímpares. (FOR)*/

    /*var nPar = 0
    var nImp = 0

    for (i in 1..10){

        print("Digite o ${i} número: ")
        val num = readLine()!!.toInt()

        if (num % 2 == 0){
            nPar++
        }else{
            nImp ++
        }
    }
    println("A quantidade de números pares foi de $nPar e a " +
    "quantidade de números ímpares foi de $nImp") */

    /*Escrever um programa que receba vários números inteiros no teclado.
    E no final imprimir a média dos números múltiplos de 3. Para sair digitar
     0(zero).(DO...WHILE)

    var soma = 0.0
    var cont = 0

    do {

        print("Digite qualquer número diferente de 0: ")
        val num = readLine()!!.toInt()
        if (num % 3 == 0 && num !=0){
            cont++
            soma += num
        }
    }while (num != 0)

    val media = soma / cont
    println("Denre os números digitados, $cont são divisíveis por 3 " +
    "e a média desses números é $media")*/

    /*
    Uma empresa desenvolveu uma pesquisa para saber as características
    psicológicas dos indivíduos de uma região. Para tanto, a cada uma das
    pessoas era perguntado: idade, sexo (1-feminino / 2-masculino / 3-Outros),
    e as opções (1, se a pessoa era calma; 2, se a pessoa era nervosa e 3,
    se a pessoa era agressiva). Pede-se para elaborar um sistema que permita
    ler os dados de 150 pessoas, calcule e mostre: (WHILE)

    o número de pessoas calmas;
    o número de mulheres nervosas;
    o número de homens agressivos;
    o número de outros calmos;
    o número de pessoas nervosas com mais de 40 anos;
    o número de pessoas calmas com menos de 18 anos.
     */

    var cont = 0
    var idade = 0
    var sexo = 0
    var opc = 0

    var pCalmas = 0
    var mNervosas = 0
    var hAgressivos = 0
    var outCalmas = 0
    var nPNervoMaior40 = 0
    val nPCalmasMenos18 = 0

    while (cont < 6){

        println("***Pessoa ${cont+1}***"\n=)
        print("Digite a idade: ")
        idade = readLine()!!.toInt()

        print("Digite o seu sexo considerando 1 para femenino, 2 para masculino" +
        " e 3 ára outros: ")
        sexo = readLine()!!.toInt()
        print("Qual o comportamento da pessoa, conseiderando 1 para calma, " +
        "2 para nervosa e 3 para agressiva")
        opc = readLine()!!.toInt()

        if (opc == 1){
            pCalmas ++

        }
        if (sexo == 1 && opc ==2){
            mNervosas++
        }

        if (sexo == 2 && opc == 3){
            hAgressivos++
        }

        if (sexo == 3 && opc == 1){
            outCalmas
        }
        if (opc == 2 && idade > 40){
            nPNervoMaior40++
        }
        if(opc < 18 && opc == 1){
            nPCalmasMenos18++

        }

        println("O número de pessoas calmas é $pCalmas")
        println("O número de pessoas calmas é $mNervosas")
        println("O número de pessoas calmas é $hAgressivos")
        println("O número de pessoas calmas é $outCalmas")
        println("O número de pessoas calmas é $nPNervoMaior40")
        println("O número de pessoas calmas é $nPCalmasMenos18")

        cont++
    }













}

