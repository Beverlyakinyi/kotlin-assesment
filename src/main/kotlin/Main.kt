fun main(){
    println(array("barnie","bakes","brown","bagels", "buns"))
    println(occurance("arnie","akes","rown","agels", "uns"))
    println(sum(33,66,34,))
    println(palindrome("madam","wow","kayak"))

}
//Write and invoke a function that given the string “Barnie bakes brown bagels
//and buns” prints out a list of all the other words and characters making up the
//string excluding all possible occurrences of the letter b.

fun array(x:String,y:String,w:String,z:String,o:String) {
    var stop: Array<String> = arrayOf(x,y,w,z, o,)
    println(stop.contentToString())
}
fun occurance(x:String,y:String,w:String,z:String,o:String,){
    var letter:Array<String> = arrayOf(x,y,w,z,o)
    println(letter.contentToString())
}
//Write and invoke one function that takes in an array of integers and returns
//these 3 values: sum, count and average of all the elements.
fun sum(num:Int,num1:Int,num2:Int):Array<Int> {
    var calculation: Array<Int> = arrayOf(num, num1, num2)
    var add: Array<Int> = arrayOf(num + num1 + num2)

    fun sum(num: Int, num1: Int, num2: Int): Int {
        var b: Array<Int> = arrayOf(num, num1, num2)
        var c = num1 + num2 + num2
        return c
    }


//The volume of a sphere is calculated using the formula below
//
//V = 4/3 π r
//3
//
//Write and invoke a function that is capable of accurately calculating the
//volume of any sphere given its radius. Use 3.14159 as π







//    A palindrome is a string that reads the same forwards and backwards e.g
//    madam, wow, kayak. Write and invoke a function:
//    isPalindrome(word: String): Boolean
//    that takes in a single word and returns true or false depending on whether the
//    word is a palindrome.

}
    fun palindrome(a:String,b:String,c:String,d:String,e:String) {
    var change: Array<String> = arrayOf(a,b,c,d, e,)
    println(change.contentToString())
}




