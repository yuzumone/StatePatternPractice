package net.yuzumone.statepatternpractice.context

import net.yuzumone.statepatternpractice.OnChangeTextListener
import net.yuzumone.statepatternpractice.state.monitor.MonitorState
import net.yuzumone.statepatternpractice.state.monitor.Start

class MonitorStateContext {

    private var state: MonitorState = Start

    fun setState(state: MonitorState) {
        this.state = state
    }

    fun onMonitoringRequest(listener: OnChangeTextListener) {
        state.onMonitoringRequest(this, listener)
    }

    fun onMonitoringReply(listener: OnChangeTextListener) {
        state.onMonitoringReply(this, listener)
    }
}