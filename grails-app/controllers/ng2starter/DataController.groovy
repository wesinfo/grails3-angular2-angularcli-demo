package ng2starter

import grails.converters.JSON
import org.dom4j.Text
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestMethod

class DataController {
    def prod=[
            'Bajaj','Renault','Audi21'
    ]

    def products() {
        Map data = [data: [prod]]
        render data as JSON
    }
    @RequestMapping(value="/form/aboutform",method=RequestMethod.GET)
    def about() {
        Map data = [data: 'This page contains about']
        render data as JSON
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
