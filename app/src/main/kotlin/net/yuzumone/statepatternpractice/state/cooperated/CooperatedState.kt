package net.yuzumone.statepatternpractice.state.cooperated

import net.yuzumone.statepatternpractice.OnChangeTextListener
import net.yuzumone.statepatternpractice.context.CooperatedStateContext

interface CooperatedState {
    fun onOutPortModificationRequest(cooperatedState: CooperatedStateContext, listener: OnChangeTextListener)
    fun onPortInformationRequest(cooperatedState: CooperatedStateContext, listener: OnChangeTextListener)
    fun onPortInformationReply(cooperatedState: CooperatedStateContext, listener: OnChangeTextListener)
    fun onOutPortModificationReply(cooperatedState: CooperatedStateContext, listener: OnChangeTextListener)
}