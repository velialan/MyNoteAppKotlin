package com.example.mynoteappkotlin.future_note.domain.use_case

import com.example.mynoteappkotlin.future_note.domain.model.Note
import com.example.mynoteappkotlin.future_note.domain.repository.NoteRepository


class GetNote(
    private val repository: NoteRepository
) {

    suspend operator fun invoke(id: Int): Note? {
        return repository.getNoteById(id)
    }
}