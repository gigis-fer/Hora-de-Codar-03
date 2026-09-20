data class Contato(val nome: String, val telefone: String)
fun main() {
    var contatos = arrayOf<Contato>()

    while (true) {
        print("Digite um comando (ADICIONAR, BUSCAR, REMOVER, LISTAR, SAIR): ")
        val comando = readlnOrNull()?.trim()?.lowercase() ?: ""

        if (comando == "sair") {
            println("Agenda encerrada. Total de contatos: ${contatos.size}")
            break
        }

        if (comando == "adicionar") {
            print("Nome: ")
            val nome = readlnOrNull()?.trim() ?: ""
            print("Telefone: ")
            val telefone = readlnOrNull()?.trim() ?: ""

            if (nome.isNotEmpty() && telefone.isNotEmpty()) {
                contatos += Contato(nome, telefone)
                println("Contato adicionado!")
            } else {
                println("Nome e telefone não podem ser vazios.")
            }
        }

        else if (comando == "buscar") {
            print("Nome: ")
            val buscaNome = readlnOrNull()?.trim() ?: ""

            var encontrado = false
            for (c in contatos) {
                if (c.nome.lowercase() == buscaNome.lowercase()) {
                    println("Telefone: ${c.telefone}")
                    encontrado = true
                    break
                }
            }

            if (!encontrado) {
                println("Contato não encontrado.")
            }
        }

        else if (comando == "remover") {
            print("Nome: ")
            val removeNome = readlnOrNull()?.trim() ?: ""

            var encontrado = false
            for (c in contatos) {
                if (c.nome.lowercase() == removeNome.lowercase()) {
                    encontrado = true
                    break
                }
            }

            if (encontrado) {
                contatos = contatos.filter { it.nome.lowercase() != removeNome.lowercase() }.toTypedArray()
                println("Contato removido!")
            } else {
                println("Contato não encontrado.")
            }
        }

        else if (comando == "listar") {
            if (contatos.isEmpty()) {
                println("Nenhum contato cadastrado.")
            } else {
                for (c in contatos) {
                    println("Nome: ${c.nome} | Telefone: ${c.telefone}")
                }
            }
        }
        else {
            println("Comando inválido! Tente novamente.")
        }
    }
}
