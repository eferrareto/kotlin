fun main() {

}
enum class TipoDeCafe{
    Espresso,
    Cappuccino,
    Latte,
    Mocha
}
fun fazerPedido(tipo : TipoDeCafe){
    println("O café que você escolheu foi ${tipo}")
}


class Ps4Controller{
    val botao1 = "Triangulo"
    val botao2 = "Circulo"
    val botao3 = "Cruz"
    val botao4 = "Quadrado"
    val botao5 = "L1"
    val botao6 = "R1"
    class Button{
        fun press(button: String){
            println("${button} botão pressionado!")
        }
    }
}
class Universidade{
    inner class Aluno(var nome : String, var matricula: Int, var curso : String){

    }
    fun matricularAluno(nome : String, matricula: Int, curso: String){
        println("Aluno: ${nome} está matriculado, o seu numero é ${matricula}, e o seu curso é ${curso}")
    }
}
class Loja{
    inner class Produto(var nome : String, var preco : Double, var categoria : String){

    }
    fun adicionarProduto(nome: String, preco: Double, categoria: String){
        println("Produto: $nome")
        println("Preço: $preco")
        println("Categoria: $categoria")
    }
}
class Escola{
    inner class Aluno(var nome : String, var turma : String, var nota : Double){
        fun imprimirInfo(){
            println("Aluno: $nome")
            println("Turma: $turma")
            println("Nota: $nota")
        }
    }
    fun matricularAluno(nome: String, turma: String,nota: Double):Aluno{
        return Aluno(nome, turma, nota)
    }

}
class Exercito(var nome: String, var tamanho : Double){
    inner class Soldado(var nome : String, var patente : String, var habilidade : Int){

    }
    fun treinarSoldado(soldado : Soldado){
        soldado.habilidade += 10
    }
    fun soldadoInfo(soldado: Soldado){
        println("Soldado: ${soldado.nome}")
        println("Patente: ${soldado.patente}")
        println("Habilidade: ${soldado.habilidade}")
    }
}
