package l0;

import android.content.Context;
import android.location.Address;
import android.location.Geocoder;
import java.util.List;
import java.util.Locale;
/* loaded from: classes.dex */
class a {

    /* renamed from: a  reason: collision with root package name */
    private final Context f13036a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public a(Context context) {
        this.f13036a = context;
    }

    private static Geocoder a(Context context, Locale locale) {
        return locale != null ? new Geocoder(context, locale) : new Geocoder(context);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public List<Address> b(String str, Locale locale) {
        return a(this.f13036a, locale).getFromLocationName(str, 5);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public List<Address> c(double d10, double d11, Locale locale) {
        return a(this.f13036a, locale).getFromLocation(d10, d11, 5);
    }
}
