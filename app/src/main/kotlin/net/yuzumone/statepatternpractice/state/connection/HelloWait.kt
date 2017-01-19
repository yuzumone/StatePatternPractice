package net.yuzumone.statepatternpractice.state.connection

import net.yuzumone.statepatternpractice.OnChangeTextListener
import net.yuzumone.statepatternpractice.context.ConnectionStateContext

object HelloWait : ConnectionState {
    override fun onError(connectionState: ConnectionStateContext, listener: OnChangeTextListener) {
        listener.onChangeText("Ignore / HelloWait")
    }

    override fun onFeature(connectionState: ConnectionStateContext, listener: OnChangeTextListener) {
        listener.onChangeText("Ignore / HelloWait")
    }

    override fun onHello(connectionState: ConnectionStateContext, listener: OnChangeTextListener) {
        listener.onChangeText("requestFeature() / FeatureWait")
        connectionState.setState(FeatureWait)
    }

    override fun onSuccess(connectionState: ConnectionStateContext, listener: OnChangeTextListener) {
        listener.onChangeText("Ignore / HelloWait")
    }

    override fun onSwitchConnected(connectionState: ConnectionStateContext, listener: OnChangeTextListener) {
        listener.onChangeText("Ignore / HelloWait")
    }

    override fun onSwitchDisconnected(connectionState: ConnectionStateContext, listener: OnChangeTextListener) {
        listener.onChangeText("Ignore / HelloWait")
    }

    override fun onTimeOut(connectionState: ConnectionStateContext, listener: OnChangeTextListener) {
        listener.onChangeText("None / Listen")
        connectionState.setState(Listen)
    }
}