package net.yuzumone.statepatternpractice.state.rest

import net.yuzumone.statepatternpractice.OnChangeTextListener
import net.yuzumone.statepatternpractice.context.RestStateContext

object SystemInformationRequestReceived : RestState {
    override fun onSystemStatusReply(restState: RestStateContext, listener: OnChangeTextListener) {
        listener.onChangeText("None / Listen")
        restState.setState(RestListen)
    }

    override fun onSystemStatusRequest(restState: RestStateContext, listener: OnChangeTextListener) {
        listener.onChangeText("Ignore / SystemInformationRequest-Received")
    }
}