fun main() {

    println("Digite o primeiro numero: ")
    val x: Int = readLine()!!.toInt()

    println("Digite o segundo: ")
    val y: Int = readLine()!!.toInt()

    val resultado: Int = somar(x, y)
    println("O resultado da operacao eh = $resultado")

    val s = somar(x, y)
    val sub = subtracao(x, y)
    val mul = multiplicacao(x, y)
    val div = divisao(x, y)

    println(s)
    println(sub)
    println(mul)
    println(div)
}

fun somar(x: Int, y: Int): Int {
    return x + y
}

fun subtracao(x: Int, y: Int): Int {
    return x - y
}

fun multiplicacao(x: Int, y: Int): Int {
    return x * y
}

fun divisao(x: Int, y: Int): Int {
    return x / y
}