package com.example.recursion

fun main(){
   print( power(2,69L))

}

fun power(n:Int, p:Long):Long{

    if(p==0L) return  1

    val partialAnswer = power(n,p-1)
    return  n* partialAnswer
}