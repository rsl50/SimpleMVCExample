package com.robsonlima.simplemvcexample.view

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.robsonlima.simplemvcexample.controller.MainController
import com.robsonlima.simplemvcexample.databinding.FragmentMainBinding

class MainFragment: Fragment() {
    // View Binding with 'fragment_main.xml' so we get reference to xml layout objects easier.
    private var _binding: FragmentMainBinding? = null
    private val binding get() = _binding!!
    // Holds the controller instance
    private var controller: MainController? = null

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        _binding = FragmentMainBinding.inflate(inflater, container, false)
        val view = binding.root
        return view
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        // Instantiate the controller
        controller = MainController()
        setupClickListeners()
    }

    // Setup the button in our fragment to call getUpdatedText method in viewModel
    private fun setupClickListeners() {
        binding.fragmentButton.setOnClickListener {
            // Update the textView with the data received through the controller
            binding.fragmentTextView.text = controller?.getUpdatedText()
        }
    }
}