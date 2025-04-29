package com.android.installreferrer.api;

import android.content.Context;
/* loaded from: classes.dex */
public abstract class InstallReferrerClient {

    /* loaded from: classes.dex */
    public static final class b {

        /* renamed from: a  reason: collision with root package name */
        private final Context f3468a;

        private b(Context context) {
            this.f3468a = context;
        }

        public InstallReferrerClient a() {
            Context context = this.f3468a;
            if (context != null) {
                return new com.android.installreferrer.api.a(context);
            }
            throw new IllegalArgumentException("Please provide a valid Context.");
        }
    }

    public static b c(Context context) {
        return new b(context);
    }

    public abstract void a();

    public abstract ReferrerDetails b();

    public abstract void d(InstallReferrerStateListener installReferrerStateListener);
}
