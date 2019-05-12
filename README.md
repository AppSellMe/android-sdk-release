# Android AppSellMe SDK

## Requirements
- minSdkVersion 15+

## Getting Started

### 1. Include repository into the build.gradle file:

```
   allprojects {
       repositories {
          ...
           maven { url  "https://dl.bintray.com/appsell/maven" }
       }
   }
```

### 2. Include AppSellMe into the build.gradle dependencies:

```
   dependencies {
     ...

     // AppSellMe SDK
     implementation 'ru.appsellme:appsellme:1.0.6'
   }
```

### 3. Init SDK in Application class:

```
   @Override
   public void onCreate() {
           super.onCreate();
           AppSellMe.init(this, "app_id");
   }
```

or 

```
   @Override
   public void onCreate() {
           super.onCreate();
           AppSellMe.init(this, "app_id", new ReferrerStateListener() {
                       @Override
                       public void onReferrerExist() {
           
                       }
           
                       @Override
                       public void onEmptyReferrer() {
           
                       }
           
                       @Override
                       public void onFeatureNotSupported() {
           
                       }
           
                       @Override
                       public void onServiceUnavailable() {
           
                       }
                   });
   }
```
- Replace `app_id` with the actual app_id.



### 4. Sending an event:

```
   AppSellMe.sendEvent("event_name");
```

or 

```
   AppSellMe.sendEvent("event_name", new ResponseStateListener() {
                       @Override
                       public void onSuccess() {
                       
                       }
   
                       @Override
                       public void onFailure() {
                       
                       }
   
                       @Override
                       public void onException(Exception e) {
                       
                       }
                   });
```

### 5. Sending an event with object:

```
   AdditionalInfo additionalInfo = new AdditionalInfo("Ivan", 22);
   String json = new Gson().toJson(additionalInfo);

   AppSellMe.sendEvent("event_name", json);
```

or

```
   AppSellMe.sendEvent("event_name", json, new ResponseStateListener() {
                       @Override
                       public void onSuccess() {

                       }

                       @Override
                       public void onFailure() {

                       }

                       @Override
                       public void onException(Exception e) {

                       }
                   });
```
