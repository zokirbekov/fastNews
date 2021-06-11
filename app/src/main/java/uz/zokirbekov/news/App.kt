package uz.zokirbekov.news

import android.app.Application
import uz.zokirbekov.news.data.di.AppComponent
import uz.zokirbekov.news.data.di.DaggerAppComponent

class App : Application() {

    companion object {
        lateinit var appComponent: AppComponent
    }

    override fun onCreate() {
        super.onCreate()
        appComponent = DaggerAppComponent.builder().build()
    }
}