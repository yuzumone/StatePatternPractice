package net.yuzumone.statepatternpractice.state.connection

import net.yuzumone.statepatternpractice.OnChangeTextListener
import net.yuzumone.statepatternpractice.context.ConnectionStateContext

interface ConnectionState {
    fun onSwitchConnected(connectionState: ConnectionStateContext, listener: OnChangeTextListener)
    fun onSwitchDisconnected(connectionState: ConnectionStateContext, listener: OnChangeTextListener)
    fun onHello(connectionState: ConnectionStateContext, listener: OnChangeTextListener)
    fun onFeature(connectionState: ConnectionStateContext, listener: OnChangeTextListener)
    fun onTimeOut(connectionState: ConnectionStateContext, listener: OnChangeTextListener)
    fun onSuccess(connectionState: ConnectionStateContext, listener: OnChangeTextListener)
    fun onError(connectionState: ConnectionStateContext, listener: OnChangeTextListener)
}