/*
 * Copyright (C) 2014 Trillian Mobile AB
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.robovm.apple.accounts;

/*<imports>*/
import java.io.*;
import java.nio.*;
import java.util.*;
import org.robovm.objc.*;
import org.robovm.objc.annotation.*;
import org.robovm.objc.block.*;
import org.robovm.rt.*;
import org.robovm.rt.bro.*;
import org.robovm.rt.bro.annotation.*;
import org.robovm.rt.bro.ptr.*;
import org.robovm.apple.foundation.*;
/*</imports>*/

/*<javadoc>*/
/**
 * @since Available in iOS 5.0 and later.
 */
/*</javadoc>*/
/*<annotations>*/@Library("Accounts") @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/ACAccountStore/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class ACAccountStorePtr extends Ptr<ACAccountStore, ACAccountStorePtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(ACAccountStore.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public ACAccountStore() {}
    protected ACAccountStore(SkipInit skipInit) { super(skipInit); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "accounts")
    public native NSArray<ACAccount> getAccounts();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    /**
     * @since Available in iOS 6.0 and later.
     */
    @GlobalValue(symbol="ACFacebookAppIdKey", optional=true)
    public static native NSString FacebookAppIdKey();
    /**
     * @since Available in iOS 6.0 and later.
     */
    @GlobalValue(symbol="ACFacebookPermissionsKey", optional=true)
    public static native NSString FacebookPermissionsKey();
    /**
     * @since Available in iOS 6.0 and later.
     */
    @GlobalValue(symbol="ACFacebookAudienceKey", optional=true)
    public static native NSString FacebookAudienceKey();
    /**
     * @since Available in iOS 6.0 and later.
     */
    @GlobalValue(symbol="ACFacebookAudienceEveryone", optional=true)
    public static native NSString FacebookAudienceEveryone();
    /**
     * @since Available in iOS 6.0 and later.
     */
    @GlobalValue(symbol="ACFacebookAudienceFriends", optional=true)
    public static native NSString FacebookAudienceFriends();
    /**
     * @since Available in iOS 6.0 and later.
     */
    @GlobalValue(symbol="ACFacebookAudienceOnlyMe", optional=true)
    public static native NSString FacebookAudienceOnlyMe();
    /**
     * @since Available in iOS 7.0 and later.
     */
    @GlobalValue(symbol="ACTencentWeiboAppIdKey", optional=true)
    public static native NSString TencentWeiboAppIdKey();
    /**
     * @since Available in iOS 5.0 and later.
     */
    @GlobalValue(symbol="ACAccountStoreDidChangeNotification", optional=true)
    public static native NSString DidChangeNotification();
    
    @Method(selector = "accountWithIdentifier:")
    public native ACAccount getAccount(String identifier);
    @Method(selector = "accountTypeWithAccountTypeIdentifier:")
    public native ACAccountType getAccountType(NSString typeIdentifier);
    @Method(selector = "accountsWithAccountType:")
    public native NSArray<ACAccount> getAccounts(ACAccountType accountType);
    @Method(selector = "saveAccount:withCompletionHandler:")
    public native void saveAccount(ACAccount account, @Block VoidBlock2<Boolean, NSError> completionHandler);
    /**
     * @since Available in iOS 5.0 and later.
     * @deprecated Deprecated in iOS 6.0.
     */
    @Deprecated
    @Method(selector = "requestAccessToAccountsWithType:withCompletionHandler:")
    public native void requestAccessToAccounts(ACAccountType accountType, @Block VoidBlock2<Boolean, NSError> handler);
    @Method(selector = "requestAccessToAccountsWithType:options:completion:")
    public native void requestAccessToAccounts(ACAccountType accountType, NSDictionary<NSString, ?> options, @Block VoidBlock2<Boolean, NSError> completion);
    @Method(selector = "renewCredentialsForAccount:completion:")
    public native void renewCredentials(ACAccount account, @Block VoidBlock2<ACAccountCredentialRenewResult, NSError> completionHandler);
    @Method(selector = "removeAccount:withCompletionHandler:")
    public native void removeAccount(ACAccount account, @Block VoidBlock2<Boolean, NSError> completionHandler);
    /*</methods>*/
}
