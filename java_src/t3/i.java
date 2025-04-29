package t3;

import android.accounts.Account;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcelable;
import android.os.RemoteException;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Log;
import b4.j;
import c4.s;
import com.google.android.gms.auth.TokenData;
import com.google.android.gms.auth.UserRecoverableAuthException;
import com.google.android.gms.common.GooglePlayServicesIncorrectManifestValueException;
import com.google.android.gms.internal.auth.e5;
import com.google.android.gms.internal.auth.k3;
import com.google.android.gms.internal.auth.l1;
import com.google.android.gms.internal.auth.l4;
import com.google.android.gms.internal.auth.n0;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeoutException;
/* loaded from: classes.dex */
public class i {

    /* renamed from: a  reason: collision with root package name */
    public static final String[] f18215a = {"com.google", "com.google.work", "cn.google"};

    /* renamed from: b  reason: collision with root package name */
    public static final String f18216b = "androidPackageName";

    /* renamed from: c  reason: collision with root package name */
    private static final ComponentName f18217c = new ComponentName("com.google.android.gms", "com.google.android.gms.auth.GetToken");

    /* renamed from: d  reason: collision with root package name */
    private static final f4.a f18218d = d.a("GoogleAuthUtil");

    public static void a(Context context, String str) {
        g(context, str, 0L);
    }

    public static String b(Context context, Account account, String str) {
        return c(context, account, str, new Bundle());
    }

    public static String c(Context context, Account account, String str, Bundle bundle) {
        o(account);
        return d(context, account, str, bundle).zza();
    }

