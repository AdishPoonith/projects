package com.facebook;

import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import kotlin.jvm.internal.g;
import kotlin.jvm.internal.l;
/* loaded from: classes.dex */
public final class CustomTabActivity extends Activity {

    /* renamed from: k  reason: collision with root package name */
    public static final a f3481k = new a(null);

    /* renamed from: l  reason: collision with root package name */
    public static final String f3482l = l.k(CustomTabActivity.class.getSimpleName(), ".action_customTabRedirect");

    /* renamed from: m  reason: collision with root package name */
    public static final String f3483m = l.k(CustomTabActivity.class.getSimpleName(), ".action_destroy");

    /* renamed from: j  reason: collision with root package name */
    private BroadcastReceiver f3484j;

    /* loaded from: classes.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(g gVar) {
            this();
        }
    }

    /* loaded from: classes.dex */
    public static final class b extends BroadcastReceiver {
        b() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            l.e(context, "context");
            l.e(intent, "intent");
            CustomTabActivity.this.finish();
        }
    }

    @Override // android.app.Activity
    protected void onActivityResult(int i10, int i11, Intent intent) {
        super.onActivityResult(i10, i11, intent);
        if (i11 == 0) {
            Intent intent2 = new Intent(f3482l);
            intent2.putExtra(CustomTabMainActivity.f3490p, getIntent().getDataString());
            e0.a.b(this).d(intent2);
            b bVar = new b();
            e0.a.b(this).c(bVar, new IntentFilter(f3483m));
            this.f3484j = bVar;
        }
    }

    @Override // android.app.Activity
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Intent intent = new Intent(this, CustomTabMainActivity.class);
        intent.setAction(f3482l);
        intent.putExtra(CustomTabMainActivity.f3490p, getIntent().getDataString());
        intent.addFlags(603979776);
        startActivityForResult(intent, 2);
    }

    @Override // android.app.Activity
    protected void onDestroy() {
        BroadcastReceiver broadcastReceiver = this.f3484j;
        if (broadcastReceiver != null) {
            e0.a.b(this).e(broadcastReceiver);
        }
        super.onDestroy();
    }
}
