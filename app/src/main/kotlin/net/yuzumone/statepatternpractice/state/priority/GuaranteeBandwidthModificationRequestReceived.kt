package net.yuzumone.statepatternpractice.state.priority

import net.yuzumone.statepatternpractice.OnChangeTextListener
import net.yuzumone.statepatternpractice.context.PriorityStateContext

object GuaranteeBandwidthModificationRequestReceived : PriorityState {
    override fun onBandwidthUsageReportReply(priorityState: PriorityStateContext, listener: OnChangeTextListener) {
        listener.onChangeText("Ignore / GuaranteeBandwidthModificationRequestReceived")
    }

    override fun onBandwidthUsageReportRequest(priorityState: PriorityStateContext, listener: OnChangeTextListener) {
        listener.onChangeText("sendBandwidthUsageReportRequest() / BandwidthUsageReportRequest-Sent")
        priorityState.setState(BandwidthUsageReportRequestSent)
    }

    override fun onGuaranteeBandwidthModificationReply(priorityState: PriorityStateContext, listener: OnChangeTextListener) {
        listener.onChangeText("Ignore / GuaranteeBandwidthModificationRequestReceived")
    }

    override fun onGuaranteeBandwidthModificationRequest(priorityState: PriorityStateContext, listener: OnChangeTextListener) {
        listener.onChangeText("Ignore / GuaranteeBandwidthModificationRequestReceived")
    }
}