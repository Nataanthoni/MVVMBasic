package com.mvvm.job.ui.quotes

import androidx.lifecycle.ViewModel
import com.mvvm.job.data.Quote
import com.mvvm.job.data.QuoteRepository

class QuotesViewModel(private val quoteRepository: QuoteRepository) : ViewModel() {

    fun getQuotes()=quoteRepository.getQuotes()

    fun addQuote(quote: Quote) = quoteRepository.addQuote(quote)
}