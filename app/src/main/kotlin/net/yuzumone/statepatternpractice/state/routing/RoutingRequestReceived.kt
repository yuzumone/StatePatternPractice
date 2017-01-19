package net.yuzumone.statepatternpractice.state.routing

import net.yuzumone.statepatternpractice.OnChangeTextListener
import net.yuzumone.statepatternpractice.context.RoutingStateContext

object RoutingRequestReceived : RoutingState {
    override fun onFlooding(routingState: RoutingStateContext, listener: OnChangeTextListener) {
        listener.onChangeText("flooding() / Packet-Sent")
        routingState.setState(PacketSent)
    }

    override fun onRoutingReply(routingState: RoutingStateContext, listener: OnChangeTextListener) {
        listener.onChangeText("Ignore / RoutingRequestReceived")
    }

    override fun onRoutingRequest(routingState: RoutingStateContext, listener: OnChangeTextListener) {
        listener.onChangeText("Ignore / RoutingRequestReceived")
    }

    override fun onTableRegistration(routingState: RoutingStateContext, listener: OnChangeTextListener) {
        listener.onChangeText("registTable() / TableRegisted")
        routingState.setState(TableRegisted)
    }
}