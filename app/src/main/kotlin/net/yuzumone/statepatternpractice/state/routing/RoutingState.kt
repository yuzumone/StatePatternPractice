package net.yuzumone.statepatternpractice.state.routing

import net.yuzumone.statepatternpractice.OnChangeTextListener
import net.yuzumone.statepatternpractice.context.RoutingStateContext

interface RoutingState {
    fun onRoutingRequest(routingState: RoutingStateContext, listener: OnChangeTextListener)
    fun onTableRegistration(routingState: RoutingStateContext, listener: OnChangeTextListener)
    fun onFlooding(routingState: RoutingStateContext, listener: OnChangeTextListener)
    fun onRoutingReply(routingState: RoutingStateContext, listener: OnChangeTextListener)
}