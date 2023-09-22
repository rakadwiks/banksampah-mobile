package ac.id.unpas.banksampah.id
import ac.id.unpas.banksampah.model.SetoranSampahDao
import ac.id.unpas.banksampah.networks.SetoranSampahApi
import ac.id.unpas.banksampah.repositories.SetoranSampahRepository
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ViewModelComponent
import dagger.hilt.android.scopes.ViewModelScoped

@Module
@InstallIn(ViewModelComponent::class)
object RepositoryModule {
    @Provides
    @ViewModelScoped
    fun provideSetoranSampahRepository(
        api: SetoranSampahApi,
        dao: SetoranSampahDao
    ): SetoranSampahRepository {
        return SetoranSampahRepository(api, dao)
    }
}
