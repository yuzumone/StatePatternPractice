package net.yuzumone.statepatternpractice.state.cooperated

import net.yuzumone.statepatternpractice.OnChangeTextListener
import net.yuzumone.statepatternpractice.context.CooperatedStateContext

object PortInformationRequestSent : CooperatedState {
    override fun onOutPortModificationReply(cooperatedState: CooperatedStateContext, listener: OnChangeTextListener) {
        listener.onChangeText("Ignore / PortInformationRequestSent")
    }

    override fun onOutPortModificationRequest(cooperatedState: CooperatedStateContext, listener: OnChangeTextListener) {
        listener.onChangeText("Ignore / PortInformationRequestSent")
    }

    override fun onPortInformationReply(cooperatedState: CooperatedStateContext, listener: OnChangeTextListener) {
        listener.onChangeText("modifyOutPort() / OutPortModified")
        cooperatedState.setState(OutPortModified)
    }

    override fun onPortInformationRequest(cooperatedState: CooperatedStateContext, listener: OnChangeTextListener) {
        listener.onChangeText("Ignore / PortInformationRequestSent")
    }
}