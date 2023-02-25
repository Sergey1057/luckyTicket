package com.example.luckyticket

fun main() {
    println("result = " + solveForSix())

}

var count: Int = 0

private fun solveForSix(): Int{
    solve(3,0,0)
    return count
}

private fun solve(remainingDigits: Int, sumA: Int, sumB: Int) {
    if (remainingDigits == 0){
        if (sumA == sumB){
            count++
        }
        return
    }

    for (a in 0..9){
        for (b in 0..9){
            solve(remainingDigits -1, sumA + a, sumB+b)
        }
    }
}