package net.yuzumone.statepatternpractice.state.connection

import net.yuzumone.statepatternpractice.OnChangeTextListener
import net.yuzumone.statepatternpractice.context.ConnectionStateContext

object Initialize : ConnectionState {
    override fun onError(connectionState: ConnectionStateContext, listener: OnChangeTextListener) {
        listener.onChangeText("None / Listen")
        connectionState.setState(Listen)
    }

    override fun onFeature(connectionState: ConnectionStateContext, listener: OnChangeTextListener) {
        listener.onChangeText("Ignore / Initialize")
    }

    override fun onHello(connectionState: ConnectionStateContext, listener: OnChangeTextListener) {
        listener.onChangeText("Ignore / Initialize")
    }

    override fun onSuccess(connectionState: ConnectionStateContext, listener: OnChangeTextListener) {
        listener.onChangeText("addConnectedSwitch() / Listen")
        connectionState.setState(Listen)
    }

    override fun onSwitchConnected(connectionState: ConnectionStateContext, listener: OnChangeTextListener) {
        listener.onChangeText("Ignore / Initialize")
    }

    override fun onSwitchDisconnected(connectionState: ConnectionStateContext, listener: OnChangeTextListener) {
        listener.onChangeText("Ignore / Initialize")
    }

    override fun onTimeOut(connectionState: ConnectionStateContext, listener: OnChangeTextListener) {
        listener.onChangeText("Ignore / Initialize")
    }
}