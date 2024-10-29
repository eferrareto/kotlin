
class Fruit(name: String, price: Double, saldo : Double) {

    init {
        println("Olá tudo bem? você possuí ${product} produtos no estoque, e o seu saldo é de ${prices}  ")
    }

    constructor(name: String, price: Double) : this(name, price, saldo = 0.0)


    var name : String = ""
    var prices : Double = 0.0
    var product : Int = 0


    fun deposit(price : Double){
        prices += price
        println(" vocÊ depositou ${price}, seu saldo é de ${prices}")
    }

    fun buy(name : String, price : Double){
        println("Você comprou ${name} e custou R$${price}")
        prices += price
    }

    fun sell(name : String, price : Double){
        println("Você vendeu ${name} por R$${price}")
    }

    fun show(name : String, price : Double){
        println("Você possui ${name} frutas e o valor de ${price}")
    }
}