package u4;

import android.content.Context;
import android.os.RemoteException;
import android.view.ViewGroup;
import com.google.android.gms.maps.GoogleMapOptions;
import java.util.ArrayList;
import java.util.List;
import v4.e0;
/* loaded from: classes.dex */
final class m extends k4.a {

    /* renamed from: e  reason: collision with root package name */
    private final ViewGroup f19055e;

    /* renamed from: f  reason: collision with root package name */
    private final Context f19056f;

    /* renamed from: g  reason: collision with root package name */
    protected k4.e f19057g;

    /* renamed from: h  reason: collision with root package name */
    private final GoogleMapOptions f19058h;

    /* renamed from: i  reason: collision with root package name */
    private final List f19059i = new ArrayList();

    /* JADX INFO: Access modifiers changed from: package-private */
    public m(ViewGroup viewGroup, Context context, GoogleMapOptions googleMapOptions) {
        this.f19055e = viewGroup;
        this.f19056f = context;
        this.f19058h = googleMapOptions;
    }

    @Override // k4.a
    protected final void a(k4.e eVar) {
        this.f19057g = eVar;
        q();
    }

    public final void p(f fVar) {
        if (b() != null) {
            ((l) b()).b(fVar);
        } else {
            this.f19059i.add(fVar);
        }
    }

    public final void q() {
        if (this.f19057g == null || b() != null) {
            return;
        }
        try {
            e.a(this.f19056f);
            v4.c R0 = e0.a(this.f19056f, null).R0(k4.d.H2(this.f19056f), this.f19058h);
            if (R0 == null) {
                return;
            }
            this.f19057g.a(new l(this.f19055e, R0));
            for (f fVar : this.f19059i) {
                ((l) b()).b(fVar);
            }
            this.f19059i.clear();
        } catch (RemoteException e10) {
            throw new w4.t(e10);
        } catch (b4.g unused) {
        }
    }
}
