package com.example.recursion

fun  main(){

//  print(sum(9))

//    print(recursion(-3))


  print(  palindrome(0,"RITAi".length-1,"RITAi"))
}


//fun recursion(n:Int):Int{
//
//if (n==0)
//    return 1
//
//
//    val partialAnswer= recursion(n-1)
//    return n* partialAnswer
//}

fun palindrome(l: Int,  s: String, r: Int): Boolean {

    //base condition

    if (s[l] >= s[r]) return true
    if (s[0] != s[r]) return false


    return palindrome(l + 1, s,r - 1)


}

//fun sum(n:Int): Int{
//
//
//  if(n==1) return 1
//
//  val partialAnswer= sum(n-1)
//  return n+ partialAnswer
//
//
//}






