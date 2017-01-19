package net.yuzumone.statepatternpractice.state.bandwidth

import net.yuzumone.statepatternpractice.OnChangeTextListener
import net.yuzumone.statepatternpractice.context.BandwidthStateContext

interface BandwidthState {
    fun onCongestionPredictionRequest(bandwidthState: BandwidthStateContext, listener: OnChangeTextListener)
    fun onBandwidthUsageReportRequest(bandwidthState: BandwidthStateContext, listener: OnChangeTextListener)
    fun onBandwidthUsageReportReply(bandwidthState: BandwidthStateContext, listener: OnChangeTextListener)
    fun onPortUsageReportRequest(bandwidthState: BandwidthStateContext, listener: OnChangeTextListener)
    fun onPortUsageReportReply(bandwidthState: BandwidthStateContext, listener: OnChangeTextListener)
    fun onBandwidthLimitation(bandwidthState: BandwidthStateContext, listener: OnChangeTextListener)
    fun onCongestionPredictionReply(bandwidthState: BandwidthStateContext, listener: OnChangeTextListener)
}