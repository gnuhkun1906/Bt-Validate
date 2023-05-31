package ra.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import ra.model.Song;
import ra.service.ISongService;

@Controller
public class SongController {
    @Autowired
    private ISongService songService;
    @GetMapping("/formCreateSong")
    public String showForm(Model model) {
        model.addAttribute("newSong", new Song());
        return "formCreate";
    }

    @PostMapping("/createSong")
    public String createSong(@ModelAttribute("newSong") Song song, BindingResult bindingResult, ModelMap modelMap) {
        if (bindingResult.hasFieldErrors()) {
            return "formCreate";
        } else {
            modelMap.addAttribute("success","Create Successfully");
            return "result";
        }
    }
}
