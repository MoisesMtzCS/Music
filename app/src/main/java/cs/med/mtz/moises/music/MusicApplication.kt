package cs.med.mtz.moises.music

import android.app.Application

class MusicApplication: Application() {

    /** */
    override fun onCreate() {
        super.onCreate()
        startKoin()
    }

    /** */
    private fun startKoin(){
//        org.koin.core.context.startKoin {
//            androidLogger()
//            androidContext(applicationContext)
//            modules(getApplicationModules())
//        }
    }

}