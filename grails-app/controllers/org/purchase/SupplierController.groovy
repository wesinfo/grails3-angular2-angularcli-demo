package org.purchase

import grails.converters.JSON
import ng2starter.Supplier

class SupplierController {

    def index() {
        List<Supplier> suppliers =Supplier.findAll()
        render suppliers as JSON
    }

    def save(Supplier supplier){
        supplier.save();
    }

}
