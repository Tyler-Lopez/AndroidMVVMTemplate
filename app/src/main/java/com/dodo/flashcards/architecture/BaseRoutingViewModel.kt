package com.dodo.flashcards.architecture

abstract class BaseRoutingViewModel<
        TypeOfViewState : ViewState,
        TypeOfViewEvent : ViewEvent,
        TypeOfDestination : Destination>
    : BaseViewModel<TypeOfViewState, TypeOfViewEvent>() {

    private var router: Router<TypeOfDestination>? = null

    fun attachRouter(router: Router<TypeOfDestination>) {
        this.router = router
        onRouterAttached()
    }

    /** Optional in implementing ViewModel **/
    open fun onRouterAttached() {}
}