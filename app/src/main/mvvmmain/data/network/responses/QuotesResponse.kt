package mvvmsampleapp.data.network.responses

import mvvmsampleapp.data.db.entities.Quote

data class QuotesResponse (
    val isSuccessful: Boolean,
    val quotes: List<Quote>
)