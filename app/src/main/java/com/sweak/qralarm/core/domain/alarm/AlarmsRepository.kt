package com.sweak.qralarm.core.domain.alarm

import kotlinx.coroutines.flow.Flow

interface AlarmsRepository {
    suspend fun addOrEditAlarm(alarm: Alarm): Long
    suspend fun setAlarmEnabled(alarmId: Long, enabled: Boolean)
    suspend fun getAlarm(alarmId: Long): Alarm?
    suspend fun getAllAlarms(): Flow<List<Alarm>>
    suspend fun deleteAlarm(alarmId: Long)
}