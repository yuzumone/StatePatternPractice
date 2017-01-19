package net.yuzumone.statepatternpractice.state.routing

import net.yuzumone.statepatternpractice.OnChangeTextListener
import net.yuzumone.statepatternpractice.context.RoutingStateContext

object TableRegisted : RoutingState {
    override fun onFlooding(routingState: RoutingStateContext, listener: OnChangeTextListener) {
        listener.onChangeText("Ignore / TableRegisted")
    }

    override fun onRoutingReply(routingState: RoutingStateContext, listener: OnChangeTextListener) {
        listener.onChangeText("None / End(Start)")
        routingState.setState(Start)
    }

    override fun onRoutingRequest(routingState: RoutingStateContext, listener: OnChangeTextListener) {
        listener.onChangeText("Ignore / TableRegisted")
    }

    override fun onTableRegistration(routingState: RoutingStateContext, listener: OnChangeTextListener) {
        listener.onChangeText("Ignore / TableRegisted")
    }
}