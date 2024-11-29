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
import com.adyen.model.management.AllowedOrigin;
import com.adyen.model.management.AllowedOriginsResponse;
import com.adyen.model.management.RestServiceError;
import com.adyen.model.RequestOptions;
import com.adyen.service.exception.ApiException;
import com.adyen.service.resource.Resource;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class AllowedOriginsMerchantLevelApi extends Service {

    public static final String API_VERSION = "3";

    protected String baseURL;

    /**
    * Allowed origins - merchant level constructor in {@link com.adyen.service.management package}.
    * @param client {@link Client } (required)
    */
    public AllowedOriginsMerchantLevelApi(Client client) {
        super(client);
        this.baseURL = createBaseURL("https://management-test.adyen.com/v3");
    }

    /**
    * Allowed origins - merchant level constructor in {@link com.adyen.service.management package}.
    * Please use this constructor only if you would like to pass along your own url for routing or testing purposes. The latest API version is defined in this class as a constant.
    * @param client {@link Client } (required)
    * @param baseURL {@link String } (required)
    */
    public AllowedOriginsMerchantLevelApi(Client client, String baseURL) {
        super(client);
        this.baseURL = baseURL;
    }

    /**
    * Create an allowed origin
    *
    * @param merchantId {@link String } The unique identifier of the merchant account. (required)
    * @param apiCredentialId {@link String } Unique identifier of the API credential. (required)
    * @param allowedOrigin {@link AllowedOrigin }  (required)
    * @return {@link AllowedOrigin }
    * @throws ApiException if fails to make API call
    */
    public AllowedOrigin createAllowedOrigin(String merchantId, String apiCredentialId, AllowedOrigin allowedOrigin) throws ApiException, IOException {
        return createAllowedOrigin(merchantId, apiCredentialId, allowedOrigin, null);
    }

    /**
    * Create an allowed origin
    *
    * @param merchantId {@link String } The unique identifier of the merchant account. (required)
    * @param apiCredentialId {@link String } Unique identifier of the API credential. (required)
    * @param allowedOrigin {@link AllowedOrigin }  (required)
    * @param requestOptions {@link RequestOptions } Object to store additional data such as idempotency-keys (optional)
    * @return {@link AllowedOrigin }
    * @throws ApiException if fails to make API call
    */
    public AllowedOrigin createAllowedOrigin(String merchantId, String apiCredentialId, AllowedOrigin allowedOrigin, RequestOptions requestOptions) throws ApiException, IOException {
        //Add path params
        Map<String, String> pathParams = new HashMap<>();
        if (merchantId == null) {
            throw new IllegalArgumentException("Please provide the merchantId path parameter");
        }
        pathParams.put("merchantId", merchantId);
        if (apiCredentialId == null) {
            throw new IllegalArgumentException("Please provide the apiCredentialId path parameter");
        }
        pathParams.put("apiCredentialId", apiCredentialId);

        String requestBody = allowedOrigin.toJson();
        Resource resource = new Resource(this, this.baseURL + "/merchants/{merchantId}/apiCredentials/{apiCredentialId}/allowedOrigins", null);
        String jsonResult = resource.request(requestBody, requestOptions, ApiConstants.HttpMethod.POST, pathParams);
        return AllowedOrigin.fromJson(jsonResult);
    }

    /**
    * Delete an allowed origin
    *
    * @param merchantId {@link String } The unique identifier of the merchant account. (required)
    * @param apiCredentialId {@link String } Unique identifier of the API credential. (required)
    * @param originId {@link String } Unique identifier of the allowed origin. (required)
    * @throws ApiException if fails to make API call
    */
    public void deleteAllowedOrigin(String merchantId, String apiCredentialId, String originId) throws ApiException, IOException {
        deleteAllowedOrigin(merchantId, apiCredentialId, originId, null);
    }

    /**
    * Delete an allowed origin
    *
    * @param merchantId {@link String } The unique identifier of the merchant account. (required)
    * @param apiCredentialId {@link String } Unique identifier of the API credential. (required)
    * @param originId {@link String } Unique identifier of the allowed origin. (required)
    * @param requestOptions {@link RequestOptions } Object to store additional data such as idempotency-keys (optional)
    * @throws ApiException if fails to make API call
    */
    public void deleteAllowedOrigin(String merchantId, String apiCredentialId, String originId, RequestOptions requestOptions) throws ApiException, IOException {
        //Add path params
        Map<String, String> pathParams = new HashMap<>();
        if (merchantId == null) {
            throw new IllegalArgumentException("Please provide the merchantId path parameter");
        }
        pathParams.put("merchantId", merchantId);
        if (apiCredentialId == null) {
            throw new IllegalArgumentException("Please provide the apiCredentialId path parameter");
        }
        pathParams.put("apiCredentialId", apiCredentialId);
        if (originId == null) {
            throw new IllegalArgumentException("Please provide the originId path parameter");
        }
        pathParams.put("originId", originId);

        String requestBody = null;
        Resource resource = new Resource(this, this.baseURL + "/merchants/{merchantId}/apiCredentials/{apiCredentialId}/allowedOrigins/{originId}", null);
        resource.request(requestBody, requestOptions, ApiConstants.HttpMethod.DELETE, pathParams);
    }

    /**
    * Get an allowed origin
    *
    * @param merchantId {@link String } The unique identifier of the merchant account. (required)
    * @param apiCredentialId {@link String } Unique identifier of the API credential. (required)
    * @param originId {@link String } Unique identifier of the allowed origin. (required)
    * @return {@link AllowedOrigin }
    * @throws ApiException if fails to make API call
    */
    public AllowedOrigin getAllowedOrigin(String merchantId, String apiCredentialId, String originId) throws ApiException, IOException {
        return getAllowedOrigin(merchantId, apiCredentialId, originId, null);
    }

    /**
    * Get an allowed origin
    *
    * @param merchantId {@link String } The unique identifier of the merchant account. (required)
    * @param apiCredentialId {@link String } Unique identifier of the API credential. (required)
    * @param originId {@link String } Unique identifier of the allowed origin. (required)
    * @param requestOptions {@link RequestOptions } Object to store additional data such as idempotency-keys (optional)
    * @return {@link AllowedOrigin }
    * @throws ApiException if fails to make API call
    */
    public AllowedOrigin getAllowedOrigin(String merchantId, String apiCredentialId, String originId, RequestOptions requestOptions) throws ApiException, IOException {
        //Add path params
        Map<String, String> pathParams = new HashMap<>();
        if (merchantId == null) {
            throw new IllegalArgumentException("Please provide the merchantId path parameter");
        }
        pathParams.put("merchantId", merchantId);
        if (apiCredentialId == null) {
            throw new IllegalArgumentException("Please provide the apiCredentialId path parameter");
        }
        pathParams.put("apiCredentialId", apiCredentialId);
        if (originId == null) {
            throw new IllegalArgumentException("Please provide the originId path parameter");
        }
        pathParams.put("originId", originId);

        String requestBody = null;
        Resource resource = new Resource(this, this.baseURL + "/merchants/{merchantId}/apiCredentials/{apiCredentialId}/allowedOrigins/{originId}", null);
        String jsonResult = resource.request(requestBody, requestOptions, ApiConstants.HttpMethod.GET, pathParams);
        return AllowedOrigin.fromJson(jsonResult);
    }

    /**
    * Get a list of allowed origins
    *
    * @param merchantId {@link String } The unique identifier of the merchant account. (required)
    * @param apiCredentialId {@link String } Unique identifier of the API credential. (required)
    * @return {@link AllowedOriginsResponse }
    * @throws ApiException if fails to make API call
    */
    public AllowedOriginsResponse listAllowedOrigins(String merchantId, String apiCredentialId) throws ApiException, IOException {
        return listAllowedOrigins(merchantId, apiCredentialId, null);
    }

    /**
    * Get a list of allowed origins
    *
    * @param merchantId {@link String } The unique identifier of the merchant account. (required)
    * @param apiCredentialId {@link String } Unique identifier of the API credential. (required)
    * @param requestOptions {@link RequestOptions } Object to store additional data such as idempotency-keys (optional)
    * @return {@link AllowedOriginsResponse }
    * @throws ApiException if fails to make API call
    */
    public AllowedOriginsResponse listAllowedOrigins(String merchantId, String apiCredentialId, RequestOptions requestOptions) throws ApiException, IOException {
        //Add path params
        Map<String, String> pathParams = new HashMap<>();
        if (merchantId == null) {
            throw new IllegalArgumentException("Please provide the merchantId path parameter");
        }
        pathParams.put("merchantId", merchantId);
        if (apiCredentialId == null) {
            throw new IllegalArgumentException("Please provide the apiCredentialId path parameter");
        }
        pathParams.put("apiCredentialId", apiCredentialId);

        String requestBody = null;
        Resource resource = new Resource(this, this.baseURL + "/merchants/{merchantId}/apiCredentials/{apiCredentialId}/allowedOrigins", null);
        String jsonResult = resource.request(requestBody, requestOptions, ApiConstants.HttpMethod.GET, pathParams);
        return AllowedOriginsResponse.fromJson(jsonResult);
    }
}
