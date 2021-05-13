

# SessionStatus

contains all the data for the product Cochl. Sense 

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**state** | [**StateEnum**](#StateEnum) | state in which the session is  | 
**error** | **String** | an error occured during the session  |  [optional]
**refs** | [**SessionRefs**](SessionRefs.md) |  | 
**inference** | [**Sense**](Sense.md) |  | 



## Enum: StateEnum

Name | Value
---- | -----
WRITEABLE | &quot;writeable&quot;
READONLY | &quot;readonly&quot;



