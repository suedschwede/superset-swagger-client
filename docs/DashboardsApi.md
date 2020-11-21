# DashboardsApi

All URIs are relative to */api/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**dashboardDelete**](DashboardsApi.md#dashboardDelete) | **DELETE** /dashboard/ | 
[**dashboardExportGet**](DashboardsApi.md#dashboardExportGet) | **GET** /dashboard/export/ | 
[**dashboardGet**](DashboardsApi.md#dashboardGet) | **GET** /dashboard/ | 
[**dashboardInfoGet**](DashboardsApi.md#dashboardInfoGet) | **GET** /dashboard/_info | 
[**dashboardPkDelete**](DashboardsApi.md#dashboardPkDelete) | **DELETE** /dashboard/{pk} | 
[**dashboardPkGet**](DashboardsApi.md#dashboardPkGet) | **GET** /dashboard/{pk} | 
[**dashboardPkPut**](DashboardsApi.md#dashboardPkPut) | **PUT** /dashboard/{pk} | 
[**dashboardPkThumbnailDigestGet**](DashboardsApi.md#dashboardPkThumbnailDigestGet) | **GET** /dashboard/{pk}/thumbnail/{digest}/ | 
[**dashboardPost**](DashboardsApi.md#dashboardPost) | **POST** /dashboard/ | 
[**dashboardRelatedColumnNameGet**](DashboardsApi.md#dashboardRelatedColumnNameGet) | **GET** /dashboard/related/{column_name} | 

<a name="dashboardDelete"></a>
# **dashboardDelete**
> InlineResponse400 dashboardDelete(q)



Deletes multiple Dashboards in a bulk operation.

### Example
```java
// Import classes:
//import at.mic.superset.swagger.ApiClient;
//import at.mic.superset.swagger.ApiException;
//import at.mic.superset.swagger.Configuration;
//import at.mic.superset.swagger.auth.*;
//import at.mic.superset.swagger.client.DashboardsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


DashboardsApi apiInstance = new DashboardsApi();
List<Integer> q = Arrays.asList(56); // List<Integer> | 
try {
    InlineResponse400 result = apiInstance.dashboardDelete(q);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DashboardsApi#dashboardDelete");
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

<a name="dashboardExportGet"></a>
# **dashboardExportGet**
> String dashboardExportGet(q)



Exports multiple Dashboards and downloads them as YAML files.

### Example
```java
// Import classes:
//import at.mic.superset.swagger.ApiClient;
//import at.mic.superset.swagger.ApiException;
//import at.mic.superset.swagger.Configuration;
//import at.mic.superset.swagger.auth.*;
//import at.mic.superset.swagger.client.DashboardsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


DashboardsApi apiInstance = new DashboardsApi();
List<Integer> q = Arrays.asList(56); // List<Integer> | 
try {
    String result = apiInstance.dashboardExportGet(q);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DashboardsApi#dashboardExportGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **q** | [**List&lt;Integer&gt;**](Integer.md)|  | [optional]

### Return type

**String**

### Authorization

[jwt](../README.md#jwt)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain, application/json

<a name="dashboardGet"></a>
# **dashboardGet**
> InlineResponse2007 dashboardGet(q)



Get a list of dashboards, use Rison or JSON query parameters for filtering, sorting, pagination and  for selecting specific columns and metadata.

### Example
```java
// Import classes:
//import at.mic.superset.swagger.ApiClient;
//import at.mic.superset.swagger.ApiException;
//import at.mic.superset.swagger.Configuration;
//import at.mic.superset.swagger.auth.*;
//import at.mic.superset.swagger.client.DashboardsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


DashboardsApi apiInstance = new DashboardsApi();
GetListSchema q = new GetListSchema(); // GetListSchema | 
try {
    InlineResponse2007 result = apiInstance.dashboardGet(q);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DashboardsApi#dashboardGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **q** | [**GetListSchema**](.md)|  | [optional]

### Return type

[**InlineResponse2007**](InlineResponse2007.md)

### Authorization

[jwt](../README.md#jwt)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="dashboardInfoGet"></a>
# **dashboardInfoGet**
> InlineResponse2001 dashboardInfoGet(q)



Several metadata information about dashboard API endpoints.

### Example
```java
// Import classes:
//import at.mic.superset.swagger.ApiClient;
//import at.mic.superset.swagger.ApiException;
//import at.mic.superset.swagger.Configuration;
//import at.mic.superset.swagger.auth.*;
//import at.mic.superset.swagger.client.DashboardsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


DashboardsApi apiInstance = new DashboardsApi();
GetInfoSchema q = new GetInfoSchema(); // GetInfoSchema | 
try {
    InlineResponse2001 result = apiInstance.dashboardInfoGet(q);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DashboardsApi#dashboardInfoGet");
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

<a name="dashboardPkDelete"></a>
# **dashboardPkDelete**
> InlineResponse400 dashboardPkDelete(pk)



Deletes a Dashboard.

### Example
```java
// Import classes:
//import at.mic.superset.swagger.ApiClient;
//import at.mic.superset.swagger.ApiException;
//import at.mic.superset.swagger.Configuration;
//import at.mic.superset.swagger.auth.*;
//import at.mic.superset.swagger.client.DashboardsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


DashboardsApi apiInstance = new DashboardsApi();
Integer pk = 56; // Integer | 
try {
    InlineResponse400 result = apiInstance.dashboardPkDelete(pk);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DashboardsApi#dashboardPkDelete");
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

<a name="dashboardPkGet"></a>
# **dashboardPkGet**
> InlineResponse2008 dashboardPkGet(pk, q)



Get a dashboard detail information.

### Example
```java
// Import classes:
//import at.mic.superset.swagger.ApiClient;
//import at.mic.superset.swagger.ApiException;
//import at.mic.superset.swagger.Configuration;
//import at.mic.superset.swagger.auth.*;
//import at.mic.superset.swagger.client.DashboardsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


DashboardsApi apiInstance = new DashboardsApi();
Integer pk = 56; // Integer | 
GetItemSchema q = new GetItemSchema(); // GetItemSchema | 
try {
    InlineResponse2008 result = apiInstance.dashboardPkGet(pk, q);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DashboardsApi#dashboardPkGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **pk** | **Integer**|  |
 **q** | [**GetItemSchema**](.md)|  | [optional]

### Return type

[**InlineResponse2008**](InlineResponse2008.md)

### Authorization

[jwt](../README.md#jwt)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="dashboardPkPut"></a>
# **dashboardPkPut**
> InlineResponse2009 dashboardPkPut(body, pk)



Changes a Dashboard.

### Example
```java
// Import classes:
//import at.mic.superset.swagger.ApiClient;
//import at.mic.superset.swagger.ApiException;
//import at.mic.superset.swagger.Configuration;
//import at.mic.superset.swagger.auth.*;
//import at.mic.superset.swagger.client.DashboardsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


DashboardsApi apiInstance = new DashboardsApi();
DashboardRestApiPut body = new DashboardRestApiPut(); // DashboardRestApiPut | Dashboard schema
Integer pk = 56; // Integer | 
try {
    InlineResponse2009 result = apiInstance.dashboardPkPut(body, pk);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DashboardsApi#dashboardPkPut");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**DashboardRestApiPut**](DashboardRestApiPut.md)| Dashboard schema |
 **pk** | **Integer**|  |

### Return type

[**InlineResponse2009**](InlineResponse2009.md)

### Authorization

[jwt](../README.md#jwt)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="dashboardPkThumbnailDigestGet"></a>
# **dashboardPkThumbnailDigestGet**
> File dashboardPkThumbnailDigestGet(pk, digest, q)



Compute async or get already computed dashboard thumbnail from cache.

### Example
```java
// Import classes:
//import at.mic.superset.swagger.ApiClient;
//import at.mic.superset.swagger.ApiException;
//import at.mic.superset.swagger.Configuration;
//import at.mic.superset.swagger.auth.*;
//import at.mic.superset.swagger.client.DashboardsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


DashboardsApi apiInstance = new DashboardsApi();
Integer pk = 56; // Integer | 
String digest = "digest_example"; // String | A hex digest that makes this dashboard unique
Object q = null; // Object | 
try {
    File result = apiInstance.dashboardPkThumbnailDigestGet(pk, digest, q);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DashboardsApi#dashboardPkThumbnailDigestGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **pk** | **Integer**|  |
 **digest** | **String**| A hex digest that makes this dashboard unique |
 **q** | [**Object**](.md)|  | [optional]

### Return type

[**File**](File.md)

### Authorization

[jwt](../README.md#jwt)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: image/_*, application/json

<a name="dashboardPost"></a>
# **dashboardPost**
> InlineResponse2011 dashboardPost(body)



Create a new Dashboard.

### Example
```java
// Import classes:
//import at.mic.superset.swagger.ApiClient;
//import at.mic.superset.swagger.ApiException;
//import at.mic.superset.swagger.Configuration;
//import at.mic.superset.swagger.auth.*;
//import at.mic.superset.swagger.client.DashboardsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


DashboardsApi apiInstance = new DashboardsApi();
DashboardRestApiPost body = new DashboardRestApiPost(); // DashboardRestApiPost | Dashboard schema
try {
    InlineResponse2011 result = apiInstance.dashboardPost(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DashboardsApi#dashboardPost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**DashboardRestApiPost**](DashboardRestApiPost.md)| Dashboard schema |

### Return type

[**InlineResponse2011**](InlineResponse2011.md)

### Authorization

[jwt](../README.md#jwt)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="dashboardRelatedColumnNameGet"></a>
# **dashboardRelatedColumnNameGet**
> InlineResponse2003 dashboardRelatedColumnNameGet(columnName, q)



Get a list of all possible owners for a dashboard.

### Example
```java
// Import classes:
//import at.mic.superset.swagger.ApiClient;
//import at.mic.superset.swagger.ApiException;
//import at.mic.superset.swagger.Configuration;
//import at.mic.superset.swagger.auth.*;
//import at.mic.superset.swagger.client.DashboardsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


DashboardsApi apiInstance = new DashboardsApi();
String columnName = "columnName_example"; // String | 
Object q = null; // Object | 
try {
    InlineResponse2003 result = apiInstance.dashboardRelatedColumnNameGet(columnName, q);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DashboardsApi#dashboardRelatedColumnNameGet");
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

