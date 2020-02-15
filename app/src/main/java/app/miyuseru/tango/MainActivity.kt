package app.miyuseru.tango

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.LinearLayout
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val apple = Word(R.drawable.apple, "りんご")
        val banana = Word(R.drawable.banana, "ばなな")
        val orange = Word(R.drawable.orange, "オレンジ")
        val strawberry = Word(R.drawable.strawberry, "いちご")


        addWord(apple)
        addWord(banana)
        addWord(orange)
        addWord(strawberry)


    }

        private fun addWord(word: Word) {
            val nameTextView = TextView(this)
            nameTextView.text = word.name

            val layout = LinearLayout(this)
            layout.orientation = LinearLayout.HORIZONTAL

            val imageView = ImageView(this)
            imageView.setImageResource(word.resId)

            layout.addView(imageView)
            layout.addView(nameTextView)

            container.addView(layout)


        }


/*
        val nameTextView = TextView(this)
        nameTextView.text = apple.name

     // container.addView(nameTextView)

        val layout = LinearLayout(this)
        layout.orientation= LinearLayout.HORIZONTAL

        val imageView = ImageView(this)
        imageView.setImageResource(apple.resId)

        layout.addView(imageView)
        layout.addView(nameTextView)

        container.addView(layout)





        val nameTextView2 = TextView(applicationContext)
        nameTextView2.text = banana.name

        //  container.addView(nameTextView)

        val layout2 = LinearLayout(this.applicationContext)
        layout2.orientation= LinearLayout.HORIZONTAL

        val imageView2 = ImageView(this)
        imageView2.setImageResource(banana.resId)

        layout2.addView(imageView2)
        layout2.addView(nameTextView2)

        container.addView(layout2)



        val nameTextView3 = TextView(applicationContext)
        nameTextView3.text = orange.name

        //  container.addView(nameTextView)

        val layout3 = LinearLayout(this.applicationContext)
        layout3.orientation= LinearLayout.HORIZONTAL

        val imageView3 = ImageView(this)
        imageView3.setImageResource(orange.resId)

        layout3.addView(imageView3)
        layout3.addView(nameTextView3)

        container.addView(layout3)




        val nameTextView4 = TextView(applicationContext)
        nameTextView4.text = strawberry.name

        //  container.addView(nameTextView)

        val layout4 = LinearLayout(this.applicationContext)
        layout4.orientation= LinearLayout.HORIZONTAL

        val imageView4 = ImageView(this)
        imageView3.setImageResource(strawberry.resId)

        layout4.addView(imageView4)
        layout4.addView(nameTextView4)

        container.addView(layout4)

 */




}
