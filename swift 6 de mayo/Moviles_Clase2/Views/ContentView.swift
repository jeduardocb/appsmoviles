//
//  ContentView.swift
//  Moviles_Clase2
//
//  Created by Jose Eduardo Cadena on 11/05/21.
//

import SwiftUI

struct ContentView: View {
    
    var countryController = Countrycontroller()
    
    var body: some View {
        NavigationView {
            List(countryController.countries) { country in
                Text(country.name)
            }
            .navigationBarTitle("Countries", displayMode: .inline)
        }
    }
}

struct ContentView_Previews: PreviewProvider {
    static var previews: some View {
        ContentView()
    }
}
