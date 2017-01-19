package net.yuzumone.statepatternpractice.state.connection

import net.yuzumone.statepatternpractice.OnChangeTextListener
import net.yuzumone.statepatternpractice.context.ConnectionStateContext

object FeatureWait : ConnectionState {
    override fun onError(connectionState: ConnectionStateContext, listener: OnChangeTextListener) {
        listener.onChangeText("Ignore / FeatureWait")
    }

    override fun onFeature(connectionState: ConnectionStateContext, listener: OnChangeTextListener) {
        listener.onChangeText("initialize() / Initialize")
        connectionState.setState(Initialize)
    }

    override fun onHello(connectionState: ConnectionStateContext, listener: OnChangeTextListener) {
        listener.onChangeText("Ignore / FeatureWait")
    }

    override fun onSuccess(connectionState: ConnectionStateContext, listener: OnChangeTextListener) {
        listener.onChangeText("Ignore / FeatureWait")
    }

    override fun onSwitchConnected(connectionState: ConnectionStateContext, listener: OnChangeTextListener) {
        listener.onChangeText("Ignore / FeatureWait")
    }

    override fun onSwitchDisconnected(connectionState: ConnectionStateContext, listener: OnChangeTextListener) {
        listener.onChangeText("Ignore / FeatureWait")
    }

    override fun onTimeOut(connectionState: ConnectionStateContext, listener: OnChangeTextListener) {
        listener.onChangeText("None / Listen")
        connectionState.setState(Initialize)
    }
}