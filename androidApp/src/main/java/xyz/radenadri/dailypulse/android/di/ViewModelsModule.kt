package xyz.radenadri.dailypulse.android.di

import org.koin.core.module.dsl.viewModel
import org.koin.dsl.module
import xyz.radenadri.dailypulse.articles.presentation.ArticlesViewModel

val viewModelsModule = module {
    viewModel { ArticlesViewModel(get()) }
}