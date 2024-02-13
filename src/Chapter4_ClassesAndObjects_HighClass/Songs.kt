package Chapter4_ClassesAndObjects_HighClass
//определяем свойство title и artist.
class Song (val title: String, val artist: String){
    fun play(){
        println("Воспроизведение песни $title от $artist")
    }
    fun stop(){
        println("Перестал воспроизводиться $title")
    }
}

fun main(){
    //Создаем три объекта Song
    val songOne = Song ("Жители Месопотамии", "Они могли бы быть Гигантами")
    val songTwo = Song ("Уход в подполье", "Джем")
    val songThree = Song ("Заставь меня улыбнуться", "Стив Харли")
    //Воспроизвести объект2 и остановить его.
    //Воспроизвести объект3.
    songTwo.play()
    songTwo.stop()
    songThree.play()
}