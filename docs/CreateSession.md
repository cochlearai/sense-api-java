

# CreateSession

Options to create a new session.  Make sure that specified type and content_type are compatible. [more info](https://docs.cochl.ai/todo) 

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**contentType** | **String** | Type of audio to send. | 
**type** | **AudioType** |  | 
**metadatas** | **Map&lt;String, String&gt;** | Type of audio session&#39;s metadatas. Check [metadatas documentation](https://docs.cochl.ai/todo) for an exaustive list of available metadatas  |  [optional]
**totalSize** | **Integer** | If set, it allows to automatically change the state of the session to &#x60;readonly&#x60; when at least &#x60;total_size&#x60; bytes of audio chunk has been uploaded.  For stream, this can be used to limit the maximum duration of the session.  For a file, this allows to automatically start inferencing when the whole file has been sent. We recommend to set the size for files as it allows to do one less API call to start the inferencing  |  [optional]
**tagsSensitivity** | **Map&lt;String, Integer&gt;** | If set, it allows to adjust the sensitivity of a given tag [in this list](https://docs.cochl.ai/sense/tags/)  The sensitivity adjustment ranges in [-2,2]  A value of 0 preserves the default sensitivity  Positive value reduces tag appearance, negative value increases it  |  [optional]
**defaultSensitivity** | **Integer** | If set, it allows to provide a default adjusted sensitivity for all tags  The sensitivity adjustment ranges in [-2,2]  0 is used if not set  Positive value reduces tag appearance, negative value increases it  |  [optional]
**windowHop** | **WindowHop** |  |  [optional]



