package jp.techacademy.okuda.kanji.kotlinlog

import android.util.Log


open class Human: Animal,Thinkable {
    constructor(name: String, age: Int,hobby: String) : super(name, age, hobby) {
    }

    override fun say() {
        Log.d("kotlintest","私の名前は"+name+"です。年は" + age + "歳です")
    }

    override fun think() {
        Log.d("kotlintest","私は" + hobby + "について考える")
    }

}