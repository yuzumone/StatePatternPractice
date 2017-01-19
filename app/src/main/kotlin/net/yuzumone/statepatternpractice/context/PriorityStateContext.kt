package net.yuzumone.statepatternpractice.context

import net.yuzumone.statepatternpractice.OnChangeTextListener
import net.yuzumone.statepatternpractice.state.priority.PriorityState
import net.yuzumone.statepatternpractice.state.priority.Start

class PriorityStateContext {

    private var state: PriorityState = Start

    fun setState(state: PriorityState) {
        this.state = state
    }

    fun onGuaranteeBandwidthModificationRequest(listener: OnChangeTextListener) {
        state.onGuaranteeBandwidthModificationRequest(this, listener)
    }

    fun onBandwidthUsageReportRequest(listener: OnChangeTextListener) {
        state.onBandwidthUsageReportRequest(this, listener)
    }

    fun onBandwidthUsageReportReply(listener: OnChangeTextListener) {
        state.onBandwidthUsageReportReply(this, listener)
    }

    fun onGuaranteeBandwidthModificationReply(listener: OnChangeTextListener) {
        state.onGuaranteeBandwidthModificationReply(this, listener)
    }
}