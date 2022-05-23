package com.example.recursion

fun main(){

   print( fibonacci(7))

}

fun fibonacci(n: Int):Int{

      if(n==1) return 1
    if(n==2) return  1
    val partialAnswer1= fibonacci(n-1)
    val partialAnswer2= fibonacci(n-2)
    return partialAnswer1+ partialAnswer2
}