package cs.med.mtz.moises.music

import android.app.Application
import cs.med.mtz.moises.music.di.getApplicationModules
import org.koin.android.ext.koin.androidContext
import org.koin.android.ext.koin.androidLogger

class MusicApplication: Application() {

    /** */
    override fun onCreate() {
        super.onCreate()
        startKoin()
    }

    /** */
    private fun startKoin(){
        org.koin.core.context.startKoin {
            androidLogger()
            androidContext(applicationContext)
            modules(getApplicationModules())
        }
    }

}