package com.example.atleticoplayers.squad

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.Spinner
import androidx.navigation.findNavController
import androidx.navigation.fragment.findNavController
import com.example.atleticoplayers.R
import com.example.atleticoplayers.databinding.FragmentSquadBinding
import com.example.atleticoplayers.formations.F442Fragment
import com.example.atleticoplayers.formations.F532Fragment
import com.example.atleticoplayers.formations.F541Fragment

class SquadFragment : Fragment() {

    private lateinit var binding: FragmentSquadBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = FragmentSquadBinding.inflate(inflater, container, false)

        return binding.root
        //ログも追加する
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val formations = resources.getStringArray(R.array.formations)

        //spinner choose formation
        val adapter = ArrayAdapter(requireContext(), android.R.layout.simple_gallery_item, formations)

        binding.formationSpinner.apply {

            setAdapter(adapter)
            onItemSelectedListener = object :
                AdapterView.OnItemSelectedListener {
                override fun onItemSelected(
                    parent: AdapterView<*>,
                    view: View,
                    position: Int,
                    id: Long
                ) {
                    when (position) {
                        0 -> {
                            findNavController().navigate(R.id.action_squadFragment_to_f3142Fragment)
                        }
                        1 -> {
                            findNavController().navigate(R.id.action_squadFragment_to_f442Fragment)
                        }
                        2 -> {
                            findNavController().navigate(R.id.action_squadFragment_to_f532Fragment)
                        }
                        3 -> {
                            findNavController().navigate(R.id.action_squadFragment_to_f541Fragment)
                        }
                    }
                }
                override fun onNothingSelected(p0: AdapterView<*>?) {
                }
            }

        }
    }
}

/*<androidx.fragment.app.FragmentContainerView
android:name="com.example.atleticoplayers.squad.SquadFragment"
android:id="@+id/fom_fra"
android:layout_width="match_parent"
android:layout_height="match_parent"
android:layout_marginTop="60dp" />*/