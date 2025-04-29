package r1;

import android.net.Uri;
import android.os.Bundle;
import android.os.ParcelFileDescriptor;
import f1.l0;
import java.io.File;
import kotlin.jvm.internal.l;
import p0.j0;
import p0.p0;
import p0.s;
/* loaded from: classes.dex */
public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static final a f16635a = new a();

    private a() {
    }

    public static final j0 a(p0.a aVar, Uri imageUri, j0.b bVar) {
        l.e(imageUri, "imageUri");
        String path = imageUri.getPath();
        l0 l0Var = l0.f8470a;
        if (!l0.V(imageUri) || path == null) {
            if (l0.S(imageUri)) {
                j0.g gVar = new j0.g(imageUri, "image/png");
                Bundle bundle = new Bundle(1);
                bundle.putParcelable("file", gVar);
                return new j0(aVar, "me/staging_resources", bundle, p0.POST, bVar, null, 32, null);
            }
            throw new s("The image Uri must be either a file:// or content:// Uri");
        }
        return b(aVar, new File(path), bVar);
    }

    public static final j0 b(p0.a aVar, File file, j0.b bVar) {
        j0.g gVar = new j0.g(ParcelFileDescriptor.open(file, 268435456), "image/png");
        Bundle bundle = new Bundle(1);
        bundle.putParcelable("file", gVar);
        return new j0(aVar, "me/staging_resources", bundle, p0.POST, bVar, null, 32, null);
    }
}
