package Chapter2_BasicTypesAndVariables

fun main (){
    val fruits = arrayOf("Banana", "Blueberry", "Pomegranate", "Cherry")
    var x = 0
    while (x < 4){
        println("Fruit = ${fruits[x]}")
        x = x + 1
    }
}