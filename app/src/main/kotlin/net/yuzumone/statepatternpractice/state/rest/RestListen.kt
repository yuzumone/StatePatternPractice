package net.yuzumone.statepatternpractice.state.rest

import net.yuzumone.statepatternpractice.OnChangeTextListener
import net.yuzumone.statepatternpractice.context.RestStateContext

object RestListen : RestState {
    override fun onSystemStatusReply(restState: RestStateContext, listener: OnChangeTextListener) {
        listener.onChangeText("Ignore / Listen")
    }

    override fun onSystemStatusRequest(restState: RestStateContext, listener: OnChangeTextListener) {
        listener.onChangeText("collectInformation(), sendResponse() / SystemInformationRequest-Received")
        restState.setState(SystemInformationRequestReceived)
    }
}