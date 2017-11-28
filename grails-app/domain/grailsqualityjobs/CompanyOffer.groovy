package grailsqualityjobs


import grails.rest.*

@Resource(readOnly = false, formats = ['json'])
class CompanyOffer {

    String offerTitle
    String offerDescription
    String salaryRange
    Date date = new Date();

    static belongsTo = [company: Company]

    static constraints = {
        salaryRange nullable: false
        offerDescription nullable: false
    }

    CompanyOffer(String offerTitle, String offerDescription, String salaryRange) {
        this.offerTitle = offerTitle
        this.offerDescription = offerDescription
        this.salaryRange = salaryRange
    }
}
