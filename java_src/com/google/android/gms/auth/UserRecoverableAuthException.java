package com.google.android.gms.auth;

import android.content.Intent;
import com.google.android.gms.common.annotation.KeepName;
@KeepName
/* loaded from: classes.dex */
public class UserRecoverableAuthException extends t3.a {

    /* renamed from: j  reason: collision with root package name */
    private final Intent f3680j;

    public UserRecoverableAuthException(String str, Intent intent) {
        super(str);
        this.f3680j = intent;
    }

    public Intent a() {
        Intent intent = this.f3680j;
        if (intent == null) {
            return null;
        }
        return new Intent(intent);
    }
}
