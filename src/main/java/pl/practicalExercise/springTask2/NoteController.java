package pl.practicalExercise.springTask2;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Optional;

@Controller
public class NoteController {

    private final NoteService noteService;

    public NoteController(NoteService noteService) {
        this.noteService = noteService;
    }

    @PostMapping("/save")
    String saveNota(@RequestParam String id, @RequestParam String note, Model model){
        Note note1 = new Note(id, note);
        boolean save = noteService.save(note1);
        if (save){
            model.addAttribute("note", note1);
            return "note";
        }
        else {
            return "wrong-data";
        }
    }
    @GetMapping("/note")
    String getNote(@RequestParam String id, Model model){
        Optional<Note> byId = noteService.findById(id);
        byId.ifPresent(n -> model.addAttribute("note", n));
        return "note";
    }
}
