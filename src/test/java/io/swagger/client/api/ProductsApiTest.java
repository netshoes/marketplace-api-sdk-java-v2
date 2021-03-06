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

import io.swagger.client.ApiException;
import io.swagger.client.model.Body;
import io.swagger.client.model.Body1;
import io.swagger.client.model.Body2;
import io.swagger.client.model.InlineResponse200;
import io.swagger.client.model.InlineResponse2001;
import io.swagger.client.model.InlineResponse200Items;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for ProductsApi
 */
@Ignore
public class ProductsApiTest {

    private final ProductsApi api = new ProductsApi();

    
    /**
     * Get product by sku
     *
     * Returns the product associated with the searched sku.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getProductBySkuTest() throws ApiException {
        String clientId = null;
        String accessToken = null;
        String sku = null;
        String expands = null;
        InlineResponse200Items response = api.getProductBySku(clientId, accessToken, sku, expands);

        // TODO: test validations
    }
    
    /**
     * Get list of products
     *
     * Returns all products associated to the seller.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getProductsTest() throws ApiException {
        String clientId = null;
        String accessToken = null;
        Integer page = null;
        Integer size = null;
        String expands = null;
        InlineResponse200 response = api.getProducts(clientId, accessToken, page, size, expands);

        // TODO: test validations
    }
    
    /**
     * Get product status
     *
     * Returns the current status of a product.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getStatusProductBySkuTest() throws ApiException {
        String clientId = null;
        String accessToken = null;
        String sku = null;
        InlineResponse2001 response = api.getStatusProductBySku(clientId, accessToken, sku);

        // TODO: test validations
    }
    
    /**
     * Create a new product.
     *
     * Creates a new product. Cannot set flavor and color on the same product
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void saveProductTest() throws ApiException {
        String clientId = null;
        String accessToken = null;
        Body body = null;
        api.saveProduct(clientId, accessToken, body);

        // TODO: test validations
    }
    
    /**
     * Update a product.
     *
     * Updates a product. Cannot set flavor and color on the same product
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void updateProductTest() throws ApiException {
        String clientId = null;
        String accessToken = null;
        String sku = null;
        Body1 body = null;
        api.updateProduct(clientId, accessToken, sku, body);

        // TODO: test validations
    }
    
    /**
     * Update product status. Only sandbox
     *
     * Update product status for Sandbox operations
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void updateProductStatusBySkuTest() throws ApiException {
        String clientId = null;
        String accessToken = null;
        String sku = null;
        Body2 body = null;
        InlineResponse2001 response = api.updateProductStatusBySku(clientId, accessToken, sku, body);

        // TODO: test validations
    }
    
}
