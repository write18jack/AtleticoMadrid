package com.example.atleticoplayers

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

//app\build.gradle id 'kotlin-android-extensions'
class MainActivity : AppCompatActivity() {

    //private lateinit var itemsViewModel: ItemsViewModel
    private val orderFragment = FormationFragment()

    //val colors = listOf(R.drawable.gradient_1, R.drawable.gradient_6,
       // R.drawable.gradient_3, R.drawable.gradient_4, R.drawable.gradient_5, R.drawable.gradient_6)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


    }
}

/*fun Int.toDp(context: Context):Int =  TypedValue.applyDimension(
    TypedValue.COMPLEX_UNIT_DIP,this.toFloat(),context.resources.displayMetrics
).toInt()

//initialize an array adapter
val adapter:ArrayAdapter<String> = object :ArrayAdapter<String>(
    this, android.R.layout.simple_list_item_1, title_list) {

    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {

        val textView:MaterialTextView = super.getView(position, convertView, parent)
                as MaterialTextView

        //height programmatically
        textView.layoutParams.height = 130.toDp(context)
        return textView
    }
}*/