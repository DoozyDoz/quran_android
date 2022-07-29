package com.quran.labs.androidquran.feature.audio_sharing

import com.quran.labs.androidquran.common.audio.model.QariItem

class AudioShareUtils {

  data class ProperAyahOrder(val start: SuraAyah, val end: SuraAyah)

  fun getProperAyahOrder(start:SuraAyah,end:SuraAyah): ProperAyahOrder {
    val (actualStart, actualEnd) = if (start <= end) {
      start to end
    } else {
      end to start
    }
    return ProperAyahOrder(actualStart, actualEnd)
  }

}
