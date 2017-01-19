package net.yuzumone.statepatternpractice.state.cooperated

import net.yuzumone.statepatternpractice.OnChangeTextListener
import net.yuzumone.statepatternpractice.context.CooperatedStateContext

object OutPortModificationRequestReceived : CooperatedState {
    override fun onOutPortModificationReply(cooperatedState: CooperatedStateContext, listener: OnChangeTextListener) {
        listener.onChangeText("Ignore / OutPortModificationRequestReceived")
    }

    override fun onOutPortModificationRequest(cooperatedState: CooperatedStateContext, listener: OnChangeTextListener) {
        listener.onChangeText("Ignore / OutPortModificationRequestReceived")
    }

    override fun onPortInformationReply(cooperatedState: CooperatedStateContext, listener: OnChangeTextListener) {
        listener.onChangeText("Ignore / OutPortModificationRequestReceived")
    }

    override fun onPortInformationRequest(cooperatedState: CooperatedStateContext, listener: OnChangeTextListener) {
        listener.onChangeText("sendPortInformationRequest() / PortInformationRequestSent")
        cooperatedState.setState(PortInformationRequestSent)
    }
}