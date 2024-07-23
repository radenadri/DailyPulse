package xyz.radenadri.dailypulse.di

import app.cash.sqldelight.db.SqlDriver
import org.koin.dsl.module
import xyz.radenadri.dailypulse.db.DailyPulseDatabase
import xyz.radenadri.dailypulse.db.DatabaseDriverFactory

val databaseModule = module {
    single<SqlDriver> { DatabaseDriverFactory().createDriver() }
    single<DailyPulseDatabase> { DailyPulseDatabase(get()) }
}