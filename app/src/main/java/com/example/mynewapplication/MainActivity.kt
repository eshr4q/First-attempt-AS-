package com.example.mynewapplication
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

    }
}

public open class Person constructor(public val age: Int) {

    public open fun talk() {
        val message: String
        message = "I'm $age years old and I'm sick of Android studio."
        println(message)


    }
}
class CodingShit constructor(age: Int): Person(age){
    override fun talk() {
        val message: String
        message = "I'm a temp and I'm $age."
        println(message)
    }
    fun code() {
        println("I code arvahe amam.")
    }
}

fun main(args: Array<String>) {
    val simplePerson: Person = Person(37)
    simplePerson.talk()

    var codingShit = CodingShit(age = 57)
    codingShit.talk()
    codingShit.code()

    codingShit = CodingShit(age = 40)
    codingShit.talk()
}



