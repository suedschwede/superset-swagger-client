# ChartDataPostProcessingOperation

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**operation** | [**OperationEnum**](#OperationEnum) | Post processing operation type | 
**options** | **Object** | Options specifying how to perform the operation. Please refer to the respective post processing operation option schemas. For example, &#x60;ChartDataPostProcessingOperationOptions&#x60; specifies the required options for the pivot operation. |  [optional]

<a name="OperationEnum"></a>
## Enum: OperationEnum
Name | Value
---- | -----
AGGREGATE | &quot;aggregate&quot;
CONTRIBUTION | &quot;contribution&quot;
CUM | &quot;cum&quot;
GEODETIC_PARSE | &quot;geodetic_parse&quot;
GEOHASH_DECODE | &quot;geohash_decode&quot;
GEOHASH_ENCODE | &quot;geohash_encode&quot;
PIVOT | &quot;pivot&quot;
ROLLING | &quot;rolling&quot;
SELECT | &quot;select&quot;
SORT | &quot;sort&quot;
