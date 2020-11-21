# DatabaseApi

All URIs are relative to */api/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**databaseGet**](DatabaseApi.md#databaseGet) | **GET** /database/ | 
[**databasePkSelectStarTableNameGet**](DatabaseApi.md#databasePkSelectStarTableNameGet) | **GET** /database/{pk}/select_star/{table_name}/ | 
[**databasePkSelectStarTableNameSchemaNameGet**](DatabaseApi.md#databasePkSelectStarTableNameSchemaNameGet) | **GET** /database/{pk}/select_star/{table_name}/{schema_name}/ | 
[**databasePkTableTableNameSchemaNameGet**](DatabaseApi.md#databasePkTableTableNameSchemaNameGet) | **GET** /database/{pk}/table/{table_name}/{schema_name}/ | 

<a name="databaseGet"></a>
# **databaseGet**
> InlineResponse20010 databaseGet(q)



Get a list of models

### Example
```java
// Import classes:
//import at.mic.superset.swagger.ApiClient;
//import at.mic.superset.swagger.ApiException;
//import at.mic.superset.swagger.Configuration;
//import at.mic.superset.swagger.auth.*;
//import at.mic.superset.swagger.client.DatabaseApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


DatabaseApi apiInstance = new DatabaseApi();
GetListSchema q = new GetListSchema(); // GetListSchema | 
try {
    InlineResponse20010 result = apiInstance.databaseGet(q);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DatabaseApi#databaseGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **q** | [**GetListSchema**](.md)|  | [optional]

### Return type

[**InlineResponse20010**](InlineResponse20010.md)

### Authorization

[jwt](../README.md#jwt)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="databasePkSelectStarTableNameGet"></a>
# **databasePkSelectStarTableNameGet**
> InlineResponse20011 databasePkSelectStarTableNameGet(pk, tableName, schemaName)



Get database select star for table

### Example
```java
// Import classes:
//import at.mic.superset.swagger.ApiClient;
//import at.mic.superset.swagger.ApiException;
//import at.mic.superset.swagger.Configuration;
//import at.mic.superset.swagger.auth.*;
//import at.mic.superset.swagger.client.DatabaseApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


DatabaseApi apiInstance = new DatabaseApi();
Integer pk = 56; // Integer | The database id
String tableName = "tableName_example"; // String | Table name
String schemaName = "schemaName_example"; // String | Table schema
try {
    InlineResponse20011 result = apiInstance.databasePkSelectStarTableNameGet(pk, tableName, schemaName);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DatabaseApi#databasePkSelectStarTableNameGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **pk** | **Integer**| The database id |
 **tableName** | **String**| Table name |
 **schemaName** | **String**| Table schema |

### Return type

[**InlineResponse20011**](InlineResponse20011.md)

### Authorization

[jwt](../README.md#jwt)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain, application/json

<a name="databasePkSelectStarTableNameSchemaNameGet"></a>
# **databasePkSelectStarTableNameSchemaNameGet**
> InlineResponse20011 databasePkSelectStarTableNameSchemaNameGet(pk, tableName, schemaName)



Get database select star for table

### Example
```java
// Import classes:
//import at.mic.superset.swagger.ApiClient;
//import at.mic.superset.swagger.ApiException;
//import at.mic.superset.swagger.Configuration;
//import at.mic.superset.swagger.auth.*;
//import at.mic.superset.swagger.client.DatabaseApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


DatabaseApi apiInstance = new DatabaseApi();
Integer pk = 56; // Integer | The database id
String tableName = "tableName_example"; // String | Table name
String schemaName = "schemaName_example"; // String | Table schema
try {
    InlineResponse20011 result = apiInstance.databasePkSelectStarTableNameSchemaNameGet(pk, tableName, schemaName);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DatabaseApi#databasePkSelectStarTableNameSchemaNameGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **pk** | **Integer**| The database id |
 **tableName** | **String**| Table name |
 **schemaName** | **String**| Table schema |

### Return type

[**InlineResponse20011**](InlineResponse20011.md)

### Authorization

[jwt](../README.md#jwt)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain, application/json

<a name="databasePkTableTableNameSchemaNameGet"></a>
# **databasePkTableTableNameSchemaNameGet**
> InlineResponse20012 databasePkTableTableNameSchemaNameGet(pk, tableName, schemaName)



Get database table metadata

### Example
```java
// Import classes:
//import at.mic.superset.swagger.ApiClient;
//import at.mic.superset.swagger.ApiException;
//import at.mic.superset.swagger.Configuration;
//import at.mic.superset.swagger.auth.*;
//import at.mic.superset.swagger.client.DatabaseApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


DatabaseApi apiInstance = new DatabaseApi();
Integer pk = 56; // Integer | The database id
String tableName = "tableName_example"; // String | Table name
String schemaName = "schemaName_example"; // String | Table schema
try {
    InlineResponse20012 result = apiInstance.databasePkTableTableNameSchemaNameGet(pk, tableName, schemaName);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DatabaseApi#databasePkTableTableNameSchemaNameGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **pk** | **Integer**| The database id |
 **tableName** | **String**| Table name |
 **schemaName** | **String**| Table schema |

### Return type

[**InlineResponse20012**](InlineResponse20012.md)

### Authorization

[jwt](../README.md#jwt)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain, application/json

