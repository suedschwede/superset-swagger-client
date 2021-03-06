/*
 * Superset
 * Superset
 *
 * OpenAPI spec version: v1
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package at.mic.superset.swagger.client;

import at.mic.superset.swagger.ApiException;
import at.mic.superset.swagger.client.model.ChartDataQueryContextSchema;
import at.mic.superset.swagger.client.model.ChartDataResponseSchema;
import at.mic.superset.swagger.client.model.ChartRestApiPost;
import at.mic.superset.swagger.client.model.ChartRestApiPut;
import java.io.File;
import at.mic.superset.swagger.client.model.GetInfoSchema;
import at.mic.superset.swagger.client.model.GetItemSchema;
import at.mic.superset.swagger.client.model.GetListSchema;
import at.mic.superset.swagger.client.model.InlineResponse200;
import at.mic.superset.swagger.client.model.InlineResponse2001;
import at.mic.superset.swagger.client.model.InlineResponse2002;
import at.mic.superset.swagger.client.model.InlineResponse2003;
import at.mic.superset.swagger.client.model.InlineResponse2004;
import at.mic.superset.swagger.client.model.InlineResponse2005;
import at.mic.superset.swagger.client.model.InlineResponse2006;
import at.mic.superset.swagger.client.model.InlineResponse201;
import at.mic.superset.swagger.client.model.InlineResponse400;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for ChartsApi
 */
@Ignore
public class ChartsApiTest {

    private final ChartsApi api = new ChartsApi();

    /**
     * 
     *
     * Takes a query context constructed in the client and returns payload data response for the given query.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void chartDataPostTest() throws ApiException {
        ChartDataQueryContextSchema body = null;
        ChartDataResponseSchema response = api.chartDataPost(body);

        // TODO: test validations
    }
    /**
     * 
     *
     * Get available datasources.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void chartDatasourcesGetTest() throws ApiException {
        InlineResponse2002 response = api.chartDatasourcesGet();

        // TODO: test validations
    }
    /**
     * 
     *
     * Deletes multiple Charts in a bulk operation.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void chartDeleteTest() throws ApiException {
        List<Integer> q = null;
        InlineResponse400 response = api.chartDelete(q);

        // TODO: test validations
    }
    /**
     * 
     *
     * Get a list of charts, use Rison or JSON query parameters for filtering, sorting, pagination and  for selecting specific columns and metadata.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void chartGetTest() throws ApiException {
        GetListSchema q = null;
        InlineResponse200 response = api.chartGet(q);

        // TODO: test validations
    }
    /**
     * 
     *
     * Several metadata information about chart API endpoints.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void chartInfoGetTest() throws ApiException {
        GetInfoSchema q = null;
        InlineResponse2001 response = api.chartInfoGet(q);

        // TODO: test validations
    }
    /**
     * 
     *
     * Compute or get already computed screenshot from cache.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void chartPkCacheScreenshotGetTest() throws ApiException {
        Integer pk = null;
        String sha = null;
        InlineResponse2006 response = api.chartPkCacheScreenshotGet(pk, sha);

        // TODO: test validations
    }
    /**
     * 
     *
     * Deletes a Chart.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void chartPkDeleteTest() throws ApiException {
        Integer pk = null;
        InlineResponse400 response = api.chartPkDelete(pk);

        // TODO: test validations
    }
    /**
     * 
     *
     * Get a chart detail information.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void chartPkGetTest() throws ApiException {
        Integer pk = null;
        GetItemSchema q = null;
        InlineResponse2004 response = api.chartPkGet(pk, q);

        // TODO: test validations
    }
    /**
     * 
     *
     * Changes a Chart.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void chartPkPutTest() throws ApiException {
        ChartRestApiPut body = null;
        Integer pk = null;
        InlineResponse2005 response = api.chartPkPut(body, pk);

        // TODO: test validations
    }
    /**
     * 
     *
     * Get a computed screenshot from cache.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void chartPkScreenshotDigestGetTest() throws ApiException {
        Integer pk = null;
        String digest = null;
        File response = api.chartPkScreenshotDigestGet(pk, digest);

        // TODO: test validations
    }
    /**
     * 
     *
     * Compute or get already computed chart thumbnail from cache.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void chartPkThumbnailDigestGetTest() throws ApiException {
        Integer pk = null;
        String digest = null;
        api.chartPkThumbnailDigestGet(pk, digest);

        // TODO: test validations
    }
    /**
     * 
     *
     * Create a new Chart.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void chartPostTest() throws ApiException {
        ChartRestApiPost body = null;
        InlineResponse201 response = api.chartPost(body);

        // TODO: test validations
    }
    /**
     * 
     *
     * Get a list of all possible owners for a chart.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void chartRelatedColumnNameGetTest() throws ApiException {
        String columnName = null;
        Object q = null;
        InlineResponse2003 response = api.chartRelatedColumnNameGet(columnName, q);

        // TODO: test validations
    }
}
