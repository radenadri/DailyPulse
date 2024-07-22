package xyz.radenadri.dailypulse.android.di

import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.module
import xyz.radenadri.dailypulse.articles.ArticlesViewModel

val viewModelsModule = module {
    viewModel { ArticlesViewModel(get()) }
}