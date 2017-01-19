package net.yuzumone.statepatternpractice.fragment

import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import net.yuzumone.statepatternpractice.OnChangeTextListener
import net.yuzumone.statepatternpractice.context.BandwidthStateContext
import net.yuzumone.statepatternpractice.databinding.FragmentBandwidthBinding

class BandwidthFragment : Fragment(), OnChangeTextListener {

    private lateinit var binding: FragmentBandwidthBinding
    private lateinit var context: BandwidthStateContext

    override fun onCreateView(inflater: LayoutInflater?, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        binding = FragmentBandwidthBinding.inflate(inflater, container, false)
        initView()
        context = BandwidthStateContext()
        return binding.root
    }

    fun initView() {
        binding.buttonCongestionRequest.setOnClickListener {
            context.onCongestionPredictionRequest(this)
        }
        binding.buttonBandwidthReportRequest.setOnClickListener {
            context.onBandwidthUsageReportRequest(this)
        }
        binding.buttonBandwidthReportReply.setOnClickListener {
            context.onBandwidthUsageReportReply(this)
        }
        binding.buttonPortReportRequest.setOnClickListener {
            context.onPortUsageReportRequest(this)
        }
        binding.buttonPortReportReply.setOnClickListener {
            context.onPortUsageReportReply(this)
        }
        binding.buttonLimitation.setOnClickListener {
            context.onBandwidthLimitation(this)
        }
        binding.buttonCongestionReply.setOnClickListener {
            context.onCongestionPredictionReply(this)
        }
    }

    override fun onChangeText(string: String) {
        binding.text.text = string
    }
}