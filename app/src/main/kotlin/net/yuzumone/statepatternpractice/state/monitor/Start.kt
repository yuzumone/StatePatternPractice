package net.yuzumone.statepatternpractice.state.monitor

import net.yuzumone.statepatternpractice.OnChangeTextListener
import net.yuzumone.statepatternpractice.context.MonitorStateContext

object Start : MonitorState {
    override fun onMonitoringReply(monitorState: MonitorStateContext, listener: OnChangeTextListener) {
        listener.onChangeText("Ignore / Start")
    }

    override fun onMonitoringRequest(monitorState: MonitorStateContext, listener: OnChangeTextListener) {
        listener.onChangeText("monitor() / Monitoring")
        monitorState.setState(Monitoring)
    }
}