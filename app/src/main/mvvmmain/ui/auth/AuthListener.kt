package mvvmsampleapp.ui.auth

import androidx.lifecycle.LiveData
import nvvmmain.data.db.entities.User

interface AuthListener {
    fun onStarted()
    fun onSuccess(user: User)
    fun onFailure(message: String)
}