fun bubbleSort(data: MutableList<Char>) {
    for (i in data.indices) {
        for (j in 1 until data.size) {
            if (data[j] < data[j - 1]) {
                data[j] = data[j - 1].also { data[j - 1] = data[j] }
            }
        }
    }
}

fun main() {
    val data = mutableListOf('g', 'c', 'b', 'e', 'd', 'f', 'a')
    println(data.joinToString(" "))
    bubbleSort(data)
    println(data.joinToString(" "))
}z