    public static TokenData d(Context context, final Account account, final String str, Bundle bundle) {
        s.i("Calling this from your main thread can lead to deadlock");
        s.g(str, "Scope cannot be empty or null.");
        o(account);
        l(context, 8400000);
        final Bundle bundle2 = bundle == null ? new Bundle() : new Bundle(bundle);
        n(context, bundle2);
        n0.e(context);
        if (e5.c() && p(context)) {
            try {
                Bundle bundle3 = (Bundle) j(l4.a(context).a(account, str, bundle2), "token retrieval");
                k(bundle3);
                return h(bundle3);
            } catch (com.google.android.gms.common.api.b e10) {
                m(e10, "token retrieval");
            }
        }
        return (TokenData) i(context, f18217c, new h() { // from class: t3.f
            @Override // t3.h
            public final Object a(IBinder iBinder) {
                return i.e(account, str, bundle2, iBinder);
            }
        }, 0L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ TokenData e(Account account, String str, Bundle bundle, IBinder iBinder) {
        Bundle y02 = l1.x(iBinder).y0(account, str, bundle);
        if (y02 != null) {
            return h(y02);
        }
        throw new IOException("Service call returned null");
    }

    /*  JADX ERROR: NullPointerException in pass: MarkMethodsForInline
        java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.isRegister()" because "arg" is null
        	at jadx.core.dex.instructions.args.RegisterArg.sameRegAndSVar(RegisterArg.java:173)
        	at jadx.core.dex.instructions.args.InsnArg.isSameVar(InsnArg.java:269)
        	at jadx.core.dex.visitors.MarkMethodsForInline.isSyntheticAccessPattern(MarkMethodsForInline.java:118)
        	at jadx.core.dex.visitors.MarkMethodsForInline.inlineMth(MarkMethodsForInline.java:86)
        	at jadx.core.dex.visitors.MarkMethodsForInline.process(MarkMethodsForInline.java:53)
        	at jadx.core.dex.visitors.MarkMethodsForInline.visit(MarkMethodsForInline.java:37)
        */
    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* bridge */ /* synthetic */ java.lang.Object f(java.lang.Object r0) {
        /*
            k(r0)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: t3.i.f(java.lang.Object):java.lang.Object");
    }

    public static void g(Context context, String str, long j10) {
        s.i("Calling this from your main thread can lead to deadlock");
        l(context, 8400000);
        Bundle bundle = new Bundle();
        n(context, bundle);
        n0.e(context);
        if (e5.c() && p(context)) {
            k3 a10 = l4.a(context);
            com.google.android.gms.internal.auth.g gVar = new com.google.android.gms.internal.auth.g();
            gVar.B(str);
            try {
                j(a10.c(gVar), "clear token");
                return;
            } catch (com.google.android.gms.common.api.b e10) {
                m(e10, "clear token");
            }
        }
        i(context, f18217c, new g(str, bundle), 0L);
    }

    private static TokenData h(Bundle bundle) {
        TokenData tokenData;
        Parcelable.Creator<TokenData> creator = TokenData.CREATOR;
        ClassLoader classLoader = TokenData.class.getClassLoader();
        if (classLoader != null) {
            bundle.setClassLoader(classLoader);
        }
        Bundle bundle2 = bundle.getBundle("tokenDetails");
        if (bundle2 == null) {
            tokenData = null;
        } else {
            if (classLoader != null) {
                bundle2.setClassLoader(classLoader);
            }
            tokenData = (TokenData) bundle2.getParcelable("TokenData");
        }
        if (tokenData != null) {
            return tokenData;
        }
        String string = bundle.getString("Error");
        s.j(string);
        Intent intent = (Intent) bundle.getParcelable("userRecoveryIntent");
        com.google.android.gms.internal.auth.i b10 = com.google.android.gms.internal.auth.i.b(string);
        if (com.google.android.gms.internal.auth.i.g(b10)) {
            f18218d.h("isUserRecoverableError status: ".concat(String.valueOf(b10)), new Object[0]);
            throw new UserRecoverableAuthException(string, intent);
        } else if (com.google.android.gms.internal.auth.i.NETWORK_ERROR.equals(b10) || com.google.android.gms.internal.auth.i.SERVICE_UNAVAILABLE.equals(b10) || com.google.android.gms.internal.auth.i.INTNERNAL_ERROR.equals(b10) || com.google.android.gms.internal.auth.i.AUTH_SECURITY_ERROR.equals(b10) || com.google.android.gms.internal.auth.i.ACCOUNT_NOT_PRESENT.equals(b10)) {
            throw new IOException(string);
        } else {
            throw new a(string);
        }
    }

    private static Object i(Context context, ComponentName componentName, h hVar, long j10) {
        b4.a aVar = new b4.a();
        c4.i c10 = c4.i.c(context);
        try {
            try {
                if (c10.a(componentName, aVar, "GoogleAuthUtil")) {
                    try {
                        return hVar.a(aVar.a());
                    } catch (RemoteException | InterruptedException | TimeoutException e10) {
                        Log.i("GoogleAuthUtil", "Error on service connection.", e10);
                        throw new IOException("Error on service connection.", e10);
                    }
                }
                throw new IOException("Could not bind to service.");
            } finally {
                c10.e(componentName, aVar, "GoogleAuthUtil");
            }
        } catch (SecurityException e11) {
            Log.w("GoogleAuthUtil", String.format("SecurityException while bind to auth service: %s", e11.getMessage()));
            throw new IOException("SecurityException while binding to Auth service.", e11);
        }
    }

    private static Object j(Task task, String str) {
        try {
            return Tasks.await(task);
        } catch (InterruptedException e10) {
            String format = String.format("Interrupted while waiting for the task of %s to finish.", str);
            f18218d.h(format, new Object[0]);
            throw new IOException(format, e10);
        } catch (CancellationException e11) {
            String format2 = String.format("Canceled while waiting for the task of %s to finish.", str);
            f18218d.h(format2, new Object[0]);
            throw new IOException(format2, e11);
        } catch (ExecutionException e12) {
            Throwable cause = e12.getCause();
            if (cause instanceof com.google.android.gms.common.api.b) {
                throw ((com.google.android.gms.common.api.b) cause);
            }
            String format3 = String.format("Unable to get a result for %s due to ExecutionException.", str);
            f18218d.h(format3, new Object[0]);
            throw new IOException(format3, e12);
        }
    }

    private static Object k(Object obj) {
        if (obj != null) {
            return obj;
        }
        f18218d.h("Service call returned null.", new Object[0]);
        throw new IOException("Service unavailable.");
    }

    private static void l(Context context, int i10) {
        try {
            j.a(context.getApplicationContext(), i10);
        } catch (b4.g e10) {
            e = e10;
            throw new a(e.getMessage(), e);
        } catch (b4.h e11) {
            throw new c(e11.b(), e11.getMessage(), e11.a());
        } catch (GooglePlayServicesIncorrectManifestValueException e12) {
            e = e12;
            throw new a(e.getMessage(), e);
        }
    }

    private static void m(com.google.android.gms.common.api.b bVar, String str) {
        f18218d.h("%s failed via GoogleAuthServiceClient, falling back to previous approach:\n%s", str, Log.getStackTraceString(bVar));
    }

    private static void n(Context context, Bundle bundle) {
        String str = context.getApplicationInfo().packageName;
        bundle.putString("clientPackageName", str);
        String str2 = f18216b;
        if (TextUtils.isEmpty(bundle.getString(str2))) {
            bundle.putString(str2, str);
        }
        bundle.putLong("service_connection_start_time_millis", SystemClock.elapsedRealtime());
    }

    private static void o(Account account) {
        if (account == null) {
            throw new IllegalArgumentException("Account cannot be null");
        }
        if (TextUtils.isEmpty(account.name)) {
            throw new IllegalArgumentException("Account name cannot be empty!");
        }
        String[] strArr = f18215a;
        for (int i10 = 0; i10 < 3; i10++) {
            if (strArr[i10].equals(account.type)) {
                return;
            }
        }
        throw new IllegalArgumentException("Account type not supported");
    }

    private static boolean p(Context context) {
        if (b4.e.m().g(context, 17895000) != 0) {
            return false;
        }
        List<String> k10 = e5.a().k();
        String str = context.getApplicationInfo().packageName;
        for (String str2 : k10) {
            if (str2.equals(str)) {
                return false;
            }
        }
        return true;
    }
}
