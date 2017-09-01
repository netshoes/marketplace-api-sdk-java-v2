# StocksApi

All URIs are relative to *https://api-sandbox.netshoes.com.br/api/v2*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getStockProductBySku**](StocksApi.md#getStockProductBySku) | **GET** /products/{sku}/stocks | Get stock of the product
[**saveStockProductBySku**](StocksApi.md#saveStockProductBySku) | **POST** /products/{sku}/stocks | Save a newly created stock quantity of the product
[**updateStockProductBySku**](StocksApi.md#updateStockProductBySku) | **PUT** /products/{sku}/stocks | Update stock of the product


<a name="getStockProductBySku"></a>
# **getStockProductBySku**
> InlineResponse2003 getStockProductBySku(clientId, accessToken, sku)

Get stock of the product

Returns the current stock quantity of the product.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.StocksApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: access_token
ApiKeyAuth access_token = (ApiKeyAuth) defaultClient.getAuthentication("access_token");
access_token.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//access_token.setApiKeyPrefix("Token");

// Configure API key authorization: client_id
ApiKeyAuth client_id = (ApiKeyAuth) defaultClient.getAuthentication("client_id");
client_id.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//client_id.setApiKeyPrefix("Token");

StocksApi apiInstance = new StocksApi();
String clientId = "clientId_example"; // String | The APP Token used to authenticate.
String accessToken = "accessToken_example"; // String | The Access Token used to authenticate.
String sku = "sku_example"; // String | Product's Sku
try {
    InlineResponse2003 result = apiInstance.getStockProductBySku(clientId, accessToken, sku);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling StocksApi#getStockProductBySku");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **clientId** | **String**| The APP Token used to authenticate. |
 **accessToken** | **String**| The Access Token used to authenticate. |
 **sku** | **String**| Product&#39;s Sku |

### Return type

[**InlineResponse2003**](InlineResponse2003.md)

### Authorization

[access_token](../README.md#access_token), [client_id](../README.md#client_id)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="saveStockProductBySku"></a>
# **saveStockProductBySku**
> saveStockProductBySku(clientId, accessToken, sku, body)

Save a newly created stock quantity of the product

Saves a new stock quantity of a product with no previous stock set.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.StocksApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: access_token
ApiKeyAuth access_token = (ApiKeyAuth) defaultClient.getAuthentication("access_token");
access_token.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//access_token.setApiKeyPrefix("Token");

// Configure API key authorization: client_id
ApiKeyAuth client_id = (ApiKeyAuth) defaultClient.getAuthentication("client_id");
client_id.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//client_id.setApiKeyPrefix("Token");

StocksApi apiInstance = new StocksApi();
String clientId = "clientId_example"; // String | The APP Token used to authenticate.
String accessToken = "accessToken_example"; // String | The Access Token used to authenticate.
String sku = "sku_example"; // String | Product's Sku
Body6 body = new Body6(); // Body6 | Json to send a stock quantity.
try {
    apiInstance.saveStockProductBySku(clientId, accessToken, sku, body);
} catch (ApiException e) {
    System.err.println("Exception when calling StocksApi#saveStockProductBySku");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **clientId** | **String**| The APP Token used to authenticate. |
 **accessToken** | **String**| The Access Token used to authenticate. |
 **sku** | **String**| Product&#39;s Sku |
 **body** | [**Body6**](Body6.md)| Json to send a stock quantity. |

### Return type

null (empty response body)

### Authorization

[access_token](../README.md#access_token), [client_id](../README.md#client_id)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="updateStockProductBySku"></a>
# **updateStockProductBySku**
> updateStockProductBySku(clientId, accessToken, sku, body)

Update stock of the product

Updates the stock quantity of the product.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.StocksApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: access_token
ApiKeyAuth access_token = (ApiKeyAuth) defaultClient.getAuthentication("access_token");
access_token.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//access_token.setApiKeyPrefix("Token");

// Configure API key authorization: client_id
ApiKeyAuth client_id = (ApiKeyAuth) defaultClient.getAuthentication("client_id");
client_id.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//client_id.setApiKeyPrefix("Token");

StocksApi apiInstance = new StocksApi();
String clientId = "clientId_example"; // String | The APP Token used to authenticate.
String accessToken = "accessToken_example"; // String | The Access Token used to authenticate.
String sku = "sku_example"; // String | Product's Sku
Body5 body = new Body5(); // Body5 | Json to send a stock quantity.
try {
    apiInstance.updateStockProductBySku(clientId, accessToken, sku, body);
} catch (ApiException e) {
    System.err.println("Exception when calling StocksApi#updateStockProductBySku");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **clientId** | **String**| The APP Token used to authenticate. |
 **accessToken** | **String**| The Access Token used to authenticate. |
 **sku** | **String**| Product&#39;s Sku |
 **body** | [**Body5**](Body5.md)| Json to send a stock quantity. |

### Return type

null (empty response body)

### Authorization

[access_token](../README.md#access_token), [client_id](../README.md#client_id)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

