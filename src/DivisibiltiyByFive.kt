fun main() {
    var a = 100
    if (div(a))
        println("YES")
    else println("NO")
}

fun div(a: Int): Boolean {
    if (a % 5 == 0)
        return true
    return false
}