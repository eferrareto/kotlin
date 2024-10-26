fun main() {
    var user1 = User()
    user1.saldo = 0
    user1.titular = "Erick"

    user1.depositar(1200)
    user1.sacar(500)
    user1.buscarSaldo()
}