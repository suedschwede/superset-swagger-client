# ChartDataFilter

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**col** | **String** | The column to filter. | 
**op** | [**OpEnum**](#OpEnum) | The comparison operator. | 
**val** | **Object** | The value or values to compare against. Can be a string, integer, decimal or list, depending on the operator. |  [optional]

<a name="OpEnum"></a>
## Enum: OpEnum
Name | Value
---- | -----
_ | &quot;&#x3D;&#x3D;&quot;
NOT_EQUAL | &quot;!&#x3D;&quot;
GREATER_THAN | &quot;&gt;&quot;
LESS_THAN | &quot;&lt;&quot;
GREATER_THAN_OR_EQUAL_TO | &quot;&gt;&#x3D;&quot;
LESS_THAN_OR_EQUAL_TO | &quot;&lt;&#x3D;&quot;
LIKE | &quot;LIKE&quot;
IS_NULL | &quot;IS NULL&quot;
IS_NOT_NULL | &quot;IS NOT NULL&quot;
IN | &quot;IN&quot;
NOT_IN | &quot;NOT IN&quot;
REGEX | &quot;REGEX&quot;
