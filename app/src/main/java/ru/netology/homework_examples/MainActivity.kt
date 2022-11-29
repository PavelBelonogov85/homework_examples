package ru.netology.homework_examples

import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var textsCounter = 0
        findViewById<Button>(R.id.buttonId).setOnClickListener {
            textsCounter = if (textsCounter==3) {0} else {textsCounter+1}
            println("Хотим поменять текст на R.string.text1"+textsCounter)
            val myTextView = findViewById<View>(R.id.textViewId) as TextView


            myTextView.setText(resources.getString(R.string.text1))
            //val newText = resources.getString(R.string["text"+textsCounter])  // как взять ресурс по имени ???
            //myTextView.setText(newText)
            myTextView.text = resources.getString(R.string.text2)
        }

    }
}