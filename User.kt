class User{
    var saldo : Int = 0
    var titular : String = ""

    fun depositar(valor : Int){
        saldo += valor
    }
    fun sacar(valor: Int){
        saldo -= valor 
    }
    fun buscarSaldo(){
        println("O saldo de ${titular} é de R$${saldo.toFloat()}")
    }
}