package q6;

import android.os.Build;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
/* loaded from: classes.dex */
public class s {

    /* loaded from: classes.dex */
    private static class a {
        public static void a(File file) {
            try {
                Files.deleteIfExists(file.toPath());
            } catch (IOException e10) {
                throw new IOException("Failed to delete file " + file + ": " + e10);
            }
        }
    }

    /* loaded from: classes.dex */
    private static class b {
        public static void a(File file) {
            if (file.delete() || !file.exists()) {
                return;
            }
            throw new IOException("Failed to delete file " + file);
        }
    }

    public static void a(File file) {
        if (Build.VERSION.SDK_INT >= 26) {
            a.a(file);
        } else {
            b.a(file);
        }
    }
}
