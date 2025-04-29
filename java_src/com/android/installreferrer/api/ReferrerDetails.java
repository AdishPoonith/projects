package com.android.installreferrer.api;

import android.os.Bundle;
/* loaded from: classes.dex */
public class ReferrerDetails {

    /* renamed from: a  reason: collision with root package name */
    private final Bundle f3469a;

    public ReferrerDetails(Bundle bundle) {
        this.f3469a = bundle;
    }

    public String a() {
        return this.f3469a.getString("install_referrer");
    }
}
