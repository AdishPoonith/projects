package com.google.android.gms.internal.p000firebaseauthapi;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import com.google.android.gms.common.api.Status;
import f4.a;
import java.net.HttpURLConnection;
import java.net.URL;
import s6.b;
/* renamed from: com.google.android.gms.internal.firebase-auth-api.m  reason: invalid package */
/* loaded from: classes.dex */
public interface m {

    /* renamed from: d  reason: collision with root package name */
    public static final a f4977d = new a("FirebaseAuth", "GetAuthDomainTaskResponseHandler");

    Uri.Builder c(Intent intent, String str, String str2);

    String d(String str);

    HttpURLConnection g(URL url);

    void l(Uri uri, String str, b bVar);

    void q(String str, Status status);

    Context zza();
}
