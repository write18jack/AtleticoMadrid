package com.example.atleticoplayers

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.atleticoplayers.CustomAdapter
import com.example.atleticoplayers.ItemsViewModel
import com.example.atleticoplayers.OrderFragment
import com.example.atleticoplayers.R

//app\build.gradle id 'kotlin-android-extensions'

class MainActivity : AppCompatActivity() {

    private lateinit var itemsViewModel: ItemsViewModel
    private val orderFragment = OrderFragment()

    //val colors = listOf(R.drawable.gradient_1, R.drawable.gradient_6,
       // R.drawable.gradient_3, R.drawable.gradient_4, R.drawable.gradient_5, R.drawable.gradient_6)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val titlelist: Array<String> = resources.getStringArray(R.array.title_list)


        //RecyclerViewの取得
        val recyclerView = findViewById<RecyclerView>(R.id.recycler_view)

        recyclerView.layoutManager = LinearLayoutManager(this)

        //val anime = resources.getAnimation(R.anim.animation1)

        val data = ArrayList<ItemsViewModel>()

        for(i in 0..5){
            data.add(ItemsViewModel(titlelist[i]))
        }

        val adapter = CustomAdapter(data)

        //attach the array adapter with list view
        recyclerView.adapter = adapter

        adapter.setOnCellClickListener(
            object : CustomAdapter.onCellClickListener{
                override fun onItemClick(itemsViewModel: ItemsViewModel) {
                    when(itemsViewModel.text){
                        titlelist[0] -> replaceFragment(orderFragment)
                    }

                }
                private fun replaceFragment(fragment: Fragment){
                    val transaction =  supportFragmentManager.beginTransaction()
                    transaction.add(R.id.card_view, fragment).commit()
                }
            }
        )

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