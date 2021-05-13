# AudioSessionApi

All URIs are relative to *https://api.cochl.ai/sense/api/v0*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createSession**](AudioSessionApi.md#createSession) | **POST** /audio_sessions/ | Create Session
[**deleteSession**](AudioSessionApi.md#deleteSession) | **DELETE** /audio_sessions/{session_id} | Delete Session
[**readStatus**](AudioSessionApi.md#readStatus) | **GET** /audio_sessions/{session_id}/status | Read Status
[**updateSession**](AudioSessionApi.md#updateSession) | **PATCH** /audio_sessions/{session_id} | Update Session
[**uploadChunk**](AudioSessionApi.md#uploadChunk) | **PUT** /audio_sessions/{session_id}/chunks/{chunk_sequence} | Upload Chunk


<a name="createSession"></a>
# **createSession**
> SessionRefs createSession(createSession)

Create Session

Create a new session. An api key is required. Session parameters are  immutable and can be set at creation only 

### Example
```java
// Import classes:
import ai.cochl.client.ApiClient;
import ai.cochl.client.ApiException;
import ai.cochl.client.Configuration;
import ai.cochl.client.auth.*;
import ai.cochl.client.models.*;
import ai.cochl.sense.api.AudioSessionApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.cochl.ai/sense/api/v0");
    
    // Configure API key authorization: API_Key
    ApiKeyAuth API_Key = (ApiKeyAuth) defaultClient.getAuthentication("API_Key");
    API_Key.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //API_Key.setApiKeyPrefix("Token");

    AudioSessionApi apiInstance = new AudioSessionApi(defaultClient);
    CreateSession createSession = new CreateSession(); // CreateSession | 
    try {
      SessionRefs result = apiInstance.createSession(createSession);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AudioSessionApi#createSession");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **createSession** | [**CreateSession**](CreateSession.md)|  |

### Return type

[**SessionRefs**](SessionRefs.md)

### Authorization

[API_Key](../README.md#API_Key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | session was created successfully  |  -  |
**400** | parameter is missing or not formated properly  |  -  |
**401** | authentication failed. For instance api key is missing or invalid  |  -  |
**500** | unexpected server error. If error persists, you can  contact support@cochl.ai to fix the problem.  |  -  |

<a name="deleteSession"></a>
# **deleteSession**
> deleteSession(sessionId)

Delete Session

Change state of session to *deleted*. All future call on the session  will return 404 

### Example
```java
// Import classes:
import ai.cochl.client.ApiClient;
import ai.cochl.client.ApiException;
import ai.cochl.client.Configuration;
import ai.cochl.client.models.*;
import ai.cochl.sense.api.AudioSessionApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.cochl.ai/sense/api/v0");

    AudioSessionApi apiInstance = new AudioSessionApi(defaultClient);
    String sessionId = "sessionId_example"; // String | session id represents unique identifier for an audio session 
    try {
      apiInstance.deleteSession(sessionId);
    } catch (ApiException e) {
      System.err.println("Exception when calling AudioSessionApi#deleteSession");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **sessionId** | **String**| session id represents unique identifier for an audio session  |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**204** | session successfully deleted  |  -  |
**404** | resources doesn&#39;t exist or has been deleted  |  -  |
**500** | unexpected server error. If error persists, you can  contact support@cochl.ai to fix the problem.  |  -  |

<a name="readStatus"></a>
# **readStatus**
> SessionStatus readStatus(sessionId, offset, count, nextToken)

Read Status

Get session status  *Note that if all chunks didn&#39;t finish to be inferenced, server will  wait at least one result to be  available in the required page range before returning result. Such waiting can lead to http requests timeout. Therefore we recommand to implement a client retry logic* 

### Example
```java
// Import classes:
import ai.cochl.client.ApiClient;
import ai.cochl.client.ApiException;
import ai.cochl.client.Configuration;
import ai.cochl.client.models.*;
import ai.cochl.sense.api.AudioSessionApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.cochl.ai/sense/api/v0");

    AudioSessionApi apiInstance = new AudioSessionApi(defaultClient);
    String sessionId = "sessionId_example"; // String | session id represents unique identifier for an audio session 
    Integer offset = 0; // Integer | how many existing elements to skip before returning the first result control how many result to receive 
    Integer count = 1024; // Integer | limit the length of the returned results array to limit size of the returned payload  
    String nextToken = "nextToken_example"; // String | next token can be used from a previous page result. It allows to  iterate through all next elements of a collection. If next_token is  set, offset and limit will be ignored 
    try {
      SessionStatus result = apiInstance.readStatus(sessionId, offset, count, nextToken);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AudioSessionApi#readStatus");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **sessionId** | **String**| session id represents unique identifier for an audio session  |
 **offset** | **Integer**| how many existing elements to skip before returning the first result control how many result to receive  | [optional] [default to 0]
 **count** | **Integer**| limit the length of the returned results array to limit size of the returned payload   | [optional] [default to 1024]
 **nextToken** | **String**| next token can be used from a previous page result. It allows to  iterate through all next elements of a collection. If next_token is  set, offset and limit will be ignored  | [optional]

### Return type

[**SessionStatus**](SessionStatus.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | successful operation  |  -  |
**400** | parameter is missing or not formated properly  |  -  |
**404** | resources doesn&#39;t exist or has been deleted  |  -  |
**500** | unexpected server error. If error persists, you can  contact support@cochl.ai to fix the problem.  |  -  |

<a name="updateSession"></a>
# **updateSession**
> updateSession(sessionId, updateSession)

Update Session

Update a session 

### Example
```java
// Import classes:
import ai.cochl.client.ApiClient;
import ai.cochl.client.ApiException;
import ai.cochl.client.Configuration;
import ai.cochl.client.models.*;
import ai.cochl.sense.api.AudioSessionApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.cochl.ai/sense/api/v0");

    AudioSessionApi apiInstance = new AudioSessionApi(defaultClient);
    String sessionId = "sessionId_example"; // String | session id represents unique identifier for an audio session 
    UpdateSession updateSession = new UpdateSession(); // UpdateSession | 
    try {
      apiInstance.updateSession(sessionId, updateSession);
    } catch (ApiException e) {
      System.err.println("Exception when calling AudioSessionApi#updateSession");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **sessionId** | **String**| session id represents unique identifier for an audio session  |
 **updateSession** | [**UpdateSession**](UpdateSession.md)|  |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**204** | session has been updated successfully  |  -  |
**400** | parameter is missing or not formated properly  |  -  |
**404** | resources doesn&#39;t exist or has been deleted  |  -  |
**500** | unexpected server error. If error persists, you can  contact support@cochl.ai to fix the problem.  |  -  |

<a name="uploadChunk"></a>
# **uploadChunk**
> SessionRefs uploadChunk(sessionId, chunkSequence, audioChunk)

Upload Chunk

Upload new audio chunk  

### Example
```java
// Import classes:
import ai.cochl.client.ApiClient;
import ai.cochl.client.ApiException;
import ai.cochl.client.Configuration;
import ai.cochl.client.models.*;
import ai.cochl.sense.api.AudioSessionApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.cochl.ai/sense/api/v0");

    AudioSessionApi apiInstance = new AudioSessionApi(defaultClient);
    String sessionId = "sessionId_example"; // String | session id represents unique identifier for an audio session 
    Integer chunkSequence = 56; // Integer | chunk represent the chunk number. This is needs to be  counter  starting from 0 and growing by one on each requests  
    AudioChunk audioChunk = new AudioChunk(); // AudioChunk | raw binary chunk 
    try {
      SessionRefs result = apiInstance.uploadChunk(sessionId, chunkSequence, audioChunk);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AudioSessionApi#uploadChunk");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **sessionId** | **String**| session id represents unique identifier for an audio session  |
 **chunkSequence** | **Integer**| chunk represent the chunk number. This is needs to be  counter  starting from 0 and growing by one on each requests   |
 **audioChunk** | [**AudioChunk**](AudioChunk.md)| raw binary chunk  |

### Return type

[**SessionRefs**](SessionRefs.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | chunk successfully uploaded  |  -  |
**400** | parameter is missing or not formated properly  |  -  |
**403** | session is not writeable anymore  |  -  |
**404** | resources doesn&#39;t exist or has been deleted  |  -  |
**409** | chunk sequence is invalid  |  -  |
**413** | audio chunk size must be smaller than 1MiB  |  -  |
**500** | unexpected server error. If error persists, you can  contact support@cochl.ai to fix the problem.  |  -  |

