package b4;

import android.content.Intent;
/* loaded from: classes.dex */
public class n extends Exception {

    /* renamed from: j  reason: collision with root package name */
    private final Intent f2921j;

    public n(String str, Intent intent) {
        super(str);
        this.f2921j = intent;
    }

    public Intent a() {
        return new Intent(this.f2921j);
    }
}
