package net.yuzumone.statepatternpractice.state.cooperated

import net.yuzumone.statepatternpractice.OnChangeTextListener
import net.yuzumone.statepatternpractice.context.CooperatedStateContext

object OutPortModified : CooperatedState {
    override fun onOutPortModificationReply(cooperatedState: CooperatedStateContext, listener: OnChangeTextListener) {
        listener.onChangeText("None / End(Start)")
        cooperatedState.setState(Start)
    }

    override fun onOutPortModificationRequest(cooperatedState: CooperatedStateContext, listener: OnChangeTextListener) {
        listener.onChangeText("Ignore / OutPortModified")
    }

    override fun onPortInformationReply(cooperatedState: CooperatedStateContext, listener: OnChangeTextListener) {
        listener.onChangeText("Ignore / OutPortModified")
    }

    override fun onPortInformationRequest(cooperatedState: CooperatedStateContext, listener: OnChangeTextListener) {
        listener.onChangeText("Ignore / OutPortModified")
    }
}