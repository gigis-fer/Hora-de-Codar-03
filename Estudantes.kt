fun main() {

    val listaEstudantes = mutableListOf<String>()

    println("Cadastro de Estudantes.\nDigite o nome do estudante e adicione-o à lista. Para encerrar o programa, digite 'PARE'.")

    while (true) {
        print("Informe o nome do estudante: ")
        val entradaUsuario = readln().trim()

        if (entradaUsuario.uppercase() == "PARE") {
            break
        }
        if (entradaUsuario.isNotEmpty()) {
            listaEstudantes.add(entradaUsuario)
            println("Estudante '$entradaUsuario' cadastrado com sucesso!")
        } else {
            println("Aviso!!! O nome não pode ser vazio. Tente novamente, por favor.")
        }
    }
    println("\nCadastro Encerrado")
    println("Quantidade de estudantes cadastrados: ${listaEstudantes.size}")

    if (listaEstudantes.isNotEmpty()) {
        println("Lista de estudantes cadastrados:")
        listaEstudantes.forEachIndexed { index, estudante->
            println("${index+ 1}. $estudante")
        }
    } else {
        println("Nenhum estudante foi cadastrado.")
    }
}
