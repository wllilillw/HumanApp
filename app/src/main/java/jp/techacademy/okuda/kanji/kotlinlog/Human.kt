package jp.techacademy.okuda.kanji.kotlinlog

import android.util.Log


open class Human: Animal,Thinkable {
    var hobby: String
    constructor(name: String, age: Int) : super(name, age) {
        this.hobby="ぽち"
    }

    override fun say() {
        Log.d("kotlintest","私の名前は"+name+"です。年は" + age + "歳です")
    }

    override fun think() {
        Log.d("kotlintest","私は" + this.hobby + "について考える")
    }

}