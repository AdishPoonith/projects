.class final Lcom/google/android/gms/internal/firebase-auth-api/om;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static final a:Lcom/google/android/gms/internal/firebase-auth-api/gv;

.field private static final b:Lcom/google/android/gms/internal/firebase-auth-api/ak;

.field private static final c:Lcom/google/android/gms/internal/firebase-auth-api/vj;

.field private static final d:Lcom/google/android/gms/internal/firebase-auth-api/ej;

.field private static final e:Lcom/google/android/gms/internal/firebase-auth-api/aj;

.field public static final synthetic f:I


# direct methods
.method static constructor <clinit>()V
    .locals 5

    const-class v0, Lcom/google/android/gms/internal/firebase-auth-api/mk;

    const-class v1, Lcom/google/android/gms/internal/firebase-auth-api/nk;

    const-string v2, "type.googleapis.com/google.crypto.tink.HmacKey"

    invoke-static {v2}, Lcom/google/android/gms/internal/firebase-auth-api/xk;->b(Ljava/lang/String;)Lcom/google/android/gms/internal/firebase-auth-api/gv;

    move-result-object v2

    sput-object v2, Lcom/google/android/gms/internal/firebase-auth-api/om;->a:Lcom/google/android/gms/internal/firebase-auth-api/gv;

    sget-object v3, Lcom/google/android/gms/internal/firebase-auth-api/km;->a:Lcom/google/android/gms/internal/firebase-auth-api/km;

    const-class v4, Lcom/google/android/gms/internal/firebase-auth-api/jm;

    invoke-static {v3, v4, v1}, Lcom/google/android/gms/internal/firebase-auth-api/ak;->a(Lcom/google/android/gms/internal/firebase-auth-api/xj;Ljava/lang/Class;Ljava/lang/Class;)Lcom/google/android/gms/internal/firebase-auth-api/ak;

    move-result-object v3

    sput-object v3, Lcom/google/android/gms/internal/firebase-auth-api/om;->b:Lcom/google/android/gms/internal/firebase-auth-api/ak;

    sget-object v3, Lcom/google/android/gms/internal/firebase-auth-api/lm;->a:Lcom/google/android/gms/internal/firebase-auth-api/lm;

    invoke-static {v3, v2, v1}, Lcom/google/android/gms/internal/firebase-auth-api/vj;->a(Lcom/google/android/gms/internal/firebase-auth-api/tj;Lcom/google/android/gms/internal/firebase-auth-api/gv;Ljava/lang/Class;)Lcom/google/android/gms/internal/firebase-auth-api/vj;

    move-result-object v1

    sput-object v1, Lcom/google/android/gms/internal/firebase-auth-api/om;->c:Lcom/google/android/gms/internal/firebase-auth-api/vj;

    sget-object v1, Lcom/google/android/gms/internal/firebase-auth-api/mm;->a:Lcom/google/android/gms/internal/firebase-auth-api/mm;

    const-class v3, Lcom/google/android/gms/internal/firebase-auth-api/yl;

    invoke-static {v1, v3, v0}, Lcom/google/android/gms/internal/firebase-auth-api/ej;->a(Lcom/google/android/gms/internal/firebase-auth-api/cj;Ljava/lang/Class;Ljava/lang/Class;)Lcom/google/android/gms/internal/firebase-auth-api/ej;

    move-result-object v1

    sput-object v1, Lcom/google/android/gms/internal/firebase-auth-api/om;->d:Lcom/google/android/gms/internal/firebase-auth-api/ej;

    sget-object v1, Lcom/google/android/gms/internal/firebase-auth-api/nm;->a:Lcom/google/android/gms/internal/firebase-auth-api/nm;

    invoke-static {v1, v2, v0}, Lcom/google/android/gms/internal/firebase-auth-api/aj;->b(Lcom/google/android/gms/internal/firebase-auth-api/yi;Lcom/google/android/gms/internal/firebase-auth-api/gv;Ljava/lang/Class;)Lcom/google/android/gms/internal/firebase-auth-api/aj;

    move-result-object v0

    sput-object v0, Lcom/google/android/gms/internal/firebase-auth-api/om;->e:Lcom/google/android/gms/internal/firebase-auth-api/aj;

    return-void
.end method

.method public static a(Lcom/google/android/gms/internal/firebase-auth-api/rj;)V
    .locals 1

    sget-object v0, Lcom/google/android/gms/internal/firebase-auth-api/om;->b:Lcom/google/android/gms/internal/firebase-auth-api/ak;

    invoke-virtual {p0, v0}, Lcom/google/android/gms/internal/firebase-auth-api/rj;->f(Lcom/google/android/gms/internal/firebase-auth-api/ak;)V

    sget-object v0, Lcom/google/android/gms/internal/firebase-auth-api/om;->c:Lcom/google/android/gms/internal/firebase-auth-api/vj;

    invoke-virtual {p0, v0}, Lcom/google/android/gms/internal/firebase-auth-api/rj;->e(Lcom/google/android/gms/internal/firebase-auth-api/vj;)V

    sget-object v0, Lcom/google/android/gms/internal/firebase-auth-api/om;->d:Lcom/google/android/gms/internal/firebase-auth-api/ej;

    invoke-virtual {p0, v0}, Lcom/google/android/gms/internal/firebase-auth-api/rj;->d(Lcom/google/android/gms/internal/firebase-auth-api/ej;)V

    sget-object v0, Lcom/google/android/gms/internal/firebase-auth-api/om;->e:Lcom/google/android/gms/internal/firebase-auth-api/aj;

    invoke-virtual {p0, v0}, Lcom/google/android/gms/internal/firebase-auth-api/rj;->c(Lcom/google/android/gms/internal/firebase-auth-api/aj;)V

    return-void
.end method
