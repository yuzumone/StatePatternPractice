package net.yuzumone.statepatternpractice.state.priority

import net.yuzumone.statepatternpractice.OnChangeTextListener
import net.yuzumone.statepatternpractice.context.PriorityStateContext

object QoSSet : PriorityState {
    override fun onBandwidthUsageReportReply(priorityState: PriorityStateContext, listener: OnChangeTextListener) {
        listener.onChangeText("Ignore / QoS-Set")
    }

    override fun onBandwidthUsageReportRequest(priorityState: PriorityStateContext, listener: OnChangeTextListener) {
        listener.onChangeText("Ignore / QoS-Set")
    }

    override fun onGuaranteeBandwidthModificationReply(priorityState: PriorityStateContext, listener: OnChangeTextListener) {
        listener.onChangeText("None / End(Start)")
        priorityState.setState(Start)
    }

    override fun onGuaranteeBandwidthModificationRequest(priorityState: PriorityStateContext, listener: OnChangeTextListener) {
        listener.onChangeText("Ignore / QoS-Set")
    }
}