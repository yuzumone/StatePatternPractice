package net.yuzumone.statepatternpractice.state.connection

import net.yuzumone.statepatternpractice.OnChangeTextListener
import net.yuzumone.statepatternpractice.context.ConnectionStateContext

object Listen : ConnectionState {
    override fun onError(connectionState: ConnectionStateContext, listener: OnChangeTextListener) {
        listener.onChangeText("Ignore / Listen")
    }

    override fun onFeature(connectionState: ConnectionStateContext, listener: OnChangeTextListener) {
        listener.onChangeText("Ignore / Listen")
    }

    override fun onHello(connectionState: ConnectionStateContext, listener: OnChangeTextListener) {
        listener.onChangeText("Ignore / Listen")
    }

    override fun onSuccess(connectionState: ConnectionStateContext, listener: OnChangeTextListener) {
        listener.onChangeText("Ignore / Listen")
    }

    override fun onSwitchConnected(connectionState: ConnectionStateContext, listener: OnChangeTextListener) {
        listener.onChangeText("hello() / HelloWait")
        connectionState.setState(HelloWait)
    }

    override fun onSwitchDisconnected(connectionState: ConnectionStateContext, listener: OnChangeTextListener) {
        listener.onChangeText("deleteConnectedSwitch() / Listen")
        connectionState.setState(Listen)
    }

    override fun onTimeOut(connectionState: ConnectionStateContext, listener: OnChangeTextListener) {
        listener.onChangeText("Ignore / Listen")
    }
}