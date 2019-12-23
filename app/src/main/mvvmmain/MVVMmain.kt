package nvvmmain

import android.app.Application
import nvvmmain.data.db.AppDatabase
import nvvmmain.data.network.MyApi
import nvvmmain.data.network.NetworkConnectionInterceptor
import nvvmmain.data.preferences.PreferenceProvider
import nvvmmain.data.repositories.QuotesRepository
import nvvmmain.data.repositories.UserRepository
import nvvmmain.ui.auth.AuthViewModelFactory
import nvvmmain.ui.home.profile.ProfileViewModelFactory
import nvvmmain.ui.home.quotes.QuotesViewModelFactory
import org.kodein.di.Kodein
import org.kodein.di.KodeinAware
import org.kodein.di.android.x.androidXModule
import org.kodein.di.generic.bind
import org.kodein.di.generic.instance
import org.kodein.di.generic.provider
import org.kodein.di.generic.singleton

class MVVMmain : Application(), KodeinAware {

    override val kodein = Kodein.lazy {
        import(androidXModule(this@MVVMmain))

        bind() from singleton { NetworkConnectionInterceptor(instance()) }
        bind() from singleton { MyApi(instance()) }
        bind() from singleton { AppDatabase(instance()) }
        bind() from singleton { PreferenceProvider(instance()) }
        bind() from singleton { UserRepository(instance(), instance()) }
        bind() from singleton { QuotesRepository(instance(), instance(), instance()) }
        bind() from provider { AuthViewModelFactory(instance()) }
        bind() from provider { ProfileViewModelFactory(instance()) }
        bind() from provider{ QuotesViewModelFactory(instance())}


    }

}