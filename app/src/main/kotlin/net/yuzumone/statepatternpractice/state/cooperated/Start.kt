package net.yuzumone.statepatternpractice.state.cooperated

import net.yuzumone.statepatternpractice.OnChangeTextListener
import net.yuzumone.statepatternpractice.context.CooperatedStateContext

object Start : CooperatedState {
    override fun onOutPortModificationReply(cooperatedState: CooperatedStateContext, listener: OnChangeTextListener) {
        listener.onChangeText("Ignore / Start")
    }

    override fun onOutPortModificationRequest(cooperatedState: CooperatedStateContext, listener: OnChangeTextListener) {
        listener.onChangeText("None / OutPortModificationRequest-Received")
        cooperatedState.setState(OutPortModificationRequestReceived)
    }

    override fun onPortInformationReply(cooperatedState: CooperatedStateContext, listener: OnChangeTextListener) {
        listener.onChangeText("Ignore / Start")
    }

    override fun onPortInformationRequest(cooperatedState: CooperatedStateContext, listener: OnChangeTextListener) {
        listener.onChangeText("Ignore / Start")
    }
}