package xyz.radenadri.dailypulse.articles.di

import org.koin.dsl.module
import xyz.radenadri.dailypulse.articles.ArticlesDataSource
import xyz.radenadri.dailypulse.articles.ArticlesRepository
import xyz.radenadri.dailypulse.articles.ArticlesService
import xyz.radenadri.dailypulse.articles.ArticlesUseCase
import xyz.radenadri.dailypulse.articles.ArticlesViewModel

val articlesModule = module {
    single<ArticlesService> { ArticlesService(get()) }
    single<ArticlesUseCase> { ArticlesUseCase(get()) }
    single<ArticlesViewModel> { ArticlesViewModel(get()) }
    single<ArticlesDataSource> { ArticlesDataSource(get()) }
    single<ArticlesRepository> { ArticlesRepository(get(), get()) }
}