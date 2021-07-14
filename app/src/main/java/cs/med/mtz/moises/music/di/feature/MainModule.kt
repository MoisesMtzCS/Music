package cs.med.mtz.moises.music.di.feature

import cs.med.mtz.moises.music.presentation.main.MainViewModel
import org.koin.android.viewmodel.dsl.viewModel
import org.koin.core.module.Module
import org.koin.dsl.module

val mainModule:Module = module {
    viewModel {
        MainViewModel()
    }
}
