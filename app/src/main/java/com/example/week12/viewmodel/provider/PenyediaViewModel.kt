package com.example.week12.viewmodel.provider

import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.createSavedStateHandle
import androidx.lifecycle.viewmodel.CreationExtras
import androidx.lifecycle.viewmodel.initializer
import androidx.lifecycle.viewmodel.viewModelFactory
import com.example.week12.repositori.AplikasiDataSiswa
import com.example.week12.repositori.RepositoryDataSiswa
import com.example.week12.viewmodel.EntryViewModel
import com.example.week12.viewmodel.HomeViewModel

fun CreationExtras.aplikasiDataSiswa(): AplikasiDataSiswa =
    (this[ViewModelProvider.AndroidViewModelFactory.APPLICATION_KEY] as
            AplikasiDataSiswa
            )

object PenyediaViewModel {
    val Factory = viewModelFactory {
        initializer {
            HomeViewModel(
                aplikasiDataSiswa().containerApp
                    .repositoryDataSiswa
            )
        }
        initializer {
            EntryViewModel(
                aplikasiDataSiswa().containerApp
                    .repositoryDataSiswa
            )
        }
    }
}