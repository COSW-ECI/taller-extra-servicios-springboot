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
package edu.eci.cosw.samples.services;

import edu.eci.cosw.samples.model.Documento;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

/**
 *
 * @author hcadavid
 */
public class DocumentServices {
    
    ConcurrentHashMap<String, Documento> docs;

    public DocumentServices() {
        docs=new ConcurrentHashMap<>();
    }
    
    
    /**
     * Registrar un documento
     * @param d el documento
     */
    public void addDocument(Documento d){
        docs.put(d.getTitulo(), d);
    }
    
    /**
     * Buscar un documento a partir de su identificador
     * @param titulo
     * @return 
     */
    public Documento getDocumento(String titulo) throws DocumentNotFoundException{
        if (!docs.containsKey(titulo)){
            throw new DocumentNotFoundException("Documento ("+titulo+") no encontrado..." );
        }
        return docs.get(titulo);
    }
    
}
