package com.haeny.practice.effectiveKotlin.part2.chapter5.item34

class QuotationPresenter(
    private val view: QuotationView,
    private val repo: QuotationRepository,
) {
    private var nextQuoteId = -1

    fun onStart() {
        onNext()
    }

    fun onNext() {
        nextQuoteId = (nextQuoteId + 1) % repo.quotesNumber
        val quote = repo.getQuote(nextQuoteId)
        view.showQuote(quote)
    }
}

class QuotationView {
    fun showQuote(quote: Int): Int {
        return quote
    }
}

class QuotationRepository(
    val quotesNumber: Int,
) {
    fun getQuote(id: Int): Int {
        return id
    }
}