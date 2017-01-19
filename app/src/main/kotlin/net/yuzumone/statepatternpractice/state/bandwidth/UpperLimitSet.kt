package net.yuzumone.statepatternpractice.state.bandwidth

import net.yuzumone.statepatternpractice.OnChangeTextListener
import net.yuzumone.statepatternpractice.context.BandwidthStateContext

object UpperLimitSet : BandwidthState {
    override fun onBandwidthLimitation(bandwidthState: BandwidthStateContext, listener: OnChangeTextListener) {
        listener.onChangeText("Ignore / UpperLimitSet")
    }

    override fun onBandwidthUsageReportReply(bandwidthState: BandwidthStateContext, listener: OnChangeTextListener) {
        listener.onChangeText("Ignore / UpperLimitSet")
    }

    override fun onBandwidthUsageReportRequest(bandwidthState: BandwidthStateContext, listener: OnChangeTextListener) {
        listener.onChangeText("Ignore / UpperLimitSet")
    }

    override fun onCongestionPredictionReply(bandwidthState: BandwidthStateContext, listener: OnChangeTextListener) {
        listener.onChangeText("None / End(Start)")
        bandwidthState.setState(Start)
    }

    override fun onCongestionPredictionRequest(bandwidthState: BandwidthStateContext, listener: OnChangeTextListener) {
        listener.onChangeText("Ignore / UpperLimitSet")
    }

    override fun onPortUsageReportReply(bandwidthState: BandwidthStateContext, listener: OnChangeTextListener) {
        listener.onChangeText("Ignore / UpperLimitSet")
    }

    override fun onPortUsageReportRequest(bandwidthState: BandwidthStateContext, listener: OnChangeTextListener) {
        listener.onChangeText("Ignore / UpperLimitSet")
    }
}