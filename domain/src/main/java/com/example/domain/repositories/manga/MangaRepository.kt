package com.example.domain.repositories.manga

import com.example.domain.models.DataItem
import com.example.domain.utils.Either
import kotlinx.coroutines.flow.Flow

interface MangaRepository {

    fun fetchManga(): Flow<Either<String, List<DataItem>>>
}