package net.yuzumone.statepatternpractice.context

import net.yuzumone.statepatternpractice.OnChangeTextListener
import net.yuzumone.statepatternpractice.state.cooperated.CooperatedState
import net.yuzumone.statepatternpractice.state.cooperated.Start

class CooperatedStateContext {

    private var state: CooperatedState = Start

    fun setState(state: CooperatedState) {
        this.state = state
    }

    fun onOutPortModificationRequest(listener: OnChangeTextListener) {
        state.onOutPortModificationRequest(this, listener)
    }

    fun onPortInformationRequest(listener: OnChangeTextListener) {
        state.onPortInformationRequest(this, listener)
    }

    fun onPortInformationReply(listener: OnChangeTextListener) {
        state.onPortInformationReply(this, listener)
    }

    fun onOutPortModificationReply(listener: OnChangeTextListener) {
        state.onOutPortModificationReply(this, listener)
    }
}