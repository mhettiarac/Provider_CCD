package contracts

import org.springframework.cloud.contract.spec.Contract

Contract.make {
    description("should return the list of cities")
    request {
        url("/cities")
        method GET()
    }
    response {
        status(200)
        body("[\"Kandy\",\"Colombo\"]")
    }
}
