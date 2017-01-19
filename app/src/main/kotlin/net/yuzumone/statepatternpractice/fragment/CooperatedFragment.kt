package net.yuzumone.statepatternpractice.fragment

import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import net.yuzumone.statepatternpractice.OnChangeTextListener
import net.yuzumone.statepatternpractice.context.CooperatedStateContext
import net.yuzumone.statepatternpractice.databinding.FragmentCooperatedBinding

class CooperatedFragment : Fragment(), OnChangeTextListener {

    private lateinit var binding: FragmentCooperatedBinding
    private lateinit var context: CooperatedStateContext

    override fun onCreateView(inflater: LayoutInflater?, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        binding = FragmentCooperatedBinding.inflate(inflater, container, false)
        initView()
        context = CooperatedStateContext()
        return binding.root
    }

    fun initView() {
        binding.buttonModificationRequest.setOnClickListener {
            context.onOutPortModificationRequest(this)
        }
        binding.buttonInformationRequest.setOnClickListener {
            context.onPortInformationRequest(this)
        }
        binding.buttonInformationReply.setOnClickListener {
            context.onPortInformationReply(this)
        }
        binding.buttonModificationReply.setOnClickListener {
            context.onOutPortModificationReply(this)
        }
    }

    override fun onChangeText(string: String) {
        binding.text.text = string
    }
}