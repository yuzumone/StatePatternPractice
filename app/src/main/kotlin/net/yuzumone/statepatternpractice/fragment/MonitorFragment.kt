package net.yuzumone.statepatternpractice.fragment

import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import net.yuzumone.statepatternpractice.OnChangeTextListener
import net.yuzumone.statepatternpractice.context.MonitorStateContext
import net.yuzumone.statepatternpractice.databinding.FragmentMonitorBinding

class MonitorFragment : Fragment(), OnChangeTextListener {

    private lateinit var binding: FragmentMonitorBinding
    private lateinit var context: MonitorStateContext

    override fun onCreateView(inflater: LayoutInflater?, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        binding = FragmentMonitorBinding.inflate(inflater, container, false)
        initView()
        context = MonitorStateContext()
        return binding.root
    }

    fun initView() {
        binding.buttonRequest.setOnClickListener {
            context.onMonitoringRequest(this)
        }
        binding.buttonReply.setOnClickListener {
            context.onMonitoringReply(this)
        }
    }

    override fun onChangeText(string: String) {
        binding.text.text = string
    }
}