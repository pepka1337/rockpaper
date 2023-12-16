fun main() {
    val choices = arrayOf("Камень", "Ножницы", "Бумага")

    println("Добро пожаловать в игру 'Камень, Ножницы, Бумага'!")
    var continuePlaying = true

    while (continuePlaying) {
        println("Сделайте свой выбор:")
        println("1 - Камень")
        println("2 - Ножницы")
        println("3 - Бумага")

        val playerChoice = readLine()
        val playerIndex = playerChoice?.toIntOrNull()

        if (playerIndex !in 1..3) {
            println("Выберите правильное число от 1 до 3!")
            continue
        }

        val computerIndex = (1..3).random()

        println("Вы выбрали: ${readLine()}")
        println("Компьютер выбрал: ${choices[computerIndex - 1]}")

        val result = when {
            playerIndex == computerIndex -> "Ничья!"
            (playerIndex == 1 && computerIndex == 2) || (playerIndex == 2 && computerIndex == 3) || (playerIndex == 3 && computerIndex == 1) -> "Вы победили!"
            else -> "Компьютер победил!"
        }

        println("Результат: $result")

        println("Хотите сыграть еще раз? (yes/no)")
        val playAgainResponse = readLine()
        if (playAgainResponse?.toLowerCase() != "yes") {
            continuePlaying = false
            println("Спасибо за игру! До новых встреч!")
        }
    }
}