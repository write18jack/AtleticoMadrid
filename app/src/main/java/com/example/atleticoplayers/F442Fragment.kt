package com.example.atleticoplayers

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageButton

private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

class F442Fragment : Fragment() {
    // TODO: Rename and change types of parameters
    private var param1: String? = null
    private var param2: String? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {
            param1 = it.getString(ARG_PARAM1)
            param2 = it.getString(ARG_PARAM2)
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val screen = inflater.inflate(R.layout.fragment_f442, container, false)

        screen.findViewById<ImageButton>(R.id.lst).setOnClickListener(subbtn)
        screen.findViewById<ImageButton>(R.id.rst).setOnClickListener()
        val lm = screen.findViewById<ImageButton>(R.id.lm)
        val lcm = screen.findViewById<ImageButton>(R.id.lcm)
        val rcm = screen.findViewById<ImageButton>(R.id.rcm)
        val rm = screen.findViewById<ImageButton>(R.id.rm)
        val lfb = screen.findViewById<ImageButton>(R.id.lfb)
        val lcb = screen.findViewById<ImageButton>(R.id.lcb)
        val rcb = screen.findViewById<ImageButton>(R.id.rcb)
        val rfb = screen.findViewById<ImageButton>(R.id.rfb)
        val gk = screen.findViewById<ImageButton>(R.id.gk)

        val subbtn = object: View.OnClickListener {


        }

        return screen
    }

    companion object {
        @JvmStatic
        fun newInstance(param1: String, param2: String) =
            F442Fragment().apply {
                arguments = Bundle().apply {
                    putString(ARG_PARAM1, param1)
                    putString(ARG_PARAM2, param2)
                }
            }
    }
}