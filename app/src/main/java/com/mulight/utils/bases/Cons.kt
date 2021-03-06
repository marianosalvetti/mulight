package com.mulight.utils.bases

import android.graphics.Typeface

class Cons {

    companion object {
        const val DB_NAME = "mulight.db"
        const val CAMERA_PERMISSION = "android.permission.CAMERA"
        const val FILE_PERMISSION = "android.permission.WRITE_EXTERNAL_STORAGE"
        private const val FONT_NORMAL = "fonts/roboto.ttf"
        private const val FONT_TITLE = "fonts/montserrat.ttf"

        val TYPEFACE_NORMAL =
            getTypeFace(FONT_NORMAL)
        val TYPEFACE_TITLE =
            getTypeFace(FONT_TITLE)

        private fun getTypeFace(font: String): Typeface {
            return Typeface.createFromAsset(MyApplication.instance?.assets, font)
        }
    }
}