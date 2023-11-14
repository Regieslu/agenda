package org.bedu.agenda.controller;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.Map.Entry;
import org.bedu.agenda.dto.ContactDTO;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AgendaController {

    private HashMap<String, String>agenda;

    public AgendaController(){
      agenda = new HashMap<>();

      agenda.put("Maria", "5509867890");
      agenda.put("Jose", "5509776789");
    }

    @RequestMapping("/obetenerAgenda")
    public List<ContactDTO> getAgenga(){ //convertir e hash a una lista para que sea mas entendible para el frontend
  List<ContactDTO> data =  new LinkedList<>();
      Set<Entry<String, String >> agendaSet = agenda.entrySet();

      for(Entry<String, String> entry : agendaSet){
        data.add(new ContactDTO(entry.getKey(), entry.getValue()));


    }
    return data;

  }
}