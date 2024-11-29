/*
 * Management API
 *
 * The version of the OpenAPI document: 3
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package com.adyen.service.management;

//api
import com.adyen.Client;
import com.adyen.Service;
import com.adyen.constants.ApiConstants;
import com.adyen.model.management.GenerateClientKeyResponse;
import com.adyen.model.management.RestServiceError;
import com.adyen.model.RequestOptions;
import com.adyen.service.exception.ApiException;
import com.adyen.service.resource.Resource;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class ClientKeyCompanyLevelApi extends Service {

    public static final String API_VERSION = "3";

    protected String baseURL;

    /**
    * Client key - company level constructor in {@link com.adyen.service.management package}.
    * @param client {@link Client } (required)
    */
    public ClientKeyCompanyLevelApi(Client client) {
        super(client);
        this.baseURL = createBaseURL("https://management-test.adyen.com/v3");
    }

    /**
    * Client key - company level constructor in {@link com.adyen.service.management package}.
    * Please use this constructor only if you would like to pass along your own url for routing or testing purposes. The latest API version is defined in this class as a constant.
    * @param client {@link Client } (required)
    * @param baseURL {@link String } (required)
    */
    public ClientKeyCompanyLevelApi(Client client, String baseURL) {
        super(client);
        this.baseURL = baseURL;
    }

    /**
    * Generate new client key
    *
    * @param companyId {@link String } The unique identifier of the company account. (required)
    * @param apiCredentialId {@link String } Unique identifier of the API credential. (required)
    * @return {@link GenerateClientKeyResponse }
    * @throws ApiException if fails to make API call
    */
    public GenerateClientKeyResponse generateNewClientKey(String companyId, String apiCredentialId) throws ApiException, IOException {
        return generateNewClientKey(companyId, apiCredentialId, null);
    }

    /**
    * Generate new client key
    *
    * @param companyId {@link String } The unique identifier of the company account. (required)
    * @param apiCredentialId {@link String } Unique identifier of the API credential. (required)
    * @param requestOptions {@link RequestOptions } Object to store additional data such as idempotency-keys (optional)
    * @return {@link GenerateClientKeyResponse }
    * @throws ApiException if fails to make API call
    */
    public GenerateClientKeyResponse generateNewClientKey(String companyId, String apiCredentialId, RequestOptions requestOptions) throws ApiException, IOException {
        //Add path params
        Map<String, String> pathParams = new HashMap<>();
        if (companyId == null) {
            throw new IllegalArgumentException("Please provide the companyId path parameter");
        }
        pathParams.put("companyId", companyId);
        if (apiCredentialId == null) {
            throw new IllegalArgumentException("Please provide the apiCredentialId path parameter");
        }
        pathParams.put("apiCredentialId", apiCredentialId);

        String requestBody = null;
        Resource resource = new Resource(this, this.baseURL + "/companies/{companyId}/apiCredentials/{apiCredentialId}/generateClientKey", null);
        String jsonResult = resource.request(requestBody, requestOptions, ApiConstants.HttpMethod.POST, pathParams);
        return GenerateClientKeyResponse.fromJson(jsonResult);
    }
}
