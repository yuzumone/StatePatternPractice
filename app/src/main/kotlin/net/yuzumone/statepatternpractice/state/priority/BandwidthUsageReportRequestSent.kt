package net.yuzumone.statepatternpractice.state.priority

import net.yuzumone.statepatternpractice.OnChangeTextListener
import net.yuzumone.statepatternpractice.context.PriorityStateContext

object BandwidthUsageReportRequestSent : PriorityState {
    override fun onBandwidthUsageReportReply(priorityState: PriorityStateContext, listener: OnChangeTextListener) {
        listener.onChangeText("modifyGuaranteeBandwidth() / QoS-Set")
        priorityState.setState(QoSSet)
    }

    override fun onBandwidthUsageReportRequest(priorityState: PriorityStateContext, listener: OnChangeTextListener) {
        listener.onChangeText("Ignore / BandwidthUsageReportRequestSent")
    }

    override fun onGuaranteeBandwidthModificationReply(priorityState: PriorityStateContext, listener: OnChangeTextListener) {
        listener.onChangeText("Ignore / BandwidthUsageReportRequestSent")
    }

    override fun onGuaranteeBandwidthModificationRequest(priorityState: PriorityStateContext, listener: OnChangeTextListener) {
        listener.onChangeText("Ignore / BandwidthUsageReportRequestSent")
    }
}