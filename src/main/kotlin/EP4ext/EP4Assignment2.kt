/*
 2. LCM, HCM of 3, 4 no.
 fun lcmOf(a: Int, b: Int, c: Int)
 fun lcmOf(a: Int, b: Int, c: Int, d: Int)
 fun hcfOf(a: Int, b: Int, c: Int)
 fun hcfOf(a: Int, b: Int, c: Int, d: Int)
 */

fun main(){
    val x = 20
    val y = 15
    val z = 8
    println(LCM(x,y))
    println(LCM(x,y,z))
}
fun HCF(x: Int, y: Int): Int { //long division
    var a = x
    var b = y

    while ( b != 0){
        val remainder = a % b
        a = b
        b = remainder
    }
    return  a //since remainder has to come out zero in end we return a only
}

fun LCM(x: Int, y: Int): Int { // common division approach
    val a = if (x > y ) x else y
    val b = if ( x < y ) x else y

    var multiple = a
    while (multiple % b != 0){
        multiple = multiple + a
    }

    return multiple
}

fun HCF(x: Int ,y: Int, z:Int): Int{
    return HCF(z,HCF(x,y))
}

fun LCM(x: Int ,y: Int, z:Int): Int{
    return LCM(z,LCM(x,y))
}