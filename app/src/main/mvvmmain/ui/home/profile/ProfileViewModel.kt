package nvvmmain.ui.home.profile

import androidx.lifecycle.ViewModel;
import nvvmmain.data.repositories.UserRepository

class ProfileViewModel(
    repository: UserRepository
) : ViewModel() {

    val user = repository.getUser()

}
