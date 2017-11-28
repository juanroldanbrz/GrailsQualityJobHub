package grailsqualityjobs


import grails.rest.*
import grails.converters.*
import org.springframework.http.HttpStatus

class SearchController extends RestfulController{
	static responseFormats = ['json']
    static allowedMethods = [index: 'GET']

    SearchController() {
        super(CompanyOffer)
    }

    def index() {
        respond CompanyOffer.list([max: 20])
    }
}
