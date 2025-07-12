
package com.shubham.aiagent

import android.app.Activity
import android.os.Bundle
import android.speech.tts.TextToSpeech
import android.widget.Button
import java.util.*

class MainActivity : Activity() {

    private lateinit var tts: TextToSpeech

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        tts = TextToSpeech(this) { status ->
            if (status != TextToSpeech.ERROR) {
                tts.language = Locale.ENGLISH
            }
        }

        findViewById<Button>(R.id.listen_button).setOnClickListener {
            tts.speak("Listening...", TextToSpeech.QUEUE_FLUSH, null, null)
        }
    }
}
