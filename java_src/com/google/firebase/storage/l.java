package com.google.firebase.storage;

import android.net.Uri;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.storage.u;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;
/* loaded from: classes.dex */
public class l implements Comparable<l> {

    /* renamed from: j  reason: collision with root package name */
    private final Uri f6968j;

    /* renamed from: k  reason: collision with root package name */
    private final com.google.firebase.storage.d f6969k;

    /* loaded from: classes.dex */
    class a implements OnFailureListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ TaskCompletionSource f6970a;

        a(TaskCompletionSource taskCompletionSource) {
            this.f6970a = taskCompletionSource;
        }

        @Override // com.google.android.gms.tasks.OnFailureListener
        public void onFailure(Exception exc) {
            this.f6970a.setException(j.e(exc, 0));
        }
    }

    /* loaded from: classes.dex */
    class b implements OnSuccessListener<u.d> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ TaskCompletionSource f6972a;

        b(TaskCompletionSource taskCompletionSource) {
            this.f6972a = taskCompletionSource;
        }

        @Override // com.google.android.gms.tasks.OnSuccessListener
        /* renamed from: a */
        public void onSuccess(u.d dVar) {
            if (this.f6972a.getTask().isComplete()) {
                return;
            }
            Log.e("StorageReference", "getBytes 'succeeded', but failed to set a Result.");
            this.f6972a.setException(j.c(Status.f3736r));
        }
    }

    /* loaded from: classes.dex */
    class c implements u.b {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ long f6974a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ TaskCompletionSource f6975b;

        c(long j10, TaskCompletionSource taskCompletionSource) {
            this.f6974a = j10;
            this.f6975b = taskCompletionSource;
        }

        @Override // com.google.firebase.storage.u.b
        public void a(u.d dVar, InputStream inputStream) {
            try {
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                byte[] bArr = new byte[16384];
                int i10 = 0;
                while (true) {
                    int read = inputStream.read(bArr, 0, 16384);
                    if (read == -1) {
                        byteArrayOutputStream.flush();
                        this.f6975b.setResult(byteArrayOutputStream.toByteArray());
                        return;
                    }
                    i10 += read;
                    if (i10 > this.f6974a) {
                        Log.e("StorageReference", "the maximum allowed buffer size was exceeded.");
                        throw new IndexOutOfBoundsException("the maximum allowed buffer size was exceeded.");
                    }
                    byteArrayOutputStream.write(bArr, 0, read);
                }
            } finally {
                inputStream.close();
            }
        }
    }

    /* loaded from: classes.dex */
    class d implements Continuation<h, Task<Void>> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ List f6977a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ List f6978b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ Executor f6979c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ TaskCompletionSource f6980d;

        d(List list, List list2, Executor executor, TaskCompletionSource taskCompletionSource) {
            this.f6977a = list;
            this.f6978b = list2;
            this.f6979c = executor;
            this.f6980d = taskCompletionSource;
        }

        @Override // com.google.android.gms.tasks.Continuation
        /* renamed from: a */
        public Task<Void> then(Task<h> task) {
            if (task.isSuccessful()) {
                h result = task.getResult();
                this.f6977a.addAll(result.d());
                this.f6978b.addAll(result.b());
                if (result.c() != null) {
                    l.this.A(null, result.c()).continueWithTask(this.f6979c, this);
                } else {
                    this.f6980d.setResult(new h(this.f6977a, this.f6978b, null));
                }
            } else {
                this.f6980d.setException(task.getException());
            }
            return Tasks.forResult(null);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public l(Uri uri, com.google.firebase.storage.d dVar) {
        c4.s.b(uri != null, "storageUri cannot be null");
        c4.s.b(dVar != null, "FirebaseApp cannot be null");
        this.f6968j = uri;
        this.f6969k = dVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Task<h> A(Integer num, String str) {
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        w6.m.b().d(new i(this, num, str, taskCompletionSource));
        return taskCompletionSource.getTask();
    }

    public a0 B(byte[] bArr) {
        c4.s.b(bArr != null, "bytes cannot be null");
        a0 a0Var = new a0(this, null, bArr);
        a0Var.b0();
        return a0Var;
    }

    public a0 C(byte[] bArr, k kVar) {
        c4.s.b(bArr != null, "bytes cannot be null");
        c4.s.b(kVar != null, "metadata cannot be null");
        a0 a0Var = new a0(this, kVar, bArr);
        a0Var.b0();
        return a0Var;
    }

    public a0 D(Uri uri) {
        c4.s.b(uri != null, "uri cannot be null");
        a0 a0Var = new a0(this, null, uri, null);
        a0Var.b0();
        return a0Var;
    }

    public a0 E(Uri uri, k kVar) {
        c4.s.b(uri != null, "uri cannot be null");
        c4.s.b(kVar != null, "metadata cannot be null");
        a0 a0Var = new a0(this, kVar, uri, null);
        a0Var.b0();
        return a0Var;
    }

    public Task<k> F(k kVar) {
        c4.s.j(kVar);
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        w6.m.b().d(new z(this, taskCompletionSource, kVar));
        return taskCompletionSource.getTask();
    }

    public boolean equals(Object obj) {
        if (obj instanceof l) {
            return ((l) obj).toString().equals(toString());
        }
        return false;
    }

    public l g(String str) {
        c4.s.b(!TextUtils.isEmpty(str), "childName cannot be null or empty");
        return new l(this.f6968j.buildUpon().appendEncodedPath(x6.d.b(x6.d.a(str))).build(), this.f6969k);
    }

    @Override // java.lang.Comparable
    /* renamed from: h */
    public int compareTo(l lVar) {
        return this.f6968j.compareTo(lVar.f6968j);
    }

    public int hashCode() {
        return toString().hashCode();
    }

    public Task<Void> i() {
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        w6.m.b().d(new com.google.firebase.storage.b(this, taskCompletionSource));
        return taskCompletionSource.getTask();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public w5.f k() {
        return v().a();
    }

    public String l() {
        return this.f6968j.getAuthority();
    }

    public Task<byte[]> n(long j10) {
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        u uVar = new u(this);
        uVar.r0(new c(j10, taskCompletionSource)).addOnSuccessListener(new b(taskCompletionSource)).addOnFailureListener(new a(taskCompletionSource));
        uVar.b0();
        return taskCompletionSource.getTask();
    }

    public Task<Uri> o() {
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        w6.m.b().d(new f(this, taskCompletionSource));
        return taskCompletionSource.getTask();
    }

    public com.google.firebase.storage.c p(Uri uri) {
        com.google.firebase.storage.c cVar = new com.google.firebase.storage.c(this, uri);
        cVar.b0();
        return cVar;
    }

    public Task<k> q() {
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        w6.m.b().d(new g(this, taskCompletionSource));
        return taskCompletionSource.getTask();
    }

    public String r() {
        String path = this.f6968j.getPath();
        int lastIndexOf = path.lastIndexOf(47);
        return lastIndexOf != -1 ? path.substring(lastIndexOf + 1) : path;
    }

    public l s() {
        String path = this.f6968j.getPath();
        if (TextUtils.isEmpty(path)) {
            return null;
        }
        if (path.equals("/")) {
            return null;
        }
        int lastIndexOf = path.lastIndexOf(47);
        return new l(this.f6968j.buildUpon().path(lastIndexOf != -1 ? path.substring(0, lastIndexOf) : "/").build(), this.f6969k);
    }

    public String t() {
        return this.f6968j.getPath();
    }

    public String toString() {
        return "gs://" + this.f6968j.getAuthority() + this.f6968j.getEncodedPath();
    }

    public l u() {
        return new l(this.f6968j.buildUpon().path("").build(), this.f6969k);
    }

    public com.google.firebase.storage.d v() {
        return this.f6969k;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public x6.h w() {
        return new x6.h(this.f6968j, this.f6969k.e());
    }

    public Task<h> x(int i10) {
        c4.s.b(i10 > 0, "maxResults must be greater than zero");
        c4.s.b(i10 <= 1000, "maxResults must be at most 1000");
        return A(Integer.valueOf(i10), null);
    }

    public Task<h> y(int i10, String str) {
        c4.s.b(i10 > 0, "maxResults must be greater than zero");
        c4.s.b(i10 <= 1000, "maxResults must be at most 1000");
        c4.s.b(str != null, "pageToken must be non-null to resume a previous list() operation");
        return A(Integer.valueOf(i10), str);
    }

    public Task<h> z() {
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        Executor a10 = w6.m.b().a();
        A(null, null).continueWithTask(a10, new d(arrayList, arrayList2, a10, taskCompletionSource));
        return taskCompletionSource.getTask();
    }
}
