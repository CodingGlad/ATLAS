package com.example.sqlSpring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping(path="/codexis")
public class MainController {
    @Autowired
    private DocumentRepository documentRepository;

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private RecordRepository recordRepository;

    @GetMapping(path="/addU")  //Pridani uzivatele HTTP trigger na /codexis/addU, get s parametrem name, id prirazeno automaticky
    public @ResponseBody String addNewUser (@RequestParam String name) {
        User n = new User();
        n.setName(name);
        userRepository.save(n);

        return "Saved";
    }

    @GetMapping(path="/addD")   //Pridani dokumentu HTTP trigger na /codexis/addD, get s parametrem title, id prirazeno automaticky
    public @ResponseBody String addNewDoc (@RequestParam String title) {
        Document d = new Document();
        d.setNazev(title);
        documentRepository.save(d);
        return "Saved";
    }

    @GetMapping(path="/addR")   //Pridani zaznamu do intersection entitiy na /codexis/addD, get s id dokumentu a id uzivatele
    public @ResponseBody String addNewRecord (@RequestParam Integer user, @RequestParam Integer doc) {
        Record r = new Record();
        r.setDocument_id(doc);
        r.setUser_id(user);
        recordRepository.save(r);
        return "Saved";
    }


    //Vypsani obsahu vsech tabulek v JSONu pro kontrolu
    /*
    @GetMapping(path="/allU")
    public @ResponseBody Iterable<User> getAllUsers() {

        return userRepository.findAll();
    }

    @GetMapping(path="/allD")
    public @ResponseBody Iterable<Document> getAllDocuments() {
        return documentRepository.findAll();

    }

    @GetMapping(path="/allR")
    public @ResponseBody Iterable<Record> getAllRecords() {
        return recordRepository.findAll();
    }
    */
}