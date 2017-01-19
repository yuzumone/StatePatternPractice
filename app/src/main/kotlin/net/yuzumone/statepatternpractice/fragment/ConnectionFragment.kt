package net.yuzumone.statepatternpractice.fragment

import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import net.yuzumone.statepatternpractice.OnChangeTextListener
import net.yuzumone.statepatternpractice.context.ConnectionStateContext
import net.yuzumone.statepatternpractice.databinding.FragmentConnectionBinding

class ConnectionFragment : Fragment(), OnChangeTextListener {

    private lateinit var binding: FragmentConnectionBinding
    private lateinit var context: ConnectionStateContext

    override fun onCreateView(inflater: LayoutInflater?, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        binding = FragmentConnectionBinding.inflate(inflater, container, false)
        initView()
        context = ConnectionStateContext()
        return binding.root
    }

    fun initView() {
        binding.buttonConnected.setOnClickListener {
            context.onSwitchConnected(this)
        }
        binding.buttonDisconnected.setOnClickListener {
            context.onSwitchDisconnected(this)
        }
        binding.buttonHello.setOnClickListener {
            context.onHello(this)
        }
        binding.buttonFeature.setOnClickListener {
            context.onFeature(this)
        }
        binding.buttonSuccess.setOnClickListener {
            context.onSuccess(this)
        }
        binding.buttonError.setOnClickListener {
            context.onError(this)
        }
        binding.buttonTimeout.setOnClickListener {
            context.onTimeOut(this)
        }
    }

    override fun onChangeText(string: String) {
        binding.text.text = string
    }
}