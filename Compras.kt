fun main() {
    var frutas = arrayOf("Maça", "Morango", "Banana", "Laranja", "Uva", "Maracujá")

    while (!frutas.isEmpty()) {
        println("Frutas disponíveis: ${frutas.joinToString()}")
        print("Digite o nome de uma fruta para remover (ou 'PARE' para encerrar): ")

        val nomeFruta = readlnOrNull()?: ""

        if (nomeFruta.lowercase() == "pare") {
            break
        }
        var existe = false
        for (f in frutas) {
            if (f.lowercase() == nomeFruta.lowercase()) {
                existe = true
            }
        }

        if (existe) {
            frutas = frutas.filter { it.lowercase() != nomeFruta.lowercase() }.toTypedArray()
            println("Fruta foi retirada da lista")
        } else {
            println("Fruta indisponível no nosso mercado")
        }
    }
    if (frutas.isEmpty()) {
        println("Lista de compras finalizada. Obrigada pela compra.")
    } else {
        println("Frutas restantes: ${frutas.joinToString()}")
    }
}
