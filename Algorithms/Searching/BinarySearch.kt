fun binarySearch(data: MutableList<Char>, c: Char): Int {
    var left = 0
    var right = data.lastIndex
    while (left <= right) {
        val mid = (left + right) / 2
        when {
            data[mid] == c -> return mid
            data[mid] < c -> left = mid + 1
            else -> right = mid - 1
        }
    }
    return -1
}

fun main() {
    val data = mutableListOf('a', 'b', 'c', 'd', 'e', 'f', 'g', 'h')
    println("the list\n${data.joinToString(" ")}")
    val x = binarySearch(data, 'e')
    print("Found at index: $x")
}