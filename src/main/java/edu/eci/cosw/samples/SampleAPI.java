/*
 * Copyright (C) 2016 Pivotal Software, Inc.
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package edu.eci.cosw.samples;

import edu.eci.cosw.samples.model.Documento;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author hcadavid
 */
@RestController
@RequestMapping(value = "/process")
public class SampleAPI {
    
    
    @Autowired
    TextProcessor tp=null;
    
    
    @RequestMapping(value = "/val/{val}", method = RequestMethod.GET)
    public String test(@PathVariable("val") String val){
        return tp.processText(val);
    }
    

    @RequestMapping(value = "/valx", method = RequestMethod.GET)
    public String test2(){
        return "aaaa";
    }

    @RequestMapping(value = "/doc", method = RequestMethod.POST)
    public String test3(@RequestBody(required = true) Documento doc){
        System.out.println(doc.getContenido());
        System.out.println(doc.getTitulo());
        return "aaaa";
    }

    
    
    
}
