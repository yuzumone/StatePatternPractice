package net.yuzumone.statepatternpractice.state.bandwidth

import net.yuzumone.statepatternpractice.OnChangeTextListener
import net.yuzumone.statepatternpractice.context.BandwidthStateContext

object PortUsageReportSent : BandwidthState {
    override fun onBandwidthLimitation(bandwidthState: BandwidthStateContext, listener: OnChangeTextListener) {
        listener.onChangeText("Ignore / PortUsageReportSent")
    }

    override fun onBandwidthUsageReportReply(bandwidthState: BandwidthStateContext, listener: OnChangeTextListener) {
        listener.onChangeText("Ignore / PortUsageReportSent")
    }

    override fun onBandwidthUsageReportRequest(bandwidthState: BandwidthStateContext, listener: OnChangeTextListener) {
        listener.onChangeText("Ignore / PortUsageReportSent")
    }

    override fun onCongestionPredictionReply(bandwidthState: BandwidthStateContext, listener: OnChangeTextListener) {
        listener.onChangeText("Ignore / PortUsageReportSent")
    }

    override fun onCongestionPredictionRequest(bandwidthState: BandwidthStateContext, listener: OnChangeTextListener) {
        listener.onChangeText("Ignore / PortUsageReportSent")
    }

    override fun onPortUsageReportReply(bandwidthState: BandwidthStateContext, listener: OnChangeTextListener) {
        listener.onChangeText("None / ReplyReceived")
        bandwidthState.setState(ReplyReceived)
    }

    override fun onPortUsageReportRequest(bandwidthState: BandwidthStateContext, listener: OnChangeTextListener) {
        listener.onChangeText("Ignore / PortUsageReportSent")
    }
}