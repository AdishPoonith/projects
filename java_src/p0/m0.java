package p0;

import android.os.AsyncTask;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import java.net.HttpURLConnection;
import java.util.Arrays;
import java.util.List;
/* loaded from: classes.dex */
public class m0 extends AsyncTask<Void, Void, List<? extends o0>> {

    /* renamed from: d  reason: collision with root package name */
    public static final a f14971d = new a(null);

    /* renamed from: e  reason: collision with root package name */
    private static final String f14972e = m0.class.getCanonicalName();

    /* renamed from: a  reason: collision with root package name */
    private final HttpURLConnection f14973a;

    /* renamed from: b  reason: collision with root package name */
    private final n0 f14974b;

    /* renamed from: c  reason: collision with root package name */
    private Exception f14975c;

    /* loaded from: classes.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(kotlin.jvm.internal.g gVar) {
            this();
        }
    }

    public m0(HttpURLConnection httpURLConnection, n0 requests) {
        kotlin.jvm.internal.l.e(requests, "requests");
        this.f14973a = httpURLConnection;
        this.f14974b = requests;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public m0(n0 requests) {
        this(null, requests);
        kotlin.jvm.internal.l.e(requests, "requests");
    }

    public List<o0> a(Void... params) {
        if (k1.a.d(this)) {
            return null;
        }
        try {
            kotlin.jvm.internal.l.e(params, "params");
            try {
                HttpURLConnection httpURLConnection = this.f14973a;
                return httpURLConnection == null ? this.f14974b.m() : j0.f14918n.o(httpURLConnection, this.f14974b);
            } catch (Exception e10) {
                this.f14975c = e10;
                return null;
            }
        } catch (Throwable th) {
            k1.a.b(th, this);
            return null;
        }
    }

    protected void b(List<o0> result) {
        if (k1.a.d(this)) {
            return;
        }
        try {
            kotlin.jvm.internal.l.e(result, "result");
            super.onPostExecute(result);
            Exception exc = this.f14975c;
            if (exc != null) {
                f1.l0 l0Var = f1.l0.f8470a;
                String str = f14972e;
                kotlin.jvm.internal.v vVar = kotlin.jvm.internal.v.f12860a;
                String format = String.format("onPostExecute: exception encountered during request: %s", Arrays.copyOf(new Object[]{exc.getMessage()}, 1));
                kotlin.jvm.internal.l.d(format, "java.lang.String.format(format, *args)");
                f1.l0.e0(str, format);
            }
        } catch (Throwable th) {
            k1.a.b(th, this);
        }
    }

    @Override // android.os.AsyncTask
    public /* bridge */ /* synthetic */ List<? extends o0> doInBackground(Void[] voidArr) {
        if (k1.a.d(this)) {
            return null;
        }
        try {
            return a(voidArr);
        } catch (Throwable th) {
            k1.a.b(th, this);
            return null;
        }
    }

    @Override // android.os.AsyncTask
    public /* bridge */ /* synthetic */ void onPostExecute(List<? extends o0> list) {
        if (k1.a.d(this)) {
            return;
        }
        try {
            b(list);
        } catch (Throwable th) {
            k1.a.b(th, this);
        }
    }

    @Override // android.os.AsyncTask
    public void onPreExecute() {
        if (k1.a.d(this)) {
            return;
        }
        try {
            super.onPreExecute();
            f0 f0Var = f0.f14852a;
            if (f0.D()) {
                f1.l0 l0Var = f1.l0.f8470a;
                String str = f14972e;
                kotlin.jvm.internal.v vVar = kotlin.jvm.internal.v.f12860a;
                String format = String.format("execute async task: %s", Arrays.copyOf(new Object[]{this}, 1));
                kotlin.jvm.internal.l.d(format, "java.lang.String.format(format, *args)");
                f1.l0.e0(str, format);
            }
            if (this.f14974b.u() == null) {
                this.f14974b.G(Thread.currentThread() instanceof HandlerThread ? new Handler() : new Handler(Looper.getMainLooper()));
            }
        } catch (Throwable th) {
            k1.a.b(th, this);
        }
    }

    public String toString() {
        String str = "{RequestAsyncTask:  connection: " + this.f14973a + ", requests: " + this.f14974b + "}";
        kotlin.jvm.internal.l.d(str, "StringBuilder()\n        .append(\"{RequestAsyncTask: \")\n        .append(\" connection: \")\n        .append(connection)\n        .append(\", requests: \")\n        .append(requests)\n        .append(\"}\")\n        .toString()");
        return str;
    }
}
