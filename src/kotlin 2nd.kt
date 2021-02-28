fun main() {
    var name:String="Hello Ann"
    println(name)

    var result=modulus(35,4)
    println (result)

    var rEsult=addition(20,25,30,35)
    println (rEsult)

    var shy:Boolean=true
    println(shy)
}
fun modulus (num1:Int,num2:Int):Int{
    var modulus=num1%num2
    return modulus
}
fun  addition (num1:Int,num2:Int,num3:Int,num4:Int):Int{
    var sum =num1+num2+num3+num4
    return sum

}
