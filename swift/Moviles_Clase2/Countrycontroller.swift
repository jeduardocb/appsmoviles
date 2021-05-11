//
//  Countrycontroller.swift
//  Moviles_Clase2
//
//  Created by Jose Eduardo Cadena on 11/05/21.
//

import Foundation

class Countrycontroller {
    
    var countries: [CountryModel]
    
    init() {
        self.countries = [
            CountryModel(id: UUID(), name: "Mexico", population: "127M"),
            CountryModel(id: UUID(), name: "Canada", population: "37M"),
            CountryModel(id: UUID(), name: "France", population: "67M"),
            CountryModel(id: UUID(), name: "Italy", population: "60M"),
            CountryModel(id: UUID(), name: "China", population: "1388M")
        ]
    }
}
