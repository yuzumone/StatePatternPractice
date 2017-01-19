package net.yuzumone.statepatternpractice.state.bandwidth

import net.yuzumone.statepatternpractice.OnChangeTextListener
import net.yuzumone.statepatternpractice.context.BandwidthStateContext

object Start : BandwidthState {
    override fun onBandwidthUsageReportReply(bandwidthState: BandwidthStateContext, listener: OnChangeTextListener) {
        listener.onChangeText("Ignore / Start")
    }

    override fun onBandwidthLimitation(bandwidthState: BandwidthStateContext, listener: OnChangeTextListener) {
        listener.onChangeText("Ignore / Start")
    }

    override fun onBandwidthUsageReportRequest(bandwidthState: BandwidthStateContext, listener: OnChangeTextListener) {
        listener.onChangeText("Ignore / Start")
    }

    override fun onCongestionPredictionReply(bandwidthState: BandwidthStateContext, listener: OnChangeTextListener) {
        listener.onChangeText("Ignore / Start")
    }

    override fun onCongestionPredictionRequest(bandwidthState: BandwidthStateContext, listener: OnChangeTextListener) {
        listener.onChangeText("None / CongestionPredictionRequest-Received")
        bandwidthState.setState(CongestionPredictionRequestReceived)
    }

    override fun onPortUsageReportReply(bandwidthState: BandwidthStateContext, listener: OnChangeTextListener) {
        listener.onChangeText("Ignore / Start")
    }

    override fun onPortUsageReportRequest(bandwidthState: BandwidthStateContext, listener: OnChangeTextListener) {
        listener.onChangeText("Ignore / Start")
    }
}