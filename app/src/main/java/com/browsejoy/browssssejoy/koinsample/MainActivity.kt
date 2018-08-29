package com.browsejoy.browssssejoy.koinsample

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.example.eprifti1.kointtest.MyPresenter
import com.example.eprifti1.kointtest.MyRepository
import com.example.eprifti1.kointtest.Repository
import org.koin.android.ext.android.inject
import org.koin.dsl.module.Module
import org.koin.standalone.StandAloneContext

class MainActivity : AppCompatActivity(){

    val presenter : MyPresenter by inject()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        StandAloneContext.startKoin(listOf(myModule))

        Log.i("MyActivity","presenter : ${presenter.sayHello()}")

    }

    val myModule: Module = org.koin.dsl.module.applicationContext {
        factory { MyPresenter(get()) } // get() will resolve Repository instance
        bean { MyRepository() as Repository }
    }

}
