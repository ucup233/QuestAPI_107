package com.example.week12.uicontroller.route

import com.example.week12.R

object DestinasiEdit: DestinasiNavigasi {

    override val route = "edit_detail"
    override val titleRes = R.string.edit_siswa
    const val itemIdArg = "idsiswa"
    val routeWithArgs = "$route/{$itemIdArg}"
}