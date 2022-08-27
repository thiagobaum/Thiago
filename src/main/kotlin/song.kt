class song(val title: String,
           val artist: String,
           val year:Int,
           val playCont:Int) {

    val isPopular: Boolean
        get() = playCont >= 1000

    fun printDesc(){
        println("$title, de [$artist], lançado em [$year].")

    }
    fun main(){
        val armandinho=song(title"semente")
    }

}