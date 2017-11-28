package grailsqualityjobs

import grails.converters.JSON
import grails.rest.*
import org.springframework.http.HttpStatus

class CompanyOfferController extends RestfulController {
    static responseFormats = ['json']

    CompanyOfferController() {
        super(CompanyOffer)
    }

    @Override
    def index() {
        Long companyId = params.companyId?.toLong()
        render Company.findById(companyId).offers.asList() as JSON
    }

    @Override
    def show() {
        Long companyId = params.companyId?.toLong()
        Long offerId = params.id?.toLong()

        CompanyOffer companyOffer = CompanyOffer.findById(offerId)
        if (companyOffer?.companyId == companyId) {
            render companyOffer as JSON
        } else {
            response.setStatus(HttpStatus.BAD_REQUEST.value())
            render (status: 500, text: "Error accesing resource") as JSON
        }
    }
}
