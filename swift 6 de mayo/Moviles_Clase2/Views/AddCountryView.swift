//
//  AddCountryView.swift
//  Moviles_Clase2
//
//  Created by Eduardo Cadena on 17/05/21.
//
import SwiftUI

struct AddCountryView: View {
    
    @State var cityName: String
    
    var body: some View {
        VStack{
                
            TextField("Add City Name", text: $cityName)
            
            Text(cityName)
          
        }// VStack
        .navigationBarTitle("Add a New Country")
    }
}

struct AddCountryView_Previews: PreviewProvider {
    static var previews: some View {
        AddCountryView(cityName: "Country")
    }
}
