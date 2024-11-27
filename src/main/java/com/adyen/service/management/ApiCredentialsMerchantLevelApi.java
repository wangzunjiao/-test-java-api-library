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

import com.adyen.Client;
import com.adyen.Service;
import com.adyen.constants.ApiConstants;
import com.adyen.model.management.ApiCredential;
import com.adyen.model.management.CreateApiCredentialResponse;
import com.adyen.model.management.CreateMerchantApiCredentialRequest;
import com.adyen.model.management.ListMerchantApiCredentialsResponse;
import com.adyen.model.management.RestServiceError;
import com.adyen.model.management.UpdateMerchantApiCredentialRequest;
import com.adyen.model.RequestOptions;
import com.adyen.service.exception.ApiException;
import com.adyen.service.resource.Resource;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class ApiCredentialsMerchantLevelApi extends Service {

    public static final String API_VERSION = "3";

    protected String baseURL;

    /**
    * API credentials - merchant level constructor in {@link com.adyen.service.management package}.
    * @param client {@link Client } (required)
    */
    public ApiCredentialsMerchantLevelApi(Client client) {
        super(client);
        this.baseURL = createBaseURL("https://management-test.adyen.com/v3");
    }

    /**
    * API credentials - merchant level constructor in {@link com.adyen.service.management package}.
    * Please use this constructor only if you would like to pass along your own url for routing or testing purposes. The latest API version is defined in this class as a constant.
    * @param client {@link Client } (required)
    * @param baseURL {@link String } (required)
    */
    public ApiCredentialsMerchantLevelApi(Client client, String baseURL) {
        super(client);
        this.baseURL = baseURL;
    }

    /**
    * Create an API credential
    *
    * @param merchantId {@link String } The unique identifier of the merchant account. (required)
    * @param createMerchantApiCredentialRequest {@link CreateMerchantApiCredentialRequest }  (required)
    * @return {@link CreateApiCredentialResponse }
    * @throws ApiException if fails to make API call
    */
    public CreateApiCredentialResponse createApiCredential(String merchantId, CreateMerchantApiCredentialRequest createMerchantApiCredentialRequest) throws ApiException, IOException {
        return createApiCredential(merchantId, createMerchantApiCredentialRequest, null);
    }

    /**
    * Create an API credential
    *
    * @param merchantId {@link String } The unique identifier of the merchant account. (required)
    * @param createMerchantApiCredentialRequest {@link CreateMerchantApiCredentialRequest }  (required)
    * @param requestOptions {@link RequestOptions } Object to store additional data such as idempotency-keys (optional)
    * @return {@link CreateApiCredentialResponse }
    * @throws ApiException if fails to make API call
    */
    public CreateApiCredentialResponse createApiCredential(String merchantId, CreateMerchantApiCredentialRequest createMerchantApiCredentialRequest, RequestOptions requestOptions) throws ApiException, IOException {
        //Add path params
        Map<String, String> pathParams = new HashMap<>();
        if (merchantId == null) {
            throw new IllegalArgumentException("Please provide the merchantId path parameter");
        }
        pathParams.put("merchantId", merchantId);

        String requestBody = createMerchantApiCredentialRequest.toJson();
        Resource resource = new Resource(this, this.baseURL + "/merchants/{merchantId}/apiCredentials", null);
        String jsonResult = resource.request(requestBody, requestOptions, ApiConstants.HttpMethod.POST, pathParams);
        return CreateApiCredentialResponse.fromJson(jsonResult);
    }

    /**
    * Get an API credential
    *
    * @param merchantId {@link String } The unique identifier of the merchant account. (required)
    * @param apiCredentialId {@link String } Unique identifier of the API credential. (required)
    * @return {@link ApiCredential }
    * @throws ApiException if fails to make API call
    */
    public ApiCredential getApiCredential(String merchantId, String apiCredentialId) throws ApiException, IOException {
        return getApiCredential(merchantId, apiCredentialId, null);
    }

    /**
    * Get an API credential
    *
    * @param merchantId {@link String } The unique identifier of the merchant account. (required)
    * @param apiCredentialId {@link String } Unique identifier of the API credential. (required)
    * @param requestOptions {@link RequestOptions } Object to store additional data such as idempotency-keys (optional)
    * @return {@link ApiCredential }
    * @throws ApiException if fails to make API call
    */
    public ApiCredential getApiCredential(String merchantId, String apiCredentialId, RequestOptions requestOptions) throws ApiException, IOException {
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
        Resource resource = new Resource(this, this.baseURL + "/merchants/{merchantId}/apiCredentials/{apiCredentialId}", null);
        String jsonResult = resource.request(requestBody, requestOptions, ApiConstants.HttpMethod.GET, pathParams);
        return ApiCredential.fromJson(jsonResult);
    }

    /**
    * Get a list of API credentials
    *
    * @param merchantId {@link String } The unique identifier of the merchant account. (required)
    * @return {@link ListMerchantApiCredentialsResponse }
    * @throws ApiException if fails to make API call
    */
    public ListMerchantApiCredentialsResponse listApiCredentials(String merchantId) throws ApiException, IOException {
        return listApiCredentials(merchantId, null,  null,  null);
    }

    /**
    * Get a list of API credentials
    *
    * @param merchantId {@link String } The unique identifier of the merchant account. (required)
    * @param pageNumber {@link Integer } Query: The number of the page to fetch. (optional)
    * @param pageSize {@link Integer } Query: The number of items to have on a page, maximum 100. The default is 10 items on a page. (optional)
    * @param requestOptions {@link RequestOptions } Object to store additional data such as idempotency-keys (optional)
    * @return {@link ListMerchantApiCredentialsResponse }
    * @throws ApiException if fails to make API call
    */
    public ListMerchantApiCredentialsResponse listApiCredentials(String merchantId, Integer pageNumber, Integer pageSize, RequestOptions requestOptions) throws ApiException, IOException {
        //Add path params
        Map<String, String> pathParams = new HashMap<>();
        if (merchantId == null) {
            throw new IllegalArgumentException("Please provide the merchantId path parameter");
        }
        pathParams.put("merchantId", merchantId);
        //Add query params
        Map<String, String> queryParams = new HashMap<>();
        if (pageNumber != null) {
        queryParams.put("pageNumber", pageNumber.toString());
        }
        if (pageSize != null) {
        queryParams.put("pageSize", pageSize.toString());
        }

        String requestBody = null;
        Resource resource = new Resource(this, this.baseURL + "/merchants/{merchantId}/apiCredentials", null);
        String jsonResult = resource.request(requestBody, requestOptions, ApiConstants.HttpMethod.GET, pathParams, queryParams);
        return ListMerchantApiCredentialsResponse.fromJson(jsonResult);
    }

    /**
    * Update an API credential
    *
    * @param merchantId {@link String } The unique identifier of the merchant account. (required)
    * @param apiCredentialId {@link String } Unique identifier of the API credential. (required)
    * @param updateMerchantApiCredentialRequest {@link UpdateMerchantApiCredentialRequest }  (required)
    * @return {@link ApiCredential }
    * @throws ApiException if fails to make API call
    */
    public ApiCredential updateApiCredential(String merchantId, String apiCredentialId, UpdateMerchantApiCredentialRequest updateMerchantApiCredentialRequest) throws ApiException, IOException {
        return updateApiCredential(merchantId, apiCredentialId, updateMerchantApiCredentialRequest, null);
    }

    /**
    * Update an API credential
    *
    * @param merchantId {@link String } The unique identifier of the merchant account. (required)
    * @param apiCredentialId {@link String } Unique identifier of the API credential. (required)
    * @param updateMerchantApiCredentialRequest {@link UpdateMerchantApiCredentialRequest }  (required)
    * @param requestOptions {@link RequestOptions } Object to store additional data such as idempotency-keys (optional)
    * @return {@link ApiCredential }
    * @throws ApiException if fails to make API call
    */
    public ApiCredential updateApiCredential(String merchantId, String apiCredentialId, UpdateMerchantApiCredentialRequest updateMerchantApiCredentialRequest, RequestOptions requestOptions) throws ApiException, IOException {
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

        String requestBody = updateMerchantApiCredentialRequest.toJson();
        Resource resource = new Resource(this, this.baseURL + "/merchants/{merchantId}/apiCredentials/{apiCredentialId}", null);
        String jsonResult = resource.request(requestBody, requestOptions, ApiConstants.HttpMethod.PATCH, pathParams);
        return ApiCredential.fromJson(jsonResult);
    }
}
