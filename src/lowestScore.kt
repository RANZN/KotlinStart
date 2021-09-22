import java.util.*;

fun main() {
    var scores = arrayOf(20, 30, 40, 10)
    var min = scores[0]
    for (i in scores) {
        if (i < min) {
            min = i;
        }
    }
    println(min)
}