/*
 * API Marketplace Grupo Netshoes
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: 2.0.0
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package io.swagger.client.api;

import io.swagger.client.ApiCallback;
import io.swagger.client.ApiClient;
import io.swagger.client.ApiException;
import io.swagger.client.ApiResponse;
import io.swagger.client.Configuration;
import io.swagger.client.Pair;
import io.swagger.client.ProgressRequestBody;
import io.swagger.client.ProgressResponseBody;

import com.google.gson.reflect.TypeToken;

import java.io.IOException;


import io.swagger.client.model.Body5;
import io.swagger.client.model.Body6;
import io.swagger.client.model.InlineResponse2003;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class StocksApi {
    private ApiClient apiClient;

    public StocksApi() {
        this(Configuration.getDefaultApiClient());
    }

    public StocksApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /* Build call for getStockProductBySku */
    private com.squareup.okhttp.Call getStockProductBySkuCall(String clientId, String accessToken, String sku, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // create path and map variables
        String localVarPath = "/products/{sku}/stocks".replaceAll("\\{format\\}","json")
        .replaceAll("\\{" + "sku" + "\\}", apiClient.escapeString(sku.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        if (clientId != null)
        localVarHeaderParams.put("client_id", apiClient.parameterToString(clientId));
        if (accessToken != null)
        localVarHeaderParams.put("access_token", apiClient.parameterToString(accessToken));

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] { "access_token", "client_id" };
        return apiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }
    
    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call getStockProductBySkuValidateBeforeCall(String clientId, String accessToken, String sku, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'clientId' is set
        if (clientId == null) {
            throw new ApiException("Missing the required parameter 'clientId' when calling getStockProductBySku(Async)");
        }
        
        // verify the required parameter 'accessToken' is set
        if (accessToken == null) {
            throw new ApiException("Missing the required parameter 'accessToken' when calling getStockProductBySku(Async)");
        }
        
        // verify the required parameter 'sku' is set
        if (sku == null) {
            throw new ApiException("Missing the required parameter 'sku' when calling getStockProductBySku(Async)");
        }
        
        
        com.squareup.okhttp.Call call = getStockProductBySkuCall(clientId, accessToken, sku, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * Get stock of the product
     * Returns the current stock quantity of the product.
     * @param clientId The APP Token used to authenticate. (required)
     * @param accessToken The Access Token used to authenticate. (required)
     * @param sku Product&#39;s Sku (required)
     * @return InlineResponse2003
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public InlineResponse2003 getStockProductBySku(String clientId, String accessToken, String sku) throws ApiException {
        ApiResponse<InlineResponse2003> resp = getStockProductBySkuWithHttpInfo(clientId, accessToken, sku);
        return resp.getData();
    }

    /**
     * Get stock of the product
     * Returns the current stock quantity of the product.
     * @param clientId The APP Token used to authenticate. (required)
     * @param accessToken The Access Token used to authenticate. (required)
     * @param sku Product&#39;s Sku (required)
     * @return ApiResponse&lt;InlineResponse2003&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<InlineResponse2003> getStockProductBySkuWithHttpInfo(String clientId, String accessToken, String sku) throws ApiException {
        com.squareup.okhttp.Call call = getStockProductBySkuValidateBeforeCall(clientId, accessToken, sku, null, null);
        Type localVarReturnType = new TypeToken<InlineResponse2003>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Get stock of the product (asynchronously)
     * Returns the current stock quantity of the product.
     * @param clientId The APP Token used to authenticate. (required)
     * @param accessToken The Access Token used to authenticate. (required)
     * @param sku Product&#39;s Sku (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getStockProductBySkuAsync(String clientId, String accessToken, String sku, final ApiCallback<InlineResponse2003> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = getStockProductBySkuValidateBeforeCall(clientId, accessToken, sku, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<InlineResponse2003>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /* Build call for saveStockProductBySku */
    private com.squareup.okhttp.Call saveStockProductBySkuCall(String clientId, String accessToken, String sku, Body6 body, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = body;
        
        // create path and map variables
        String localVarPath = "/products/{sku}/stocks".replaceAll("\\{format\\}","json")
        .replaceAll("\\{" + "sku" + "\\}", apiClient.escapeString(sku.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        if (clientId != null)
        localVarHeaderParams.put("client_id", apiClient.parameterToString(clientId));
        if (accessToken != null)
        localVarHeaderParams.put("access_token", apiClient.parameterToString(accessToken));

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] { "access_token", "client_id" };
        return apiClient.buildCall(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }
    
    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call saveStockProductBySkuValidateBeforeCall(String clientId, String accessToken, String sku, Body6 body, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'clientId' is set
        if (clientId == null) {
            throw new ApiException("Missing the required parameter 'clientId' when calling saveStockProductBySku(Async)");
        }
        
        // verify the required parameter 'accessToken' is set
        if (accessToken == null) {
            throw new ApiException("Missing the required parameter 'accessToken' when calling saveStockProductBySku(Async)");
        }
        
        // verify the required parameter 'sku' is set
        if (sku == null) {
            throw new ApiException("Missing the required parameter 'sku' when calling saveStockProductBySku(Async)");
        }
        
        // verify the required parameter 'body' is set
        if (body == null) {
            throw new ApiException("Missing the required parameter 'body' when calling saveStockProductBySku(Async)");
        }
        
        
        com.squareup.okhttp.Call call = saveStockProductBySkuCall(clientId, accessToken, sku, body, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * Save a newly created stock quantity of the product
     * Saves a new stock quantity of a product with no previous stock set.
     * @param clientId The APP Token used to authenticate. (required)
     * @param accessToken The Access Token used to authenticate. (required)
     * @param sku Product&#39;s Sku (required)
     * @param body Json to send a stock quantity. (required)
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public void saveStockProductBySku(String clientId, String accessToken, String sku, Body6 body) throws ApiException {
        saveStockProductBySkuWithHttpInfo(clientId, accessToken, sku, body);
    }

    /**
     * Save a newly created stock quantity of the product
     * Saves a new stock quantity of a product with no previous stock set.
     * @param clientId The APP Token used to authenticate. (required)
     * @param accessToken The Access Token used to authenticate. (required)
     * @param sku Product&#39;s Sku (required)
     * @param body Json to send a stock quantity. (required)
     * @return ApiResponse&lt;Void&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<Void> saveStockProductBySkuWithHttpInfo(String clientId, String accessToken, String sku, Body6 body) throws ApiException {
        com.squareup.okhttp.Call call = saveStockProductBySkuValidateBeforeCall(clientId, accessToken, sku, body, null, null);
        return apiClient.execute(call);
    }

    /**
     * Save a newly created stock quantity of the product (asynchronously)
     * Saves a new stock quantity of a product with no previous stock set.
     * @param clientId The APP Token used to authenticate. (required)
     * @param accessToken The Access Token used to authenticate. (required)
     * @param sku Product&#39;s Sku (required)
     * @param body Json to send a stock quantity. (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call saveStockProductBySkuAsync(String clientId, String accessToken, String sku, Body6 body, final ApiCallback<Void> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = saveStockProductBySkuValidateBeforeCall(clientId, accessToken, sku, body, progressListener, progressRequestListener);
        apiClient.executeAsync(call, callback);
        return call;
    }
    /* Build call for updateStockProductBySku */
    private com.squareup.okhttp.Call updateStockProductBySkuCall(String clientId, String accessToken, String sku, Body5 body, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = body;
        
        // create path and map variables
        String localVarPath = "/products/{sku}/stocks".replaceAll("\\{format\\}","json")
        .replaceAll("\\{" + "sku" + "\\}", apiClient.escapeString(sku.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        if (clientId != null)
        localVarHeaderParams.put("client_id", apiClient.parameterToString(clientId));
        if (accessToken != null)
        localVarHeaderParams.put("access_token", apiClient.parameterToString(accessToken));

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] { "access_token", "client_id" };
        return apiClient.buildCall(localVarPath, "PUT", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }
    
    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call updateStockProductBySkuValidateBeforeCall(String clientId, String accessToken, String sku, Body5 body, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'clientId' is set
        if (clientId == null) {
            throw new ApiException("Missing the required parameter 'clientId' when calling updateStockProductBySku(Async)");
        }
        
        // verify the required parameter 'accessToken' is set
        if (accessToken == null) {
            throw new ApiException("Missing the required parameter 'accessToken' when calling updateStockProductBySku(Async)");
        }
        
        // verify the required parameter 'sku' is set
        if (sku == null) {
            throw new ApiException("Missing the required parameter 'sku' when calling updateStockProductBySku(Async)");
        }
        
        // verify the required parameter 'body' is set
        if (body == null) {
            throw new ApiException("Missing the required parameter 'body' when calling updateStockProductBySku(Async)");
        }
        
        
        com.squareup.okhttp.Call call = updateStockProductBySkuCall(clientId, accessToken, sku, body, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * Update stock of the product
     * Updates the stock quantity of the product.
     * @param clientId The APP Token used to authenticate. (required)
     * @param accessToken The Access Token used to authenticate. (required)
     * @param sku Product&#39;s Sku (required)
     * @param body Json to send a stock quantity. (required)
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public void updateStockProductBySku(String clientId, String accessToken, String sku, Body5 body) throws ApiException {
        updateStockProductBySkuWithHttpInfo(clientId, accessToken, sku, body);
    }

    /**
     * Update stock of the product
     * Updates the stock quantity of the product.
     * @param clientId The APP Token used to authenticate. (required)
     * @param accessToken The Access Token used to authenticate. (required)
     * @param sku Product&#39;s Sku (required)
     * @param body Json to send a stock quantity. (required)
     * @return ApiResponse&lt;Void&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<Void> updateStockProductBySkuWithHttpInfo(String clientId, String accessToken, String sku, Body5 body) throws ApiException {
        com.squareup.okhttp.Call call = updateStockProductBySkuValidateBeforeCall(clientId, accessToken, sku, body, null, null);
        return apiClient.execute(call);
    }

    /**
     * Update stock of the product (asynchronously)
     * Updates the stock quantity of the product.
     * @param clientId The APP Token used to authenticate. (required)
     * @param accessToken The Access Token used to authenticate. (required)
     * @param sku Product&#39;s Sku (required)
     * @param body Json to send a stock quantity. (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call updateStockProductBySkuAsync(String clientId, String accessToken, String sku, Body5 body, final ApiCallback<Void> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = updateStockProductBySkuValidateBeforeCall(clientId, accessToken, sku, body, progressListener, progressRequestListener);
        apiClient.executeAsync(call, callback);
        return call;
    }
}
