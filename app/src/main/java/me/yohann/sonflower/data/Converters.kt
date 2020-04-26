package me.yohann.sonflower.data

import androidx.room.TypeConverters
import java.util.*

class Converters {
    @TypeConverters fun calenderToDateStamp(calender: Calendar): Long = calender.timeInMillis

    @TypeConverters fun dataStampToCalendar(value: Long): Calendar =
        Calendar.getInstance().apply { timeInMillis = value }
}