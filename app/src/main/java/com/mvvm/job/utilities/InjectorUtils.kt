package com.mvvm.job.utilities

import com.mvvm.job.data.FakeDatabase
import com.mvvm.job.data.QuoteRepository
import com.mvvm.job.ui.quotes.QuotesViewModelFactory

object InjectorUtils {

    fun privideQuotesViewModelFactory() : QuotesViewModelFactory{
        val quoteRepository = QuoteRepository.getInstance(FakeDatabase.getInstance().quoteDao)
        return QuotesViewModelFactory(quoteRepository)
    }
}