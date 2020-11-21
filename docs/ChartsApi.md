# ChartsApi

All URIs are relative to */api/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**chartDataPost**](ChartsApi.md#chartDataPost) | **POST** /chart/data | 
[**chartDatasourcesGet**](ChartsApi.md#chartDatasourcesGet) | **GET** /chart/datasources | 
[**chartDelete**](ChartsApi.md#chartDelete) | **DELETE** /chart/ | 
[**chartGet**](ChartsApi.md#chartGet) | **GET** /chart/ | 
[**chartInfoGet**](ChartsApi.md#chartInfoGet) | **GET** /chart/_info | 
[**chartPkCacheScreenshotGet**](ChartsApi.md#chartPkCacheScreenshotGet) | **GET** /chart/{pk}/cache_screenshot/ | 
[**chartPkDelete**](ChartsApi.md#chartPkDelete) | **DELETE** /chart/{pk} | 
[**chartPkGet**](ChartsApi.md#chartPkGet) | **GET** /chart/{pk} | 
[**chartPkPut**](ChartsApi.md#chartPkPut) | **PUT** /chart/{pk} | 
[**chartPkScreenshotDigestGet**](ChartsApi.md#chartPkScreenshotDigestGet) | **GET** /chart/{pk}/screenshot/{digest}/ | 
[**chartPkThumbnailDigestGet**](ChartsApi.md#chartPkThumbnailDigestGet) | **GET** /chart/{pk}/thumbnail/{digest}/ | 
[**chartPost**](ChartsApi.md#chartPost) | **POST** /chart/ | 
[**chartRelatedColumnNameGet**](ChartsApi.md#chartRelatedColumnNameGet) | **GET** /chart/related/{column_name} | 

<a name="chartDataPost"></a>
# **chartDataPost**
> ChartDataResponseSchema chartDataPost(body)



Takes a query context constructed in the client and returns payload data response for the given query.

### Example
```java
// Import classes:
//import at.mic.superset.swagger.ApiClient;
//import at.mic.superset.swagger.ApiException;
//import at.mic.superset.swagger.Configuration;
//import at.mic.superset.swagger.auth.*;
//import at.mic.superset.swagger.client.ChartsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


ChartsApi apiInstance = new ChartsApi();
ChartDataQueryContextSchema body = new ChartDataQueryContextSchema(); // ChartDataQueryContextSchema | A query context consists of a datasource from which to fetch data and one or many query objects.
try {
    ChartDataResponseSchema result = apiInstance.chartDataPost(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ChartsApi#chartDataPost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**ChartDataQueryContextSchema**](ChartDataQueryContextSchema.md)| A query context consists of a datasource from which to fetch data and one or many query objects. |

### Return type

[**ChartDataResponseSchema**](ChartDataResponseSchema.md)

### Authorization

[jwt](../README.md#jwt)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="chartDatasourcesGet"></a>
# **chartDatasourcesGet**
> InlineResponse2002 chartDatasourcesGet()



Get available datasources.

### Example
```java
// Import classes:
//import at.mic.superset.swagger.ApiClient;
//import at.mic.superset.swagger.ApiException;
//import at.mic.superset.swagger.Configuration;
//import at.mic.superset.swagger.auth.*;
//import at.mic.superset.swagger.client.ChartsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


ChartsApi apiInstance = new ChartsApi();
try {
    InlineResponse2002 result = apiInstance.chartDatasourcesGet();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ChartsApi#chartDatasourcesGet");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**InlineResponse2002**](InlineResponse2002.md)

### Authorization

[jwt](../README.md#jwt)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="chartDelete"></a>
# **chartDelete**
> InlineResponse400 chartDelete(q)



Deletes multiple Charts in a bulk operation.

### Example
```java
// Import classes:
//import at.mic.superset.swagger.ApiClient;
//import at.mic.superset.swagger.ApiException;
//import at.mic.superset.swagger.Configuration;
//import at.mic.superset.swagger.auth.*;
//import at.mic.superset.swagger.client.ChartsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


ChartsApi apiInstance = new ChartsApi();
List<Integer> q = Arrays.asList(56); // List<Integer> | 
try {
    InlineResponse400 result = apiInstance.chartDelete(q);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ChartsApi#chartDelete");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **q** | [**List&lt;Integer&gt;**](Integer.md)|  | [optional]

### Return type

[**InlineResponse400**](InlineResponse400.md)

### Authorization

[jwt](../README.md#jwt)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="chartGet"></a>
# **chartGet**
> InlineResponse200 chartGet(q)



Get a list of charts, use Rison or JSON query parameters for filtering, sorting, pagination and  for selecting specific columns and metadata.

### Example
```java
// Import classes:
//import at.mic.superset.swagger.ApiClient;
//import at.mic.superset.swagger.ApiException;
//import at.mic.superset.swagger.Configuration;
//import at.mic.superset.swagger.auth.*;
//import at.mic.superset.swagger.client.ChartsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


ChartsApi apiInstance = new ChartsApi();
GetListSchema q = new GetListSchema(); // GetListSchema | 
try {
    InlineResponse200 result = apiInstance.chartGet(q);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ChartsApi#chartGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **q** | [**GetListSchema**](.md)|  | [optional]

### Return type

[**InlineResponse200**](InlineResponse200.md)

### Authorization

[jwt](../README.md#jwt)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="chartInfoGet"></a>
# **chartInfoGet**
> InlineResponse2001 chartInfoGet(q)



Several metadata information about chart API endpoints.

### Example
```java
// Import classes:
//import at.mic.superset.swagger.ApiClient;
//import at.mic.superset.swagger.ApiException;
//import at.mic.superset.swagger.Configuration;
//import at.mic.superset.swagger.auth.*;
//import at.mic.superset.swagger.client.ChartsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


ChartsApi apiInstance = new ChartsApi();
GetInfoSchema q = new GetInfoSchema(); // GetInfoSchema | 
try {
    InlineResponse2001 result = apiInstance.chartInfoGet(q);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ChartsApi#chartInfoGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **q** | [**GetInfoSchema**](.md)|  | [optional]

### Return type

[**InlineResponse2001**](InlineResponse2001.md)

### Authorization

[jwt](../README.md#jwt)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="chartPkCacheScreenshotGet"></a>
# **chartPkCacheScreenshotGet**
> InlineResponse2006 chartPkCacheScreenshotGet(pk, sha)



Compute or get already computed screenshot from cache.

### Example
```java
// Import classes:
//import at.mic.superset.swagger.ApiClient;
//import at.mic.superset.swagger.ApiException;
//import at.mic.superset.swagger.Configuration;
//import at.mic.superset.swagger.auth.*;
//import at.mic.superset.swagger.client.ChartsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


ChartsApi apiInstance = new ChartsApi();
Integer pk = 56; // Integer | 
String sha = "sha_example"; // String | 
try {
    InlineResponse2006 result = apiInstance.chartPkCacheScreenshotGet(pk, sha);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ChartsApi#chartPkCacheScreenshotGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **pk** | **Integer**|  |
 **sha** | **String**|  |

### Return type

[**InlineResponse2006**](InlineResponse2006.md)

### Authorization

[jwt](../README.md#jwt)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="chartPkDelete"></a>
# **chartPkDelete**
> InlineResponse400 chartPkDelete(pk)



Deletes a Chart.

### Example
```java
// Import classes:
//import at.mic.superset.swagger.ApiClient;
//import at.mic.superset.swagger.ApiException;
//import at.mic.superset.swagger.Configuration;
//import at.mic.superset.swagger.auth.*;
//import at.mic.superset.swagger.client.ChartsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


ChartsApi apiInstance = new ChartsApi();
Integer pk = 56; // Integer | 
try {
    InlineResponse400 result = apiInstance.chartPkDelete(pk);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ChartsApi#chartPkDelete");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **pk** | **Integer**|  |

### Return type

[**InlineResponse400**](InlineResponse400.md)

### Authorization

[jwt](../README.md#jwt)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="chartPkGet"></a>
# **chartPkGet**
> InlineResponse2004 chartPkGet(pk, q)



Get a chart detail information.

### Example
```java
// Import classes:
//import at.mic.superset.swagger.ApiClient;
//import at.mic.superset.swagger.ApiException;
//import at.mic.superset.swagger.Configuration;
//import at.mic.superset.swagger.auth.*;
//import at.mic.superset.swagger.client.ChartsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


ChartsApi apiInstance = new ChartsApi();
Integer pk = 56; // Integer | 
GetItemSchema q = new GetItemSchema(); // GetItemSchema | 
try {
    InlineResponse2004 result = apiInstance.chartPkGet(pk, q);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ChartsApi#chartPkGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **pk** | **Integer**|  |
 **q** | [**GetItemSchema**](.md)|  | [optional]

### Return type

[**InlineResponse2004**](InlineResponse2004.md)

### Authorization

[jwt](../README.md#jwt)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="chartPkPut"></a>
# **chartPkPut**
> InlineResponse2005 chartPkPut(body, pk)



Changes a Chart.

### Example
```java
// Import classes:
//import at.mic.superset.swagger.ApiClient;
//import at.mic.superset.swagger.ApiException;
//import at.mic.superset.swagger.Configuration;
//import at.mic.superset.swagger.auth.*;
//import at.mic.superset.swagger.client.ChartsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


ChartsApi apiInstance = new ChartsApi();
ChartRestApiPut body = new ChartRestApiPut(); // ChartRestApiPut | Chart schema
Integer pk = 56; // Integer | 
try {
    InlineResponse2005 result = apiInstance.chartPkPut(body, pk);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ChartsApi#chartPkPut");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**ChartRestApiPut**](ChartRestApiPut.md)| Chart schema |
 **pk** | **Integer**|  |

### Return type

[**InlineResponse2005**](InlineResponse2005.md)

### Authorization

[jwt](../README.md#jwt)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="chartPkScreenshotDigestGet"></a>
# **chartPkScreenshotDigestGet**
> File chartPkScreenshotDigestGet(pk, digest)



Get a computed screenshot from cache.

### Example
```java
// Import classes:
//import at.mic.superset.swagger.ApiClient;
//import at.mic.superset.swagger.ApiException;
//import at.mic.superset.swagger.Configuration;
//import at.mic.superset.swagger.auth.*;
//import at.mic.superset.swagger.client.ChartsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


ChartsApi apiInstance = new ChartsApi();
Integer pk = 56; // Integer | 
String digest = "digest_example"; // String | 
try {
    File result = apiInstance.chartPkScreenshotDigestGet(pk, digest);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ChartsApi#chartPkScreenshotDigestGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **pk** | **Integer**|  |
 **digest** | **String**|  |

### Return type

[**File**](File.md)

### Authorization

[jwt](../README.md#jwt)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: image/_*, application/json

<a name="chartPkThumbnailDigestGet"></a>
# **chartPkThumbnailDigestGet**
> chartPkThumbnailDigestGet(pk, digest)



Compute or get already computed chart thumbnail from cache.

### Example
```java
// Import classes:
//import at.mic.superset.swagger.ApiClient;
//import at.mic.superset.swagger.ApiException;
//import at.mic.superset.swagger.Configuration;
//import at.mic.superset.swagger.auth.*;
//import at.mic.superset.swagger.client.ChartsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


ChartsApi apiInstance = new ChartsApi();
Integer pk = 56; // Integer | 
String digest = "digest_example"; // String | 
try {
    apiInstance.chartPkThumbnailDigestGet(pk, digest);
} catch (ApiException e) {
    System.err.println("Exception when calling ChartsApi#chartPkThumbnailDigestGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **pk** | **Integer**|  |
 **digest** | **String**|  |

### Return type

null (empty response body)

### Authorization

[jwt](../README.md#jwt)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="chartPost"></a>
# **chartPost**
> InlineResponse201 chartPost(body)



Create a new Chart.

### Example
```java
// Import classes:
//import at.mic.superset.swagger.ApiClient;
//import at.mic.superset.swagger.ApiException;
//import at.mic.superset.swagger.Configuration;
//import at.mic.superset.swagger.auth.*;
//import at.mic.superset.swagger.client.ChartsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


ChartsApi apiInstance = new ChartsApi();
ChartRestApiPost body = new ChartRestApiPost(); // ChartRestApiPost | Chart schema
try {
    InlineResponse201 result = apiInstance.chartPost(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ChartsApi#chartPost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**ChartRestApiPost**](ChartRestApiPost.md)| Chart schema |

### Return type

[**InlineResponse201**](InlineResponse201.md)

### Authorization

[jwt](../README.md#jwt)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="chartRelatedColumnNameGet"></a>
# **chartRelatedColumnNameGet**
> InlineResponse2003 chartRelatedColumnNameGet(columnName, q)



Get a list of all possible owners for a chart.

### Example
```java
// Import classes:
//import at.mic.superset.swagger.ApiClient;
//import at.mic.superset.swagger.ApiException;
//import at.mic.superset.swagger.Configuration;
//import at.mic.superset.swagger.auth.*;
//import at.mic.superset.swagger.client.ChartsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


ChartsApi apiInstance = new ChartsApi();
String columnName = "columnName_example"; // String | 
Object q = null; // Object | 
try {
    InlineResponse2003 result = apiInstance.chartRelatedColumnNameGet(columnName, q);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ChartsApi#chartRelatedColumnNameGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **columnName** | **String**|  |
 **q** | [**Object**](.md)|  | [optional]

### Return type

[**InlineResponse2003**](InlineResponse2003.md)

### Authorization

[jwt](../README.md#jwt)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

