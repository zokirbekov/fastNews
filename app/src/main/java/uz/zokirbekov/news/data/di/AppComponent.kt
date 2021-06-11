package uz.zokirbekov.news.data.di

import dagger.Component
import uz.zokirbekov.news.data.di.modules.DbModule
import uz.zokirbekov.news.data.di.modules.NetworkModule

@Component(modules = [NetworkModule::class, DbModule::class])
interface AppComponent {

}