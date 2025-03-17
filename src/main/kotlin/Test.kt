package org.example

fun main(args: Array<String>){
    println("Hello Kotlin")
//  Different ways to declare a variable
    var decimal = 3.40
    val number: Int = readln().toInt()
    var a: String = readln()

    val miniTest = Test("miniSo",23)
    miniTest.name="math Test"

    val maxTest: Test

    println(miniTest)
}

class Test(var name: String, val id: Int) {

}