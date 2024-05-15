package easy

/*
* Given an integer x, return true if x is a
palindrome
, and false otherwise.
* */
fun main(args: Array<String>) {

    println(isPalindrome(121))
}

fun isPalindrome(x: Int): Boolean {
    return (x >= 0 && x == reverseInteger(x))
}

fun reverseInteger(value: Int): Int {
    var number = value
    var reversed = 0
    while (number != 0) {
        val digit = number % 10
        reversed = reversed * 10 + digit
        number /= 10
    }
    return reversed
}
