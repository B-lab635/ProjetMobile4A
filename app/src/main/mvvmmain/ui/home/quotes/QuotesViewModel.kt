package nvvmmain.ui.home.quotes

import androidx.lifecycle.ViewModel;
import nvvmmain.data.repositories.QuotesRepository
import nvvmmain.util.lazyDeferred

class QuotesViewModel(
    repository: QuotesRepository
) : ViewModel() {

    val quotes by lazyDeferred {
        repository.getQuotes()
    }
}
