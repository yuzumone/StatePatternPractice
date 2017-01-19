package net.yuzumone.statepatternpractice.state.monitor

import net.yuzumone.statepatternpractice.OnChangeTextListener
import net.yuzumone.statepatternpractice.context.MonitorStateContext

object Monitoring : MonitorState {
    override fun onMonitoringReply(monitorState: MonitorStateContext, listener: OnChangeTextListener) {
        listener.onChangeText("None / End(Start)")
        monitorState.setState(Start)
    }

    override fun onMonitoringRequest(monitorState: MonitorStateContext, listener: OnChangeTextListener) {
        listener.onChangeText("Ignore / Monitoring")
    }
}