package u7;
/* loaded from: classes.dex */
public final class f {

    /* renamed from: a  reason: collision with root package name */
    private t7.b f19151a;

    /* renamed from: b  reason: collision with root package name */
    private t7.a f19152b;

    /* renamed from: c  reason: collision with root package name */
    private t7.c f19153c;

    /* renamed from: d  reason: collision with root package name */
    private int f19154d = -1;

    /* renamed from: e  reason: collision with root package name */
    private b f19155e;

    public static boolean b(int i10) {
        return i10 >= 0 && i10 < 8;
    }

    public b a() {
        return this.f19155e;
    }

    public void c(t7.a aVar) {
        this.f19152b = aVar;
    }

    public void d(int i10) {
        this.f19154d = i10;
    }

    public void e(b bVar) {
        this.f19155e = bVar;
    }

    public void f(t7.b bVar) {
        this.f19151a = bVar;
    }

    public void g(t7.c cVar) {
        this.f19153c = cVar;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(200);
        sb.append("<<\n");
        sb.append(" mode: ");
        sb.append(this.f19151a);
        sb.append("\n ecLevel: ");
        sb.append(this.f19152b);
        sb.append("\n version: ");
        sb.append(this.f19153c);
        sb.append("\n maskPattern: ");
        sb.append(this.f19154d);
        if (this.f19155e == null) {
            sb.append("\n matrix: null\n");
        } else {
            sb.append("\n matrix:\n");
            sb.append(this.f19155e);
        }
        sb.append(">>\n");
        return sb.toString();
    }
}
