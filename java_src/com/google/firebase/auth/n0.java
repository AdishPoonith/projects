package com.google.firebase.auth;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.firebase.auth.internal.GenericIdpActivity;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
/* loaded from: classes.dex */
public class n0 extends n {

    /* renamed from: a  reason: collision with root package name */
    private final Bundle f6561a;

    /* loaded from: classes.dex */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        private final FirebaseAuth f6562a;

        /* renamed from: b  reason: collision with root package name */
        final Bundle f6563b;

        /* renamed from: c  reason: collision with root package name */
        private final Bundle f6564c;

        /* synthetic */ a(String str, FirebaseAuth firebaseAuth, l1 l1Var) {
            Bundle bundle = new Bundle();
            this.f6563b = bundle;
            Bundle bundle2 = new Bundle();
            this.f6564c = bundle2;
            this.f6562a = firebaseAuth;
            bundle.putString("com.google.firebase.auth.KEY_API_KEY", firebaseAuth.l().r().b());
            bundle.putString("com.google.firebase.auth.KEY_PROVIDER_ID", str);
            bundle.putBundle("com.google.firebase.auth.KEY_PROVIDER_CUSTOM_PARAMS", bundle2);
            bundle.putString("com.google.firebase.auth.internal.CLIENT_VERSION", com.google.android.gms.internal.p000firebaseauthapi.u.a().b());
            bundle.putString("com.google.firebase.auth.KEY_TENANT_ID", firebaseAuth.p());
            bundle.putString("com.google.firebase.auth.KEY_FIREBASE_APP_NAME", firebaseAuth.l().q());
        }

        public a a(Map<String, String> map) {
            for (Map.Entry<String, String> entry : map.entrySet()) {
                this.f6564c.putString(entry.getKey(), entry.getValue());
            }
            return this;
        }

        public n0 b() {
            return new n0(this.f6563b, null);
        }

        public a c(List<String> list) {
            this.f6563b.putStringArrayList("com.google.firebase.auth.KEY_PROVIDER_SCOPES", new ArrayList<>(list));
            return this;
        }
    }

    /* loaded from: classes.dex */
    public static class b {

        /* renamed from: a  reason: collision with root package name */
        private final String f6565a;

        /* renamed from: b  reason: collision with root package name */
        private String f6566b;

        /* renamed from: c  reason: collision with root package name */
        private String f6567c;

        /* renamed from: d  reason: collision with root package name */
        private String f6568d;

        /* synthetic */ b(String str, m1 m1Var) {
            this.f6565a = str;
        }

        public h a() {
            String str = this.f6565a;
            String str2 = this.f6566b;
            String str3 = this.f6567c;
            String str4 = this.f6568d;
            Parcelable.Creator<a2> creator = a2.CREATOR;
            c4.s.g(str, "Must specify a non-empty providerId");
            if (TextUtils.isEmpty(str2) && TextUtils.isEmpty(str3)) {
                throw new IllegalArgumentException("Must specify an idToken or an accessToken.");
            }
            return new a2(str, str2, str3, null, null, null, str4);
        }

        public b b(String str) {
            this.f6567c = str;
            return this;
        }

        public b c(String str) {
            this.f6566b = str;
            return this;
        }

        public b d(String str, String str2) {
            this.f6566b = str;
            this.f6568d = str2;
            return this;
        }
    }

    /* synthetic */ n0(Bundle bundle, n1 n1Var) {
        this.f6561a = bundle;
    }

    public static a d(String str) {
        return e(str, FirebaseAuth.getInstance());
    }

    public static a e(String str, FirebaseAuth firebaseAuth) {
        c4.s.f(str);
        c4.s.j(firebaseAuth);
        if (!"facebook.com".equals(str) || com.google.android.gms.internal.p000firebaseauthapi.i1.g(firebaseAuth.l())) {
            return new a(str, firebaseAuth, null);
        }
        throw new IllegalArgumentException("Sign in with Facebook is not supported via this method; the Facebook TOS dictate that you must use the Facebook Android SDK for Facebook login.");
    }

    public static b f(String str) {
        return new b(c4.s.f(str), null);
    }

    @Override // com.google.firebase.auth.n
    public final void a(Activity activity) {
        Intent intent = new Intent("com.google.firebase.auth.internal.NONGMSCORE_LINK");
        intent.setClass(activity, GenericIdpActivity.class);
        intent.setPackage(activity.getPackageName());
        intent.putExtras(this.f6561a);
        activity.startActivity(intent);
    }

    @Override // com.google.firebase.auth.n
    public final void b(Activity activity) {
        Intent intent = new Intent("com.google.firebase.auth.internal.NONGMSCORE_REAUTHENTICATE");
        intent.setClass(activity, GenericIdpActivity.class);
        intent.setPackage(activity.getPackageName());
        intent.putExtras(this.f6561a);
        activity.startActivity(intent);
    }

    @Override // com.google.firebase.auth.n
    public final void c(Activity activity) {
        Intent intent = new Intent("com.google.firebase.auth.internal.NONGMSCORE_SIGN_IN");
        intent.setClass(activity, GenericIdpActivity.class);
        intent.setPackage(activity.getPackageName());
        intent.putExtras(this.f6561a);
        activity.startActivity(intent);
    }
}
