package com.learningDocker.Devops.node;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/notes")

public class NoteController {

    private final com.learningDocker.Devops.node.NoteService noteService;

    @Autowired
    public NoteController(com.learningDocker.Devops.node.NoteService noteService) {
        this.noteService = noteService;
    }

    @GetMapping
    public List<Note> getAllNotes(){
        return this.noteService.getNotes();
    }

    @PostMapping("/")
    public ResponseEntity<Object> createNote(@RequestBody Note note){
        return noteService.newNote(note);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Object> updateNoteById(@PathVariable Integer id, @RequestBody Note updateNote){
        return this.noteService.updateNote(id, updateNote);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Object> deleteNoteById(@PathVariable Integer id){
        return this.noteService.deleteNote(id);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Object> getNoteById(@PathVariable Integer id){
        return this.noteService.getNoteById(id);
    }

}
