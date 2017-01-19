package net.yuzumone.statepatternpractice.fragment

import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import net.yuzumone.statepatternpractice.OnChangeTextListener
import net.yuzumone.statepatternpractice.context.PriorityStateContext
import net.yuzumone.statepatternpractice.databinding.FragmentPriorityBinding

class PriorityFragment : Fragment(), OnChangeTextListener {

    private lateinit var binding: FragmentPriorityBinding
    private lateinit var context: PriorityStateContext

    override fun onCreateView(inflater: LayoutInflater?, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        binding = FragmentPriorityBinding.inflate(inflater, container, false)
        initView()
        context = PriorityStateContext()
        return binding.root
    }

    fun initView() {
        binding.buttonGuaranteeRequest.setOnClickListener {
            context.onGuaranteeBandwidthModificationRequest(this)
        }
        binding.buttonReportRequest.setOnClickListener {
            context.onBandwidthUsageReportRequest(this)
        }
        binding.buttonReportReply.setOnClickListener {
            context.onBandwidthUsageReportReply(this)
        }
        binding.buttonGuaranteeReply.setOnClickListener {
            context.onGuaranteeBandwidthModificationReply(this)
        }
    }

    override fun onChangeText(string: String) {
        binding.text.text = string
    }
}