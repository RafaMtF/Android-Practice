import java.util.Date

fun main() {
    val song = Song("KATAMARI", "femtanyl", "13-08-2023", 16_174_299)
    println(song)
    println("${song.isPopular}")
}

class Song(
    private val title: String,
    private val artist: String,
    private val yearPublished: String,
    private val playCount: Int
) {

    val isPopular: Boolean = playCount > 1000000

    override fun toString(): String {
        return "$title, performed by $artist, was released in $yearPublished"
    }
}