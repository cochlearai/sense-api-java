

# SessionStatus

Contains all the data for the product Cochl.Sense 

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**state** | [**StateEnum**](#StateEnum) | State in which the session is  | 
**error** | **String** | An error occurred during the session  |  [optional]
**refs** | [**SessionRefs**](SessionRefs.md) |  | 
**inference** | [**Sense**](Sense.md) |  | 



## Enum: StateEnum

Name | Value
---- | -----
WRITABLE | &quot;writable&quot;
READONLY | &quot;readonly&quot;



