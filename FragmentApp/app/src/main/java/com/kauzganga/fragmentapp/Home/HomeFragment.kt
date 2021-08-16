package com.kauzganga.fragmentapp.Home

import android.os.Bundle
import android.view.*
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.ViewModelProviders
import androidx.navigation.Navigation
import androidx.navigation.findNavController

import com.kauzganga.fragmentapp.R
import com.kauzganga.fragmentapp.databinding.FragmentHomeBinding
/**
 * A simple [Fragment] subclass.
 */
class HomeFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val objBinding = DataBindingUtil.inflate<FragmentHomeBinding>(inflater,R.layout.fragment_home,container,false)
        objBinding.homeText.text ="this is the text"
        val viewModel = ViewModelProvider(this).get(HomeViewModel::class.java)
       // objBinding.homeViewModel = viewModel
        objBinding.toAbout.setOnClickListener {
            it.findNavController().navigate(R.id.action_homeFragment_to_aboutFragment)
        }
        setHasOptionsMenu(true)
        return objBinding.root
    }

    override fun onCreateOptionsMenu(menu: Menu, inflater: MenuInflater) {
        super.onCreateOptionsMenu(menu, inflater)
        inflater.inflate(R.menu.main_menu,menu)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when(item.itemId){
            R.id.menu_about ->Toast.makeText(context,"about clicked",Toast.LENGTH_LONG).show()
            R.id.menu_settings -> Toast.makeText(context,"settings clicked",Toast.LENGTH_LONG).show()
        }
        return super.onOptionsItemSelected(item)
    }
}
