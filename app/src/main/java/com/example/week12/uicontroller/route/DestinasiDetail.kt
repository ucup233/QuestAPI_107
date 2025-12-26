package com.example.week12.uicontroller.route

import com.example.week12.R


object DestinasiDetail : DestinasiNavigasi {
    override val route = "item_detail"
    override val titleRes = R.string.detail_siswa
    const val itemIdArg = "idsiswa"
    val routeWithArgs = "$route/{$itemIdArg}"
}