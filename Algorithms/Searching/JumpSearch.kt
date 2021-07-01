import kotlin.math.sqrt

fun jumpSearch(data: MutableList<Char>, c: Char): Int {
    var found = 0
    val jumpBy = sqrt(data.size.toDouble()).toInt()
    var blockStart = 0
    var blockEnd = jumpBy

    while (data[blockEnd] < c) {
        blockStart = blockEnd
        blockEnd += jumpBy

        if (blockEnd > data.lastIndex) blockEnd = data.lastIndex
        if (blockStart > data.lastIndex) break
    }
    for (i in blockStart..blockEnd) {
        if (c == data[i])
            found++
    }
    return found
}

fun main() {
    val data = mutableListOf('a', 'b', 'c', 'd', 'e', 'e', 'e', 'f', 'g', 'h', 'i', 'j')
    println("the list\n${data.joinToString(" ")}")
    val x = jumpSearch(data, 'e')
    print("$x Found")
}