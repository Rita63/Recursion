package com.example.recursion

fun main(){

    print(  palindrome(0,"ROR".length-1,"ROR",))

}

fun palindrome(L:Int,R:Int,S:String):Boolean{
    if(L>=R) return true  //do small work
    if(S[L]!=S[R]) return  false //ask recursion to do remaining work

    return  palindrome(L+1, R-1,S)
}