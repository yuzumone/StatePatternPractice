package net.yuzumone.statepatternpractice.state.rest

import net.yuzumone.statepatternpractice.OnChangeTextListener
import net.yuzumone.statepatternpractice.context.RestStateContext

interface RestState {
    fun onSystemStatusRequest(restState: RestStateContext, listener: OnChangeTextListener)
    fun onSystemStatusReply(restState: RestStateContext, listener: OnChangeTextListener)
}