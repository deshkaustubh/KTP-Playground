package EP5

fun main() {
    val series = listOf( 0, 1, 2, 3, 4, 5)
    println(checkForAP(series))
    println(checkForGP(series))
}

fun checkForAP(series: List<Int>): String {
    if (series.size < 2) return "Too short to determine AP"

    val d = series[1] - series[0]

    for (i in 2 until series.lastIndex) {
        if (series[i + 1] - series[i] != d) return "Not an AP"
    }
    return "AP with d = $d"
}

fun checkForGP(series: List<Int>): String {
    if (series.size < 2) return "Too short to determine GP"
    if (series[0] == 0) return "Cannot determine GP with zero in series"

    val r = series[1] / series[0]

    for (i in 2 until  series.lastIndex) {
        if (series[i] == 0 || series[i + 1] / series[i] != r) return "Not a GP"
    }
    return "GP with r = $r"
}
