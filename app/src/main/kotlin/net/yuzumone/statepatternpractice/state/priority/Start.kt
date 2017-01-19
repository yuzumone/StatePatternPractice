package net.yuzumone.statepatternpractice.state.priority

import net.yuzumone.statepatternpractice.OnChangeTextListener
import net.yuzumone.statepatternpractice.context.PriorityStateContext

object Start : PriorityState {
    override fun onBandwidthUsageReportReply(priorityState: PriorityStateContext, listener: OnChangeTextListener) {
        listener.onChangeText("Ignore / Start")
    }

    override fun onBandwidthUsageReportRequest(priorityState: PriorityStateContext, listener: OnChangeTextListener) {
        listener.onChangeText("Ignore / Start")
    }

    override fun onGuaranteeBandwidthModificationReply(priorityState: PriorityStateContext, listener: OnChangeTextListener) {
        listener.onChangeText("Ignore / Start")
    }

    override fun onGuaranteeBandwidthModificationRequest(priorityState: PriorityStateContext, listener: OnChangeTextListener) {
        listener.onChangeText("None / GuaranteeBandwidthModificationRequestReceived")
        priorityState.setState(GuaranteeBandwidthModificationRequestReceived)
    }
}