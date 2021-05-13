

# SenseEvent

contains data returned by Cochl.Sense model 

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**probability** | **Double** | probablity that the event occured. 0. means not possible at all and  1. means that it is certain  | 
**startTime** | **Double** | represent start of the window, in second, where inference was done. Note that start_time will increase by window_hop on every step  | 
**endTime** | **Double** | represent end of the window, in second where inference was done. Note that end_time is window_length after start_time  | 
**tag** | **String** | name of what was recognized during inference.  | 



