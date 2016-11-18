package ng2starter

import grails.converters.JSON
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestMethod

class FormController {
    def prod=[
            'Bajaj','Renault','Audi21'
    ]

    def products() {
        Map data = [data: [prod]]
        render data as JSON
    }

    def aboutForm() {
        List<Users> user = Users.findAll();
//        Map data = [data: 'This page contains about']
        render user as JSON
    }

    def contact() {
        Map data = [data: 'Contact us at blah blah.better don not contact ' ]
        render data as JSON
    }


    def form(){
        Map data = [data: 'This is a test pase ' ]
        render data as JSON
    }
}
