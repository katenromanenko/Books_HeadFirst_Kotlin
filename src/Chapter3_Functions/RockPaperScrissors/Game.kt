package Chapter3_Functions.RockPaperScrissors

fun main(){
    val options = arrayOf("Камень", "Бумага", "Ножницы")
    val gameChoice = getGameChoise(options)
    val userChoice = getUserChoise(options)
    printResult (userChoice, gameChoice)
}

fun getGameChoise (optionsParam: Array<String>) =
    optionsParam [(Math.random() * optionsParam.size).toInt()]

fun getUserChoise (optionsParam: Array<String>): String {
    //переменная isValidChoise, будет показывать,
    //ввел ли пользователь допустимый вариант
    var isValidChoise = false
    var userChoice = ""
    //Выполнять цикл, пока пользователь не введет допустимый вариант
    while (!isValidChoise) {
//Запросить у пользователя его выбор
        //Запросить у пользователя его выбор
        print("Пожалуйста, введите одно из следующих значений:")
        for (item in optionsParam) print(" $item")
        println(".")
        //Прочитать пользовательский ввод
        val userInput = readLine()
        //Проверить пользовательский ввод
        if (userInput != null && userInput in optionsParam) {
            isValidChoise = true
            userChoice = userInput
        }
        //Если выбран недопустимый вариант, сообщить пользователю
        if (!isValidChoise) println("Вы должны ввести правильный выбор.")
}
return userChoice
}

fun printResult(userChoice: String, gameChoice: String){
    val result: String
    //Определить результат
    if (userChoice == gameChoice) result = "Галстук!"
    else if ((userChoice == "Камень" && gameChoice == "Ножницы") ||
        (userChoice == "Бумага" && gameChoice == "Камень") ||
        (userChoice == "Ножницы" && gameChoice == "Бумага")) result = "Ты победил!"
    else result = "Ты проиграл!"
    //Вывести результат
    println("Ты выбрал $userChoice. Я выбрал $gameChoice. $result")
}