package net.yuzumone.statepatternpractice.state.priority

import net.yuzumone.statepatternpractice.OnChangeTextListener
import net.yuzumone.statepatternpractice.context.PriorityStateContext

interface PriorityState {
    fun onGuaranteeBandwidthModificationRequest(priorityState: PriorityStateContext, listener: OnChangeTextListener)
    fun onBandwidthUsageReportRequest(priorityState: PriorityStateContext, listener: OnChangeTextListener)
    fun onBandwidthUsageReportReply(priorityState: PriorityStateContext, listener: OnChangeTextListener)
    fun onGuaranteeBandwidthModificationReply(priorityState: PriorityStateContext, listener: OnChangeTextListener)
}