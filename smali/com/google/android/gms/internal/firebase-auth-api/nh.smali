.class public final Lcom/google/android/gms/internal/firebase-auth-api/nh;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static final a:[B

.field public static final b:Lcom/google/android/gms/internal/firebase-auth-api/as;

.field public static final c:Lcom/google/android/gms/internal/firebase-auth-api/as;

.field public static final d:Lcom/google/android/gms/internal/firebase-auth-api/as;


# direct methods
.method static constructor <clinit>()V
    .locals 9

    const/4 v0, 0x0

    new-array v0, v0, [B

    sput-object v0, Lcom/google/android/gms/internal/firebase-auth-api/nh;->a:[B

    sget-object v7, Lcom/google/android/gms/internal/firebase-auth-api/lb;->a:Lcom/google/android/gms/internal/firebase-auth-api/as;

    sget-object v8, Lcom/google/android/gms/internal/firebase-auth-api/ct;->l:Lcom/google/android/gms/internal/firebase-auth-api/ct;

    const/4 v1, 0x4

    const/4 v2, 0x5

    const/4 v3, 0x3

    move-object v4, v7

    move-object v5, v8

    move-object v6, v0

    invoke-static/range {v1 .. v6}, Lcom/google/android/gms/internal/firebase-auth-api/nh;->a(IIILcom/google/android/gms/internal/firebase-auth-api/as;Lcom/google/android/gms/internal/firebase-auth-api/ct;[B)Lcom/google/android/gms/internal/firebase-auth-api/as;

    move-result-object v1

    sput-object v1, Lcom/google/android/gms/internal/firebase-auth-api/nh;->b:Lcom/google/android/gms/internal/firebase-auth-api/as;

    sget-object v5, Lcom/google/android/gms/internal/firebase-auth-api/ct;->n:Lcom/google/android/gms/internal/firebase-auth-api/ct;

    const/4 v1, 0x4

    const/4 v3, 0x4

    invoke-static/range {v1 .. v6}, Lcom/google/android/gms/internal/firebase-auth-api/nh;->a(IIILcom/google/android/gms/internal/firebase-auth-api/as;Lcom/google/android/gms/internal/firebase-auth-api/ct;[B)Lcom/google/android/gms/internal/firebase-auth-api/as;

    move-result-object v1

    sput-object v1, Lcom/google/android/gms/internal/firebase-auth-api/nh;->c:Lcom/google/android/gms/internal/firebase-auth-api/as;

    sget-object v4, Lcom/google/android/gms/internal/firebase-auth-api/lb;->e:Lcom/google/android/gms/internal/firebase-auth-api/as;

    const/4 v1, 0x4

    const/4 v3, 0x3

    move-object v5, v8

    invoke-static/range {v1 .. v6}, Lcom/google/android/gms/internal/firebase-auth-api/nh;->a(IIILcom/google/android/gms/internal/firebase-auth-api/as;Lcom/google/android/gms/internal/firebase-auth-api/ct;[B)Lcom/google/android/gms/internal/firebase-auth-api/as;

    move-result-object v0

    sput-object v0, Lcom/google/android/gms/internal/firebase-auth-api/nh;->d:Lcom/google/android/gms/internal/firebase-auth-api/as;

    return-void
.end method

.method public static a(IIILcom/google/android/gms/internal/firebase-auth-api/as;Lcom/google/android/gms/internal/firebase-auth-api/ct;[B)Lcom/google/android/gms/internal/firebase-auth-api/as;
    .locals 1

    invoke-static {}, Lcom/google/android/gms/internal/firebase-auth-api/yp;->C()Lcom/google/android/gms/internal/firebase-auth-api/xp;

    move-result-object p0

    invoke-static {}, Lcom/google/android/gms/internal/firebase-auth-api/lq;->C()Lcom/google/android/gms/internal/firebase-auth-api/kq;

    move-result-object p1

    const/4 v0, 0x4

    invoke-virtual {p1, v0}, Lcom/google/android/gms/internal/firebase-auth-api/kq;->s(I)Lcom/google/android/gms/internal/firebase-auth-api/kq;

    const/4 v0, 0x5

    invoke-virtual {p1, v0}, Lcom/google/android/gms/internal/firebase-auth-api/kq;->t(I)Lcom/google/android/gms/internal/firebase-auth-api/kq;

    const/4 v0, 0x0

    invoke-static {p5, v0, v0}, Lcom/google/android/gms/internal/firebase-auth-api/m4;->w([BII)Lcom/google/android/gms/internal/firebase-auth-api/m4;

    move-result-object p5

    invoke-virtual {p1, p5}, Lcom/google/android/gms/internal/firebase-auth-api/kq;->r(Lcom/google/android/gms/internal/firebase-auth-api/m4;)Lcom/google/android/gms/internal/firebase-auth-api/kq;

    invoke-virtual {p1}, Lcom/google/android/gms/internal/firebase-auth-api/o5;->j()Lcom/google/android/gms/internal/firebase-auth-api/r5;

    move-result-object p1

    check-cast p1, Lcom/google/android/gms/internal/firebase-auth-api/lq;

    invoke-static {}, Lcom/google/android/gms/internal/firebase-auth-api/vp;->C()Lcom/google/android/gms/internal/firebase-auth-api/up;

    move-result-object p5

    invoke-virtual {p5, p3}, Lcom/google/android/gms/internal/firebase-auth-api/up;->r(Lcom/google/android/gms/internal/firebase-auth-api/as;)Lcom/google/android/gms/internal/firebase-auth-api/up;

    invoke-virtual {p5}, Lcom/google/android/gms/internal/firebase-auth-api/o5;->j()Lcom/google/android/gms/internal/firebase-auth-api/r5;

    move-result-object p3

    check-cast p3, Lcom/google/android/gms/internal/firebase-auth-api/vp;

    invoke-static {}, Lcom/google/android/gms/internal/firebase-auth-api/bq;->D()Lcom/google/android/gms/internal/firebase-auth-api/aq;

    move-result-object p5

    invoke-virtual {p5, p1}, Lcom/google/android/gms/internal/firebase-auth-api/aq;->s(Lcom/google/android/gms/internal/firebase-auth-api/lq;)Lcom/google/android/gms/internal/firebase-auth-api/aq;

    invoke-virtual {p5, p3}, Lcom/google/android/gms/internal/firebase-auth-api/aq;->r(Lcom/google/android/gms/internal/firebase-auth-api/vp;)Lcom/google/android/gms/internal/firebase-auth-api/aq;

    invoke-virtual {p5, p2}, Lcom/google/android/gms/internal/firebase-auth-api/aq;->t(I)Lcom/google/android/gms/internal/firebase-auth-api/aq;

    invoke-virtual {p5}, Lcom/google/android/gms/internal/firebase-auth-api/o5;->j()Lcom/google/android/gms/internal/firebase-auth-api/r5;

    move-result-object p1

    check-cast p1, Lcom/google/android/gms/internal/firebase-auth-api/bq;

    invoke-virtual {p0, p1}, Lcom/google/android/gms/internal/firebase-auth-api/xp;->r(Lcom/google/android/gms/internal/firebase-auth-api/bq;)Lcom/google/android/gms/internal/firebase-auth-api/xp;

    invoke-virtual {p0}, Lcom/google/android/gms/internal/firebase-auth-api/o5;->j()Lcom/google/android/gms/internal/firebase-auth-api/r5;

    move-result-object p0

    check-cast p0, Lcom/google/android/gms/internal/firebase-auth-api/yp;

    invoke-static {}, Lcom/google/android/gms/internal/firebase-auth-api/as;->C()Lcom/google/android/gms/internal/firebase-auth-api/zr;

    move-result-object p1

    new-instance p2, Lcom/google/android/gms/internal/firebase-auth-api/fh;

    invoke-direct {p2}, Lcom/google/android/gms/internal/firebase-auth-api/fh;-><init>()V

    const-string p2, "type.googleapis.com/google.crypto.tink.EciesAeadHkdfPrivateKey"

    invoke-virtual {p1, p2}, Lcom/google/android/gms/internal/firebase-auth-api/zr;->s(Ljava/lang/String;)Lcom/google/android/gms/internal/firebase-auth-api/zr;

    invoke-virtual {p1, p4}, Lcom/google/android/gms/internal/firebase-auth-api/zr;->r(Lcom/google/android/gms/internal/firebase-auth-api/ct;)Lcom/google/android/gms/internal/firebase-auth-api/zr;

    invoke-virtual {p0}, Lcom/google/android/gms/internal/firebase-auth-api/v3;->zzo()Lcom/google/android/gms/internal/firebase-auth-api/m4;

    move-result-object p0

    invoke-virtual {p1, p0}, Lcom/google/android/gms/internal/firebase-auth-api/zr;->t(Lcom/google/android/gms/internal/firebase-auth-api/m4;)Lcom/google/android/gms/internal/firebase-auth-api/zr;

    invoke-virtual {p1}, Lcom/google/android/gms/internal/firebase-auth-api/o5;->j()Lcom/google/android/gms/internal/firebase-auth-api/r5;

    move-result-object p0

    check-cast p0, Lcom/google/android/gms/internal/firebase-auth-api/as;

    return-object p0
.end method
