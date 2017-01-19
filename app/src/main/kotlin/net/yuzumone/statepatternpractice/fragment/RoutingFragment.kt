package net.yuzumone.statepatternpractice.fragment

import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import net.yuzumone.statepatternpractice.OnChangeTextListener
import net.yuzumone.statepatternpractice.context.RoutingStateContext
import net.yuzumone.statepatternpractice.databinding.FragmentRoutingBinding

class RoutingFragment : Fragment(), OnChangeTextListener {

    private lateinit var binding: FragmentRoutingBinding
    private lateinit var context: RoutingStateContext

    override fun onCreateView(inflater: LayoutInflater?, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        binding = FragmentRoutingBinding.inflate(inflater, container, false)
        initView()
        context = RoutingStateContext()
        return binding.root
    }

    fun initView() {
        binding.buttonRequest.setOnClickListener {
            context.onRoutingRequest(this)
        }
        binding.buttonRegistration.setOnClickListener {
            context.onTableRegistration(this)
        }
        binding.buttonFlooding.setOnClickListener {
            context.onFlooding(this)
        }
        binding.buttonReply.setOnClickListener {
            context.onRoutingReply(this)
        }
    }

    override fun onChangeText(string: String) {
        binding.text.text = string
    }
}