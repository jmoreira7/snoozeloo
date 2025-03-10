package com.example.snoozeloo.data

import com.example.snoozeloo.data.source.androidapi.AndroidAlarm

fun Alarm.toAndroidAlarm(): AndroidAlarm {
    return AndroidAlarm(
        time = time,
    )
}

fun AndroidAlarm.toExternal(): Alarm {
    return Alarm(
        time = time,
        isActive = true,
        label = null,
    )
}