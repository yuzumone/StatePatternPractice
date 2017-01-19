package net.yuzumone.statepatternpractice.context

import net.yuzumone.statepatternpractice.OnChangeTextListener
import net.yuzumone.statepatternpractice.state.connection.ConnectionState
import net.yuzumone.statepatternpractice.state.connection.Listen

class ConnectionStateContext() {

    private var state: ConnectionState = Listen

    fun setState(state: ConnectionState) {
        this.state = state
    }

    fun onSwitchConnected(listener: OnChangeTextListener) {
        state.onSwitchConnected(this, listener)
    }

    fun onSwitchDisconnected(listener: OnChangeTextListener) {
        state.onSwitchDisconnected(this, listener)
    }

    fun onHello(listener: OnChangeTextListener) {
        state.onHello(this, listener)
    }

    fun onFeature(listener: OnChangeTextListener) {
        state.onFeature(this, listener)
    }

    fun onTimeOut(listener: OnChangeTextListener) {
        state.onTimeOut(this, listener)
    }

    fun onSuccess(listener: OnChangeTextListener) {
        state.onSuccess(this, listener)
    }

    fun onError(listener: OnChangeTextListener) {
        state.onError(this, listener)
    }
}