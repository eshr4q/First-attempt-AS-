package com.example.mynewapplication
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

    }
}

public final class Person constructor(public val age: Int) {

    public fun talk() {
        val message: String
        message = "I'm $age years old and I'm sick of Android studio."
        println(message)

    }
}

fun main(args: Array<String>) {
    val SimplePerson: Person = Person(27)
    SimplePerson.talk()
}


//class Name constructor (val age: Int) {
// fun talk(input: String): String {
//  val message: String
//  message= "It's my birthday, I'm $age years old."
//  println(message)
//
// }
//}
