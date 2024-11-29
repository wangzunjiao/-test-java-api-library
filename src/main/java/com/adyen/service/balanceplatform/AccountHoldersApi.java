/*
 * Configuration API
 *
 * The version of the OpenAPI document: 2
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package com.adyen.service.balanceplatform;

//api
import com.adyen.Client;
import com.adyen.Service;
import com.adyen.constants.ApiConstants;
import com.adyen.model.balanceplatform.AccountHolder;
import com.adyen.model.balanceplatform.AccountHolderInfo;
import com.adyen.model.balanceplatform.AccountHolderUpdateRequest;
import com.adyen.model.balanceplatform.GetTaxFormResponse;
import com.adyen.model.balanceplatform.PaginatedBalanceAccountsResponse;
import com.adyen.model.balanceplatform.RestServiceError;
import com.adyen.model.balanceplatform.TransactionRulesResponse;
import com.adyen.model.RequestOptions;
import com.adyen.service.exception.ApiException;
import com.adyen.service.resource.Resource;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class AccountHoldersApi extends Service {

    public static final String API_VERSION = "2";

    protected String baseURL;

    /**
    * Account holders constructor in {@link com.adyen.service.balanceplatform package}.
    * @param client {@link Client } (required)
    */
    public AccountHoldersApi(Client client) {
        super(client);
        this.baseURL = createBaseURL("https://balanceplatform-api-test.adyen.com/bcl/v2");
    }

    /**
    * Account holders constructor in {@link com.adyen.service.balanceplatform package}.
    * Please use this constructor only if you would like to pass along your own url for routing or testing purposes. The latest API version is defined in this class as a constant.
    * @param client {@link Client } (required)
    * @param baseURL {@link String } (required)
    */
    public AccountHoldersApi(Client client, String baseURL) {
        super(client);
        this.baseURL = baseURL;
    }

    /**
    * Create an account holder
    *
    * @param accountHolderInfo {@link AccountHolderInfo }  (required)
    * @return {@link AccountHolder }
    * @throws ApiException if fails to make API call
    */
    public AccountHolder createAccountHolder(AccountHolderInfo accountHolderInfo) throws ApiException, IOException {
        return createAccountHolder(accountHolderInfo, null);
    }

    /**
    * Create an account holder
    *
    * @param accountHolderInfo {@link AccountHolderInfo }  (required)
    * @param requestOptions {@link RequestOptions } Object to store additional data such as idempotency-keys (optional)
    * @return {@link AccountHolder }
    * @throws ApiException if fails to make API call
    */
    public AccountHolder createAccountHolder(AccountHolderInfo accountHolderInfo, RequestOptions requestOptions) throws ApiException, IOException {

        String requestBody = accountHolderInfo.toJson();
        Resource resource = new Resource(this, this.baseURL + "/accountHolders", null);
        String jsonResult = resource.request(requestBody, requestOptions, ApiConstants.HttpMethod.POST, null);
        return AccountHolder.fromJson(jsonResult);
    }

    /**
    * Get an account holder
    *
    * @param id {@link String } The unique identifier of the account holder. (required)
    * @return {@link AccountHolder }
    * @throws ApiException if fails to make API call
    */
    public AccountHolder getAccountHolder(String id) throws ApiException, IOException {
        return getAccountHolder(id, null);
    }

    /**
    * Get an account holder
    *
    * @param id {@link String } The unique identifier of the account holder. (required)
    * @param requestOptions {@link RequestOptions } Object to store additional data such as idempotency-keys (optional)
    * @return {@link AccountHolder }
    * @throws ApiException if fails to make API call
    */
    public AccountHolder getAccountHolder(String id, RequestOptions requestOptions) throws ApiException, IOException {
        //Add path params
        Map<String, String> pathParams = new HashMap<>();
        if (id == null) {
            throw new IllegalArgumentException("Please provide the id path parameter");
        }
        pathParams.put("id", id);

        String requestBody = null;
        Resource resource = new Resource(this, this.baseURL + "/accountHolders/{id}", null);
        String jsonResult = resource.request(requestBody, requestOptions, ApiConstants.HttpMethod.GET, pathParams);
        return AccountHolder.fromJson(jsonResult);
    }

    /**
    * Get all balance accounts of an account holder
    *
    * @param id {@link String } The unique identifier of the account holder. (required)
    * @return {@link PaginatedBalanceAccountsResponse }
    * @throws ApiException if fails to make API call
    */
    public PaginatedBalanceAccountsResponse getAllBalanceAccountsOfAccountHolder(String id) throws ApiException, IOException {
        return getAllBalanceAccountsOfAccountHolder(id, null,  null,  null);
    }

    /**
    * Get all balance accounts of an account holder
    *
    * @param id {@link String } The unique identifier of the account holder. (required)
    * @param offset {@link Integer } Query: The number of items that you want to skip. (optional)
    * @param limit {@link Integer } Query: The number of items returned per page, maximum 100 items. By default, the response returns 10 items per page. (optional)
    * @param requestOptions {@link RequestOptions } Object to store additional data such as idempotency-keys (optional)
    * @return {@link PaginatedBalanceAccountsResponse }
    * @throws ApiException if fails to make API call
    */
    public PaginatedBalanceAccountsResponse getAllBalanceAccountsOfAccountHolder(String id, Integer offset, Integer limit, RequestOptions requestOptions) throws ApiException, IOException {
        //Add path params
        Map<String, String> pathParams = new HashMap<>();
        if (id == null) {
            throw new IllegalArgumentException("Please provide the id path parameter");
        }
        pathParams.put("id", id);
        //Add query params
        Map<String, String> queryParams = new HashMap<>();
        if (offset != null) {
        queryParams.put("offset", offset.toString());
        }
        if (limit != null) {
        queryParams.put("limit", limit.toString());
        }

        String requestBody = null;
        Resource resource = new Resource(this, this.baseURL + "/accountHolders/{id}/balanceAccounts", null);
        String jsonResult = resource.request(requestBody, requestOptions, ApiConstants.HttpMethod.GET, pathParams, queryParams);
        return PaginatedBalanceAccountsResponse.fromJson(jsonResult);
    }

    /**
    * Get all transaction rules for an account holder
    *
    * @param id {@link String } The unique identifier of the account holder. (required)
    * @return {@link TransactionRulesResponse }
    * @throws ApiException if fails to make API call
    */
    public TransactionRulesResponse getAllTransactionRulesForAccountHolder(String id) throws ApiException, IOException {
        return getAllTransactionRulesForAccountHolder(id, null);
    }

    /**
    * Get all transaction rules for an account holder
    *
    * @param id {@link String } The unique identifier of the account holder. (required)
    * @param requestOptions {@link RequestOptions } Object to store additional data such as idempotency-keys (optional)
    * @return {@link TransactionRulesResponse }
    * @throws ApiException if fails to make API call
    */
    public TransactionRulesResponse getAllTransactionRulesForAccountHolder(String id, RequestOptions requestOptions) throws ApiException, IOException {
        //Add path params
        Map<String, String> pathParams = new HashMap<>();
        if (id == null) {
            throw new IllegalArgumentException("Please provide the id path parameter");
        }
        pathParams.put("id", id);

        String requestBody = null;
        Resource resource = new Resource(this, this.baseURL + "/accountHolders/{id}/transactionRules", null);
        String jsonResult = resource.request(requestBody, requestOptions, ApiConstants.HttpMethod.GET, pathParams);
        return TransactionRulesResponse.fromJson(jsonResult);
    }

    /**
    * Get a tax form
    *
    * @param id {@link String } The unique identifier of the account holder. (required)
    * @param formType {@link String } The type of tax form you want to retrieve. Accepted values are **US1099k** and **US1099nec** (required)
    * @param year {@link Integer } The tax year in YYYY format for the tax form you want to retrieve (required)
    * @return {@link GetTaxFormResponse }
    * @throws ApiException if fails to make API call
    */
    public GetTaxFormResponse getTaxForm(String id, String formType, Integer year) throws ApiException, IOException {
        return getTaxForm(id, formType,  year,  null);
    }

    /**
    * Get a tax form
    *
    * @param id {@link String } The unique identifier of the account holder. (required)
    * @param formType {@link String } Query: The type of tax form you want to retrieve. Accepted values are **US1099k** and **US1099nec** (required)
    * @param year {@link Integer } Query: The tax year in YYYY format for the tax form you want to retrieve (required)
    * @param requestOptions {@link RequestOptions } Object to store additional data such as idempotency-keys (optional)
    * @return {@link GetTaxFormResponse }
    * @throws ApiException if fails to make API call
    */
    public GetTaxFormResponse getTaxForm(String id, String formType, Integer year, RequestOptions requestOptions) throws ApiException, IOException {
        //Add path params
        Map<String, String> pathParams = new HashMap<>();
        if (id == null) {
            throw new IllegalArgumentException("Please provide the id path parameter");
        }
        pathParams.put("id", id);
        //Add query params
        Map<String, String> queryParams = new HashMap<>();
        if (formType != null) {
        queryParams.put("formType", formType);
        }
        if (year != null) {
        queryParams.put("year", year.toString());
        }

        String requestBody = null;
        Resource resource = new Resource(this, this.baseURL + "/accountHolders/{id}/taxForms", null);
        String jsonResult = resource.request(requestBody, requestOptions, ApiConstants.HttpMethod.GET, pathParams, queryParams);
        return GetTaxFormResponse.fromJson(jsonResult);
    }

    /**
    * Update an account holder
    *
    * @param id {@link String } The unique identifier of the account holder. (required)
    * @param accountHolderUpdateRequest {@link AccountHolderUpdateRequest }  (required)
    * @return {@link AccountHolder }
    * @throws ApiException if fails to make API call
    */
    public AccountHolder updateAccountHolder(String id, AccountHolderUpdateRequest accountHolderUpdateRequest) throws ApiException, IOException {
        return updateAccountHolder(id, accountHolderUpdateRequest, null);
    }

    /**
    * Update an account holder
    *
    * @param id {@link String } The unique identifier of the account holder. (required)
    * @param accountHolderUpdateRequest {@link AccountHolderUpdateRequest }  (required)
    * @param requestOptions {@link RequestOptions } Object to store additional data such as idempotency-keys (optional)
    * @return {@link AccountHolder }
    * @throws ApiException if fails to make API call
    */
    public AccountHolder updateAccountHolder(String id, AccountHolderUpdateRequest accountHolderUpdateRequest, RequestOptions requestOptions) throws ApiException, IOException {
        //Add path params
        Map<String, String> pathParams = new HashMap<>();
        if (id == null) {
            throw new IllegalArgumentException("Please provide the id path parameter");
        }
        pathParams.put("id", id);

        String requestBody = accountHolderUpdateRequest.toJson();
        Resource resource = new Resource(this, this.baseURL + "/accountHolders/{id}", null);
        String jsonResult = resource.request(requestBody, requestOptions, ApiConstants.HttpMethod.PATCH, pathParams);
        return AccountHolder.fromJson(jsonResult);
    }
}
