package mvvmsampleapp.data.network.responses

import mvvmsampleapp.data.db.entities.User

data class AuthResponse(
    val isSuccessful : Boolean?,
    val message: String?,
    val user: User?
)