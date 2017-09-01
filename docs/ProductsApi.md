# ProductsApi

All URIs are relative to *https://api-sandbox.netshoes.com.br/api/v2*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getProductBySku**](ProductsApi.md#getProductBySku) | **GET** /products/{sku} | Get product by sku
[**getProducts**](ProductsApi.md#getProducts) | **GET** /products | Get list of products
[**getStatusProductBySku**](ProductsApi.md#getStatusProductBySku) | **GET** /products/{sku}/status | Get product status
[**saveProduct**](ProductsApi.md#saveProduct) | **POST** /products | Create a new product.
[**updateProduct**](ProductsApi.md#updateProduct) | **PUT** /products/{sku} | Update a product.
[**updateProductStatusBySku**](ProductsApi.md#updateProductStatusBySku) | **PUT** /products/{sku}/status | Update product status. Only sandbox


<a name="getProductBySku"></a>
# **getProductBySku**
> InlineResponse200Items getProductBySku(clientId, accessToken, sku, expands)

Get product by sku

Returns the product associated with the searched sku.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ProductsApi;

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

ProductsApi apiInstance = new ProductsApi();
String clientId = "clientId_example"; // String | The APP Token used to authenticate.
String accessToken = "accessToken_example"; // String | The Access Token used to authenticate.
String sku = "sku_example"; // String | Product's Sku
String expands = "expands_example"; // String | Expand response relationships, for instance if you need to access product images use 'images', to access product attributes use 'attributes' and to access images and attributes use 'images,attributes'.
try {
    InlineResponse200Items result = apiInstance.getProductBySku(clientId, accessToken, sku, expands);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProductsApi#getProductBySku");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **clientId** | **String**| The APP Token used to authenticate. |
 **accessToken** | **String**| The Access Token used to authenticate. |
 **sku** | **String**| Product&#39;s Sku |
 **expands** | **String**| Expand response relationships, for instance if you need to access product images use &#39;images&#39;, to access product attributes use &#39;attributes&#39; and to access images and attributes use &#39;images,attributes&#39;. | [optional]

### Return type

[**InlineResponse200Items**](InlineResponse200Items.md)

### Authorization

[access_token](../README.md#access_token), [client_id](../README.md#client_id)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getProducts"></a>
# **getProducts**
> InlineResponse200 getProducts(clientId, accessToken, page, size, expands)

Get list of products

Returns all products associated to the seller.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ProductsApi;

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

ProductsApi apiInstance = new ProductsApi();
String clientId = "clientId_example"; // String | The APP Token used to authenticate.
String accessToken = "accessToken_example"; // String | The Access Token used to authenticate.
Integer page = 0; // Integer | Number of the page in pagination. The starting page number is zero.
Integer size = 20; // Integer | Define the size of the returned list of products.
String expands = "expands_example"; // String | Expand response relationships, for instance if you need to access product images use 'images', to access product attributes use 'attributes' and to access images and attributes use 'images,attributes'.
try {
    InlineResponse200 result = apiInstance.getProducts(clientId, accessToken, page, size, expands);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProductsApi#getProducts");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **clientId** | **String**| The APP Token used to authenticate. |
 **accessToken** | **String**| The Access Token used to authenticate. |
 **page** | **Integer**| Number of the page in pagination. The starting page number is zero. | [optional] [default to 0]
 **size** | **Integer**| Define the size of the returned list of products. | [optional] [default to 20]
 **expands** | **String**| Expand response relationships, for instance if you need to access product images use &#39;images&#39;, to access product attributes use &#39;attributes&#39; and to access images and attributes use &#39;images,attributes&#39;. | [optional]

### Return type

[**InlineResponse200**](InlineResponse200.md)

### Authorization

[access_token](../README.md#access_token), [client_id](../README.md#client_id)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getStatusProductBySku"></a>
# **getStatusProductBySku**
> InlineResponse2001 getStatusProductBySku(clientId, accessToken, sku)

Get product status

Returns the current status of a product.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ProductsApi;

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

ProductsApi apiInstance = new ProductsApi();
String clientId = "clientId_example"; // String | The APP Token used to authenticate.
String accessToken = "accessToken_example"; // String | The Access Token used to authenticate.
String sku = "sku_example"; // String | Product's Sku
try {
    InlineResponse2001 result = apiInstance.getStatusProductBySku(clientId, accessToken, sku);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProductsApi#getStatusProductBySku");
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

[**InlineResponse2001**](InlineResponse2001.md)

### Authorization

[access_token](../README.md#access_token), [client_id](../README.md#client_id)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="saveProduct"></a>
# **saveProduct**
> saveProduct(clientId, accessToken, body)

Create a new product.

Creates a new product. Cannot set flavor and color on the same product

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ProductsApi;

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

ProductsApi apiInstance = new ProductsApi();
String clientId = "clientId_example"; // String | The APP Token used to authenticate.
String accessToken = "accessToken_example"; // String | The Access Token used to authenticate.
Body body = new Body(); // Body | Product json to create a new product.
try {
    apiInstance.saveProduct(clientId, accessToken, body);
} catch (ApiException e) {
    System.err.println("Exception when calling ProductsApi#saveProduct");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **clientId** | **String**| The APP Token used to authenticate. |
 **accessToken** | **String**| The Access Token used to authenticate. |
 **body** | [**Body**](Body.md)| Product json to create a new product. |

### Return type

null (empty response body)

### Authorization

[access_token](../README.md#access_token), [client_id](../README.md#client_id)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="updateProduct"></a>
# **updateProduct**
> updateProduct(clientId, accessToken, sku, body)

Update a product.

Updates a product. Cannot set flavor and color on the same product

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ProductsApi;

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

ProductsApi apiInstance = new ProductsApi();
String clientId = "clientId_example"; // String | The APP Token used to authenticate.
String accessToken = "accessToken_example"; // String | The Access Token used to authenticate.
String sku = "sku_example"; // String | Product's Sku
Body1 body = new Body1(); // Body1 | Product json to create a new product.
try {
    apiInstance.updateProduct(clientId, accessToken, sku, body);
} catch (ApiException e) {
    System.err.println("Exception when calling ProductsApi#updateProduct");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **clientId** | **String**| The APP Token used to authenticate. |
 **accessToken** | **String**| The Access Token used to authenticate. |
 **sku** | **String**| Product&#39;s Sku |
 **body** | [**Body1**](Body1.md)| Product json to create a new product. |

### Return type

null (empty response body)

### Authorization

[access_token](../README.md#access_token), [client_id](../README.md#client_id)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="updateProductStatusBySku"></a>
# **updateProductStatusBySku**
> InlineResponse2001 updateProductStatusBySku(clientId, accessToken, sku, body)

Update product status. Only sandbox

Update product status for Sandbox operations

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ProductsApi;

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

ProductsApi apiInstance = new ProductsApi();
String clientId = "clientId_example"; // String | The APP Token used to authenticate.
String accessToken = "accessToken_example"; // String | The Access Token used to authenticate.
String sku = "sku_example"; // String | Product's Sku
Body2 body = new Body2(); // Body2 | Json to update status.
try {
    InlineResponse2001 result = apiInstance.updateProductStatusBySku(clientId, accessToken, sku, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProductsApi#updateProductStatusBySku");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **clientId** | **String**| The APP Token used to authenticate. |
 **accessToken** | **String**| The Access Token used to authenticate. |
 **sku** | **String**| Product&#39;s Sku |
 **body** | [**Body2**](Body2.md)| Json to update status. |

### Return type

[**InlineResponse2001**](InlineResponse2001.md)

### Authorization

[access_token](../README.md#access_token), [client_id](../README.md#client_id)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

