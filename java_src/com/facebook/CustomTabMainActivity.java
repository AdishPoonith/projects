package com.facebook;

import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.Uri;
import android.os.Bundle;
import f1.e;
import f1.e0;
import f1.l0;
import f1.x;
import kotlin.jvm.internal.g;
import kotlin.jvm.internal.l;
import p1.i0;
/* loaded from: classes.dex */
public final class CustomTabMainActivity extends Activity {

    /* renamed from: l  reason: collision with root package name */
    public static final a f3486l = new a(null);

    /* renamed from: m  reason: collision with root package name */
    public static final String f3487m = l.k(CustomTabMainActivity.class.getSimpleName(), ".extra_action");

    /* renamed from: n  reason: collision with root package name */
    public static final String f3488n = l.k(CustomTabMainActivity.class.getSimpleName(), ".extra_params");

    /* renamed from: o  reason: collision with root package name */
    public static final String f3489o = l.k(CustomTabMainActivity.class.getSimpleName(), ".extra_chromePackage");

    /* renamed from: p  reason: collision with root package name */
    public static final String f3490p = l.k(CustomTabMainActivity.class.getSimpleName(), ".extra_url");

    /* renamed from: q  reason: collision with root package name */
    public static final String f3491q = l.k(CustomTabMainActivity.class.getSimpleName(), ".extra_targetApp");

    /* renamed from: r  reason: collision with root package name */
    public static final String f3492r = l.k(CustomTabMainActivity.class.getSimpleName(), ".action_refresh");

    /* renamed from: s  reason: collision with root package name */
    public static final String f3493s = l.k(CustomTabMainActivity.class.getSimpleName(), ".no_activity_exception");

    /* renamed from: j  reason: collision with root package name */
    private boolean f3494j = true;

    /* renamed from: k  reason: collision with root package name */
    private BroadcastReceiver f3495k;

    /* loaded from: classes.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(g gVar) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final Bundle b(String str) {
            Uri parse = Uri.parse(str);
            l0 l0Var = l0.f8470a;
            Bundle j02 = l0.j0(parse.getQuery());
            j02.putAll(l0.j0(parse.getFragment()));
            return j02;
        }
    }

    /* loaded from: classes.dex */
    public /* synthetic */ class b {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f3496a;

        static {
            int[] iArr = new int[i0.valuesCustom().length];
            iArr[i0.INSTAGRAM.ordinal()] = 1;
            f3496a = iArr;
        }
    }

    /* loaded from: classes.dex */
    public static final class c extends BroadcastReceiver {
        c() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            l.e(context, "context");
            l.e(intent, "intent");
            Intent intent2 = new Intent(CustomTabMainActivity.this, CustomTabMainActivity.class);
            intent2.setAction(CustomTabMainActivity.f3492r);
            String str = CustomTabMainActivity.f3490p;
            intent2.putExtra(str, intent.getStringExtra(str));
            intent2.addFlags(603979776);
            CustomTabMainActivity.this.startActivity(intent2);
        }
    }

    private final void a(int i10, Intent intent) {
        BroadcastReceiver broadcastReceiver = this.f3495k;
        if (broadcastReceiver != null) {
            e0.a.b(this).e(broadcastReceiver);
        }
        if (intent != null) {
            String stringExtra = intent.getStringExtra(f3490p);
            Bundle b10 = stringExtra != null ? f3486l.b(stringExtra) : new Bundle();
            e0 e0Var = e0.f8417a;
            Intent intent2 = getIntent();
            l.d(intent2, "intent");
            Intent m10 = e0.m(intent2, b10, null);
            if (m10 != null) {
                intent = m10;
            }
        } else {
            e0 e0Var2 = e0.f8417a;
            Intent intent3 = getIntent();
            l.d(intent3, "intent");
            intent = e0.m(intent3, null, null);
        }
        setResult(i10, intent);
        finish();
    }

    @Override // android.app.Activity
    protected void onCreate(Bundle bundle) {
        String stringExtra;
        super.onCreate(bundle);
        String str = CustomTabActivity.f3482l;
        if (l.a(str, getIntent().getAction())) {
            setResult(0);
        } else if (bundle != null || (stringExtra = getIntent().getStringExtra(f3487m)) == null) {
            return;
        } else {
            Bundle bundleExtra = getIntent().getBundleExtra(f3488n);
            boolean a10 = (b.f3496a[i0.f15147k.a(getIntent().getStringExtra(f3491q)).ordinal()] == 1 ? new x(stringExtra, bundleExtra) : new e(stringExtra, bundleExtra)).a(this, getIntent().getStringExtra(f3489o));
            this.f3494j = false;
            if (a10) {
                c cVar = new c();
                this.f3495k = cVar;
                e0.a.b(this).c(cVar, new IntentFilter(str));
                return;
            }
            setResult(0, getIntent().putExtra(f3493s, true));
        }
        finish();
    }

    @Override // android.app.Activity
    protected void onNewIntent(Intent intent) {
        l.e(intent, "intent");
        super.onNewIntent(intent);
        if (l.a(f3492r, intent.getAction())) {
            e0.a.b(this).d(new Intent(CustomTabActivity.f3483m));
        } else if (!l.a(CustomTabActivity.f3482l, intent.getAction())) {
            return;
        }
        a(-1, intent);
    }

    @Override // android.app.Activity
    protected void onResume() {
        super.onResume();
        if (this.f3494j) {
            a(0, null);
        }
        this.f3494j = true;
    }
}
