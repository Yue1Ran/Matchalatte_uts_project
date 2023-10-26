package com.example.matchalatte_uts_project.viewmodel

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.MutableLiveData
import com.example.matchalatte_uts_project.model.Menu


class MenuDetaileFragment (app: Application) : AndroidViewModel(app) {
    val menu =MutableLiveData<Menu>()


    fun fetch() {
        this.menu.value = Menu(
            "1",
            "Mie Ayam Jamur",
            "merupakan mie.....",
            "15.000",
            "",
        )
    }
}