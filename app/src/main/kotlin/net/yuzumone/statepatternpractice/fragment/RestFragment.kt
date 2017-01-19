package net.yuzumone.statepatternpractice.fragment

import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import net.yuzumone.statepatternpractice.OnChangeTextListener
import net.yuzumone.statepatternpractice.context.RestStateContext
import net.yuzumone.statepatternpractice.databinding.FragmentRestBinding

class RestFragment : Fragment(), OnChangeTextListener {

    private lateinit var binding: FragmentRestBinding
    private lateinit var context: RestStateContext

    override fun onCreateView(inflater: LayoutInflater?, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        binding = FragmentRestBinding.inflate(inflater, container, false)
        initView()
        context = RestStateContext()
        return binding.root
    }

    fun initView() {
        binding.buttonRequest.setOnClickListener {
            context.onSystemStatusRequest(this)
        }
        binding.buttonReply.setOnClickListener {
            context.onSystemStatusReply(this)
        }
    }

    override fun onChangeText(string: String) {
        binding.text.text = string
    }
}