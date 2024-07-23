package xyz.radenadri.dailypulse.android.di

import app.cash.sqldelight.db.SqlDriver
import org.koin.android.ext.koin.androidContext
import org.koin.dsl.module
import xyz.radenadri.dailypulse.db.DailyPulseDatabase
import xyz.radenadri.dailypulse.db.DatabaseDriverFactory

val databaseModule = module {
    single<SqlDriver> { DatabaseDriverFactory(androidContext()).createDriver() }

    single<DailyPulseDatabase> { DailyPulseDatabase(get()) }
}