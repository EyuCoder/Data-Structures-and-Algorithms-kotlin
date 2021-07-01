import ext.swap

fun quickSort(data: MutableList<Char>, left: Int, right: Int): MutableList<Char> {
    if (right - left <= 0) return data
    //Lomuto's partition scheme
    //val pivot = data[right]

    val pivot = data[(right + left) / 2]
    var i = left
    var j = right

    while (i <= j) {
        while (data[i] < pivot) i++
        while (data[j] > pivot) j--
        if (i <= j) {
            data.swap(i, j)
            i++
            j--
        }
    }

    quickSort(data, left, i - 1)
    quickSort(data, i, right)
    return data
}

fun main() {
    val data = mutableListOf('g', 'c', 'b', 'e', 'd', 'f', 'a')
    println(data.joinToString(" "))
    quickSort(data, 0, data.lastIndex)
    println(data.joinToString(" "))
}