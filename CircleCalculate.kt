class CircleCalculate {
    companion object{
        val pi = 3.14
    }
    fun calculate(raio : Int) {
        val result = 2 * pi * raio
        println("A circunferência do círculo com raio ${raio} é: ${result.toInt()}")
    }
}


