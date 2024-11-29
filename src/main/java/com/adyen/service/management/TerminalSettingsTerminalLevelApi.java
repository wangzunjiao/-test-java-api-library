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
import com.adyen.model.management.Logo;
import com.adyen.model.management.RestServiceError;
import com.adyen.model.management.TerminalSettings;
import com.adyen.model.RequestOptions;
import com.adyen.service.exception.ApiException;
import com.adyen.service.resource.Resource;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class TerminalSettingsTerminalLevelApi extends Service {

    public static final String API_VERSION = "3";

    protected String baseURL;

    /**
    * Terminal settings - terminal level constructor in {@link com.adyen.service.management package}.
    * @param client {@link Client } (required)
    */
    public TerminalSettingsTerminalLevelApi(Client client) {
        super(client);
        this.baseURL = createBaseURL("https://management-test.adyen.com/v3");
    }

    /**
    * Terminal settings - terminal level constructor in {@link com.adyen.service.management package}.
    * Please use this constructor only if you would like to pass along your own url for routing or testing purposes. The latest API version is defined in this class as a constant.
    * @param client {@link Client } (required)
    * @param baseURL {@link String } (required)
    */
    public TerminalSettingsTerminalLevelApi(Client client, String baseURL) {
        super(client);
        this.baseURL = baseURL;
    }

    /**
    * Get the terminal logo
    *
    * @param terminalId {@link String } The unique identifier of the payment terminal. (required)
    * @return {@link Logo }
    * @throws ApiException if fails to make API call
    */
    public Logo getTerminalLogo(String terminalId) throws ApiException, IOException {
        return getTerminalLogo(terminalId, null);
    }

    /**
    * Get the terminal logo
    *
    * @param terminalId {@link String } The unique identifier of the payment terminal. (required)
    * @param requestOptions {@link RequestOptions } Object to store additional data such as idempotency-keys (optional)
    * @return {@link Logo }
    * @throws ApiException if fails to make API call
    */
    public Logo getTerminalLogo(String terminalId, RequestOptions requestOptions) throws ApiException, IOException {
        //Add path params
        Map<String, String> pathParams = new HashMap<>();
        if (terminalId == null) {
            throw new IllegalArgumentException("Please provide the terminalId path parameter");
        }
        pathParams.put("terminalId", terminalId);

        String requestBody = null;
        Resource resource = new Resource(this, this.baseURL + "/terminals/{terminalId}/terminalLogos", null);
        String jsonResult = resource.request(requestBody, requestOptions, ApiConstants.HttpMethod.GET, pathParams);
        return Logo.fromJson(jsonResult);
    }

    /**
    * Get terminal settings
    *
    * @param terminalId {@link String } The unique identifier of the payment terminal. (required)
    * @return {@link TerminalSettings }
    * @throws ApiException if fails to make API call
    */
    public TerminalSettings getTerminalSettings(String terminalId) throws ApiException, IOException {
        return getTerminalSettings(terminalId, null);
    }

    /**
    * Get terminal settings
    *
    * @param terminalId {@link String } The unique identifier of the payment terminal. (required)
    * @param requestOptions {@link RequestOptions } Object to store additional data such as idempotency-keys (optional)
    * @return {@link TerminalSettings }
    * @throws ApiException if fails to make API call
    */
    public TerminalSettings getTerminalSettings(String terminalId, RequestOptions requestOptions) throws ApiException, IOException {
        //Add path params
        Map<String, String> pathParams = new HashMap<>();
        if (terminalId == null) {
            throw new IllegalArgumentException("Please provide the terminalId path parameter");
        }
        pathParams.put("terminalId", terminalId);

        String requestBody = null;
        Resource resource = new Resource(this, this.baseURL + "/terminals/{terminalId}/terminalSettings", null);
        String jsonResult = resource.request(requestBody, requestOptions, ApiConstants.HttpMethod.GET, pathParams);
        return TerminalSettings.fromJson(jsonResult);
    }

    /**
    * Update the logo
    *
    * @param terminalId {@link String } The unique identifier of the payment terminal. (required)
    * @param logo {@link Logo }  (required)
    * @return {@link Logo }
    * @throws ApiException if fails to make API call
    */
    public Logo updateLogo(String terminalId, Logo logo) throws ApiException, IOException {
        return updateLogo(terminalId, logo, null);
    }

    /**
    * Update the logo
    *
    * @param terminalId {@link String } The unique identifier of the payment terminal. (required)
    * @param logo {@link Logo }  (required)
    * @param requestOptions {@link RequestOptions } Object to store additional data such as idempotency-keys (optional)
    * @return {@link Logo }
    * @throws ApiException if fails to make API call
    */
    public Logo updateLogo(String terminalId, Logo logo, RequestOptions requestOptions) throws ApiException, IOException {
        //Add path params
        Map<String, String> pathParams = new HashMap<>();
        if (terminalId == null) {
            throw new IllegalArgumentException("Please provide the terminalId path parameter");
        }
        pathParams.put("terminalId", terminalId);

        String requestBody = logo.toJson();
        Resource resource = new Resource(this, this.baseURL + "/terminals/{terminalId}/terminalLogos", null);
        String jsonResult = resource.request(requestBody, requestOptions, ApiConstants.HttpMethod.PATCH, pathParams);
        return Logo.fromJson(jsonResult);
    }

    /**
    * Update terminal settings
    *
    * @param terminalId {@link String } The unique identifier of the payment terminal. (required)
    * @param terminalSettings {@link TerminalSettings }  (required)
    * @return {@link TerminalSettings }
    * @throws ApiException if fails to make API call
    */
    public TerminalSettings updateTerminalSettings(String terminalId, TerminalSettings terminalSettings) throws ApiException, IOException {
        return updateTerminalSettings(terminalId, terminalSettings, null);
    }

    /**
    * Update terminal settings
    *
    * @param terminalId {@link String } The unique identifier of the payment terminal. (required)
    * @param terminalSettings {@link TerminalSettings }  (required)
    * @param requestOptions {@link RequestOptions } Object to store additional data such as idempotency-keys (optional)
    * @return {@link TerminalSettings }
    * @throws ApiException if fails to make API call
    */
    public TerminalSettings updateTerminalSettings(String terminalId, TerminalSettings terminalSettings, RequestOptions requestOptions) throws ApiException, IOException {
        //Add path params
        Map<String, String> pathParams = new HashMap<>();
        if (terminalId == null) {
            throw new IllegalArgumentException("Please provide the terminalId path parameter");
        }
        pathParams.put("terminalId", terminalId);

        String requestBody = terminalSettings.toJson();
        Resource resource = new Resource(this, this.baseURL + "/terminals/{terminalId}/terminalSettings", null);
        String jsonResult = resource.request(requestBody, requestOptions, ApiConstants.HttpMethod.PATCH, pathParams);
        return TerminalSettings.fromJson(jsonResult);
    }
}
