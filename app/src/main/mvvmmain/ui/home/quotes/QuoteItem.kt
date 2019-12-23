package nvvmmain.ui.home.quotes

import com.xwray.groupie.databinding.BindableItem
import nvvmmain.R
import nvvmmain.data.db.entities.Quote
import nvvmmain.databinding.ItemQuoteBinding

class QuoteItem(
    private val quote: Quote
) : BindableItem<ItemQuoteBinding>(){

    override fun getLayout() = R.layout.item_quote

    override fun bind(viewBinding: ItemQuoteBinding, position: Int) {
        viewBinding.setQuote(quote)
    }
}