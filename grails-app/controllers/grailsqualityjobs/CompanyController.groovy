package grailsqualityjobs


import grails.rest.*
import grails.converters.*

class CompanyController extends RestfulController {
    static responseFormats = ['json']
    CompanyController() {
        super(Company)
    }
}
