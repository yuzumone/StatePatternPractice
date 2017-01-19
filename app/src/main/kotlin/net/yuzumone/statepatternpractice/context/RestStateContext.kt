package net.yuzumone.statepatternpractice.context

import net.yuzumone.statepatternpractice.OnChangeTextListener
import net.yuzumone.statepatternpractice.state.rest.RestListen
import net.yuzumone.statepatternpractice.state.rest.RestState

class RestStateContext {

    private var state: RestState = RestListen

    fun setState(state: RestState) {
        this.state = state
    }

    fun onSystemStatusRequest(listener: OnChangeTextListener) {
        state.onSystemStatusRequest(this, listener)
    }

    fun onSystemStatusReply(listener: OnChangeTextListener) {
        state.onSystemStatusReply(this, listener)
    }
}