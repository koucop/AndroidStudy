package com.kwang0.movierepository.data.source.local

import android.text.TextUtils

class DBUtils {

    companion object {
        private const val SEPARATOR = ","

        fun transformIntegerListToString(integerList: List<Int>): String {
            return TextUtils.join(SEPARATOR, integerList)
        }

        fun transformStringToIntegerList(text: String): List<Int> {
            val arrayDB = text.split(SEPARATOR)
            val integerList = mutableListOf<Int>()
            for (s in arrayDB) {
                integerList.add(Integer.parseInt(s))
            }
            return integerList
        }
    }

}
