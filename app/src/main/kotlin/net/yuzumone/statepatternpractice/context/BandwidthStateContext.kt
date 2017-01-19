package net.yuzumone.statepatternpractice.context

import net.yuzumone.statepatternpractice.OnChangeTextListener
import net.yuzumone.statepatternpractice.state.bandwidth.BandwidthState
import net.yuzumone.statepatternpractice.state.bandwidth.Start

class BandwidthStateContext {

    private var state: BandwidthState = Start

    fun setState(state: BandwidthState) {
        this.state = state
    }

    fun onCongestionPredictionRequest(listener: OnChangeTextListener) {
        state.onCongestionPredictionRequest(this, listener)
    }

    fun onBandwidthUsageReportRequest(listener: OnChangeTextListener) {
        state.onBandwidthUsageReportRequest(this, listener)
    }

    fun onBandwidthUsageReportReply(listener: OnChangeTextListener) {
        state.onBandwidthUsageReportReply(this, listener)
    }

    fun onPortUsageReportRequest(listener: OnChangeTextListener) {
        state.onPortUsageReportRequest(this, listener)
    }

    fun onPortUsageReportReply(listener: OnChangeTextListener) {
        state.onPortUsageReportReply(this, listener)
    }

    fun onBandwidthLimitation(listener: OnChangeTextListener) {
        state.onBandwidthLimitation(this, listener)
    }

    fun onCongestionPredictionReply(listener: OnChangeTextListener) {
        state.onCongestionPredictionReply(this, listener)
    }
}