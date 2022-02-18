package com.solucinestpvpos.citricostovar.io

import com.solucinestpvpos.citricostovar.api.ApiServices
import com.solucinestpvpos.citricostovar.interfaces.Constants
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import javax.inject.Singleton


@Module
@InstallIn(SingletonComponent::class)
object NetworkModule {

    @Singleton
    @Provides
    fun provideRetrofit() : Retrofit {
        return  Retrofit.Builder()
            .baseUrl(Constants.BASE_URL)
            .addConverterFactory(GsonConverterFactory.create())
            .build()
    }

    @Provides
    fun provideApiservice(retrofit: Retrofit) : ApiServices {
        return retrofit.create(ApiServices::class.java)
    }

}