fun main() {
    val likes = 11
    val likeString = "Лайк"
    val likeIf = "Лайка"
    val likesString = "Лайков"
    val result: String = if (likes == 0 || likes >= 5) likesString else if (likes == 1) likeString else likeIf
    println(result)
}