package net.yuzumone.statepatternpractice.context

import net.yuzumone.statepatternpractice.OnChangeTextListener
import net.yuzumone.statepatternpractice.state.routing.RoutingState
import net.yuzumone.statepatternpractice.state.routing.Start

class RoutingStateContext {

    private var state: RoutingState = Start

    fun setState(state: RoutingState) {
        this.state = state
    }

    fun onRoutingRequest(listener: OnChangeTextListener) {
        state.onRoutingRequest(this, listener)
    }

    fun onTableRegistration(listener: OnChangeTextListener) {
        state.onTableRegistration(this, listener)
    }

    fun onFlooding(listener: OnChangeTextListener) {
        state.onFlooding(this, listener)
    }

    fun onRoutingReply(listener: OnChangeTextListener) {
        state.onRoutingReply(this, listener)
    }
}