package xyz.radenadri.dailypulse.di

import org.koin.core.component.KoinComponent
import org.koin.core.component.inject
import org.koin.core.context.startKoin
import xyz.radenadri.dailypulse.articles.ArticlesViewModel

fun initKoin() {
    val modules = sharedKoinModules

    startKoin {
        modules(modules)
    }
}

class ArticlesInjector : KoinComponent {
    val articlesViewModel: ArticlesViewModel by inject()
}