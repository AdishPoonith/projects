package d0;

import android.content.Context;
import java.io.FileDescriptor;
import java.io.PrintWriter;
/* loaded from: classes.dex */
public class b<D> {

    /* renamed from: a  reason: collision with root package name */
    int f7562a;

    /* renamed from: b  reason: collision with root package name */
    InterfaceC0112b<D> f7563b;

    /* renamed from: c  reason: collision with root package name */
    a<D> f7564c;

    /* renamed from: d  reason: collision with root package name */
    Context f7565d;

    /* renamed from: e  reason: collision with root package name */
    boolean f7566e = false;

    /* renamed from: f  reason: collision with root package name */
    boolean f7567f = false;

    /* renamed from: g  reason: collision with root package name */
    boolean f7568g = true;

    /* renamed from: h  reason: collision with root package name */
    boolean f7569h = false;

    /* renamed from: i  reason: collision with root package name */
    boolean f7570i = false;

    /* loaded from: classes.dex */
    public interface a<D> {
        void a(b<D> bVar);
    }

    /* renamed from: d0.b$b  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public interface InterfaceC0112b<D> {
        void a(b<D> bVar, D d10);
    }

    public b(Context context) {
        this.f7565d = context.getApplicationContext();
    }

    public void a() {
        this.f7567f = true;
        j();
    }

    public boolean b() {
        return k();
    }

    public void c() {
        this.f7570i = false;
    }

    public String d(D d10) {
        StringBuilder sb = new StringBuilder(64);
        androidx.core.util.b.a(d10, sb);
        sb.append("}");
        return sb.toString();
    }

    public void e() {
        a<D> aVar = this.f7564c;
        if (aVar != null) {
            aVar.a(this);
        }
    }

    public void f(D d10) {
        InterfaceC0112b<D> interfaceC0112b = this.f7563b;
        if (interfaceC0112b != null) {
            interfaceC0112b.a(this, d10);
        }
    }

    @Deprecated
    public void g(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        printWriter.print(str);
        printWriter.print("mId=");
        printWriter.print(this.f7562a);
        printWriter.print(" mListener=");
        printWriter.println(this.f7563b);
        if (this.f7566e || this.f7569h || this.f7570i) {
            printWriter.print(str);
            printWriter.print("mStarted=");
            printWriter.print(this.f7566e);
            printWriter.print(" mContentChanged=");
            printWriter.print(this.f7569h);
            printWriter.print(" mProcessingChange=");
            printWriter.println(this.f7570i);
        }
        if (this.f7567f || this.f7568g) {
            printWriter.print(str);
            printWriter.print("mAbandoned=");
            printWriter.print(this.f7567f);
            printWriter.print(" mReset=");
            printWriter.println(this.f7568g);
        }
    }

    public void h() {
        m();
    }

    public boolean i() {
        return this.f7567f;
    }

    protected void j() {
    }

    protected boolean k() {
        throw null;
    }

    public void l() {
        if (this.f7566e) {
            h();
        } else {
            this.f7569h = true;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void m() {
    }

    protected void n() {
    }

    protected void o() {
        throw null;
    }

    protected void p() {
    }

    public void q(int i10, InterfaceC0112b<D> interfaceC0112b) {
        if (this.f7563b != null) {
            throw new IllegalStateException("There is already a listener registered");
        }
        this.f7563b = interfaceC0112b;
        this.f7562a = i10;
    }

    public void r() {
        n();
        this.f7568g = true;
        this.f7566e = false;
        this.f7567f = false;
        this.f7569h = false;
        this.f7570i = false;
    }

    public void s() {
        if (this.f7570i) {
            l();
        }
    }

    public final void t() {
        this.f7566e = true;
        this.f7568g = false;
        this.f7567f = false;
        o();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(64);
        androidx.core.util.b.a(this, sb);
        sb.append(" id=");
        sb.append(this.f7562a);
        sb.append("}");
        return sb.toString();
    }

    public void u() {
        this.f7566e = false;
        p();
    }

    public void v(InterfaceC0112b<D> interfaceC0112b) {
        InterfaceC0112b<D> interfaceC0112b2 = this.f7563b;
        if (interfaceC0112b2 == null) {
            throw new IllegalStateException("No listener register");
        }
        if (interfaceC0112b2 != interfaceC0112b) {
            throw new IllegalArgumentException("Attempting to unregister the wrong listener");
        }
        this.f7563b = null;
    }
}
