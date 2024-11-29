/*
 * Transfers API
 *
 * The version of the OpenAPI document: 4
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package com.adyen.service.transfers;

//api
import com.adyen.Client;
import com.adyen.Service;
import com.adyen.constants.ApiConstants;
import java.time.OffsetDateTime;
import com.adyen.model.transfers.RestServiceError;
import com.adyen.model.transfers.Transaction;
import com.adyen.model.transfers.TransactionSearchResponse;
import com.adyen.model.RequestOptions;
import com.adyen.service.exception.ApiException;
import com.adyen.service.resource.Resource;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class TransactionsApi extends Service {

    public static final String API_VERSION = "4";

    protected String baseURL;

    /**
    * Transactions constructor in {@link com.adyen.service.transfers package}.
    * @param client {@link Client } (required)
    */
    public TransactionsApi(Client client) {
        super(client);
        this.baseURL = createBaseURL("https://balanceplatform-api-test.adyen.com/btl/v4");
    }

    /**
    * Transactions constructor in {@link com.adyen.service.transfers package}.
    * Please use this constructor only if you would like to pass along your own url for routing or testing purposes. The latest API version is defined in this class as a constant.
    * @param client {@link Client } (required)
    * @param baseURL {@link String } (required)
    */
    public TransactionsApi(Client client, String baseURL) {
        super(client);
        this.baseURL = baseURL;
    }

    /**
    * Get all transactions
    *
    * @param createdSince {@link OffsetDateTime } Only include transactions that have been created on or after this point in time. The value must be in ISO 8601 format. For example, **2021-05-30T15:07:40Z**. (required)
    * @param createdUntil {@link OffsetDateTime } Only include transactions that have been created on or before this point in time. The value must be in ISO 8601 format. For example, **2021-05-30T15:07:40Z**. (required)
    * @return {@link TransactionSearchResponse }
    * @throws ApiException if fails to make API call
    */
    public TransactionSearchResponse getAllTransactions(OffsetDateTime createdSince, OffsetDateTime createdUntil) throws ApiException, IOException {
        return getAllTransactions(null,  null,  null,  null,  null,  createdSince,  createdUntil,  null,  null);
    }

    /**
    * Get all transactions
    *
    * @param balancePlatform {@link String } Query: The unique identifier of the [balance platform](https://docs.adyen.com/api-explorer/#/balanceplatform/latest/get/balancePlatforms/{id}__queryParam_id).  Required if you don&#39;t provide a &#x60;balanceAccountId&#x60; or &#x60;accountHolderId&#x60;. (optional)
    * @param paymentInstrumentId {@link String } Query: The unique identifier of the [payment instrument](https://docs.adyen.com/api-explorer/balanceplatform/latest/get/paymentInstruments/_id_).  To use this parameter, you must also provide a &#x60;balanceAccountId&#x60;, &#x60;accountHolderId&#x60;, or &#x60;balancePlatform&#x60;.  The &#x60;paymentInstrumentId&#x60; must be related to the &#x60;balanceAccountId&#x60; or &#x60;accountHolderId&#x60; that you provide. (optional)
    * @param accountHolderId {@link String } Query: The unique identifier of the [account holder](https://docs.adyen.com/api-explorer/#/balanceplatform/latest/get/accountHolders/{id}__queryParam_id).  Required if you don&#39;t provide a &#x60;balanceAccountId&#x60; or &#x60;balancePlatform&#x60;.  If you provide a &#x60;balanceAccountId&#x60;, the &#x60;accountHolderId&#x60; must be related to the &#x60;balanceAccountId&#x60;. (optional)
    * @param balanceAccountId {@link String } Query: The unique identifier of the [balance account](https://docs.adyen.com/api-explorer/#/balanceplatform/latest/get/balanceAccounts/{id}__queryParam_id).  Required if you don&#39;t provide an &#x60;accountHolderId&#x60; or &#x60;balancePlatform&#x60;.  If you provide an &#x60;accountHolderId&#x60;, the &#x60;balanceAccountId&#x60; must be related to the &#x60;accountHolderId&#x60;. (optional)
    * @param cursor {@link String } Query: The &#x60;cursor&#x60; returned in the links of the previous response. (optional)
    * @param createdSince {@link OffsetDateTime } Query: Only include transactions that have been created on or after this point in time. The value must be in ISO 8601 format. For example, **2021-05-30T15:07:40Z**. (required)
    * @param createdUntil {@link OffsetDateTime } Query: Only include transactions that have been created on or before this point in time. The value must be in ISO 8601 format. For example, **2021-05-30T15:07:40Z**. (required)
    * @param limit {@link Integer } Query: The number of items returned per page, maximum of 100 items. By default, the response returns 10 items per page. (optional)
    * @param requestOptions {@link RequestOptions } Object to store additional data such as idempotency-keys (optional)
    * @return {@link TransactionSearchResponse }
    * @throws ApiException if fails to make API call
    */
    public TransactionSearchResponse getAllTransactions(String balancePlatform, String paymentInstrumentId, String accountHolderId, String balanceAccountId, String cursor, OffsetDateTime createdSince, OffsetDateTime createdUntil, Integer limit, RequestOptions requestOptions) throws ApiException, IOException {
        //Add query params
        Map<String, String> queryParams = new HashMap<>();
        if (balancePlatform != null) {
        queryParams.put("balancePlatform", balancePlatform);
        }
        if (paymentInstrumentId != null) {
        queryParams.put("paymentInstrumentId", paymentInstrumentId);
        }
        if (accountHolderId != null) {
        queryParams.put("accountHolderId", accountHolderId);
        }
        if (balanceAccountId != null) {
        queryParams.put("balanceAccountId", balanceAccountId);
        }
        if (cursor != null) {
        queryParams.put("cursor", cursor);
        }
        if (createdSince != null) {
        queryParams.put("createdSince", createdSince.toString());
        }
        if (createdUntil != null) {
        queryParams.put("createdUntil", createdUntil.toString());
        }
        if (limit != null) {
        queryParams.put("limit", limit.toString());
        }

        String requestBody = null;
        Resource resource = new Resource(this, this.baseURL + "/transactions", null);
        String jsonResult = resource.request(requestBody, requestOptions, ApiConstants.HttpMethod.GET, null, queryParams);
        return TransactionSearchResponse.fromJson(jsonResult);
    }

    /**
    * Get a transaction
    *
    * @param id {@link String } The unique identifier of the transaction. (required)
    * @return {@link Transaction }
    * @throws ApiException if fails to make API call
    */
    public Transaction getTransaction(String id) throws ApiException, IOException {
        return getTransaction(id, null);
    }

    /**
    * Get a transaction
    *
    * @param id {@link String } The unique identifier of the transaction. (required)
    * @param requestOptions {@link RequestOptions } Object to store additional data such as idempotency-keys (optional)
    * @return {@link Transaction }
    * @throws ApiException if fails to make API call
    */
    public Transaction getTransaction(String id, RequestOptions requestOptions) throws ApiException, IOException {
        //Add path params
        Map<String, String> pathParams = new HashMap<>();
        if (id == null) {
            throw new IllegalArgumentException("Please provide the id path parameter");
        }
        pathParams.put("id", id);

        String requestBody = null;
        Resource resource = new Resource(this, this.baseURL + "/transactions/{id}", null);
        String jsonResult = resource.request(requestBody, requestOptions, ApiConstants.HttpMethod.GET, pathParams);
        return Transaction.fromJson(jsonResult);
    }
}
