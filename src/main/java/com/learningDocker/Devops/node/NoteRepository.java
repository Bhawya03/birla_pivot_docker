package com.learningDocker.Devops.node;

import com.learningDocker.Devops.node.Note;
import org.springframework.data.jpa.repository.JpaRepository;

public interface NoteRepository extends JpaRepository<Note, Integer> {
}