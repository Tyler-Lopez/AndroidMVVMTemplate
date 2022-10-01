package com.dodo.flashcards.architecture

import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.MutableStateFlow
import androidx.lifecycle.ViewModel

interface ViewState

interface StatePusher<TypeOfViewState : ViewState> {
    /** State flow observed in View, triggers recomposition on each pushed [ViewState] **/
    val viewState: StateFlow<TypeOfViewState?>

    /** Abstraction to update underlying [MutableStateFlow] instance of [viewState]
     * from the implementing ViewModel **/
    fun pushState(state: TypeOfViewState)

    /** Optional extension to push a [ViewState] in the implementing [ViewModel] scope **/
    fun TypeOfViewState.push()
}