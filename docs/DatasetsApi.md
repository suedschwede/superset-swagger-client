# DatasetsApi

All URIs are relative to */api/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**datasetExportGet**](DatasetsApi.md#datasetExportGet) | **GET** /dataset/export/ | 
[**datasetGet**](DatasetsApi.md#datasetGet) | **GET** /dataset/ | 
[**datasetInfoGet**](DatasetsApi.md#datasetInfoGet) | **GET** /dataset/_info | 
[**datasetPkDelete**](DatasetsApi.md#datasetPkDelete) | **DELETE** /dataset/{pk} | 
[**datasetPkGet**](DatasetsApi.md#datasetPkGet) | **GET** /dataset/{pk} | 
[**datasetPkPut**](DatasetsApi.md#datasetPkPut) | **PUT** /dataset/{pk} | 
[**datasetPkRefreshPut**](DatasetsApi.md#datasetPkRefreshPut) | **PUT** /dataset/{pk}/refresh | 
[**datasetPkRelatedObjectsGet**](DatasetsApi.md#datasetPkRelatedObjectsGet) | **GET** /dataset/{pk}/related_objects | 
[**datasetPost**](DatasetsApi.md#datasetPost) | **POST** /dataset/ | 
[**datasetRelatedColumnNameGet**](DatasetsApi.md#datasetRelatedColumnNameGet) | **GET** /dataset/related/{column_name} | 

<a name="datasetExportGet"></a>
# **datasetExportGet**
> String datasetExportGet(q)



Exports multiple datasets and downloads them as YAML files

### Example
```java
// Import classes:
//import at.mic.superset.swagger.ApiClient;
//import at.mic.superset.swagger.ApiException;
//import at.mic.superset.swagger.Configuration;
//import at.mic.superset.swagger.auth.*;
//import at.mic.superset.swagger.client.DatasetsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


DatasetsApi apiInstance = new DatasetsApi();
List<Integer> q = Arrays.asList(56); // List<Integer> | 
try {
    String result = apiInstance.datasetExportGet(q);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DatasetsApi#datasetExportGet");
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

<a name="datasetGet"></a>
# **datasetGet**
> InlineResponse20013 datasetGet(q)



Get a list of models

### Example
```java
// Import classes:
//import at.mic.superset.swagger.ApiClient;
//import at.mic.superset.swagger.ApiException;
//import at.mic.superset.swagger.Configuration;
//import at.mic.superset.swagger.auth.*;
//import at.mic.superset.swagger.client.DatasetsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


DatasetsApi apiInstance = new DatasetsApi();
GetListSchema q = new GetListSchema(); // GetListSchema | 
try {
    InlineResponse20013 result = apiInstance.datasetGet(q);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DatasetsApi#datasetGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **q** | [**GetListSchema**](.md)|  | [optional]

### Return type

[**InlineResponse20013**](InlineResponse20013.md)

### Authorization

[jwt](../README.md#jwt)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="datasetInfoGet"></a>
# **datasetInfoGet**
> InlineResponse2001 datasetInfoGet(q)



Get metadata information about this API resource

### Example
```java
// Import classes:
//import at.mic.superset.swagger.ApiClient;
//import at.mic.superset.swagger.ApiException;
//import at.mic.superset.swagger.Configuration;
//import at.mic.superset.swagger.auth.*;
//import at.mic.superset.swagger.client.DatasetsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


DatasetsApi apiInstance = new DatasetsApi();
GetInfoSchema q = new GetInfoSchema(); // GetInfoSchema | 
try {
    InlineResponse2001 result = apiInstance.datasetInfoGet(q);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DatasetsApi#datasetInfoGet");
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

<a name="datasetPkDelete"></a>
# **datasetPkDelete**
> InlineResponse400 datasetPkDelete(pk)



Deletes a Dataset

### Example
```java
// Import classes:
//import at.mic.superset.swagger.ApiClient;
//import at.mic.superset.swagger.ApiException;
//import at.mic.superset.swagger.Configuration;
//import at.mic.superset.swagger.auth.*;
//import at.mic.superset.swagger.client.DatasetsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


DatasetsApi apiInstance = new DatasetsApi();
Integer pk = 56; // Integer | 
try {
    InlineResponse400 result = apiInstance.datasetPkDelete(pk);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DatasetsApi#datasetPkDelete");
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

<a name="datasetPkGet"></a>
# **datasetPkGet**
> InlineResponse20014 datasetPkGet(pk, q)



Get an item model

### Example
```java
// Import classes:
//import at.mic.superset.swagger.ApiClient;
//import at.mic.superset.swagger.ApiException;
//import at.mic.superset.swagger.Configuration;
//import at.mic.superset.swagger.auth.*;
//import at.mic.superset.swagger.client.DatasetsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


DatasetsApi apiInstance = new DatasetsApi();
Integer pk = 56; // Integer | 
GetItemSchema q = new GetItemSchema(); // GetItemSchema | 
try {
    InlineResponse20014 result = apiInstance.datasetPkGet(pk, q);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DatasetsApi#datasetPkGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **pk** | **Integer**|  |
 **q** | [**GetItemSchema**](.md)|  | [optional]

### Return type

[**InlineResponse20014**](InlineResponse20014.md)

### Authorization

[jwt](../README.md#jwt)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="datasetPkPut"></a>
# **datasetPkPut**
> InlineResponse20015 datasetPkPut(body, pk)



Changes a Dataset

### Example
```java
// Import classes:
//import at.mic.superset.swagger.ApiClient;
//import at.mic.superset.swagger.ApiException;
//import at.mic.superset.swagger.Configuration;
//import at.mic.superset.swagger.auth.*;
//import at.mic.superset.swagger.client.DatasetsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


DatasetsApi apiInstance = new DatasetsApi();
DatasetRestApiPut body = new DatasetRestApiPut(); // DatasetRestApiPut | Dataset schema
Integer pk = 56; // Integer | 
try {
    InlineResponse20015 result = apiInstance.datasetPkPut(body, pk);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DatasetsApi#datasetPkPut");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**DatasetRestApiPut**](DatasetRestApiPut.md)| Dataset schema |
 **pk** | **Integer**|  |

### Return type

[**InlineResponse20015**](InlineResponse20015.md)

### Authorization

[jwt](../README.md#jwt)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="datasetPkRefreshPut"></a>
# **datasetPkRefreshPut**
> InlineResponse400 datasetPkRefreshPut(pk)



Refreshes and updates columns of a dataset

### Example
```java
// Import classes:
//import at.mic.superset.swagger.ApiClient;
//import at.mic.superset.swagger.ApiException;
//import at.mic.superset.swagger.Configuration;
//import at.mic.superset.swagger.auth.*;
//import at.mic.superset.swagger.client.DatasetsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


DatasetsApi apiInstance = new DatasetsApi();
Integer pk = 56; // Integer | 
try {
    InlineResponse400 result = apiInstance.datasetPkRefreshPut(pk);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DatasetsApi#datasetPkRefreshPut");
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

<a name="datasetPkRelatedObjectsGet"></a>
# **datasetPkRelatedObjectsGet**
> DatasetRelatedObjectsResponse datasetPkRelatedObjectsGet(pk)



Get charts and dashboards count associated to a dataset

### Example
```java
// Import classes:
//import at.mic.superset.swagger.ApiClient;
//import at.mic.superset.swagger.ApiException;
//import at.mic.superset.swagger.Configuration;
//import at.mic.superset.swagger.auth.*;
//import at.mic.superset.swagger.client.DatasetsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


DatasetsApi apiInstance = new DatasetsApi();
Integer pk = 56; // Integer | 
try {
    DatasetRelatedObjectsResponse result = apiInstance.datasetPkRelatedObjectsGet(pk);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DatasetsApi#datasetPkRelatedObjectsGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **pk** | **Integer**|  |

### Return type

[**DatasetRelatedObjectsResponse**](DatasetRelatedObjectsResponse.md)

### Authorization

[jwt](../README.md#jwt)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="datasetPost"></a>
# **datasetPost**
> InlineResponse2012 datasetPost(body)



Create a new Dataset

### Example
```java
// Import classes:
//import at.mic.superset.swagger.ApiClient;
//import at.mic.superset.swagger.ApiException;
//import at.mic.superset.swagger.Configuration;
//import at.mic.superset.swagger.auth.*;
//import at.mic.superset.swagger.client.DatasetsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


DatasetsApi apiInstance = new DatasetsApi();
DatasetRestApiPost body = new DatasetRestApiPost(); // DatasetRestApiPost | Dataset schema
try {
    InlineResponse2012 result = apiInstance.datasetPost(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DatasetsApi#datasetPost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**DatasetRestApiPost**](DatasetRestApiPost.md)| Dataset schema |

### Return type

[**InlineResponse2012**](InlineResponse2012.md)

### Authorization

[jwt](../README.md#jwt)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="datasetRelatedColumnNameGet"></a>
# **datasetRelatedColumnNameGet**
> InlineResponse2003 datasetRelatedColumnNameGet(columnName, q)



### Example
```java
// Import classes:
//import at.mic.superset.swagger.ApiClient;
//import at.mic.superset.swagger.ApiException;
//import at.mic.superset.swagger.Configuration;
//import at.mic.superset.swagger.auth.*;
//import at.mic.superset.swagger.client.DatasetsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


DatasetsApi apiInstance = new DatasetsApi();
String columnName = "columnName_example"; // String | 
Object q = null; // Object | 
try {
    InlineResponse2003 result = apiInstance.datasetRelatedColumnNameGet(columnName, q);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DatasetsApi#datasetRelatedColumnNameGet");
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

