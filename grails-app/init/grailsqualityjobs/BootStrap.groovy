package grailsqualityjobs

class BootStrap {

    def init = { servletContext ->
        50.times { companyIndex ->
            Company company = new Company(companyName: "company $companyIndex")
            10.times { offerIndex ->
                String offerDescription = "We need java dev"
                String salaryRange = "From 20.000 eur/ to 25.000 eur / year"
                String offerTitle = "This is the offer $offerIndex"
                CompanyOffer offer = new CompanyOffer(offerTitle, offerDescription, salaryRange)
                company.addToOffers(offer)
            }

            company.save()
        }
    }
    def destroy = {
    }
}
