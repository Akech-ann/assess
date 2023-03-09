fun main() {
    var anny = sentence("anne","akech")
    println(anny[0])
    println(anny[0])
    var m= arrayOf(373,373,3273,37,3)
    println(m.max())
    println(m.min())
    println(m.average())
    printname("books")

  var str = arrayOf("ann","akech","ivy")
    println(str)
    calculation(352,36,327,387,83)

}

//1. Write and invoke a function that takes in any 2 strings and returns the first
//character of the longer string or the first character of the first string if they are
//equal in length.

fun sentence(name1:String,name2:String):String{
    return name1

}
//question 2

fun invoke(name:Int):Array<Int>{
    return arrayOf(name)

}


fun printname(name:String){
    //var name ="book"
    println("${name[0]}${name[1]}${name[2]}${name[3]}${name[4]}")


}
//Write and call a function that takes in an array of strings, joins them all into
//one string and returns it.
fun sent(name:String):Array<String>{
    return arrayOf(name)
}


fun calculation(num1:Int,num2:Int,num3: Int,num4: Int,num5: Int){
    println(num1+num2)
    println(num5-num2)
    println(num1/num2)
    println(num4*num2)

}