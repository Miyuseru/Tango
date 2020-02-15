package app.miyuseru.tango

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

      val apple = Word(R.drawable.apple,"りんご")

        val nameTextView = TextView(applicationContext)
        nameTextView.text = apple.name

        container.addView(nameTextView)






    }


}
