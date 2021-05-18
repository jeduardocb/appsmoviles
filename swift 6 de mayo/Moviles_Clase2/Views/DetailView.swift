//
//  DetailView.swift
//  Moviles_Clase2
//
//  Created by Eduardo Cadena on 17/05/21.
//

import SwiftUI

struct DetailView: View {
    
    let country: CountryModel
    
    var body: some View {
        Text(country.name + " -> " + country.population)
    }
}

struct DetailView_Previews: PreviewProvider {
    static var previews: some View {
        DetailView(country: CountryModel(id: UUID(), name: "asdf", population: "too many"))
    }
}
