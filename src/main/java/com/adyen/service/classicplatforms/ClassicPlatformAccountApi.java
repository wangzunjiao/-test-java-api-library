/*
 * Account API
 * This API is used for the classic integration. If you are just starting your implementation, refer to our [new integration guide](https://docs.adyen.com/marketplaces-and-platforms) instead.  The Account API provides endpoints for managing account-related entities on your platform. These related entities include account holders, accounts, bank accounts, shareholders, and verification-related documents. The management operations include actions such as creation, retrieval, updating, and deletion of them.  For more information, refer to our [documentation](https://docs.adyen.com/marketplaces-and-platforms/classic). ## Authentication Your Adyen contact will provide your API credential and an API key. To connect to the API, add an `X-API-Key` header with the API key as the value, for example:   ``` curl -H \"Content-Type: application/json\" \\ -H \"X-API-Key: YOUR_API_KEY\" \\ ... ```  Alternatively, you can use the username and password to connect to the API using basic authentication. For example:  ``` curl -U \"ws@MarketPlace.YOUR_PLATFORM_ACCOUNT\":\"YOUR_WS_PASSWORD\" \\ -H \"Content-Type: application/json\" \\ ... ``` When going live, you need to generate new web service user credentials to access the [live endpoints](https://docs.adyen.com/development-resources/live-endpoints).  ## Versioning The Account API supports [versioning](https://docs.adyen.com/development-resources/versioning) using a version suffix in the endpoint URL. This suffix has the following format: \"vXX\", where XX is the version number.  For example: ``` https://cal-test.adyen.com/cal/services/Account/v6/createAccountHolder ```
 *
 * The version of the OpenAPI document: 6
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package com.adyen.service.classicplatforms;

import com.adyen.Client;
import com.adyen.Service;
import com.adyen.constants.ApiConstants;
import com.adyen.model.marketpayaccount.CloseAccountHolderRequest;
import com.adyen.model.marketpayaccount.CloseAccountHolderResponse;
import com.adyen.model.marketpayaccount.CloseAccountRequest;
import com.adyen.model.marketpayaccount.CloseAccountResponse;
import com.adyen.model.marketpayaccount.CloseStoresRequest;
import com.adyen.model.marketpayaccount.CreateAccountHolderRequest;
import com.adyen.model.marketpayaccount.CreateAccountHolderResponse;
import com.adyen.model.marketpayaccount.CreateAccountRequest;
import com.adyen.model.marketpayaccount.CreateAccountResponse;
import com.adyen.model.marketpayaccount.DeleteBankAccountRequest;
import com.adyen.model.marketpayaccount.DeleteLegalArrangementRequest;
import com.adyen.model.marketpayaccount.DeletePayoutMethodRequest;
import com.adyen.model.marketpayaccount.DeleteShareholderRequest;
import com.adyen.model.marketpayaccount.DeleteSignatoriesRequest;
import com.adyen.model.marketpayaccount.GenericResponse;
import com.adyen.model.marketpayaccount.GetAccountHolderRequest;
import com.adyen.model.marketpayaccount.GetAccountHolderResponse;
import com.adyen.model.marketpayaccount.GetAccountHolderStatusResponse;
import com.adyen.model.marketpayaccount.GetTaxFormRequest;
import com.adyen.model.marketpayaccount.GetTaxFormResponse;
import com.adyen.model.marketpayaccount.GetUploadedDocumentsRequest;
import com.adyen.model.marketpayaccount.GetUploadedDocumentsResponse;
import com.adyen.model.marketpayaccount.PerformVerificationRequest;
import com.adyen.model.marketpayaccount.ServiceError;
import com.adyen.model.marketpayaccount.SuspendAccountHolderRequest;
import com.adyen.model.marketpayaccount.SuspendAccountHolderResponse;
import com.adyen.model.marketpayaccount.UnSuspendAccountHolderRequest;
import com.adyen.model.marketpayaccount.UnSuspendAccountHolderResponse;
import com.adyen.model.marketpayaccount.UpdateAccountHolderRequest;
import com.adyen.model.marketpayaccount.UpdateAccountHolderResponse;
import com.adyen.model.marketpayaccount.UpdateAccountHolderStateRequest;
import com.adyen.model.marketpayaccount.UpdateAccountRequest;
import com.adyen.model.marketpayaccount.UpdateAccountResponse;
import com.adyen.model.marketpayaccount.UploadDocumentRequest;
import com.adyen.model.RequestOptions;
import com.adyen.service.exception.ApiException;
import com.adyen.service.resource.Resource;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class ClassicPlatformAccountApi extends Service {

    public static final String API_VERSION = "6";

    protected String baseURL;

    /**
    * Verification constructor in {@link com.adyen.service package}.
    * @param client {@link Client }  (required)
    */
    public ClassicPlatformAccountApi(Client client) {
        super(client);
        this.baseURL = createBaseURL("https://cal-test.adyen.com/cal/services/Account/v6");
    }

    /**
    * Verification constructor in {@link com.adyen.service package}.
    * Please use this constructor only if you would like to pass along your own url for routing or testing purposes. The latest API version is defined in this class as a constant.
    * @param client {@link Client }  (required)
    * @param baseURL {@link String }  (required)
    */
    public ClassicPlatformAccountApi(Client client, String baseURL) {
        super(client);
        this.baseURL = baseURL;
    }

    /**
    * Trigger verification
    *
    * @param performVerificationRequest {@link PerformVerificationRequest }  (required)
    * @return {@link GenericResponse }
    * @throws ApiException if fails to make API call
    */
    public GenericResponse checkAccountHolder(PerformVerificationRequest performVerificationRequest) throws ApiException, IOException {
        return checkAccountHolder(performVerificationRequest, null);
    }

    /**
    * Trigger verification
    *
    * @param performVerificationRequest {@link PerformVerificationRequest }  (required)
    * @param requestOptions {@link RequestOptions } Object to store additional data such as idempotency-keys (optional)
    * @return {@link GenericResponse }
    * @throws ApiException if fails to make API call
    */
    public GenericResponse checkAccountHolder(PerformVerificationRequest performVerificationRequest, RequestOptions requestOptions) throws ApiException, IOException {

        String requestBody = performVerificationRequest.toJson();
        Resource resource = new Resource(this, this.baseURL + "/checkAccountHolder", null);
        String jsonResult = resource.request(requestBody, requestOptions, ApiConstants.HttpMethod.POST, null);
        return GenericResponse.fromJson(jsonResult);
    }

    /**
    * Close an account
    *
    * @param closeAccountRequest {@link CloseAccountRequest }  (required)
    * @return {@link CloseAccountResponse }
    * @throws ApiException if fails to make API call
    */
    public CloseAccountResponse closeAccount(CloseAccountRequest closeAccountRequest) throws ApiException, IOException {
        return closeAccount(closeAccountRequest, null);
    }

    /**
    * Close an account
    *
    * @param closeAccountRequest {@link CloseAccountRequest }  (required)
    * @param requestOptions {@link RequestOptions } Object to store additional data such as idempotency-keys (optional)
    * @return {@link CloseAccountResponse }
    * @throws ApiException if fails to make API call
    */
    public CloseAccountResponse closeAccount(CloseAccountRequest closeAccountRequest, RequestOptions requestOptions) throws ApiException, IOException {

        String requestBody = closeAccountRequest.toJson();
        Resource resource = new Resource(this, this.baseURL + "/closeAccount", null);
        String jsonResult = resource.request(requestBody, requestOptions, ApiConstants.HttpMethod.POST, null);
        return CloseAccountResponse.fromJson(jsonResult);
    }

    /**
    * Close an account holder
    *
    * @param closeAccountHolderRequest {@link CloseAccountHolderRequest }  (required)
    * @return {@link CloseAccountHolderResponse }
    * @throws ApiException if fails to make API call
    */
    public CloseAccountHolderResponse closeAccountHolder(CloseAccountHolderRequest closeAccountHolderRequest) throws ApiException, IOException {
        return closeAccountHolder(closeAccountHolderRequest, null);
    }

    /**
    * Close an account holder
    *
    * @param closeAccountHolderRequest {@link CloseAccountHolderRequest }  (required)
    * @param requestOptions {@link RequestOptions } Object to store additional data such as idempotency-keys (optional)
    * @return {@link CloseAccountHolderResponse }
    * @throws ApiException if fails to make API call
    */
    public CloseAccountHolderResponse closeAccountHolder(CloseAccountHolderRequest closeAccountHolderRequest, RequestOptions requestOptions) throws ApiException, IOException {

        String requestBody = closeAccountHolderRequest.toJson();
        Resource resource = new Resource(this, this.baseURL + "/closeAccountHolder", null);
        String jsonResult = resource.request(requestBody, requestOptions, ApiConstants.HttpMethod.POST, null);
        return CloseAccountHolderResponse.fromJson(jsonResult);
    }

    /**
    * Close stores
    *
    * @param closeStoresRequest {@link CloseStoresRequest }  (required)
    * @return {@link GenericResponse }
    * @throws ApiException if fails to make API call
    */
    public GenericResponse closeStores(CloseStoresRequest closeStoresRequest) throws ApiException, IOException {
        return closeStores(closeStoresRequest, null);
    }

    /**
    * Close stores
    *
    * @param closeStoresRequest {@link CloseStoresRequest }  (required)
    * @param requestOptions {@link RequestOptions } Object to store additional data such as idempotency-keys (optional)
    * @return {@link GenericResponse }
    * @throws ApiException if fails to make API call
    */
    public GenericResponse closeStores(CloseStoresRequest closeStoresRequest, RequestOptions requestOptions) throws ApiException, IOException {

        String requestBody = closeStoresRequest.toJson();
        Resource resource = new Resource(this, this.baseURL + "/closeStores", null);
        String jsonResult = resource.request(requestBody, requestOptions, ApiConstants.HttpMethod.POST, null);
        return GenericResponse.fromJson(jsonResult);
    }

    /**
    * Create an account
    *
    * @param createAccountRequest {@link CreateAccountRequest }  (required)
    * @return {@link CreateAccountResponse }
    * @throws ApiException if fails to make API call
    */
    public CreateAccountResponse createAccount(CreateAccountRequest createAccountRequest) throws ApiException, IOException {
        return createAccount(createAccountRequest, null);
    }

    /**
    * Create an account
    *
    * @param createAccountRequest {@link CreateAccountRequest }  (required)
    * @param requestOptions {@link RequestOptions } Object to store additional data such as idempotency-keys (optional)
    * @return {@link CreateAccountResponse }
    * @throws ApiException if fails to make API call
    */
    public CreateAccountResponse createAccount(CreateAccountRequest createAccountRequest, RequestOptions requestOptions) throws ApiException, IOException {

        String requestBody = createAccountRequest.toJson();
        Resource resource = new Resource(this, this.baseURL + "/createAccount", null);
        String jsonResult = resource.request(requestBody, requestOptions, ApiConstants.HttpMethod.POST, null);
        return CreateAccountResponse.fromJson(jsonResult);
    }

    /**
    * Create an account holder
    *
    * @param createAccountHolderRequest {@link CreateAccountHolderRequest }  (required)
    * @return {@link CreateAccountHolderResponse }
    * @throws ApiException if fails to make API call
    */
    public CreateAccountHolderResponse createAccountHolder(CreateAccountHolderRequest createAccountHolderRequest) throws ApiException, IOException {
        return createAccountHolder(createAccountHolderRequest, null);
    }

    /**
    * Create an account holder
    *
    * @param createAccountHolderRequest {@link CreateAccountHolderRequest }  (required)
    * @param requestOptions {@link RequestOptions } Object to store additional data such as idempotency-keys (optional)
    * @return {@link CreateAccountHolderResponse }
    * @throws ApiException if fails to make API call
    */
    public CreateAccountHolderResponse createAccountHolder(CreateAccountHolderRequest createAccountHolderRequest, RequestOptions requestOptions) throws ApiException, IOException {

        String requestBody = createAccountHolderRequest.toJson();
        Resource resource = new Resource(this, this.baseURL + "/createAccountHolder", null);
        String jsonResult = resource.request(requestBody, requestOptions, ApiConstants.HttpMethod.POST, null);
        return CreateAccountHolderResponse.fromJson(jsonResult);
    }

    /**
    * Delete bank accounts
    *
    * @param deleteBankAccountRequest {@link DeleteBankAccountRequest }  (required)
    * @return {@link GenericResponse }
    * @throws ApiException if fails to make API call
    */
    public GenericResponse deleteBankAccounts(DeleteBankAccountRequest deleteBankAccountRequest) throws ApiException, IOException {
        return deleteBankAccounts(deleteBankAccountRequest, null);
    }

    /**
    * Delete bank accounts
    *
    * @param deleteBankAccountRequest {@link DeleteBankAccountRequest }  (required)
    * @param requestOptions {@link RequestOptions } Object to store additional data such as idempotency-keys (optional)
    * @return {@link GenericResponse }
    * @throws ApiException if fails to make API call
    */
    public GenericResponse deleteBankAccounts(DeleteBankAccountRequest deleteBankAccountRequest, RequestOptions requestOptions) throws ApiException, IOException {

        String requestBody = deleteBankAccountRequest.toJson();
        Resource resource = new Resource(this, this.baseURL + "/deleteBankAccounts", null);
        String jsonResult = resource.request(requestBody, requestOptions, ApiConstants.HttpMethod.POST, null);
        return GenericResponse.fromJson(jsonResult);
    }

    /**
    * Delete legal arrangements
    *
    * @param deleteLegalArrangementRequest {@link DeleteLegalArrangementRequest }  (required)
    * @return {@link GenericResponse }
    * @throws ApiException if fails to make API call
    */
    public GenericResponse deleteLegalArrangements(DeleteLegalArrangementRequest deleteLegalArrangementRequest) throws ApiException, IOException {
        return deleteLegalArrangements(deleteLegalArrangementRequest, null);
    }

    /**
    * Delete legal arrangements
    *
    * @param deleteLegalArrangementRequest {@link DeleteLegalArrangementRequest }  (required)
    * @param requestOptions {@link RequestOptions } Object to store additional data such as idempotency-keys (optional)
    * @return {@link GenericResponse }
    * @throws ApiException if fails to make API call
    */
    public GenericResponse deleteLegalArrangements(DeleteLegalArrangementRequest deleteLegalArrangementRequest, RequestOptions requestOptions) throws ApiException, IOException {

        String requestBody = deleteLegalArrangementRequest.toJson();
        Resource resource = new Resource(this, this.baseURL + "/deleteLegalArrangements", null);
        String jsonResult = resource.request(requestBody, requestOptions, ApiConstants.HttpMethod.POST, null);
        return GenericResponse.fromJson(jsonResult);
    }

    /**
    * Delete payout methods
    *
    * @param deletePayoutMethodRequest {@link DeletePayoutMethodRequest }  (required)
    * @return {@link GenericResponse }
    * @throws ApiException if fails to make API call
    */
    public GenericResponse deletePayoutMethods(DeletePayoutMethodRequest deletePayoutMethodRequest) throws ApiException, IOException {
        return deletePayoutMethods(deletePayoutMethodRequest, null);
    }

    /**
    * Delete payout methods
    *
    * @param deletePayoutMethodRequest {@link DeletePayoutMethodRequest }  (required)
    * @param requestOptions {@link RequestOptions } Object to store additional data such as idempotency-keys (optional)
    * @return {@link GenericResponse }
    * @throws ApiException if fails to make API call
    */
    public GenericResponse deletePayoutMethods(DeletePayoutMethodRequest deletePayoutMethodRequest, RequestOptions requestOptions) throws ApiException, IOException {

        String requestBody = deletePayoutMethodRequest.toJson();
        Resource resource = new Resource(this, this.baseURL + "/deletePayoutMethods", null);
        String jsonResult = resource.request(requestBody, requestOptions, ApiConstants.HttpMethod.POST, null);
        return GenericResponse.fromJson(jsonResult);
    }

    /**
    * Delete shareholders
    *
    * @param deleteShareholderRequest {@link DeleteShareholderRequest }  (required)
    * @return {@link GenericResponse }
    * @throws ApiException if fails to make API call
    */
    public GenericResponse deleteShareholders(DeleteShareholderRequest deleteShareholderRequest) throws ApiException, IOException {
        return deleteShareholders(deleteShareholderRequest, null);
    }

    /**
    * Delete shareholders
    *
    * @param deleteShareholderRequest {@link DeleteShareholderRequest }  (required)
    * @param requestOptions {@link RequestOptions } Object to store additional data such as idempotency-keys (optional)
    * @return {@link GenericResponse }
    * @throws ApiException if fails to make API call
    */
    public GenericResponse deleteShareholders(DeleteShareholderRequest deleteShareholderRequest, RequestOptions requestOptions) throws ApiException, IOException {

        String requestBody = deleteShareholderRequest.toJson();
        Resource resource = new Resource(this, this.baseURL + "/deleteShareholders", null);
        String jsonResult = resource.request(requestBody, requestOptions, ApiConstants.HttpMethod.POST, null);
        return GenericResponse.fromJson(jsonResult);
    }

    /**
    * Delete signatories
    *
    * @param deleteSignatoriesRequest {@link DeleteSignatoriesRequest }  (required)
    * @return {@link GenericResponse }
    * @throws ApiException if fails to make API call
    */
    public GenericResponse deleteSignatories(DeleteSignatoriesRequest deleteSignatoriesRequest) throws ApiException, IOException {
        return deleteSignatories(deleteSignatoriesRequest, null);
    }

    /**
    * Delete signatories
    *
    * @param deleteSignatoriesRequest {@link DeleteSignatoriesRequest }  (required)
    * @param requestOptions {@link RequestOptions } Object to store additional data such as idempotency-keys (optional)
    * @return {@link GenericResponse }
    * @throws ApiException if fails to make API call
    */
    public GenericResponse deleteSignatories(DeleteSignatoriesRequest deleteSignatoriesRequest, RequestOptions requestOptions) throws ApiException, IOException {

        String requestBody = deleteSignatoriesRequest.toJson();
        Resource resource = new Resource(this, this.baseURL + "/deleteSignatories", null);
        String jsonResult = resource.request(requestBody, requestOptions, ApiConstants.HttpMethod.POST, null);
        return GenericResponse.fromJson(jsonResult);
    }

    /**
    * Get an account holder
    *
    * @param getAccountHolderRequest {@link GetAccountHolderRequest }  (required)
    * @return {@link GetAccountHolderResponse }
    * @throws ApiException if fails to make API call
    */
    public GetAccountHolderResponse getAccountHolder(GetAccountHolderRequest getAccountHolderRequest) throws ApiException, IOException {
        return getAccountHolder(getAccountHolderRequest, null);
    }

    /**
    * Get an account holder
    *
    * @param getAccountHolderRequest {@link GetAccountHolderRequest }  (required)
    * @param requestOptions {@link RequestOptions } Object to store additional data such as idempotency-keys (optional)
    * @return {@link GetAccountHolderResponse }
    * @throws ApiException if fails to make API call
    */
    public GetAccountHolderResponse getAccountHolder(GetAccountHolderRequest getAccountHolderRequest, RequestOptions requestOptions) throws ApiException, IOException {

        String requestBody = getAccountHolderRequest.toJson();
        Resource resource = new Resource(this, this.baseURL + "/getAccountHolder", null);
        String jsonResult = resource.request(requestBody, requestOptions, ApiConstants.HttpMethod.POST, null);
        return GetAccountHolderResponse.fromJson(jsonResult);
    }

    /**
    * Get a tax form
    *
    * @param getTaxFormRequest {@link GetTaxFormRequest }  (required)
    * @return {@link GetTaxFormResponse }
    * @throws ApiException if fails to make API call
    */
    public GetTaxFormResponse getTaxForm(GetTaxFormRequest getTaxFormRequest) throws ApiException, IOException {
        return getTaxForm(getTaxFormRequest, null);
    }

    /**
    * Get a tax form
    *
    * @param getTaxFormRequest {@link GetTaxFormRequest }  (required)
    * @param requestOptions {@link RequestOptions } Object to store additional data such as idempotency-keys (optional)
    * @return {@link GetTaxFormResponse }
    * @throws ApiException if fails to make API call
    */
    public GetTaxFormResponse getTaxForm(GetTaxFormRequest getTaxFormRequest, RequestOptions requestOptions) throws ApiException, IOException {

        String requestBody = getTaxFormRequest.toJson();
        Resource resource = new Resource(this, this.baseURL + "/getTaxForm", null);
        String jsonResult = resource.request(requestBody, requestOptions, ApiConstants.HttpMethod.POST, null);
        return GetTaxFormResponse.fromJson(jsonResult);
    }

    /**
    * Get documents
    *
    * @param getUploadedDocumentsRequest {@link GetUploadedDocumentsRequest }  (required)
    * @return {@link GetUploadedDocumentsResponse }
    * @throws ApiException if fails to make API call
    */
    public GetUploadedDocumentsResponse getUploadedDocuments(GetUploadedDocumentsRequest getUploadedDocumentsRequest) throws ApiException, IOException {
        return getUploadedDocuments(getUploadedDocumentsRequest, null);
    }

    /**
    * Get documents
    *
    * @param getUploadedDocumentsRequest {@link GetUploadedDocumentsRequest }  (required)
    * @param requestOptions {@link RequestOptions } Object to store additional data such as idempotency-keys (optional)
    * @return {@link GetUploadedDocumentsResponse }
    * @throws ApiException if fails to make API call
    */
    public GetUploadedDocumentsResponse getUploadedDocuments(GetUploadedDocumentsRequest getUploadedDocumentsRequest, RequestOptions requestOptions) throws ApiException, IOException {

        String requestBody = getUploadedDocumentsRequest.toJson();
        Resource resource = new Resource(this, this.baseURL + "/getUploadedDocuments", null);
        String jsonResult = resource.request(requestBody, requestOptions, ApiConstants.HttpMethod.POST, null);
        return GetUploadedDocumentsResponse.fromJson(jsonResult);
    }

    /**
    * Suspend an account holder
    *
    * @param suspendAccountHolderRequest {@link SuspendAccountHolderRequest }  (required)
    * @return {@link SuspendAccountHolderResponse }
    * @throws ApiException if fails to make API call
    */
    public SuspendAccountHolderResponse suspendAccountHolder(SuspendAccountHolderRequest suspendAccountHolderRequest) throws ApiException, IOException {
        return suspendAccountHolder(suspendAccountHolderRequest, null);
    }

    /**
    * Suspend an account holder
    *
    * @param suspendAccountHolderRequest {@link SuspendAccountHolderRequest }  (required)
    * @param requestOptions {@link RequestOptions } Object to store additional data such as idempotency-keys (optional)
    * @return {@link SuspendAccountHolderResponse }
    * @throws ApiException if fails to make API call
    */
    public SuspendAccountHolderResponse suspendAccountHolder(SuspendAccountHolderRequest suspendAccountHolderRequest, RequestOptions requestOptions) throws ApiException, IOException {

        String requestBody = suspendAccountHolderRequest.toJson();
        Resource resource = new Resource(this, this.baseURL + "/suspendAccountHolder", null);
        String jsonResult = resource.request(requestBody, requestOptions, ApiConstants.HttpMethod.POST, null);
        return SuspendAccountHolderResponse.fromJson(jsonResult);
    }

    /**
    * Unsuspend an account holder
    *
    * @param unSuspendAccountHolderRequest {@link UnSuspendAccountHolderRequest }  (required)
    * @return {@link UnSuspendAccountHolderResponse }
    * @throws ApiException if fails to make API call
    */
    public UnSuspendAccountHolderResponse unSuspendAccountHolder(UnSuspendAccountHolderRequest unSuspendAccountHolderRequest) throws ApiException, IOException {
        return unSuspendAccountHolder(unSuspendAccountHolderRequest, null);
    }

    /**
    * Unsuspend an account holder
    *
    * @param unSuspendAccountHolderRequest {@link UnSuspendAccountHolderRequest }  (required)
    * @param requestOptions {@link RequestOptions } Object to store additional data such as idempotency-keys (optional)
    * @return {@link UnSuspendAccountHolderResponse }
    * @throws ApiException if fails to make API call
    */
    public UnSuspendAccountHolderResponse unSuspendAccountHolder(UnSuspendAccountHolderRequest unSuspendAccountHolderRequest, RequestOptions requestOptions) throws ApiException, IOException {

        String requestBody = unSuspendAccountHolderRequest.toJson();
        Resource resource = new Resource(this, this.baseURL + "/unSuspendAccountHolder", null);
        String jsonResult = resource.request(requestBody, requestOptions, ApiConstants.HttpMethod.POST, null);
        return UnSuspendAccountHolderResponse.fromJson(jsonResult);
    }

    /**
    * Update an account
    *
    * @param updateAccountRequest {@link UpdateAccountRequest }  (required)
    * @return {@link UpdateAccountResponse }
    * @throws ApiException if fails to make API call
    */
    public UpdateAccountResponse updateAccount(UpdateAccountRequest updateAccountRequest) throws ApiException, IOException {
        return updateAccount(updateAccountRequest, null);
    }

    /**
    * Update an account
    *
    * @param updateAccountRequest {@link UpdateAccountRequest }  (required)
    * @param requestOptions {@link RequestOptions } Object to store additional data such as idempotency-keys (optional)
    * @return {@link UpdateAccountResponse }
    * @throws ApiException if fails to make API call
    */
    public UpdateAccountResponse updateAccount(UpdateAccountRequest updateAccountRequest, RequestOptions requestOptions) throws ApiException, IOException {

        String requestBody = updateAccountRequest.toJson();
        Resource resource = new Resource(this, this.baseURL + "/updateAccount", null);
        String jsonResult = resource.request(requestBody, requestOptions, ApiConstants.HttpMethod.POST, null);
        return UpdateAccountResponse.fromJson(jsonResult);
    }

    /**
    * Update an account holder
    *
    * @param updateAccountHolderRequest {@link UpdateAccountHolderRequest }  (required)
    * @return {@link UpdateAccountHolderResponse }
    * @throws ApiException if fails to make API call
    */
    public UpdateAccountHolderResponse updateAccountHolder(UpdateAccountHolderRequest updateAccountHolderRequest) throws ApiException, IOException {
        return updateAccountHolder(updateAccountHolderRequest, null);
    }

    /**
    * Update an account holder
    *
    * @param updateAccountHolderRequest {@link UpdateAccountHolderRequest }  (required)
    * @param requestOptions {@link RequestOptions } Object to store additional data such as idempotency-keys (optional)
    * @return {@link UpdateAccountHolderResponse }
    * @throws ApiException if fails to make API call
    */
    public UpdateAccountHolderResponse updateAccountHolder(UpdateAccountHolderRequest updateAccountHolderRequest, RequestOptions requestOptions) throws ApiException, IOException {

        String requestBody = updateAccountHolderRequest.toJson();
        Resource resource = new Resource(this, this.baseURL + "/updateAccountHolder", null);
        String jsonResult = resource.request(requestBody, requestOptions, ApiConstants.HttpMethod.POST, null);
        return UpdateAccountHolderResponse.fromJson(jsonResult);
    }

    /**
    * Update payout or processing state
    *
    * @param updateAccountHolderStateRequest {@link UpdateAccountHolderStateRequest }  (required)
    * @return {@link GetAccountHolderStatusResponse }
    * @throws ApiException if fails to make API call
    */
    public GetAccountHolderStatusResponse updateAccountHolderState(UpdateAccountHolderStateRequest updateAccountHolderStateRequest) throws ApiException, IOException {
        return updateAccountHolderState(updateAccountHolderStateRequest, null);
    }

    /**
    * Update payout or processing state
    *
    * @param updateAccountHolderStateRequest {@link UpdateAccountHolderStateRequest }  (required)
    * @param requestOptions {@link RequestOptions } Object to store additional data such as idempotency-keys (optional)
    * @return {@link GetAccountHolderStatusResponse }
    * @throws ApiException if fails to make API call
    */
    public GetAccountHolderStatusResponse updateAccountHolderState(UpdateAccountHolderStateRequest updateAccountHolderStateRequest, RequestOptions requestOptions) throws ApiException, IOException {

        String requestBody = updateAccountHolderStateRequest.toJson();
        Resource resource = new Resource(this, this.baseURL + "/updateAccountHolderState", null);
        String jsonResult = resource.request(requestBody, requestOptions, ApiConstants.HttpMethod.POST, null);
        return GetAccountHolderStatusResponse.fromJson(jsonResult);
    }

    /**
    * Upload a document
    *
    * @param uploadDocumentRequest {@link UploadDocumentRequest }  (required)
    * @return {@link UpdateAccountHolderResponse }
    * @throws ApiException if fails to make API call
    */
    public UpdateAccountHolderResponse uploadDocument(UploadDocumentRequest uploadDocumentRequest) throws ApiException, IOException {
        return uploadDocument(uploadDocumentRequest, null);
    }

    /**
    * Upload a document
    *
    * @param uploadDocumentRequest {@link UploadDocumentRequest }  (required)
    * @param requestOptions {@link RequestOptions } Object to store additional data such as idempotency-keys (optional)
    * @return {@link UpdateAccountHolderResponse }
    * @throws ApiException if fails to make API call
    */
    public UpdateAccountHolderResponse uploadDocument(UploadDocumentRequest uploadDocumentRequest, RequestOptions requestOptions) throws ApiException, IOException {

        String requestBody = uploadDocumentRequest.toJson();
        Resource resource = new Resource(this, this.baseURL + "/uploadDocument", null);
        String jsonResult = resource.request(requestBody, requestOptions, ApiConstants.HttpMethod.POST, null);
        return UpdateAccountHolderResponse.fromJson(jsonResult);
    }
}
