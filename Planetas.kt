fun main(){
    var lista_planetas =
        mutableListOf<String>("Mercúrio", "Vênus", "Terra", "Marte", "Júpiter",
            "Saturno", "Urano", "Netuno", "Plutão")

    println(lista_planetas)
    var resposta: String
    var continuar = true

    while(continuar) {
        println("Informe o nome do planeta: ")
        val input_usuario = readln().trim().lowercase().replaceFirstChar { it.uppercase() }

        if (input_usuario in lista_planetas) {
            println("Planeta encontrado!")
            println("Você gostaria de removê-lo? S/N")

            resposta = readln()
            if (resposta.uppercase() == "S") {
                lista_planetas.remove(input_usuario)
                println("O planeta $input_usuario foi removido. Essa é a lista atual: $lista_planetas")
            }
        } else {
            println("Planeta não encontrado!")
            println("Você gostaria de adicioná-lo? S/N")

            resposta = readln()
            if (resposta == "S" || resposta == "s") {
                lista_planetas.add(input_usuario)
                println("O planeta $input_usuario foi adicionado. Essa é a lista atual: $lista_planetas")
            }
        }


        println("Você gostaria de continuar? S/N")
        resposta = readln()
        if (resposta.uppercase() == "N") {
            continuar = false
        }
        println("Programa encerrado, até depois!")
       }
}
