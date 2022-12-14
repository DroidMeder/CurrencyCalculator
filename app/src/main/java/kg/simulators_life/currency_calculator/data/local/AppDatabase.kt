package kg.simulators_life.currency_calculator.data.local

import androidx.room.Database
import androidx.room.RoomDatabase
import androidx.room.TypeConverters
import kg.simulators_life.currency_calculator.data.dto.ValCursDto
import kg.simulators_life.currency_calculator.data.dto.ValuteConverter

@Database(entities = [ValCursDto::class], version = 2, exportSchema = false)
@TypeConverters(ValuteConverter::class)
abstract class AppDatabase : RoomDatabase() {

    abstract fun currencyDao() : CurrencyDao
}