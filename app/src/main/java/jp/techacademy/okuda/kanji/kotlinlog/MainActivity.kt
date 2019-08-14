package jp.techacademy.okuda.kanji.kotlinlog


import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val human = Human("ポチ", 3,"hob")      // 名前をポチ、年齢3歳で、Dogのインスタンスを作る

        human.say()
        human.think()
    }
}

