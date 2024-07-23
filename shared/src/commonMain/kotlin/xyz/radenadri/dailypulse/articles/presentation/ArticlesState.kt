package xyz.radenadri.dailypulse.articles.presentation

import xyz.radenadri.dailypulse.articles.application.Article

data class ArticlesState (
    val articles: List<Article> = listOf(),
    val loading: Boolean = false,
    val error: String? = null
)
