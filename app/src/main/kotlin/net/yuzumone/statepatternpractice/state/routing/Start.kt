package net.yuzumone.statepatternpractice.state.routing

import net.yuzumone.statepatternpractice.OnChangeTextListener
import net.yuzumone.statepatternpractice.context.RoutingStateContext

object Start : RoutingState {
    override fun onFlooding(routingState: RoutingStateContext, listener: OnChangeTextListener) {
        listener.onChangeText("Ignore / Start")
    }

    override fun onRoutingRequest(routingState: RoutingStateContext, listener: OnChangeTextListener) {
        listener.onChangeText("None / RoutingRequest-Received")
        routingState.setState(RoutingRequestReceived)
    }

    override fun onRoutingReply(routingState: RoutingStateContext, listener: OnChangeTextListener) {
        listener.onChangeText("Ignore / Start")
    }

    override fun onTableRegistration(routingState: RoutingStateContext, listener: OnChangeTextListener) {
        listener.onChangeText("Ignore / Start")
    }
}