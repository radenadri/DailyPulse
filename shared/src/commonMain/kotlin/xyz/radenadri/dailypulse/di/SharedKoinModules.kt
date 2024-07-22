package xyz.radenadri.dailypulse.di

import xyz.radenadri.dailypulse.articles.di.articlesModule

val sharedKoinModules = listOf(articlesModule, networkModule)