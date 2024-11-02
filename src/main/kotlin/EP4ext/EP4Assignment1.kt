/* fun printSeries(n: Int)
 Observe the series :
 1, (1+2), (1+2+3), (1+2+3+4), (1+2+3+4+5)
 = 1, 3, 6, 10, 15, 21, …
 For input n, print n number of terms of this series :
 n=1 → 1
 n=2 → 1, 3
 n=5 → 1, 3, 6, 10, 15
 */

fun main() {
    printseries(5)
}

fun printseries(number: Int){
    var variable  = 0
    for(i in 1..number){
        variable = variable + i
        print("$variable, ")
    }
}