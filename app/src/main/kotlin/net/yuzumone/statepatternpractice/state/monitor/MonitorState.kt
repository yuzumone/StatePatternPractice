package net.yuzumone.statepatternpractice.state.monitor

import net.yuzumone.statepatternpractice.OnChangeTextListener
import net.yuzumone.statepatternpractice.context.MonitorStateContext

interface MonitorState {
    fun onMonitoringRequest(monitorState: MonitorStateContext, listener: OnChangeTextListener)
    fun onMonitoringReply(monitorState: MonitorStateContext, listener: OnChangeTextListener)
}