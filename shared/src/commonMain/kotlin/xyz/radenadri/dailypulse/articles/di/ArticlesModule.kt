package xyz.radenadri.dailypulse.articles.di

import org.koin.dsl.module
import xyz.radenadri.dailypulse.articles.data.ArticlesDataSource
import xyz.radenadri.dailypulse.articles.data.ArticlesRepository
import xyz.radenadri.dailypulse.articles.data.ArticlesService
import xyz.radenadri.dailypulse.articles.application.ArticlesUseCase
import xyz.radenadri.dailypulse.articles.presentation.ArticlesViewModel

val articlesModule = module {
    single<ArticlesService> { ArticlesService(get()) }
    single<ArticlesUseCase> { ArticlesUseCase(get()) }
    single<ArticlesViewModel> { ArticlesViewModel(get()) }
    single<ArticlesDataSource> { ArticlesDataSource(get()) }
    single<ArticlesRepository> { ArticlesRepository(get(), get()) }
}