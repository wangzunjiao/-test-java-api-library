/*
 * POS Terminal Management API
 *
 * The version of the OpenAPI document: 1
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package com.adyen.service;


//api-single
import com.adyen.Client;
import com.adyen.Service;
import com.adyen.constants.ApiConstants;
import com.adyen.model.posterminalmanagement.AssignTerminalsRequest;
import com.adyen.model.posterminalmanagement.AssignTerminalsResponse;
import com.adyen.model.posterminalmanagement.FindTerminalRequest;
import com.adyen.model.posterminalmanagement.FindTerminalResponse;
import com.adyen.model.posterminalmanagement.GetStoresUnderAccountRequest;
import com.adyen.model.posterminalmanagement.GetStoresUnderAccountResponse;
import com.adyen.model.posterminalmanagement.GetTerminalDetailsRequest;
import com.adyen.model.posterminalmanagement.GetTerminalDetailsResponse;
import com.adyen.model.posterminalmanagement.GetTerminalsUnderAccountRequest;
import com.adyen.model.posterminalmanagement.GetTerminalsUnderAccountResponse;
import com.adyen.model.posterminalmanagement.ServiceError;
import com.adyen.model.RequestOptions;
import com.adyen.service.exception.ApiException;
import com.adyen.service.resource.Resource;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
public class PosTerminalManagementApi extends Service {

    public static final String API_VERSION = "1";

    protected String baseURL;

    /**
    * Default constructor in {@link com.adyen.service package}.
    * @param client {@link Client }  (required)
    */
    public PosTerminalManagementApi(Client client) {
        super(client);
        this.baseURL = createBaseURL("https://postfmapi-test.adyen.com/postfmapi/terminal/v1");
    }

    /**
    * Alternative constructor in {@link com.adyen.service package}.
    * Please use this constructor only if you would like to pass along your own url for routing or testing purposes. The latest API version is defined in this class as a constant.
    * @param client {@link Client }  (required)
    * @param baseURL {@link String }  (required)
    */
    public PosTerminalManagementApi(Client client, String baseURL) {
        super(client);
        this.baseURL = baseURL;
    }

    /**
    * Assign terminals
    *
    * @param assignTerminalsRequest {@link AssignTerminalsRequest }  (required)
    * @return {@link AssignTerminalsResponse }
    * @throws ApiException if fails to make API call
    */
    public AssignTerminalsResponse assignTerminals(AssignTerminalsRequest assignTerminalsRequest) throws ApiException, IOException {
        return assignTerminals(assignTerminalsRequest, null);
    }

    /**
    * Assign terminals
    *
    * @param assignTerminalsRequest {@link AssignTerminalsRequest }  (required)
    * @param requestOptions {@link RequestOptions } Object to store additional data such as idempotency-keys (optional)
    * @return {@link AssignTerminalsResponse }
    * @throws ApiException if fails to make API call
    */
    public AssignTerminalsResponse assignTerminals(AssignTerminalsRequest assignTerminalsRequest, RequestOptions requestOptions) throws ApiException, IOException {

        String requestBody = assignTerminalsRequest.toJson();
        Resource resource = new Resource(this, this.baseURL + "/assignTerminals", null);
        String jsonResult = resource.request(requestBody, requestOptions, ApiConstants.HttpMethod.POST, null);
        return AssignTerminalsResponse.fromJson(jsonResult);
    }

    /**
    * Get the account or store of a terminal
    *
    * @param findTerminalRequest {@link FindTerminalRequest }  (required)
    * @return {@link FindTerminalResponse }
    * @throws ApiException if fails to make API call
    */
    public FindTerminalResponse findTerminal(FindTerminalRequest findTerminalRequest) throws ApiException, IOException {
        return findTerminal(findTerminalRequest, null);
    }

    /**
    * Get the account or store of a terminal
    *
    * @param findTerminalRequest {@link FindTerminalRequest }  (required)
    * @param requestOptions {@link RequestOptions } Object to store additional data such as idempotency-keys (optional)
    * @return {@link FindTerminalResponse }
    * @throws ApiException if fails to make API call
    */
    public FindTerminalResponse findTerminal(FindTerminalRequest findTerminalRequest, RequestOptions requestOptions) throws ApiException, IOException {

        String requestBody = findTerminalRequest.toJson();
        Resource resource = new Resource(this, this.baseURL + "/findTerminal", null);
        String jsonResult = resource.request(requestBody, requestOptions, ApiConstants.HttpMethod.POST, null);
        return FindTerminalResponse.fromJson(jsonResult);
    }

    /**
    * Get the stores of an account
    *
    * @param getStoresUnderAccountRequest {@link GetStoresUnderAccountRequest }  (required)
    * @return {@link GetStoresUnderAccountResponse }
    * @throws ApiException if fails to make API call
    */
    public GetStoresUnderAccountResponse getStoresUnderAccount(GetStoresUnderAccountRequest getStoresUnderAccountRequest) throws ApiException, IOException {
        return getStoresUnderAccount(getStoresUnderAccountRequest, null);
    }

    /**
    * Get the stores of an account
    *
    * @param getStoresUnderAccountRequest {@link GetStoresUnderAccountRequest }  (required)
    * @param requestOptions {@link RequestOptions } Object to store additional data such as idempotency-keys (optional)
    * @return {@link GetStoresUnderAccountResponse }
    * @throws ApiException if fails to make API call
    */
    public GetStoresUnderAccountResponse getStoresUnderAccount(GetStoresUnderAccountRequest getStoresUnderAccountRequest, RequestOptions requestOptions) throws ApiException, IOException {

        String requestBody = getStoresUnderAccountRequest.toJson();
        Resource resource = new Resource(this, this.baseURL + "/getStoresUnderAccount", null);
        String jsonResult = resource.request(requestBody, requestOptions, ApiConstants.HttpMethod.POST, null);
        return GetStoresUnderAccountResponse.fromJson(jsonResult);
    }

    /**
    * Get the details of a terminal
    *
    * @param getTerminalDetailsRequest {@link GetTerminalDetailsRequest }  (required)
    * @return {@link GetTerminalDetailsResponse }
    * @throws ApiException if fails to make API call
    */
    public GetTerminalDetailsResponse getTerminalDetails(GetTerminalDetailsRequest getTerminalDetailsRequest) throws ApiException, IOException {
        return getTerminalDetails(getTerminalDetailsRequest, null);
    }

    /**
    * Get the details of a terminal
    *
    * @param getTerminalDetailsRequest {@link GetTerminalDetailsRequest }  (required)
    * @param requestOptions {@link RequestOptions } Object to store additional data such as idempotency-keys (optional)
    * @return {@link GetTerminalDetailsResponse }
    * @throws ApiException if fails to make API call
    */
    public GetTerminalDetailsResponse getTerminalDetails(GetTerminalDetailsRequest getTerminalDetailsRequest, RequestOptions requestOptions) throws ApiException, IOException {

        String requestBody = getTerminalDetailsRequest.toJson();
        Resource resource = new Resource(this, this.baseURL + "/getTerminalDetails", null);
        String jsonResult = resource.request(requestBody, requestOptions, ApiConstants.HttpMethod.POST, null);
        return GetTerminalDetailsResponse.fromJson(jsonResult);
    }

    /**
    * Get the list of terminals
    *
    * @param getTerminalsUnderAccountRequest {@link GetTerminalsUnderAccountRequest }  (required)
    * @return {@link GetTerminalsUnderAccountResponse }
    * @throws ApiException if fails to make API call
    */
    public GetTerminalsUnderAccountResponse getTerminalsUnderAccount(GetTerminalsUnderAccountRequest getTerminalsUnderAccountRequest) throws ApiException, IOException {
        return getTerminalsUnderAccount(getTerminalsUnderAccountRequest, null);
    }

    /**
    * Get the list of terminals
    *
    * @param getTerminalsUnderAccountRequest {@link GetTerminalsUnderAccountRequest }  (required)
    * @param requestOptions {@link RequestOptions } Object to store additional data such as idempotency-keys (optional)
    * @return {@link GetTerminalsUnderAccountResponse }
    * @throws ApiException if fails to make API call
    */
    public GetTerminalsUnderAccountResponse getTerminalsUnderAccount(GetTerminalsUnderAccountRequest getTerminalsUnderAccountRequest, RequestOptions requestOptions) throws ApiException, IOException {

        String requestBody = getTerminalsUnderAccountRequest.toJson();
        Resource resource = new Resource(this, this.baseURL + "/getTerminalsUnderAccount", null);
        String jsonResult = resource.request(requestBody, requestOptions, ApiConstants.HttpMethod.POST, null);
        return GetTerminalsUnderAccountResponse.fromJson(jsonResult);
    }
}
