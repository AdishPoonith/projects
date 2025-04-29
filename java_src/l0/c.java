package l0;

import android.location.Address;
import android.util.Log;
import java.io.IOException;
import java.util.List;
import r8.j;
import r8.k;
import r8.s;
/* loaded from: classes.dex */
final class c implements k.c {

    /* renamed from: j  reason: collision with root package name */
    private final a f13039j;

    /* renamed from: k  reason: collision with root package name */
    private k f13040k;

    /* JADX INFO: Access modifiers changed from: package-private */
    public c(a aVar) {
        this.f13039j = aVar;
    }

    private void a(j jVar, k.d dVar) {
        String str = (String) jVar.a("address");
        String str2 = (String) jVar.a("localeIdentifier");
        if (str == null || str.isEmpty()) {
            dVar.b("ARGUMENT_ERROR", "Supply a valid value for the 'address' parameter.", null);
        }
        try {
            List<Address> b10 = this.f13039j.b(str, m0.c.a(str2));
            if (b10 != null && !b10.isEmpty()) {
                dVar.a(m0.b.c(b10));
                return;
            }
            dVar.b("NOT_FOUND", String.format("No coordinates found for '%s'", str), null);
        } catch (IOException unused) {
            dVar.b("IO_ERROR", String.format("A network error occurred trying to lookup the address ''.", str), null);
        }
    }

    private void b(j jVar, k.d dVar) {
        double doubleValue = ((Double) jVar.a("latitude")).doubleValue();
        double doubleValue2 = ((Double) jVar.a("longitude")).doubleValue();
        try {
            List<Address> c10 = this.f13039j.c(doubleValue, doubleValue2, m0.c.a((String) jVar.a("localeIdentifier")));
            if (c10 != null && !c10.isEmpty()) {
                dVar.a(m0.b.b(c10));
                return;
            }
            dVar.b("NOT_FOUND", String.format("No address information found for supplied coordinates (latitude: %f, longitude: %f).", Double.valueOf(doubleValue), Double.valueOf(doubleValue2)), null);
        } catch (IOException unused) {
            dVar.b("IO_ERROR", String.format("A network error occurred trying to lookup the supplied coordinates (latitude: %f, longitude: %f).", Double.valueOf(doubleValue), Double.valueOf(doubleValue2)), null);
        }
    }

    @Override // r8.k.c
    public void I(j jVar, k.d dVar) {
        String str = jVar.f16777a;
        str.hashCode();
        if (str.equals("placemarkFromCoordinates")) {
            b(jVar, dVar);
        } else if (str.equals("locationFromAddress")) {
            a(jVar, dVar);
        } else {
            dVar.c();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void c(r8.c cVar) {
        if (this.f13040k != null) {
            Log.wtf("MethodCallHandlerImpl", "Setting a method call handler before the last was disposed.");
            d();
        }
        k kVar = new k(cVar, "flutter.baseflow.com/geocoding", s.f16792b, cVar.d());
        this.f13040k = kVar;
        kVar.e(this);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void d() {
        k kVar = this.f13040k;
        if (kVar == null) {
            Log.d("MethodCallHandlerImpl", "Tried to stop listening when no MethodChannel had been initialized.");
            return;
        }
        kVar.e(null);
        this.f13040k = null;
    }
}
