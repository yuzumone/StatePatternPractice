package net.yuzumone.statepatternpractice.state.bandwidth

import net.yuzumone.statepatternpractice.OnChangeTextListener
import net.yuzumone.statepatternpractice.context.BandwidthStateContext

object CongestionPredictionRequestReceived : BandwidthState {
    override fun onBandwidthLimitation(bandwidthState: BandwidthStateContext, listener: OnChangeTextListener) {
        listener.onChangeText("Ignore / CongestionPredictionRequestReceived")
    }

    override fun onBandwidthUsageReportReply(bandwidthState: BandwidthStateContext, listener: OnChangeTextListener) {
        listener.onChangeText("Ignore / CongestionPredictionRequestReceived")
    }

    override fun onBandwidthUsageReportRequest(bandwidthState: BandwidthStateContext, listener: OnChangeTextListener) {
        listener.onChangeText("sendBandwidthUsageReportRequest() / BandwidthUsageReport-Sent")
        bandwidthState.setState(BandwidthUsageReportSent)
    }

    override fun onCongestionPredictionReply(bandwidthState: BandwidthStateContext, listener: OnChangeTextListener) {
        listener.onChangeText("Ignore / CongestionPredictionRequestReceived")
    }

    override fun onCongestionPredictionRequest(bandwidthState: BandwidthStateContext, listener: OnChangeTextListener) {
        listener.onChangeText("Ignore / CongestionPredictionRequestReceived")
    }

    override fun onPortUsageReportReply(bandwidthState: BandwidthStateContext, listener: OnChangeTextListener) {
        listener.onChangeText("Ignore / CongestionPredictionRequestReceived")
    }

    override fun onPortUsageReportRequest(bandwidthState: BandwidthStateContext, listener: OnChangeTextListener) {
        listener.onChangeText("sendPortUsageReportRequest() / PortUsageReport-Sent")
        bandwidthState.setState(PortUsageReportSent)
    }
}