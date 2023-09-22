package ac.id.unpas.banksampah.persistences
import androidx.room.Database
import androidx.room.RoomDatabase
import ac.id.unpas.banksampah.model.SetoranSampah
import ac.id.unpas.banksampah.model.SetoranSampahDao


@Database(entities = [SetoranSampah::class], version = 1)
abstract class AppDatabase : RoomDatabase() {
    abstract fun setoranSampahDao(): SetoranSampahDao
}