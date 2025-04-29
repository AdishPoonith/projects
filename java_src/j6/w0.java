package j6;
/* loaded from: classes.dex */
public class w0 implements com.google.firebase.firestore.f0 {

    /* renamed from: a  reason: collision with root package name */
    private final p0 f12355a;

    /* renamed from: b  reason: collision with root package name */
    private final c1 f12356b;

    /* renamed from: c  reason: collision with root package name */
    private final h<y1> f12357c;

    public w0(p0 p0Var, c1 c1Var, h<y1> hVar) {
        this.f12355a = p0Var;
        this.f12356b = c1Var;
        this.f12357c = hVar;
    }

    @Override // com.google.firebase.firestore.f0
    public void remove() {
        this.f12357c.d();
        this.f12355a.h0(this.f12356b);
    }
}
