//
//  CountryModel.swift
//  Moviles_Clase2
//
//  Created by Jose Eduardo Cadena on 11/05/21.
//

import Foundation

struct CountryModel: Identifiable, Hashable {
    
    var id: UUID
    var name: String
    var population: String
    
    func hash(into hasher: inout Hasher) {
        hasher.combine(id)
    }
}
