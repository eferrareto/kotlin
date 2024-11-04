fun main() {
    var controle = Ps4Controller.Button()
    var botao = Ps4Controller()
    controle.press(botao.botao1)
    controle.press(botao.botao4)
    controle.press(botao.botao6)
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