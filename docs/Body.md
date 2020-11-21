# Body

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**password** | **String** | The password for authentication |  [optional]
**provider** | [**ProviderEnum**](#ProviderEnum) | Choose an authentication provider |  [optional]
**refresh** | **Boolean** | If true a refresh token is provided also |  [optional]
**username** | **String** | The username for authentication |  [optional]

<a name="ProviderEnum"></a>
## Enum: ProviderEnum
Name | Value
---- | -----
DB | &quot;db&quot;
LDAP | &quot;ldap&quot;
