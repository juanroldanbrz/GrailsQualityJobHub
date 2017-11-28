package grailsqualityjobs


import grails.rest.*

@Resource(readOnly = false, formats = ['json'])
class Company {

    String companyName
    String companyAddress

    static hasMany = [offers: CompanyOffer]

    static constraints = {
        companyAddress nullable: true
    }
}